interface A 
{
    void show();
}
interface B 
{
    void show();
}
class C 
{
     public void show()
    {
        System.out.println("I am show method");
    }
}
class D implements A,B 
{
    public void show()
    {
        System.out.println("I am show method of d");
    }
}
public class MultipalInheritance
{
    public static void main(String args[])
    {
        D d=new D();
        d.show();
    }
}