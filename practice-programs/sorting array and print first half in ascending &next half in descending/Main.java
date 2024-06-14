import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[100];
        int b[]=new int[100];
        int temp=0;
        for(int i=0;i<n;i++){
             a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
            if(a[i]>a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
        for(int i=0;i<n;i++){
           System.out.println(a[i]+" ");
         }   
         
         for(int i=0;i<n/2;i++){
           //System.out.print("FH:");
           System.out.println(a[i]+" ");
         }
         for(int i=n-1;i>=n/2;i--){
           //System.out.print("SH:");
           System.out.println(a[i]+" ");
         }
 
    }
}
