package экзамен;

public class MinMax {

    private int array[];



    public interface searchMinMax{
        void search();
    }



    public int[] getArray() {
        return array;
    }

    public static int searchMax(int[] array){
        int res = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i-1] < array[i]){
                res = i;
            }
        }
        return array[res];
    }

    public static int searchMin(int[] array){
        int res = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i-1] > array[i]){
                res = i;
            }
        }
        return array[res];
    }
}
