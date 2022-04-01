import java.util.ArrayList;

public class Matrix {
    public static ArrayList<Integer> numberOfNonZeroValues(int[][] Matrix){
        ArrayList<Integer> arrayList = new ArrayList<>();
        int sum = 0;
        for (int col = 0; col < Matrix.length; col++) {
            for (int i = 0; i < Matrix[col].length; i++) {
                if (Matrix[i][col] != 0) {
                    sum++;
                }
            }
        }
        arrayList.add(sum);
        return arrayList;           //ÉRTÉKNEK JÓT AD VISSZA
    }

    public static ArrayList<Integer> indexOfColumnsWithSameValues(int[][] Matrix){

        ArrayList<Integer> values = new ArrayList<>();
        int current = 0;

        for (int col = 0; col < Matrix[0].length; col++) {      // oszlop index
            current = Matrix[0][col];
            Boolean sameValues = true;

            for (int row = 0; row < Matrix.length; row++) {     // sor    index
                if (current == Matrix[col][row]){
                    sameValues = false;
                }

            }
            if (sameValues){
                values.add(col);
            }
        }
        return values;
    }
}
