public class MyArrayDataException extends NumberFormatException{

    public MyArrayDataException (int i,  int j)
    {
        System.out.printf(" ошибка в index %d - %d ", i, j);

    }
}