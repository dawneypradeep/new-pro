package firstjava;

import java.util.Scanner;

public class prg1 {

	public static void main(String[] args) {
		float p,r,t,s;
		Scanner K=new Scanner(System.in);
		p=K.nextFloat();
		r=K.nextFloat();
		t=K.nextFloat();
		s=p*r*t/100;
		System.out.println("simple interst is"+s);
		K.close();

	}

}
