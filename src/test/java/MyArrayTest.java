import org.junit.Assert;
import org.junit.Test;

public class MyArrayTest {

    @Test
    public void reverseArray() {
        int[] expectedArray = { 4, 1, 9, 4, 10, 31, 2, 12, 145, 123 };
        int[] actualArray = { 123, 145, 12, 2, 31, 10, 4, 9, 1, 4, 1231231};
        actualArray = MyArray.reverseArray(actualArray);
        Assert.assertArrayEquals(expectedArray, actualArray);
    }
}