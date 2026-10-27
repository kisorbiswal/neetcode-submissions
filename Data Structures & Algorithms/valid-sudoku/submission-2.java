class Solution {
    public boolean isValidSudoku(char[][] board) {
		Map<String, Set<Character>> dataMap = new HashMap<String, Set<Character>>();

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {

				char currChar = board[i][j];
				if (currChar == '.') {
					continue;
				}
				if (!dataMap.computeIfAbsent("R" + i, r -> new HashSet<Character>()).add(currChar)) {
					return false;
				}

				
				if (!dataMap.computeIfAbsent("C" + j , r -> new HashSet<Character>()).add(currChar)) {
					return false;
				}

				if (!dataMap.computeIfAbsent(getBoxKey(i, j), r -> new HashSet<Character>()).add(currChar)) {
					return false;
				}
			}
		}

		return true;
	}

	private String getBoxKey(int i, int j) {
		return "B" + Math.ceil((i + 1) / 3D) + Math.ceil((j + 1) / 3D);
	}
}
