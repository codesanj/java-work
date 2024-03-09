import java.util.Scanner;

public class as3 {
    public static void main(String a[]) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("enter day number: ");
        int var2 = var1.nextInt();
        int var3 = var2 % 7;
        switch (var3) {
            case 1:
                System.out.println("SUNDAY");
                break;
            case 2:
                System.out.println("MONDAY");
                break;
            case 3:
                System.out.println("TUESDAY");
                break;
            case 4:
                System.out.println("WEDNESDAY");
                break;
            case 5:
                System.out.println("THURSDAY");
                break;
            case 6:
                System.out.println("FRIDAY");
                break;
            case 7:
                System.out.println("SATURDAY");
                break;
            default:
                break;
        }
    }
}
