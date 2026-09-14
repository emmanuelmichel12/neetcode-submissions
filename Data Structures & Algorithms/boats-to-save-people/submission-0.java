class Solution {
    public int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);
        int length = people.length - 1;
        int count = 0;
        int pointer1 = 0;
        int pointer2 = length;

        while(pointer1 <= pointer2)
        {
            int sum = people[pointer1] + people[pointer2];

            if(sum <= limit)
            {
                pointer1++;
                pointer2--;

            }
            else
            {
                pointer2--;
            }

            count++;
        }

        return count;
        
    }
}