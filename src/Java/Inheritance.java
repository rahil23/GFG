package Java;

class A {
    int a;
    int b;
    public void fun_A()
    {
        a=7;b=7;
        System.out.println("the value of a and 7 in base class is"+a+" --"+b);
    }
    public void commonMethod()
    {
        a=8;b=8;
        System.out.println("the value of a and b in base class common method  is"+a+" --"+b);

    }
}
public class Inheritance extends A {
    int a;
    int c;
    public void fun_B()
    {
        a=2;b=2;
        System.out.println("the value of a and 7 in Child class is"+a+" --"+b);
    }
    public void commonMethod()
    {
        a=9;b=9;
        System.out.println("this is overridden method"+a+" --"+b);

    }

    public static void main(String[] args) {
/*        A objA  =new A();
        objA.fun_A();
        objA.commonMethod();*/


      /*  A objIn  =new Inheritance();
        objIn.fun_A();
      //  objIn.fun_B() -->  THIS WILL GIVE COMPILATION ERROR AS REFRENCE IS OF PARENT CLASS AND METHOD IS OF BASE CLASS
        objIn.commonMethod();*/

/*
        Inheritance objb = new Inheritance();
        objb.fun_A();
        objb.fun_B();
        objb.commonMethod();
*/

        A objb = new Inheritance();
        objb.fun_A();
        objb.commonMethod();





    }
}
