class test1{
    test1(){
        System.out.println("enter your name: ");
    }
}
class A extends test1{
    A(){
        System.out.println("my name is sanj");
    }
}
class B extends A{
    B(){
        System.out.println("my name is shaurya");
    }
}
class test{
    public static void main(String[] arg){
        A b=new B();

    }
}