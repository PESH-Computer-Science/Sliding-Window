public class Kadane_Algorithm {

    public static void main(String[] args) {
		// Finding maximum subarray sum
		int ar[] = {1, -2, 3, 6, 4, -1, -10, 12};
		int answer = 0;
		int maxSoFar = 0;
	
		for(int i : ar){
			maxSoFar += i;
			if(maxSoFar < 0) maxSoFar = 0;
			answer = Math.max(answer, maxSoFar);
		}
		System.out.println(answer);
	}
}
