package LC.ArrayString;

public class CanJump {
    public static void main(String[] args) {

        int nums[] = {3,2,1,0,4};
        int n = nums.length;
        int max=0;
        for(int i=0;i< n-1 ;i++)
        {
            if(max>=i && max<i+nums[i])
            {
                max = i+nums[i];
            }
            if(max>=n-1)
            {
                //return true;
                System.out.println("true");

            }
        }
        //return false;
        System.out.println("false");
    }

}
