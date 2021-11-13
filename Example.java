
public class Example {
	public static void main(String args[]) {
		String s = "World";
		char c[] = { 'I', 'N', 'D', 'I', 'A' };
		String t1 = new String(c);
		String t2 = new String("Basic");
		System.out.println(s);
		System.out.println(t1);
		System.out.println(t2);

		System.out.println("------------------------");
		/* StringBuffer - class append() Method */
		StringBuffer sb = new StringBuffer("Vinoth");
		sb.append("kumar");
		System.out.println(sb);

		System.out.println("------------------------");
		/* insert() Method */
		StringBuffer sb1 = new StringBuffer("Arun");
		sb1.insert(1, "bala");
		System.out.println(sb1);

		System.out.println("------------------------");
		/* replace() Method */
		StringBuffer sb2 = new StringBuffer("this is a test");
		sb2.replace(5, 9, "was");
		System.out.println(sb2);

		System.out.println("------------------------");
		/* delete() Method */
		StringBuffer sb3 = new StringBuffer("Beautiful");
		sb3.delete(2, 5);
		System.out.println(sb3);

		System.out.println("------------------------");
		/* reverse() Method */
		StringBuffer sb4 = new StringBuffer("Family");
		sb4.reverse();
		System.out.println(sb4);

		System.out.println("------------------------");
		/* capacity() Method */
		StringBuffer sb5 = new StringBuffer();
		System.out.println(sb5);
		sb5.append("java");
		System.out.println(sb5.capacity());
		sb5.append("Java is a programming Language");
		System.out.println(sb5.capacity());

	}
}