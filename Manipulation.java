
public class Manipulation {
	public static void main(String args[]) {
		// System.out.println("-----------------------");
		/* String Comparison */
		String s1 = "nature";
		String s2 = "Nature";
		String s3 = "Adventure";
		String s4 = new String(s1);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s2));

		System.out.println(s1.compareTo(s2));

		System.out.println("-------------------------");
		/* String Concatenation */

		String a1 = "Arun";
		String a2 = "kumar";
		String a3 = a1.concat(a2);
		System.out.println(a3);

		System.out.println("----------------");
		/* charAt() */
		String name = "Language";
		char n1 = name.charAt(3);
		System.out.println(n1);
		char n2 = name.charAt(3);
		System.out.println(n2);

		System.out.println("----------------");
		/* contains() */
		String con = "how was the day";
		System.out.println(con.contains("was"));
		System.out.println(con.contains("day"));
		System.out.println(con.contains("very"));

		System.out.println("----------------");
		/* endsWith() */
		String ss = "get well soon";
		System.out.println(ss.endsWith("n"));
		System.out.println(ss.endsWith("t"));

		System.out.println("----------------");
		/* format() */
		String sf = "Karthick";
		String sf1 = String.format("name is %s", sf);
		String sf2 = String.format("value is %f", 45.674);
		String sf3 = String.format("value is %f", 56.14562058);
		System.out.println(sf1);
		System.out.println(sf2);
		System.out.println(sf3);

		System.out.println("----------------");
		/* getBytes */
		String b = "SUCCESS";
		byte[] by = b.getBytes();
		for (int i = 0; i < by.length; i++) {
			System.out.println(by[i]);
		}

		System.out.println("----------------");
		/* indexOf() */
		String i = "Welcome to Java";
		int ind = i.indexOf("om");
		int ind2 = i.indexOf("av");
		System.out.println(ind + " " + ind2);

		int ind3 = i.indexOf("me", 4);
		System.out.println(ind3);

		System.out.println("----------------");
		/* length() */
		String l1 = "vinoth";
		String l2 = "varun";
		System.out.println("The length is:" + l1.length());
		System.out.println("The length is:" + l2.length());

		System.out.println("----------------");
		/* replacae() */
		String r = "Java is a secured Language";
		String replace = r.replace('a', 'l');
		System.out.println(replace);

		System.out.println("----------------");
		/* toLowerCase */
		String lo = "AJITH KUMAR";
		String lc = lo.toLowerCase();
		System.out.println(lc);
		/* UpperCase */
		String u = "sanjai kumar";
		String up = u.toUpperCase();
		System.out.println(up);

	}
}
