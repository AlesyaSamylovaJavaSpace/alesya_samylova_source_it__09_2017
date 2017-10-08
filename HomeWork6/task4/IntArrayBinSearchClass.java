package task4;

import java.util.Arrays;

public class IntArrayBinSearchClass {
    private int[] intArray = null;

    public IntArrayBinSearchClass(int length){
        if (length>0) {
            intArray = new int[length];
            for (int i = 0; i < length; i++) {
                intArray[i] = (int)(Math.random()*100);
            }
        }
        Arrays.sort(intArray);
    }

    @Override
    public String toString() {
        return "IntArrayBinSearchClass{" +
                "intArray=" + Arrays.toString(intArray) +
                '}';
    }
}
