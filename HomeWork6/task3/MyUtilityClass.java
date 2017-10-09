package task3;

import jdk.management.resource.ResourceRequestDeniedException;
import task2.MyCheckedException;
import task2.MyUncheckedException;

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

    public Integer convertStringToInteger(String str) {
        Integer intVar = null;
        try {
            intVar = Integer.valueOf(str);
        } catch (NumberFormatException ex) {
            System.out.println(" EXCEPTION " + ex.getClass().getCanonicalName()
                    + " your string \"" + str + "\" can't be converted to Integer");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            return intVar;
        }
    }

    public void obtainMyUncheckedException(){
        throw new MyUncheckedException();
    }

    public void obtainMyCheckedException() throws MyCheckedException{
        throw new MyCheckedException();
    }

    public void processIllegalResourceException() throws MyCheckedException{
         try {
             throw new ResourceRequestDeniedException();
         } catch (ResourceRequestDeniedException ex) {
             ex.printStackTrace();
         } finally {
             throw new MyCheckedException();
         }
    }

    public Double convertObjectToDouble(Object o) {
        Double doubleVar = null;
        String strVar = null;
        try {
            strVar = (String) o;
            doubleVar = Double.valueOf(strVar);
        } catch (ClassCastException ex) {
            System.out.println(" EXCEPTION " + ex.getClass().getCanonicalName()
                    + ": your object cannot be cast to String");
        } catch (NumberFormatException ex) {
            System.out.println(" EXCEPTION " + ex.getClass().getCanonicalName()
                    + " your string \"" + strVar + "\" can't be converted to Double");
        }
        return doubleVar;
    }
}
