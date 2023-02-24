import java.util.Scanner;


public class shpargalka {
    
    


public class main {

    public static void main(String[] args) {
        /*Comment
        от и до
         */


        //Comment в строку
        System.out.println("Hello\\ \" \n \tWorld !");

        ////////////////////////////////////////////////////////////////////////////
        // Типы данных

        byte age = 127; // от -128 до 127 и занимает 1 байт
        short num = 128; // от -32768 до 32767 и занимает 2 байт
        int num2 = 123123; // 4 байта
        long num3 = 45645456; // 8 байт

        float num4 = 4.5f; // с точкой
        double num5 = 5.4564456; // в 2 раза больше цифр после точки чем во float

        char ch = 't'; // 1 символ в одинарной ковычке
        String name = "Alex"; // Строка

        boolean isSappy = true; // Булево
        ////////////////////////////////////////////////////////////////////////////
        //Получение данных от пользователся // импорт сканер import java.util.Scanner;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("You name ?");
//        String userName = scan.nextLine(); // считать строку и формат
//        System.out.println("Hi, " + userName);


//        int num6 = scan.nextInt(); // считать строку и формат
//        byte num7 = scan.nextByte(); // считать строку и формат
//        boolean b = scan.hasNextBoolean(); // считать строку и формат


//        float num8 = 50, num9 = 10;
//        float res = num8 + num9;
//        res  += 10;
//        res ++;
//        res --;
//
//        System.out.println(res);
        Scanner scan = new Scanner(System.in);

        System.out.println("1 chislo");
        float num10 = scan.nextFloat();

        System.out.println("2 chislo");
        float num11 = scan.nextFloat();

        float res1 = num10 + num11;
        float res2 = num10 - num11;
        float res3 = num10 * num11;
        float res4 = num10 / num11;
        
        System.out.println("result");
        System.out.println(res1 + "\n" + res2 + "\n" + res3 + "\n" + res4 + "\n");
        ////////////////////////////////////////////////////////////////////////////
             
    }
    
}

}
