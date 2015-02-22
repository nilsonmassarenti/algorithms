public class InsertionSort {

	public static void main(Integer[] nums) {
		Integer[] numbers = nums;
		//declare variables
		//ordNumber = Number of items sorted
		//keyItem   = Number of item to be inserted
		//newSort   = TO sort a new item
		Integer ordNumber;
		Integer keyItem;
		Integer newSort;
		
		//Main loop to verify a numbers
		for (ordNumber = 1; ordNumber < numbers.length; ordNumber++)
		{
			keyItem = numbers[ordNumber];
			for (newSort = ordNumber - 1; (newSort >= 0)
					&& (numbers[newSort] < keyItem); newSort--)
															
			{
				numbers[newSort + 1] = numbers[newSort];
			}
			// Put the key in its proper location
			numbers[newSort + 1] = keyItem; 
		}
	}

}
