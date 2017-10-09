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

    public boolean containsElementFoundByBinarySearch(int element){
        if(indexOfElementByBinarySearch(element) > -1) {
            return true;
        }
        return false;
    }

    public int indexOfElementByBinarySearch (int element){
        return recursiveBinarySearch(element, intArray.length - 1, 0);
    }

    private int recursiveBinarySearch(int key, int lastIndex, int firstIndex) {
        if (firstIndex >= lastIndex) {
            return -1;
        }

        int mid = (firstIndex + lastIndex) / 2;
        if (key == intArray[mid]) {
            return mid;
        } else if (key < intArray[mid]) {
            return recursiveBinarySearch(key, mid, firstIndex);
        } else {
            return recursiveBinarySearch(key, lastIndex, mid + 1);
        }
    }

    @Override
    public String toString() {
        return "IntArrayBinSearchClass{" +
                "intArray=" + Arrays.toString(intArray) +
                '}';
    }

    public Integer getElementByIndex(int index){
        if (intArray != null && index >= 0 && index < intArray.length){
            return intArray[index];
        }
        return null;
    }
}
