package itstep.learning.basic;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Введення та виведення даних у консолі
 */
public class Console {
    public void demo(){
        System.out.println("Введение и выведение данных в консоли");
        //Для ввода используется работа с потоком ввода Sytem.in
        //System.in - чистый поток, который позволяет прочитать один символ, массив.
        //Концепция чистого потока - за основу берется только один символ. Если мы показываем массив,
        //то также - по одному символу в массив.
        //Поэтому напрямую с System.in обычно не работают. Работают с оболочками
        Scanner scanner=new Scanner(System.in);
//        System.out.print("Your name: ");
//        String name=scanner.nextLine();
//        System.out.printf("Hello, %s!\n", name);

        System.out.print("Enter numbers: ");
        int sum=0;
//        while (scanner.hasNextInt()){ Зависает, поток консоли не заканчивается никогда
//            sum+=scanner.nextInt();
//        }
        String[] strs=scanner.nextLine().split(" ");
        for(String str: strs){
            sum+=Integer.parseInt(str);
        }
        System.out.printf("Sum: %d\n", sum);
    }
}
