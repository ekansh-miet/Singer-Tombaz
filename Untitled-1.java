import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int operations=0;
        while(true){
            int max1=-1, max2=-1;
            for(int i=0;i<n;i++){
                if(max1==-1 || a[i]>a[max1]){
                    max2=max1;
                    max1=i;
                }
                else if(max2==-1 || a[i]>a[max2]){
                    max2=i;
                }
            }
            if(a[max1]==0){
                break;
            }
            if(a[max1]==a[max2]){
                a[max1]=0;
                a[max2]=0;
            }
            else{
                a[max1]=a[max2];
                a[max2]=0;
            }
            operations++;
        }
        System.out.println(operations);
    }
}