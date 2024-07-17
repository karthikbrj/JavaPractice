public class LexicographicallySmallestString {

	public static void main(String[] args) {
		String s = "45320";
		String str=getSmallestString(s);
		System.out.println(str);
	}

	public static String getSmallestString(String s) {
		char ch[]=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]%2==ch[i+1]%2) {
				if(ch[i]>ch[i+1]) {
					char temp=ch[i];
					ch[i]=ch[i+1];
					ch[i+1]=temp;
					break;
				}
			}
		}
		return new String(ch);
		

	}

}
