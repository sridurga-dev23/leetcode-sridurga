// Last updated: 8/13/2026, 3:42:02 PM
import java.util.Arrays;

class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        
        Arrays.sort(prices);
        Arrays.sort(discounts);

        double total = 0;

        for (int price : prices) {
            total += price;
        }

        int i = prices.length - 1;
        int j = discounts.length - 1;

        while (i >= 0 && j >= 0) {
            total -= (double) prices[i] * discounts[j] / 100;
            i--;
            j--;
        }

        return total;
    }
}