public class FirstOccurenceOfString {

	public static void main(String[] args) {
		String haystack = "mississippi";
		String needle = "issipi";
		int n = strStr(haystack, needle);
		System.out.println(n);
	}

	public static int strStr(String haystack, String needle) {
		int needleLength = needle.length();
		int haystackLength = haystack.length();

		if (needleLength == 0) {
			return -1;
		}

		if (haystackLength < needleLength) {
			return -1;
		}

		for (int i = 0; i <= haystackLength - needleLength; i++) {
			if (haystack.charAt(i) == needle.charAt(0)) {
				String str = haystack.substring(i, i + needleLength);
				if (str.equals(needle)) {
					return i;
				}
			}
		}
		return -1;
	}
}
