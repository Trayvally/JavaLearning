````
for (int i = 0; set.size()<10; i++){
            set.add(random.nextInt(19)+1);
        }

````
上述程序可运行，但如果采用下述for()循环
````
for (set.size()<10){
            set.add(random.nextInt(19)+1);
        }
````
则不能通过编译