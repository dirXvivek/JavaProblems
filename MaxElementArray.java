public class MaxElementArray {
    public static void main(String[] args)
    {
        int [] array = {13,1,4,53,2};
        int arr = array.length;
        int max = array[0];
        for(int i=0;i<arr;i++)
        {
            if(array[i]>max)
            {
                max = array[i];
            }
            else
            {
                max = max;
            }
        }
        System.out.println("maximum number are: "+max);

    }
}
