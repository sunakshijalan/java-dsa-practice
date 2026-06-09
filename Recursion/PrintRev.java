class PrintRev
{
    void print(String n) 
    {
        if(n.length()==1)
        {
            System.out.print(n);
        }
        else
        {
            print(n.substring(1));
            System.out.print(n.charAt(0)+"");
        }
    }
    public static void main()
    {
        PrintRev ob=new PrintRev();
        ob.print("recursion");
    }
}