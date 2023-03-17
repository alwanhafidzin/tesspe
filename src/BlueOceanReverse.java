import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BlueOceanReverse {
    public static void main(String[] args) {
        int[] array1 = {1,5,5,5,3};
        int[] array2 = {5};
        System.out.println(Arrays.toString(blueOceanReverse(array1, array2)));
    }

    public static int[] blueOceanReverse(int[] array1, int[] array2){
        List<Integer> listArray2 = convertToArrayList(array2);
        List<Integer> listFinal =new ArrayList<>();
        for (int i =0; i< array1.length; i++){
            if(!listArray2.contains(array1[i])){
                listFinal.add(array1[i]);
            }
        }
        int[] array = new int[listFinal.size()];
        for(int i =0; i< listFinal.size(); i++){
            array[i] = listFinal.get(i);
        }
        return array;
    }

    public static List<Integer> convertToArrayList(int[] array){
        List<Integer> listArray = new ArrayList<>();
        for(int i=0; i<array.length; i++){
            listArray.add(array[i]);
        }
        return  listArray;
    }
}
