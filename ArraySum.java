public class ArraySum {
    public static void main(String[] args)
    {
        float [] arr = {5.3f,4.4f,3,2,1};
        float sum = 0;
//        int len = arr.length;
        for(float element : arr)
        {
            sum +=element;
        }
        System.out.println(sum);

    }
}
