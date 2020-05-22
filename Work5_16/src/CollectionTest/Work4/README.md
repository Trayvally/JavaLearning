 4. //思考题:为什么会得到这个排序 结果升序,如果集合里面是字符串呢？或者是对象呢？

        vector.add(34);
        vector.add(4);
        vector.add(134);
        vector.add(54);
        vector.add(14);
        vector.add(20);
  
        vector.sort(new Comparator() {
          @Override
          public int compare(Object o1, Object o2) {
            return ((Integer)o1).compareTo((Integer)o2);
          }
        });
   
        System.out.println(vector.toString());
        
        
        
 如果是字符串，结果为[134, 14, 20, 34, 4, 54]
 
 将字符串从第一个字符开始比较后排序。