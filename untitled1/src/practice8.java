import java.math.BigDecimal;
import java.math.BigInteger;

public class practice8 {
    public static void main(String[]args)
    {
        BigInteger a=BigInteger.valueOf(26);
        BigInteger c=BigInteger.valueOf(23);
        BigDecimal b=BigDecimal.valueOf(2134124124.34523525234235);
        System.out.printf("%4d %.4f",a.add(c),b);
    }

}
