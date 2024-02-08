package Array;

import java.util.HashMap;

//Sum of pair to get 25
public class SumPair {
    public static void main(String[] args) {
        int[] arr = {7, 13, 12, 18, 10, 16};
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        int pairCount = 0;

        // Count the frequency of each element and find pairs
        for (int num : arr) {
            int complement = 25 - num; // Find the complement

            // If the complement exists in the map and it's not the same as the current element
            if (freqMap.containsKey(complement) && complement != num) {
                pairCount =pairCount+ freqMap.get(complement);
                System.out.println("the pair is"+num+" "+ complement);// Add its frequency to the pair count
            }

            // Increment frequency of the current element
            freqMap.put(num, freqMap.getOrDefault(num,1));
        }
System.out.print(pairCount);

    }
}