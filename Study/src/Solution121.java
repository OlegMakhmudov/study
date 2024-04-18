/**
 * В данном классе решается задача 121.
 */
public class Solution121 {
  /**
   * Вызывается работа программы.
   *
   * @param args аргументы программ.
   */
  public static void main(String[] args) {
    Solution121 solution121 = new Solution121();
    int[] prices = {7, 2, 9, 1, 2, 3};
    System.out.println(solution121.maxProfit(prices));
  }

  /**
   * Вычисляем максимальную прибыль.
   * Прибыль = Цена продажи - цена покупки.
   *
   * @param prices массив цен.
   * @return максимальная прибыль.
   */
  public int maxProfit(int[] prices) {
    int buyPrice = prices[0];
    int maxProfit = 0;

    for (int i = 1; i < prices.length; i++) {
      if (prices[i] < buyPrice) {
        buyPrice = prices[i];
      } else {
        maxProfit = Math.max(maxProfit, prices[i] - buyPrice);
      }
    }
    return maxProfit;
  }
}
