class Solution {
    public int heightChecker(int[] heights) {
        int counter = 0;
        int n = heights.length;
        int copy[] = new int[n];

        //Copying into expected array.
        for(int i = 0; i < n; i++){
            copy[i] = heights[i];
        }

        //Selection Sort.
        for(int i = 0; i < n - 1; i++){
            int minIndex = i;
            for(int j = i+1; j < n; j++){
                if(copy[j] < copy[minIndex]){
                    minIndex = j;
                }
            }

            int temp = copy[minIndex];
            copy[minIndex] = copy[i];
            copy[i] = temp;
        }


        for(int x = 0; x < n; x++){
            if(heights[x] != copy[x]){
                counter += 1;
            }
        }

        return counter;
    }
}