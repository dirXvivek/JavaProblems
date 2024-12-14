public class AvgMark {
    public static void main(String[] args)
    {
        float [] marks ={56,43.3f,43,24,21};
        float sum = 0;

        for(float elements:marks)
        {
            sum =sum+elements;

        }
        float avg = sum/marks.length;
        System.out.println("the average marks are: "+avg);
    }
}
