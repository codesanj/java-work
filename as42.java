import java.util.Scanner;  
public class as42{
    static int countofdigits(int N,int M){
        int f1[]=new int[10];
        int f2[]=new int[10];
        int count=0;
        while(N>0){
            f1[N%10]++;
            N=N/10;
        }
        while(M>0){
            f2[M%10]++;
            M=M/10;
        }
        for(int i=0;i<10;i++)
        {
            if(f1[i]>0 && f2[i]>0){
                count++;
            }
        }
        return count;
    }
    public static void main(String arg[]){
        Scanner var1 = new Scanner(System.in);
        System.out.println("enter first number: ");
        int N = var1.nextInt();
        System.out.println("enter second number ");
        int M = var1.nextInt();
        System.out.println(countofdigits(N,M));
    }
}

