import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
       
        int[] array = new int[n];
       
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int v=16;
       int mid=0;
        int l=0;
        int h=v;
        while(l<h)
        {
             mid=(l+h)/2;
        if(mid*mid==v){
            System.out.println("mid");
        }
       
               else if(mid*mid>v)
                {
                    v=mid;
                }
            else{
                l=mid;
            }
     
        scanner.close();
    }}}
