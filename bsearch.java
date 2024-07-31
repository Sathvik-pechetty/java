import java.util.*;
class Binary
{
  public static void main(String[] args)
  {
     int a[]={7,18,45,10,8};
     int key=7,flag=0;
     int mid,low=0,high=4;
       while(low<=high)
       {
          mid=(low+high)/2;
          if(key==a[mid])
          {
          flag=1;
          break;
          }
          else if(key>a[mid])
          {
             low=mid+1;
           }
           else
           {
             high=mid-1;
           }
          }
          if(flag==1)
          {
          System.out.println("key is found");
          }
          else
          {
          System.out.println("key is not found");
          }
    }
}
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
