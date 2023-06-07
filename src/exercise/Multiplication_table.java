package exercise;

public class Multiplication_table {

    /*
     * Your task, is to create N×N multiplication table, of size provided in parameter.
     * For example, when given size is 3:
     * 1 2 3
     * 2 4 6
     * 3 6 9
     * For the given example, the return value should be: [[1,2,3],[2,4,6],[3,6,9]]
     */

    public static void main(String[] args) {
        for (int[] i: multiplicationTable(4)) {
            for (int j: i) {
                System.out.print(j+",");
            }
            System.out.println();
        }
    }

    public static int[][] multiplicationTable(int n) {
        int[][] table = new int[n][n];

        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                table[y][x] = (x+1) * (y+1);
            }
        }
        return table;
    }

//    Best solution
//    public static int[][] multiplicationTable(int n) {
//        return rangeClosed(1, n)
//                .mapToObj(i -> rangeClosed(1, n)
//                        .map(v -> v * i)
//                        .toArray())
//                .toArray(int[][]::new);
//    }

}
