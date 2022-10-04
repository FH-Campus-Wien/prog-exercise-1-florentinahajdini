package at.ac.fhcampuswien;


import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){

        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){

        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){

        char a = 'Z';
        int b = 0xface;
        @SuppressWarnings("OctalInteger") int c = 012;
        long d = (int) 80L;
        float f = (int) 44e-1f;
        float g = (int) 5.5f;
        double h = (int) 8.88e1;
        double i = (int) 99.9;

        int d1 = (int) d;
        int f1 = (int) f;
        int g1 = (int) g;
        int h1 = (int) h;
        int i1= (int) i;

        System.out.println(a + b + c + d1 + f1 + g1 + h1 + i1);
    }

    //todo Task 4
    public void addTwoNumbers(){

        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int result = number1 + number2;
        System.out.println(result);
    }

    //todo Task 5
    public void swapTwoNumbers(){

        System.out.println("Before Swap:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();

        System.out.println("After Swap:");
        x = x - y;
        y = x + y;
        x = y - x;
        System.out.println("x: "+ x);
        System.out.println("y: "+ y);
    }

    //todo Task 6
    public void compareTwoNumbers(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("n1: ");
        int n1 = scanner.nextInt();
        System.out.print("n2: ");
        int n2 = scanner.nextInt();
        if (n1 < n2){
            System.out.println("n2 > n1");
        }
        else if (n1>n2) {
            System.out.println("n1 > n2");
        }
        else{
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){

        System.out.print("Enter annual Revenue:");
        Scanner scanner = new Scanner(System.in);
        int annualRevenue = scanner.nextInt();
        if (annualRevenue >= 0 && annualRevenue < 20_000) {
            System.out.println("Poor Sales Revenue");
        } else if (annualRevenue >= 20_000 && annualRevenue < 50_000) {
            System.out.println("Average Sales Revenue");
        } else if (annualRevenue >= 50_000 && annualRevenue < 80_000) {
            System.out.println("Good Sales Revenue");
        } else if (annualRevenue >= 80_000 && annualRevenue < 100_000) {
            System.out.println("Excellent Sales Revenue");
        } else {
            System.out.println("Invalid Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){

        System.out.print("Enter CommissionClass:");
        Scanner scanner = new Scanner(System.in);
        int provision = scanner.nextInt();

        switch (provision) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println(" Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println(" Your Commission Rate was set to 0.0");
                break;
        }
    }

    //todo Task 9
    public void leapyear(){

        System.out.print("Year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (year % 100 == 0 && year % 400 != 0){
            System.out.println("Not a Leapyear");
        }else if (year % 400 == 0) {
            System.out.println("Leapyear");
        }else if (year % 4 == 0) {
            System.out.println("Leapyear");
        }else {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){

        System.out.print("Number: ");
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();
        int numberTwo, numberThree, numberFour;
        if (number > 999){
            System.out.println();
        }else{
            numberTwo = number % 10;
            numberThree = number % 100 / 10;
            numberFour = number % 1000 / 100;

            String numberturned = "" + numberTwo + numberThree + numberFour;
            System.out.println(numberturned);
        }
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}