package programmers.level1;

public class P_76501 {
	public static void main(String[] args) {
		int[] absolutes = new int[] {4, 7, 12};
		boolean[] signs = new boolean[] {true, false, true};
		
		int answer = result(absolutes, signs);
		System.out.println(answer);
	}

	static int result(int[] absolutes, boolean[] signs) {
		int sum = 0;

		for (int i = 0; i < absolutes.length; i++) {
			if (signs[i] == false) {
				sum += -1 * (absolutes[i]);
			} else {
				sum += absolutes[i];
			}
		}
		return sum;
	}
}
