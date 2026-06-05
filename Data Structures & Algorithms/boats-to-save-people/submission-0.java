class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0;
        int j = people.length - 1;
        int boatCount = 0;
        while (i < j) {
            if (people[i] + people[j] <= limit) {
                i++;
                j--;
                boatCount++;
            } else if (people[j] <= limit) {
                j--;
                boatCount++;
            }
        }
        if (i == j && people[i] <= limit) {
            return boatCount+1;
        }
        return boatCount;
    }
}