 import java.util.*;
  class Bubble
  {
   public static void main(String[]  args)
   {
      int a[]={45,18,7,10,8};
      int i,j,temp;
      for(i=0;i<5;i++)
      {
         for(j=0;j<5-i-1;j++)
         {
         if(a[j]>a[j+1])
               {  	  temp=a[j];
              		 a[j]=a[j+1];
              		 a[j+1]=temp;
	        }
	   }  
      }	      
          for(i=0;i<5;i++)
         {
         	 System.out.println(a[i]);
         }
    }
}
