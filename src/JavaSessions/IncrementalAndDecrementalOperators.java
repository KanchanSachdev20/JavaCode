package JavaSessions;

public class IncrementalAndDecrementalOperators {

	public static void main(String[] args) {
		
		int a = 1;
		int b = a++; //postIncrement [++ is after variable]
		
		System.out.println(a); //2
		System.out.println(b); //1
		
		int l =3;
		int m = l++;
		System.out.println(l); //4
		System.out.println(m); //3
		
		int p = -98;
		int q = p++;
		System.out.println(p); //-97
		System.out.println(q); //-98
		
		int u = 1;
		int y = ++u;
		System.out.println(u); //2
		System.out.println(y); //2

		int x = 5;
		int z = ++x;
		System.out.println(x); //6
		System.out.println(z); //6
		
		int j = -99;
		int k = ++j;
		System.out.println(j); //-98
		System.out.println(k); //-98
		
		int pop = 2;
		System.out.println(pop++); //2
		System.out.println(pop); //3
		
		int loop = 2;
		System.out.println(++loop); //3
		System.out.println(loop); //3
		
		int amount = 10;
		int finalAmt = amount + 4;
		System.out.println(finalAmt);
		
		
		//post decrement
		int aa = 2;
		int bb = aa--;
		System.out.println(aa); //1
		System.out.println(bb); //2
		
		int rest = -99;
		System.out.println(rest);//-99
		int api = rest--;
		System.out.println(rest);//-99-1 = -100
		System.out.println(api);//-99
		
		
		//pre decrement
		int aa1 = 2;
		int bb1 = --aa1;
		System.out.println(aa1); //1
		System.out.println(bb1); //1
		
		int s1 = -1000;
		int s2 = --s1;
		System.out.println(s1);//-1001
		System.out.println(s2);//-1001
		
		int s3 = 40;
		System.out.println(s3--);
		System.out.println(s3);
		
		
		int p3 = 50;
		System.out.println(--p3);
		System.out.println(p3);//49
		
		System.out.println(p3+1);//50
		
		
		int na = 1;
		System.out.println(na);
		int test = na++ + na++ + na++ + na++;
		System.out.println(test);
		System.out.println(na);//5
		
	}

}
