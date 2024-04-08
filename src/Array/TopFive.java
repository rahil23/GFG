package Array;

public class TopFive {
    public static void main(String[] args) {

        int arr[] = {10, 50, 20, 40, 30, 60, 50, 70, 80, 90};
        int newArray[] = new int[5];
        int count = 0;
        int max;
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = arr[i];
        }
        for (int i = 0; i < newArray.length; i++) {
            int temp;
            for (int j = 0; j < newArray.length; i++) {
                if(newArray[j+1]>newArray[j])
                {
                    temp=newArray[j+1];
                    newArray[j+1]=newArray[j];
                    newArray[j]=temp;
                }

            }
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }


    }
}