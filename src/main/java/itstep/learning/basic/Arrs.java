package itstep.learning.basic;

import java.util.*;

/**
 * Массивы, коллекции и циклы
 */
public class Arrs {
    public void demo(){
        System.out.println("Arrays demo");
        int[] arr1 = {1,2,3,4,5};  //с инициализацией
        int[] arr2=new int[10];    //пустой массив с размером
        for (int i=0; i<arr1.length; i++){
            System.out.print(arr1[i] + " ");
            //В Java нет общего .toString(), поэтому приведение в строку
            //часто делается как добавление пустой строки или пробела
            // 2+'' ->2.t0String()
        }
        System.out.println();
        for (int element:arr2){
            System.out.printf("%d ", element);
        }
        System.out.println();

        //многомерные массивы - только "рваные"
        int[][] arr2d={
                {1,2,3},
                {4,5,6,0},
                {7,8}
        };

        for(int[] arr: arr2d){      //автоопределения типа нет (типа var, auto)
            for (int element:arr){
                System.out.print(element + " ");
            }
            System.out.println();
        }

        //Коллекции тоже делятся на два основных типа:
        //List - индексируемая коллекция, при том, что это интерфейс (List<E> java.util)
        List<Integer> list1 = new ArrayList<>();
        //List - интерфейс для коллекции
        //ArrayList, LinkedList - реализации (есть много), эти основные
        //<> - "diamond operator" - автоматически определяет тип коллекции
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.remove(1);
        for(int element:list1){
            System.out.print(element +" ");
        }
        System.out.println();
        System.out.println(list1.get(2));

        Map<String, String> map1 = new LinkedHashMap<>();
        map1.put("key1", "value1");
        map1.put("key2", "value2");
        map1.put("key3", "value3");
        map1.put("key4", "value4");
        map1.put("key5", "value5");
        for (String key: map1.keySet()){
            System.out.println(key+" " + map1.get(key));
        }
    }
}
