import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        int c[]=new int[n+m];
        int temp=0;

for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
    if((a[i]>a[i+1]) && (i!=(i+1))){
       temp=a[i];
       a[i]=a[i+1];
       a[i+1]=temp;
    }
}
for(int j=0;j<m;j++){
    b[j]=sc.nextInt();
    if((b[j]>b[j+1]) && (j!=(j+1))){
       temp=b[j];
       b[j]=b[j+1];
       b[j+1]=temp;
    }
}
for(int i=0;i<n;i++){
    c[i]=a[i]; 
}
for(int i=n;i<m;i++){
    c[i]=b[i]; 
}
}}