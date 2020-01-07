package MatrizCero;

import java.util.LinkedList;
import java.util.List;

public class Matriz {

public static void main(String[] args) {
int[][] array = {{0, 2, 3}, {4, 0, 6}, {2, 5, 0}};

for (int i = 0; i < array.length; i++) {
for (int j = 0; j < array.length; j++) {
System.out.print(array[i][j] + " ");
}
System.out.println(" ");
}
List visitedRowIndex = new LinkedList();
List visitedColumnIndex = new LinkedList();
for (int i = 0; i < array.length; i++) {
for (int j = 0; j < array.length; j++) {
if (!visitedRowIndex.contains(i) && !visitedColumnIndex.contains(j) && array[i][j] == 0) {
visitedColumnIndex.add(j);
visitedRowIndex.add(i);
for (int k = 0; k < array.length; k++) {
array[k][j] = 0;
}
for (int k = 0; k < array.length; k++) {
array[i][k] = 0;
}
}
}
System.out.println(" ");
}

for (int i = 0; i < array.length; i++) {
for (int j = 0; j < array.length; j++) {
System.out.print(array[i][j] + " ");
}
System.out.println(" ");
}
}
}