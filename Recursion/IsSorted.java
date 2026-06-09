//Write A Program To Print Whether An Array Is Sorted
class IsSorted 
{
    public static boolean sorted(int[] arr,int i)
    {
        if(i==arr.length)
            return true;
        else if(arr[i]<=arr[i-1])
            return false;
        return sorted(arr,i+1);
    }
    public static void main()
    {
        int[] arr={1,2,3,4,4};
        System.out.println(sorted(arr,1)+"");
    }
}