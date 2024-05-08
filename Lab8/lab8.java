class Solution {
    public int coinChange(int[] coins, int amount) {
    // initalize an array with amount+1 coins and the reason is if we need to use pennies only we still have enough to create amount
    int[] minCoin = new int[amount + 1];
    
    //fill the entire array with amount+1 as the value and as we test out possibilities for amount that will be updates
    Arrays.fill(minCoin, amount + 1);
    
    //make the minimum amount of coins for an amount 0 to be 0
    minCoin[0] = 0;
    
    //iterate through each coin in coins
    for (int coin : coins) {
        //iterate through each amount starting from the value of the coin
        for (int j = coin; j <= amount; j++) {
            //calculate the minimum number of coins needed for current amount
            minCoin[j] = Math.min(minCoin[j], minCoin[j - coin] + 1);
        }
    }
    
    //check if the amount is less than or equal to and if it is then erturn minCoin[amount]
    if (minCoin[amount] <= amount) {
        return minCoin[amount];
}   
    //return -1 if there is no possible combination
    else {
        return -1;
}

}
}

