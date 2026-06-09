class KeypadCombinations 
{
    void keypadComb(String s,String combination,String[] arr)//classic permutation problem
    {
        if(s.length()==0)
            System.out.println(combination);
        else
        {
            String map=arr[s.charAt(0)-'0'];
            for(int i=0;i<map.length();i++)
            {
                keypadComb(s.substring(1),combination+map.charAt(i),arr);
            }
        }
    }
    public static void main(String args[]) 
    {
        KeypadCombinations ob = new KeypadCombinations();
        String[] arr= {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
        ob.keypadComb("23", "", arr);
    }
}
