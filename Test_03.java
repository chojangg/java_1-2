package 방과후;

public class Test_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str1 = "A";
//		System.out.println(str1 + 1);
/*
		char ch = 'A';
		System.out.println(ch + 1);
		System.out.println((char)(ch + 1));
		
		int a = 10;
		int b = 10;
		int c = a + b;

		if(a==b)
			System.out.println("같다.");
		else
			System.out.println("다르다.");*/
		
		String str1 = new String("Hi");
		String str2 = new String("Hi");
		
		//System.out.println(str1 + str2);
		
		if(str1.contentEquals(str2))
			System.out.println("같다.");
		else
			System.out.println("다르다.");
	}

}
