package LC.ArrayString;

public class StockSell {

    public static void main(String[] args) {

        int p[] = {7, 1, 5, 3, 6, 4};
        int profit = 0;
        int maxProfit=0;
        for (int i = 1; i < p.length - 1; i++) {


                 if(p[i]>p[i-1])
                 {
                     profit = profit+ p[i]-p[i-1];
                     maxProfit = Math.max(profit,maxProfit);
                 }
        }
        System.out.println(maxProfit);
    }
}