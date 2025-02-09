import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the size of the array: ");
int n = scanner.nextInt();
int[] array = new int[n];
System.out.println("Enter the elements of the array:");
for (int i = 0; i < n; i++) {
array[i] = scanner.nextInt();
}
int largest = array[0];
int largestIndex = 0;
for (int i = 1; i < n; i++) {
if (array[i] > largest) {
largest = array[i];
largestIndex = i;
}
}
int elementsAfterLargest = n - largestIndex - 1;
if (elementsAfterLargest == 3) {
largest -= 100;
} else if (elementsAfterLargest > 3) {
largest -= 500;
} else if (elementsAfterLargest == 2 || elementsAfterLargest == 1) {
System.out.println("2 debit count: " + (elementsAfterLargest == 2 ? 1 : 0));
System.out.println("1 debit count: " + (elementsAfterLargest == 1 ? 1 : 0));
return;
}
System.out.println("Largest element : " + largest);
    }
}
