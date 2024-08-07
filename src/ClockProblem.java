public class ClockProblem {

	public static void main(String[] args) {
		String time = "6:00";
		findAngle(time);
	}

	private static void findAngle(String time) {
		String[] str = time.split(":");
		for (String string : str) {
			System.out.println(string);
		}
		double angle = (Integer.parseInt(str[0]) * 30) + ((Integer.parseInt(str[1]) / 60));
		System.out.println(angle);

	}

}
