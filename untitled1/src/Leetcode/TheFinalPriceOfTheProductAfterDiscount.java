package Leetcode;

public class TheFinalPriceOfTheProductAfterDiscount{

    public int[] finalPrices(int[] prices) {
        int [] back = new int[prices.length];
        for (int i = 0;i<prices.length-1;i++){
            int j = i+1;
            back[i] = FindPrice(i,j,prices);
        }
        back[prices.length] = prices[prices.length];
        return back;
    }
    public int FindPrice(int i,int j,int[] prices){
        if (prices[i]>prices[j])
        {
            return prices[i] - prices[j];
        }
        else {
            j=j+1;
            if (j >= prices.length) return prices[i];
            else return FindPrice(i,j,prices);
        }
    }

    public static void main(String[] args) {
        int[] a = {8,4,6,2,3};
        TheFinalPriceOfTheProductAfterDiscount w = new TheFinalPriceOfTheProductAfterDiscount();
        int[] b = w.finalPrices(a);
        System.out.println(b[0]);
    }
}
