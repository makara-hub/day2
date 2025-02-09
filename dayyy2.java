public class Main {
public static void main(String[] args) {
int[] Prices = {100, 200, 150, 200};
int count = MaxPrice(Prices);
System.out.println("The maximum stock price occurs " + count + " times.");
}
public static int MaxPrice(int[] Prices) {
int maxPrice = Prices[0];
int count = 1;
for (int i = 1; i < Prices.length; i++) {
if (Prices[i] > maxPrice) {
maxPrice = Prices[i];
count = 1;
} else if (Prices[i] == maxPrice) {
count++;
}
}
return count;
}
}
