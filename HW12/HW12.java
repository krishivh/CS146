public class HW12 {
    //check to see if been visited yet
    private boolean isVisited(boolean[] visited) {
        for (int i = 1; i < visitedList.length; i++) {
            if (!visitedList[i]) return false;
        }
        return true;
    }

    public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        //create visitedlist which will return true or false if it has been visited
        //also initialize total cost as 0 
        boolean[] visitedList = new boolean[n + 1];
        int totalCost = 0;
    
        while (!isVisited(visitedList)) {
            //start by initializing the bestWell as the maximum possible integer and make the bestWellHouse as well
            int bestWell = Integer.MAX_VALUE;
            int bestWellHouse = -1;
    
            //iterate through all of the wells
            for (int i = 1; i <= n; i++) {
                //if the well is not in the visited list and the next well that we are iterating through is better, then we change the best well and swap the index
                if (!visitedList[i] && wells[i - 1] < bestWell) {
                    //if the if statement passes then we change the best well and its index
                    //reason that the house index is not i-1 is because wells starts at 1 instead of 0
                    bestWell = wells[i - 1];
                    bestWellHouse = i;
                }
            }
            
            //also initialize the bestPipe to the same maximum value
            int bestPipe = Integer.MAX_VALUE;
            int bestPipeIndex = -1;
    
            for (int[] pipe : pipes) {
                int house1 = pipe[0];
                int house2 = pipe[1];
                int cost = pipe[2];
    
                if (visitedList[house1] && !visitedList[house2] && cost < bestPipe) {
                    bestPipe = cost;
                    bestPipeHouse = house2;
                } else if (visitedList[house2] && !visitedList[house1] && cost < bestPipe) {
                    bestPipe = cost;
                    bestPipeHouse = house1;
                }
            }
    
            //determine which one to create either the well or the pipe based on cost
            if (bestWell <= bestPipe) {
                visitedList[bestWellHouse] = true;
                totalCost += bestWell;
            } else {
                visitedList[bestPipeHouse] = true;
                totalCost += bestPipe;
            }
        }
        //return the total cost
        return totalCost;
    }
    
}