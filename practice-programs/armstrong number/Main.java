import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n,temp1=n,count=0,u,x,sum=0;
        
        //****to find no.of digits*******
        
        while(n>0){
            n=n/10;
            count++;
        }
        
        
        while(temp>0){
        int c=count;
            x=1;
            u=temp%10;
            while(c>0){
                x=x*u;
                c--;
            }
            sum=sum+x;
            temp=temp/10;
            }
            if(sum==temp1){
                System.out.println("Amstrong number");
            }
            else{
                System.out.println(" Not an Amstrong number");
                
            }
        }
}
        
        
        
        
        
        