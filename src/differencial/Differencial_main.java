package differencial;

import java.util.Scanner;

public class Differencial_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input value of  a> ");
		double a = Double.parseDouble(scan.next());
		System.out.print("Input value of h> ");
		double h = Double.parseDouble(scan.next());
		Differencial_lib dlib = new Differencial_lib(a,h);
		
		System.out.println("f(x)=x^2��x="+a+"�ɂ���������W���̗��_�l��"+dlib.getRX());
		System.out.println("f(x)=x^2��x="+a+"�ɂ���������W����"+dlib.getDX());
		System.out.println("X="+a+"�덷��"+dlib.getAnswer());
		
	}

}
