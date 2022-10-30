package sample;

public class Anag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="loki";
String s2="kt4t";
int lt=0;

for(int i=0;i<s1.length();i++) {
	for(int j=0;j<s2.length();j++) {
		if(s1.charAt(i)==s2.charAt(j)) {
			lt++;
			break;
		}
	}
}
System.out.println(lt);
	}

}
