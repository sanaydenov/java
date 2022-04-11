package FirstHomeWork;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println("Задача 1: " + checkRange(3,21));
        checkPositive(7);
        System.out.println("Задача 3: " + checkNegative(-1));
        printText("Приличный текст", 3);
        System.out.println("Задача 5: " + checkYear(2020));
    }

    public static boolean checkRange(int a, int b){
       boolean c = ((a + b) >= 10) && ((a+b) <=20);
       return c;
    }
    public static void checkPositive(int d){
        if (d >= 0) {
            System.out.println("Задача 2: Число положительное");
        }
        else {
            System.out.println("Задача 2: Число отрицательное");
        }

    }
    public static boolean checkNegative(int e){
        boolean f = (e < 0);
        return f;
    }
    public static void printText(String text, int g){
        System.out.println("Задача 4: ");
        for (int i = 1; i <= g; i++){
            System.out.println(text);
        }
    }
    public static boolean checkYear(int y){
        boolean x = (y%4 == 0) && (y%100 != 0) || (y%400 == 0);
        return x;

    }
}
