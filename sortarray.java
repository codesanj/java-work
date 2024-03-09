import java.util.Scanner;
public class sortarray{
    public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
     int[] array = new int[10];  
     int temp;
     int i,j;
System.out.println("Enter five elements in the array: ");  

for(i=0; i<5; i++)  
{  
   
array[i]=sc.nextInt();  
} 
for(i=0;i<5;i++){
    for(j=i+1;j<5;j++){
        if(array[i]>array[j])
       { temp=array[i];
        array[i]=array[j];
        array[j]=temp;}
    }
}
System.out.println("the sorted array is: ");
for(i=0;i<5;i++){
    System.out.println(array[i]);
}
 }
 }