package hackerrank;

public class CiferSir {
public static StringBuilder encryption(String msg, int key){
	char[] letters=msg.toCharArray();
	StringBuilder encmsg=new StringBuilder();
	for (int i = 0; i < letters.length; i++) {
		encmsg.append((char)(byte)(letters[i]+key));
	}
	System.out.println("en "+encmsg);
	return encmsg;
}
public static void decryp(StringBuilder encmsg,int key){
	String msg=encmsg.toString();
	char[] let=msg.toCharArray();
	StringBuilder decmsg=new StringBuilder();
	for (int i = 0; i < let.length; i++) {
		decmsg.append((char)(byte)(let[i]-key));
	}
	System.out.println("de "+decmsg);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		decryp(encryption("abcde", 3),3);
	}

}
