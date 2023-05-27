package PlayGround;

import java.util.Arrays;

public class ClassWork {
    private static int [] arrayHolder;

    public static void setArrayHolder(int[] arrayHolder) {
        int[] arrayNumber = {2,5,1};
        arrayHolder = new int[arrayNumber.length * 2];
        for (int index = 0; index < arrayNumber.length; index++) {
            arrayHolder[index] = arrayNumber[index];
        }
    }

    public static String getArrayHolder() {
        return Arrays.toString(arrayHolder);
    }
}
