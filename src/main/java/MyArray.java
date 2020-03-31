public class MyArray {
    public static int[] reverseArray(int[] array) {
        for (int index = 0, lastIndex = array.length - 1; index < array.length / 2; index++, lastIndex--) {
            int temp = array[index];
            array[index] = array[lastIndex];
            array[lastIndex] = temp;
        }
        return array;
    }
}
