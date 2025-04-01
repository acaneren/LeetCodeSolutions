int maxProfit(int* prices, int pricesSize) {
    
    int min_price = prices[0];
    int max_profit = 0;
    int profit = 0;

    if (pricesSize < 2)
    {
        return 0;
    }
    
    for (int i = 0; i < pricesSize; i++)
    {
        profit = prices[i] - min_price;

        if (profit > max_profit)
        {
            max_profit = profit;
        }
        if (prices[i] < min_price)
        {
            min_price = prices[i];
        }
    }
    return max_profit;   
}