public class multiplication{
    public int multiplication(int x,int y){
        return(x*y);
    }
    public int multiplication(int x,int y,int z){
        return(x*y*z);
    }
    public double multiplication(double x,double y){
        return(x*y);
    }
    public static void main(String arg[]){
        multiplication m=new multiplication();
        System.out.println(m.multiplication(10,20));
        System.out.println(m.multiplication(10,20,30));
        System.out.println(m.multiplication(10.3,20.7));
    }
}