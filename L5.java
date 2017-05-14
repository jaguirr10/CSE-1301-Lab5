// Juan Aguirre

import java.io.*;
import java.util.Scanner;

public class L5
{
   public static void main (String args [])throws IOException
   {
	   System.out.println("Index\tValue");
	   
      Scanner scan = new Scanner(new File ("E://Datafile2.txt"));
     
      int maxValue = -9999;
      int minValue = 9999;
      int value = scan.nextInt();
      int position = 0;
     int SaveMax = 0;
      int SaveMin = 0;
         
      do
      {
      position++;
         System.out.println(position +"\t" + value); //value
         if(value > maxValue)
         {
            maxValue = value ;
            SaveMax = position;
         }
         if(value < minValue)
         {
           SaveMin = position;
           minValue = value;
         }  
         value = scan.nextInt();   
      }
      while(value != -1);
      
      System.out.println();
      System.out.println("The Max Value was " + maxValue + " at position " + SaveMax);
      System.out.println();
     System.out.println("The Min Value was " + minValue + " at position " + SaveMin);
      
   }
}
        
     
     

