public class Main {
public static void main(String[] args) {
int[] id = {25, 30, 28, 55, 30, 29};
checkIds(id);
}
public static void checkIds(int[] id) {
boolean isDuplicate;
for (int i = 0; i < id.length; i++) {
isDuplicate = false;
for (int j = 0; j < id.length; j++) {
if (i != j && id[i] == id[j]) {
isDuplicate = true;
break;
}
}
if (isDuplicate) {
System.out.println("The ID " + id[i] + " already exists.");
} else {
System.out.println("The student ID " + id[i] + " is registered.");
}
}
}
}
