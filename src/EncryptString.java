public class EncryptString {

	public static void main(String[] args) {
		String s1 = "dart";
		int k1 = 3;
		System.out.println(getEncryptedString(s1, k1));
	}

	public static String getEncryptedString(String s, int k) {
		int n = s.length();
		StringBuilder encrypted = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int newIndex = (i + k) % n;
			encrypted.append(s.charAt(newIndex));
		}
		return encrypted.toString();

	}

}