public class FindMaxProfit {

	public static void main(String[] args) {
		int []prices= {7,1,5,3,6,4};
		int profit=maxProfit(prices);
		System.out.println("The profit is "+profit);
	}

	private static int maxProfit(int[] prices) {
		int minPrice=Integer.MAX_VALUE;
		int maxProfit=0;
		for (int i : prices) {
			if(i<minPrice) {
				minPrice=i;
			}
			int profit=i-minPrice;
			if(profit>maxProfit) {
				maxProfit=profit;
			}
		}
		return maxProfit;
	}

}
