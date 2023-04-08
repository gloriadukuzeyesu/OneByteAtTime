package ArraysAndHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        // Create a HashMap to store the frequency of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        // Create a PriorityQueue to keep track of the top k frequent numbers
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue());

        // Add all the entries in the frequencyMap to the queue
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            queue.offer(entry);
        }
        // Create a list to store the top k frequent numbers
        int[] topKFrequentNumbers = new int[k];

        for (int i = 0; i < k; i++) {
            topKFrequentNumbers[i] = queue.poll().getKey();
        }
        return topKFrequentNumbers;
    }
}
