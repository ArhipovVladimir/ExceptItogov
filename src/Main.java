// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[][] data;
        data = new String[][]
                {{"11", "t", "3", "8"},
                 {"1", "s1", "2", "2"},
                 {"1", "r1", "2", "3"},
                 {"h", "1", "5", "1"}};
        try {
           calcManrix (data);
       } catch (MyArraySizeException e) {
           e.printStackTrace();
       }

    }

    private static void calcManrix(String[][] matrix) throws MyArraySizeException {
        if (matrix.length !=4 ){
            throw new MyArraySizeException("Не верный размер массива");
        } else if (matrix[1].length !=4){
            throw new MyArraySizeException("Не верный размер массива");
        } else if (matrix[2].length != 4) {
            throw new MyArraySizeException("Не верный размер массива");
        } else if (matrix[3].length !=4 ) {
            throw new MyArraySizeException("Не верный размер массива");
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

            }


        }
    }
}

