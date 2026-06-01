class Solution {
    public int minimumCost(int[] cost) {
        int totalCost = 0;
        int len = cost.length;

        for(int i = 0; i < len - 1; i++){
            int min = i;
            for(int j = i; j < len; j++){
                if(cost[j] > cost[min]){
                    min = j;
                }
            }

            int temp = cost[min];
            cost[min] = cost[i];
            cost[i] = temp;

        }

        for(int x = 0; x < len; x++){
            if((x+1) % 3 != 0){
                totalCost += cost[x];
            }
        }

        return totalCost;

    }
}