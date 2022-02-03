import java.util.Arrays;

public class Array_short_merge {
    public static void main(String[] args) {
        int[] array1 = { 67, 5, 4, 15, 66 };
        int[] array2 = { 78, 21, 30, 9, 88 };

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        int[] array3 = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, array3, 0, array1.length);
        System.arraycopy(array2, 0, array3, array1.length, array2.length);
        Arrays.sort(array3);

        System.out.println(Arrays.toString(array3));
    }
}
