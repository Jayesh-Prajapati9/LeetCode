class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]=nums;
        int flag=0;
        int result[]=new int[2];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]+a[j]==target&&i!=j){
                    result[0]=i;
                    result[1]=j;
                    break;
                }
            }
        }
        return result;
    }
}