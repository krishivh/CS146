def isVisited(self, visitedList):
    for v in visitedList[1:]:
        if not v:
            return False
    return True

def min_cost_to_supply_water(self, n, wells, pipes):
        visitedList = [False] * (n + 1) 
        totalCost = 0

        while not self.isVisited(visitedList):
            bestWell = float('inf')
            bestWellHouse = -1


            for i in range(1, n + 1):
                if not visitedList[i] and wells[i - 1] < bestWell:
                    bestWell = wells[i - 1]
                    bestWellHouse = i

            bestPipe = float('inf')
            bestPipeHouse = -1

            for house1, house2, cost in pipes:
                if visitedList[house1] and not visitedList[house2] and cost < bestPipe:
                    bestPipe = cost
                    bestPipeHouse = house2
                elif visitedList[house2] and not visitedList[house1] and cost < bestPipe:
                    bestPipe = cost
                    bestPipeHouse = house1

            if bestWell <= bestPipe:
                visitedList[bestWellHouse] = True
                total_cost += bestWell
            else:
                visitedList[bestPipeHouse] = True
                totalCost += bestPipe

        return totalCost
    
