import java.util.Arrays;

public class qdan38 {
    public static void main(String[]args)
    {
        final double STARTRATE =10;
        final int NRATES =6;
        final int NYEARS =10;
        double[] interestRate=new double[NRATES];
        for (int j=0;j<interestRate.length;j++)
        {
            interestRate[j]=(STARTRATE+j)/100.0;
        }
        double[][] balances =new double[NYEARS][NRATES];
        for (int j=0;j<balances[0].length;j++)
        {
            balances[0][j]=10000;
        }
        for (int i=1;i<balances.length;i++)
        {
            for (int j=0;j<balances[i].length;j++)
            {
                double oldBalances=balances[i-1][j];
                double interest =oldBalances*interestRate[j];
                balances[i][j]=oldBalances+interest;
            }
        }
        for (int j=0;j<interestRate.length;j++)
            System.out.printf("%9,0%%",100*interestRate[j]);
        System.out.println();
        System.out.println(Arrays.deepToString(balances));
    }
}
