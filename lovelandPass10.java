/*
Angelia
11/17/18
CSCI 1015-W1S
Programming Assignment 10
Purpose of this program is to pass an array of your choosing, I have chosen the int array, 
to methods and use array algorithm. The first method should gather the sum of the values set in 
the array. The second method should gather the average of the values set in the array. The third 
method should decide which number of the array values is the highest number. Finally, the fourth
method should determine which number of the array values is the lowest number.   
*/

public class lovelandPass10
{
   public static void main(String[] args)
   {
      int[] iarray = { 2, 1, 9, 7, 3 };
      int total = getTotal(iarray);
      int average = getAverage(iarray);
      int high = getHighest(iarray);
      int low = getLowest(iarray);
      
      System.out.println("Processing the int array.");
      System.out.println("Total: " +total);
      System.out.println("Average: " +average);
      System.out.println("Highest Value: " +high);
      System.out.println("Lowest Value: " +low);
   }
   
   //This method gathers the total of the values set in the array and returns it to the main method
   public static int getTotal(int[] iTotal)
   {
      int total = 0;
      //For loop to get the sum of iarray passed to this method
      for(int i = 0; i < iTotal.length; i++)
      {
         total += iTotal[i];
      }
      return total;
   }
   
   //This method gathers the average of the values set in the array and returns it to the main method
   public static int getAverage(int[] iAverage)
   {
      int sum = 0;
      int average;
      //For loop to get the average of iarray passed to this method
      for (int i = 0; i < iAverage.length; i++) 
      {
         sum += iAverage[i];
      }
      average = sum / iAverage.length;
      //Returning the result back to the main
      return average;
   }
   
   //This method returns the highest value set in the array back to the main method
   public static int getHighest(int[] iHigh)
   {
      int high = iHigh[0];
      //For loop to determine the highest number of iarray passed to this method
      for(int i = 1; i < iHigh.length; i++)
      {
         if(iHigh[i] > high)
         {
            high = iHigh[i];
         }
      }
      //Returing the result back to the main
      return high;
   }
   
   //This method returns the lowest value set in the array back to the main method
   public static int getLowest(int[] iLow)
   {
      int low = iLow[0];
      //For loop to determine the lowest number of iarray passed to this method
      for(int i = 1; i < iLow.length; i++)
      {
         if(iLow[i] < low)
         {
            low = iLow[i];
         }
      }
      //Returning the result back to the main
      return low;
   }
   
}