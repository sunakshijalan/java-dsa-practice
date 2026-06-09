//Write A Program To Print All Possible Subsequences Of A String
class Subsequences 
{
    void subsequence(String s,String newstr)
    {
        if (s.length()==1)
        {
            System.out.println(newstr+s);
            System.out.println(newstr);
        }
        else
        {
            subsequence(s.substring(1),newstr+s.charAt(0));
            subsequence(s.substring(1),newstr);
        }
    }
    public static void main()
    {
        Subsequences ob = new Subsequences();
        ob.subsequence("abc", "");
    }
}
