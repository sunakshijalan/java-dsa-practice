//Write A Progrram To Print The First And Last Occurrence Of A String
class FirstLastOccurrence 
{
    void occurence(String s,char a,int i,int f,int l)
    {
        if(i==s.length()-1)
            System.out.println("last occurence of character is "+l);
        else
        {
            if(s.charAt(i)==a&&f==-1)
            {
                System.out.println("The first occurence of character is "+i);
                occurence(s,a,i+1,i,l);
            }
            else if(s.charAt(i)==a&&f!=-1)
                occurence(s,a,i+1,f,i);
            else
                occurence(s,a,i+1,f,l);
        }
        
    }
    public static void main()
    {
        FirstLastOccurrence ob=new FirstLastOccurrence();
        ob.occurence("abaacdaefaah", 'a', 0, -1, -1);
    }
}
