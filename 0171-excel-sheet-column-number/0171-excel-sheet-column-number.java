class Solution {
    public int titleToNumber(String columnTitle) {
        char[] givenString = columnTitle.toCharArray();
		int columnNumber = 0;
		int j =0;
		
		for(int i =givenString.length-1 ; i>-1 ; i--) {
			columnNumber += (Character.getNumericValue(givenString[i])-9)* Math.pow(26, j++);
		}

		return columnNumber;
    }
}