package itstep.learning.basic;

public class Vars {
    public void demo(){
        System.out.println("Types and Variables");
        byte  b1=1;    // 8 bit   | числовые типы - все знаковые (от -127... +128 для byte)
        short s1=2;    // 16      | беззнаковых модификаций не существует (unsigned int и т.п.)
        int   i1=3;    // 32      |
        long  l1=4L;   // 64       |
        int iDef;     // принцип значений по умолчанию - действует (будет ноль)

        //по умолчанию числа с плавающей точкой = double, чтобы указать, что работаем с float - нужно добавить f
        float  f1 =  5.0f;    //32 bit
        double d1 =  6.0;     //64
        double d2 =  1.5E-3;

        char c1 = 'A';        //16 bit (UTF16)

        boolean bo1 = true;

        //Присваивание - операция, т.е. возвращает результат. Это позволяет
        //создавать каскадные присваивания
        d1=d2=0.1;
        //но это создает опасность, например, можно написать
        if(bo1=false){} //это позволяет использование присваивания в других выражениях
        //В Шарпе такое запрещено, операция присваивания не может стоять в if
        if ((d1=2.0)>1.0){}

        //Для всех примитивов есть референсные аналоги, которые идут вместо упаковки/распаковки
        //(boxing/unboxing)

        //Они такие же, но пишутся с большой буквы, как правило
        Integer i2=3;
        Byte b2=-2;
        Short s2 = -3;

        //В шарпе идет идея (boxing/unboxing), а в Java - замена типов на референсные аналоги

        //String - immutable, т.е. все операции создают новые объекты
        String str1 ="hello";
        String str2="hello";
        String str3 = new String ("hello");
        if (str1==str2){
            System.out.println("str1==str2");
        }
        else{
            System.out.println("str1!=str2");
        }
        if (str1==str3){
            System.out.println("str1==str3");
        }
        else{
            System.out.println("str1!=str3");
        }
        if (str1.equals(str3)){
            System.out.println("str1 equals str3");
        }
        else{
            System.out.println("str1 !equals str3");
        }

        final int f3 = 10;
    }
}
