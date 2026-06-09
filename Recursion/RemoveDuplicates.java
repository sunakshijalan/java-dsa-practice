//Write A Program To Remove Duplicate Characters From A String
class RemoveDuplicates 
{
    public static String removeDup (String s,int i)
    {
        if(i==-1)
            return s;
        else if(s.indexOf(s.charAt(i))!=s.lastIndexOf(s.charAt(i)))
            return removeDup((s.substring(0,i)+s.substring(i+1)),i-1);
        else
            return removeDup(s,i-1);
    }
    public static void main() 
    {
        System.out.println(removeDup("abbccda","abbccda".length()-1)+"");
    }
}
