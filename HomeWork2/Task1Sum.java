
public class Task1Sum {
    public static int getSumOfDigitsFromNumber(int num){
        int sum = 0;

        while (num != 0){
            sum += num % 10;
            num/=10;
        }
        return sum;
    }

    public static int getSumOfDigitsFromNumberRecursiveFunc(int num){
        if (num == 0){
            return num;
        } else {
            return num%10 + getSumOfDigitsFromNumberRecursiveFunc(num/10);
        }
    }
}
