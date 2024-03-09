import java.util.Scanner;

public class as2 {
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks: ");
        int marks=sc.nextInt();
        if (marks>90 && marks<=100){
            System.out.println("A");
        }
        else  if (marks>80 && marks<=90){
            System.out.println("B");
        }
        else if (marks>70 && marks<=80){
            System.out.println("C");
        }
        else if(marks>60 && marks<=70){
            System.out.println("D");
        }
        else if (marks>50 && marks<=60){
            System.out.println("E");
        }
        else if (marks>40 && marks<=50){
            System.out.println("F");
        }
        else if (marks>30 && marks<=40){
            System.out.println("G");
        }
        else if (marks>20 && marks<=30){
            System.out.println("H");
        }
        else if (marks>10 && marks<=20){
            System.out.println("I");
        }
        else if(marks<=10){
            System.out.println("J");
        }
        
    }
}
