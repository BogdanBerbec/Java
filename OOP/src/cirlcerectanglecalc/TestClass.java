package cirlcerectanglecalc;

public class TestClass {

    public static void main(String[] args) {
        int[][] matrix1 = { { 1 , 2 , 3 } , { 5 , 6 , 7 } , { 9 , 0 , 1 } };
        int[][] matrix2 = { { 4 , 1 , 6 } , { 2 , 3 , 5 } , { 7 , 4 , 3 } };
        int[][] matrix3 = new int[3][3];
        for (int i=0, j=0; i<3 && j<3; i++, j++) {
            matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            System.out.print(matrix3[i][j]);
        }
    }
}
