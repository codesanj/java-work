import java.util.*;
public class as21{
    public static void main(String arg[]){
        Scanner var1 = new Scanner(System.in);
        System.out.println("enter numbers: ");
        int a = var1.nextInt();
        int b=var1.nextInt();
        int c=var1.nextInt();
        int temp,largest;
        temp=a>b?a:b;
        largest=c>temp?c:temp;
        System.out.println("the largest number is "+largest);
    }
}

