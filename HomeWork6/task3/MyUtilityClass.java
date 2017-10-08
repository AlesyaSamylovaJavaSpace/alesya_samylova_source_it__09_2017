package task3;

public class MyUtilityClass <T>{
    public T getElementByIndex(T[] array, int index) {
        T element = null;
        try {
            element = array[index];
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(" EXCEPTION " + ex.getClass().getCanonicalName()
                    + ": index " + index + " is not in range [0; " + array.length + "]");
        } catch (NullPointerException ex) {
            System.out.println(" EXCEPTION " + ex.getClass().getCanonicalName()
                    + " your array is null");

        } catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            return element;
        }
    }
}
