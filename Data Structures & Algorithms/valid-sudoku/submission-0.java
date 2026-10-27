class Solution {
    public boolean isValidSudoku(char[][] board) {
		Map<String, List<Character>> dataMap = new HashMap<String, List<Character>>();

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				char currChar = board[i][j];
				if (currChar == '.') {
					continue;
				}
				String rKey = "R" + (i + 1);
				List<Character> rVal = dataMap.computeIfAbsent(rKey, r -> new ArrayList<>());
				if(rVal.contains(currChar )) {
					return false;
				}else {
					rVal.add(currChar);
				}
				
				String cKey = "C" + (j + 1);
				List<Character> cVal = dataMap.computeIfAbsent(cKey, c -> new ArrayList<>());
				if (cVal.contains(currChar)) {
					return false;
				} else {
					cVal.add(currChar);
				}

				String boxKey = getBoxKey(i, j);
				List<Character> boxVal = dataMap.computeIfAbsent(boxKey, b -> new ArrayList<>());
				if (boxVal.contains(currChar)) {
					return false;
				} else {
					boxVal.add(currChar);
				}
			}
		}

		return true;
	}

	private String getBoxKey(int i, int j) {
		return "B" + Math.ceil((i + 1) / 3D) + Math.ceil((j + 1) / 3D);
	}
}
