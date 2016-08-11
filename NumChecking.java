package programs;

import java.util.Scanner;

public class NumChecking {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	if(num==0){
		System.out.println("Given Number is Zero: "+num);
	}else if(num>0){
		System.out.println("Given Number is Positive: "+num);
	}else{
		System.out.println("Given Number is Negative: "+num);
	}
	s.close();
}}
