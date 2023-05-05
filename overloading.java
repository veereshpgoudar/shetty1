class overloading 
{
    void add(int x,int y)
    {
        System.out.println(x+y);
    }
    void add(int x,int y,int z)
    {
        System.out.println(x+y+z);
    }
    void add(float x,int y)
    {
        System.out.println(x+y);
    }
}
    
class demooverloading
{
    public static void main(String argu[])
    {
        overloading a=new overloading();
        a.add(200.2f,20);
        a.add(45,20,30);
        a.add(44,86);
    }
}