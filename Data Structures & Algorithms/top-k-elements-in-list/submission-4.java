

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> frequencyMap = new HashMap<>();
		for (int n : nums) {
			frequencyMap.merge(n, 1, Integer::sum);
		}

		Map<Integer, List<Integer>> reverseMap = new TreeMap<>();
		for (Integer key : frequencyMap.keySet()) {
			Integer f = frequencyMap.get(key);
			reverseMap.computeIfAbsent(f, fd -> new ArrayList<>()).add(key);
		}
		List<Integer> sorted = reverseMap.keySet().stream().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());

		List<Integer> allInOrder = new ArrayList<>();
		for (int s : sorted) {
			allInOrder.addAll(reverseMap.get(s));
		}

		return allInOrder.stream().limit(k).mapToInt(Integer::intValue).toArray();
    }
}
