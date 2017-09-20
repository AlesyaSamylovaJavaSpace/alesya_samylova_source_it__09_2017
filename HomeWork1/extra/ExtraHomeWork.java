package extra;
public class ExtraHomeWork {

    public static Integer getSum(Integer a, Integer b){
        return a + b;
    }

    // To calculate Greatest Common Divisor of two numbers
    public static Integer myGCDfunction(Integer a, Integer b){
        Integer min_num = b;

        if (a < b) {
            min_num = a;
        }

        for (Integer gds = min_num; gds >= 1; gds--){
            if ((a % gds == 0) && (b % gds == 0)){
                return gds;
            }
        }

        return 1;
    }

    public static void main(String[] args){
        Integer a = 156;
        Integer b = 18;

        System.out.println("Sum of " + a + " and " + b + " is equal to" + getSum(a,b));
        System.out.println("Greatest Common Divisor of " + a + " and " + b + " is equal to " + myGCDfunction(a,b));
    }
}
