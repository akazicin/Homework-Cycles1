public class Main {
    public static void main(String[] args) {

        ///task1

        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(" i = " + i);
        }

        ///task2

        for ( int i = 10; i >= 0; i = i - 1 ){
            System.out.println( i );
        }

        /// task3

        for (int i = 0; i <=17 ; i = i + 2) {
             System.out.println( i );
            }
        /// task4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        /// task5
        for (int i = 1904; i <= 2096 ; i = i+4) {
            System.out.println(i + " год является високосным ");
        }

        ///task6

        for (int i = 7; i <= 98; i = i+7) {
            System.out.print( i + " ");
        }
        System.out.println();

        ///task7

        for (int i = 1; i <=512 ; i = i*2 ) {
            System.out.print(i + " " );
        }
        System.out.println();

        ///task8

        double salatyMonth = 0;
        for (int month = 1; month <= 12 ; month++) {
            salatyMonth = salatyMonth + 29000;
            System.out.println( "Месяц " + month + " , сумма накоплений равна " + salatyMonth+ " рублей");
        }

        ///task9
        salatyMonth = 0;
        for (int month = 1; month <= 12 ; month++) {
            salatyMonth = salatyMonth * 1.01;
            salatyMonth = salatyMonth + 29000;
            System.out.println( "Месяц " + month + " , сумма накоплений равна " + (long)salatyMonth+ " рублей");
        }

        ///task10

        for (int i = 1; i <=10 ; i++) {
            System.out.println( "2*" + i + "=" + (2*i));

        }





        

        }
    }
