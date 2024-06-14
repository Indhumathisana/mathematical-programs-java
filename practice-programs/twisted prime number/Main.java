import java.util.*;
public class Main{
          public static void main(String[]args){
              Scanner sc=new Scanner(System.in);
              int n=sc.nextInt();
              int count=0;
              int temp=n,rev=0,r;
              for( int i=2;i<n;i++){
                  if(n%i==0){
                  count++;    
                  }
                  else if(count==0){
                      while(n>0){
                     r=n%10;
                     rev=(rev*10)+r;
                     n =n/10; 
                     }
                     }
                     for(int j=2;j<rev;j++){
                         if(rev%j==0){
                             System.out.println("Twisted Prime Number");
                         }
                         else{
                             System.out.println(" Not Twisted Prime Number");
                         }
                     }
                  }
                  
              }

          }