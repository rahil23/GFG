package LC.ArrayString;

public class MajorityCandidateEfficient {

    public static void main(String[] args) {

        int nums[]={2,2,3,3,1,1,3,3,1,1,3,2,2,3};
        int count=0;
        int ele=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
            {
                ele = nums[i];
                count++;
            }
            if(ele==nums[i])
            {
                count++;
            }
            else{
                count--;
            }
        }
        System.out.println(ele);
    }


}
