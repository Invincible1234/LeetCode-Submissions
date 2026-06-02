class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        
        int land_end_min = Integer.MAX_VALUE;
        for (int i = 0; i < landStartTime.length; ++i) {
            land_end_min = Math.min(land_end_min, landStartTime[i] + landDuration[i]);
        }

        int water_end_min = Integer.MAX_VALUE;
        for (int i = 0; i < waterStartTime.length; ++i) {
            water_end_min = Math.min(water_end_min, waterStartTime[i] + waterDuration[i]);
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < waterStartTime.length; i++) {
            ans = Math.min(ans, Math.max(waterStartTime[i], land_end_min) +waterDuration[i]);
        }

        for (int i = 0; i < landStartTime.length; i++) {
            ans = Math.min(ans, Math.max(landStartTime[i], water_end_min) +landDuration[i]);
        }

        return ans;
    }
}