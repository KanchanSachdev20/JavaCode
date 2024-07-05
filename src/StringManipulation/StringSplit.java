package StringManipulation;

import java.util.Arrays;

public class StringSplit {

	public static void main(String[] args) {
		
		String lang = "JAVA_PYTHON_DOTNET_RUBY";
		String l[] = lang.split("_");
		
		System.out.println(Arrays.toString(l));
		for(String s:l) {
		System.out.println(s);
		}
		
		String pop = "xXseleniumxXXtestingXxXjavaXXxpythonX";
		String d[] = pop.split("xX");
		
		System.out.println(d[0].length());
		System.out.println(d[1]);
		
		for(String s:d) {
			System.out.println(s);
			}
		
		
		int k = 1100;
		System.out.println(k+20);
		String k1 = String.valueOf(k);
		System.out.println(k1+20);
		
		String v ="12.33";
		System.out.println(v+20);
		double d1 = Double.parseDouble(v);
		System.out.println(d1+20);
		
		String x = "100";
		System.out.println(x+20);
		int i = Integer.parseInt(x);
		System.out.println(i+20);

		
		String h ="testing with selenium";
		String g = "development with selenium";
		System.out.println(h.startsWith("testing"));
		System.out.println(g.endsWith("selenium"));
		
		//substring
		String msg = "your transcation id is 12345";
		System.out.println(msg.substring(msg.indexOf("is")+2).trim());
		
		String mg = "your transcation id is 12345";
		System.out.println(mg.substring(msg.indexOf("is")+2, mg.length()).trim());//0-8
	}

}
