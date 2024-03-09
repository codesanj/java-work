class SaveAcc{
    static float r=1.5f;
    int accountno;
    int name;
    float balance;
    int p=200000;
   static float t=2.3f;
   static double interest;

    /*static void ModIntRate(){
         r=r*1.5f;
         SaveAcc obj0=new SaveAcc();
        obj0.p;
        interest=(p*r*t)/100;
         System.out.println("the modified rate is : "+interest);
    }*/

    void calcinterest(){
     
     interest=(p*r*t)/100;
     System.out.println("the rate is : "+interest);
    }

    public static void main(String arg[]){
        SaveAcc obj=new SaveAcc();
        obj.calcinterest();
        //ModIntRate();
        r=r*1.5f;
         SaveAcc obj0=new SaveAcc();
        //obj0.p;
        interest=(obj0.p*r*t)/100;
         System.out.println("the modified rate is : "+interest);
    }
}