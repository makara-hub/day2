
public class Main {
public static void main(String[] args) {
int[] Readings = {25, 30, 28, 55, 32, 29};
Readings(Readings);
  }
public static void Readings(int[] readings) {
for (int i = 0; i < readings.length; i++) {
if (readings[i] > 50) {
System.out.println("Fault detected in sensor " +i);
}
else  {
System.out.println("All sensors are functioning within the normal range.");
        }}
    }
}
