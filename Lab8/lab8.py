def coinChange(self, coins, amount):
        min_coin = [amount + 1] * (amount + 1)
        min_coin[0] = 0
        for coin in coins:
            for j in range(coin, amount + 1):
                min_coin[j] = min(min_coin[j], min_coin[j - coin] + 1)
        if min_coin[amount] <= amount:
            return min_coin[amount]
        else:
            return -1