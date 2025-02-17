class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int count=1;
        int n=candyType.length;
        for(int i=0;i<n-1;i++)
        {
            if(candyType[i]!=candyType[i+1])
            count++;
        }
        int max=n/2;
        return Math.min(count,max);
    }
}