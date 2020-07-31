import java.util.Arrays;

public class Count 
{
    public static void main(String args[])
    {
     int count = 0;
     public int countNumbers(int numbers[], int lessThan)
     {
         Arrays.sort(numbers); 
         for(int i = 0; i < sizeof(numbers); i++)
         {
             if(lessThan > a[i])
            {
                count++ ;
            } 
         }
         return count;
         
     }
    }
}
