
public class Task5ExcelColumn {

    protected static final char [] ALPHABET_ARRAY = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                                                     'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static String getExcelStringCode(Integer numCode) {

        if (numCode <= 0) {
            return null;
        }

        int reminder = 0;
        int intPart = numCode -1;
        String strCode = "";
        int basis = ALPHABET_ARRAY.length; // equals to 26

        while (intPart>=0) {
            reminder = intPart % basis;
            strCode = ALPHABET_ARRAY[reminder] + strCode;
            intPart = intPart/basis -1;
        };

        return strCode;
    }

    public static Integer getIntCodeForExcelColumn(String strCode){
        if (strCode == null){
            return -1;
        }

        char [] strChar = strCode.toCharArray();
        boolean isValid = false;

        // Check validity of strCode
        for (char charEl : strChar) {
            isValid = false;
            for (char letter : ALPHABET_ARRAY){
                if (charEl == letter){
                    isValid = true;
                    break;
                }
            }

            if (isValid == false){
                return -1;
            }
        }

        // Convert strCode to numCode
        Integer numCode = 0;
        int n = ALPHABET_ARRAY.length; // equals to 26

        for (int i = 0; i < strChar.length; i++){
            for (int j = 0; j < n; j++){
                if (strChar[i] == ALPHABET_ARRAY[j]){
                    numCode = (j+1) + numCode*n;
                }
            }
        }

        return numCode;
    }

    public static String getNextExcelColumn(String excelColumn){
        return getExcelStringCode(getIntCodeForExcelColumn(excelColumn)+1);
    }
}
