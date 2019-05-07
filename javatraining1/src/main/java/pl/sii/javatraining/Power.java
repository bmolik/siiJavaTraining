package pl.sii.javatraining;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(2,3));

    }

    public static int power(int base, int power){
            int result = 1;
            for (; power != 0; power--) {
                result *= base;
            }
            return result;
        }
}
