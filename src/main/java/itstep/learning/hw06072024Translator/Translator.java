package itstep.learning.hw06072024Translator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Translator {

    public Map<String,String> dictionary;

    public Translator(){
        dictionary=new HashMap<>();
        dictionary.put("cat", "кіт");
        dictionary.put("dog", "собака");
        dictionary.put("rat", "криса");
        dictionary.put("elephant","слон");
        dictionary.put("bird", "пташка");
    }

    public void translate(){
        Scanner scanner=new Scanner(System.in);
        short choice;
        do{
            System.out.println("Оберіть дію зі словником:");
            System.out.println("1-Отримати переклад слова");
            System.out.println("2-Доповнити словник");
            System.out.print("Ваш вибір: ");

            choice=scanner.nextShort();
            scanner.nextLine();
            switch (choice){
                case 1:{
                    System.out.println("Введіть слово англійською");
                    String word=scanner.nextLine();
                    if(dictionary.containsKey(word))
                    {
                        System.out.printf("Переклад %s: %s\n", word, dictionary.get(word));
                    }
                    else{
                        System.out.println("Слово не знайдено у словнику. Ви можете його додати самостійно");
                    }
                    break;
                }
                case 2:
                {
                    System.out.print("Введіть слово англійською: ");
                    String word = scanner.nextLine();
                    if (word.trim().isEmpty()){
                        System.out.println("Ви не ввели жодного слова. Спробуйте ще раз");
                    }
                    else{
                        System.out.println("Введіть переклад слова: ");
                        String translation = scanner.nextLine();
                        if(translation.trim().isEmpty()){
                            System.out.println("Переклад не заповнений. Спробуйте знову");
                        }
                        else{
                            dictionary.put(word, translation);
                            System.out.println("Cлово успішно додадано до словника");
                        }
                    }
                    break;
                }
                default:{
                    System.out.println("Невірний вибір, спробуйте ще раз.");
                }
            }
        }while (choice!=0);


    }
}
