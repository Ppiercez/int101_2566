package work01;

public class Utilitor {
    public static String testString(String value){
        if (value == null){
            throw new NullPointerException();
        }
        if (value.isBlank()){
            throw new IllegalArgumentException();
        }
        return value;
    }
    public static double testPositive(double value){
        if (value < 0){
            throw new IllegalArgumentException();
        }
        return value;
    }
    public static long computeIsbn10(long isbn10){
        long newnumber = isbn10;
        long mod = 0 ;
        long sum = 0 ;
        for (int i = 2;i <= 10;i++){
            mod = newnumber % 10;
            mod = mod * i;
            newnumber = newnumber / 10;
            sum += mod;
        }
        sum %= 11;
        return sum = 11 - sum;
    }
}
