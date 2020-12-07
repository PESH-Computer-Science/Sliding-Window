import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinct 
{
	
	public static void main(String[] args) 
	{
		//input
		String str = "AAAHHIBC";
		int k = 2;
		
		int windowStart = 0; 
		int maxLength = 0;
		Map<Character, Integer> charFreqMap = new HashMap<>();
		for (int windowEnd = 0; windowEnd < str.length(); windowEnd++){
			char rightChar = str.charAt(windowEnd);
			charFreqMap.put(rightChar, charFreqMap.getOrDefault(rightChar, 0) + 1);
			while (charFreqMap.size() > k) {
				char leftChar = str.charAt(windowStart);
				charFreqMap.put(leftChar, charFreqMap.get(leftChar) - 1);
				if (charFreqMap.get(leftChar) == 0)
				{
					charFreqMap.remove(leftChar);
				}
				windowStart++;
			}
			maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
		}
		System.out.println(maxLength);
		
	}

}
