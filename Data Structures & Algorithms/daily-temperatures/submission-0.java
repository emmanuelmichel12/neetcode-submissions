class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] finalArr = new int[temperatures.length];


        for(int i = 0; i < temperatures.length; i++)
        {
            int track = 0;
            for(int j = i; j < temperatures.length; j++)
            {
                if(temperatures[i] >= temperatures[j])
                {
                    track++;
                }
                else
                {
                    finalArr[i] = track;
                    break;
                }
            }
        }

        return finalArr;
    }
}
