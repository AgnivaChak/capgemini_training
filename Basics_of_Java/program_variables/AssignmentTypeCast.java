package program_variables;

public class AssignmentTypeCast {

	public static void main(String[] args) {
		//1.for byte
		byte b=65;//1byte
		int i=b;//4byte
		short s=b;
		long l=b;
		double d=b;
		float f=b;
		char c=(char)b;
		System.out.println(i);
		System.out.println(s);
		System.out.println(l);
		System.out.println(d);
		System.out.println(f);
		System.out.println(c);
		
		//2.for short
		short s1=69;
		byte b1=(byte)s1;
		int i1=s1;
		long l1=s1;
		double d1=s1;
		float f1=s1;
		char c1=(char)s1;
		System.out.println(b1);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(d1);
		System.out.println(f1);
		System.out.println(c1);
		
		//3.for int
		int i2=70;
		byte b2=(byte)i2;
		short s2=(short)i2;
		long l2=i2;
		double d2=i2;
		float f2=i2;
		char c2=(char)i2;
		System.out.println(b2);
		System.out.println(s2);
		System.out.println(l2);
		System.out.println(d2);
		System.out.println(f2);
		System.out.println(c2);
		
		//4.for long
		long l3=88;
		byte b3=(byte)l3;
		int i3=(int)l3;
		short s3=(short)l3;
		double d3=l3;
		float f3=l3;
		char c3=(char)l3;
		System.out.println(b3);
		System.out.println(s3);
		System.out.println(i3);
		System.out.println(d3);
		System.out.println(f3);
		System.out.println(c3);
		
		//5.for double
		double d4=79.7;
		byte b4=(byte)d4;
		int i4=(int)d4;
		short s4=(short)d4;
		long l4=(long)d4;
		float f4=(float)d4;
		char c4=(char)d4;
		System.out.println(b4);
		System.out.println(i4);
		System.out.println(s4);
		System.out.println(l4);
		System.out.println(f4);
		System.out.println(c4);
		
		//6.for float
		float f5=55;
		byte b5=(byte)f5;
		int i5=(int)f5;
		short s5=(short)f5;
		long l5=(long)f5;
		double d5=f5;
		char c5=(char)f5;
		System.out.println(b5);
		System.out.println(i5);
		System.out.println(s5);
		System.out.println(l5);
		System.out.println(d5);
		System.out.println(c5);
		
		//7.for char
		char c6=97;
		byte b6=(byte)c6;
		short s6=(short)c6;
		int i6=c6;
		long l6=c6;
		double d6=c6;
		float f6=c6;
		System.out.println(b6);
		System.out.println(i6);
		System.out.println(s6);
		System.out.println(l6);
		System.out.println(d6);
		System.out.println(f6);
		
		
		
		
		
		

	}

}