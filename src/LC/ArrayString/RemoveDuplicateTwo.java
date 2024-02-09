package LC.ArrayString;

/*Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]*/

/*Input: nums = [0,0,1,1,1,1,2,3,3]
Output: 7, nums = [0,0,1,1,2,3,3,_,_]*/
public class RemoveDuplicateTwo {
    public static void main(String[] args) {
      //  int nums[] = {  0,0,1, 1, 1,1, 2,2,2 ,3, 3};
        int nums[] = {0,0,1,1,1,1,2,3,3};
          int count=0;
          int j=0;
          int res = nums.length;
       for(int i=2;i<nums.length;i++)
       {
           if(j<2 || nums[i]!=nums[i-2])
           {
               nums[j++]=nums[i];
           }
       }


       /* int nums[] = {0,0,1,1,1,1,2,3,3};
        int i=0;
        for(int n: nums)
        {
            if(i<2|| n!=nums[i-2])
            {
                nums[i++]=n;
            }
        }

        System.out.println("the count is : "+i);*/
    }
}
