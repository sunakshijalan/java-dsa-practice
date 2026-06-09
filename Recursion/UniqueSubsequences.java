//Write A Program To Print All Unique Subsequences Of A String
import java.util.*;
class UniqueSubsequences 
{
    void uniqueSubsequence(String s,String newstr,HashSet<String> set)
    {
        if (s.length()==0)
        {
            if(set.contains(newstr))
                System.out.print("");
            else
            {
                set.add(newstr);
                System.out.println(newstr);
            }
        }
        else
        {
            uniqueSubsequence(s.substring(1),newstr+s.charAt(0),set);
            uniqueSubsequence(s.substring(1),newstr,set);
        }
    }
    public static void main()
    {
        HashSet<String> set=new HashSet<>();
        UniqueSubsequences ob=new UniqueSubsequences();
        ob.uniqueSubsequence("aaa", "", set);
    }
}
