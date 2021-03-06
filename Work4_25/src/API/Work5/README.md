Web应用程序在浏览器中显示字符串时，由于显示长度的限制，常常需要将字符串截取后再进行显示。但目前很多流行的语言，
如C#、Java内部采用的都是 Unicode 16（UCS2）编码，在这种编码中所有的字符都是两个字符，因此，如果要截取的字符串
是中、英文、数字混合的，就会产生问题，如下面的字符串：

````
String s = "a加b等于c，如果a等1、b等于2，那么c等3"; 
````
  上面的字符串既有汉字，又有英文字符和数字。如果要截取前6个字节的字符，应该是”a加b等"，但如果用substring方法截
  取前6个字符就成了"a 加b等于c"。产生这个问题的原因是将substring方法将双字节的汉字当成一个字节的字符（UCS2字符）
  处理了。 要解决这个问题的方法是首先得到该字符串的UCS2编码的字节数组，如下面的代码如下：

``
byte[] bytes = s.getBytes("Unicode");
``
由于上面生成的字节数组中前两个字节是标志位，bytes[0] = -2，bytes[1] = -1，因此，要从第三个字节开始扫描，对于一个
英文或数字字符，UCS2编码的第二个字节是相应的ASCII，第一个字节是0，如a的UCS2编码是0  97，而汉字两个字节都不为0，因
此，可以利于UCS2编码的这个规则来计算实际的字节数


    