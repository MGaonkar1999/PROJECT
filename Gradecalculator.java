package day3;
//WAP to print grades of student
//if percentage <40 then print fail
//if percentage >=40 and <=60 print C
//if percentage >=61 and <80 print B
//if percentage >=80 print A
import java.util.*;

public class Gradecalculator {

	public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
        System.out.println("enter your percentage");
		
        int per=s.nextInt();
		
		if(per<40)
			System.out.println("fail");	
		
		else if(per>=40 && per<=60)
			System.out.println("C");	
		else if(per>=61 && per<80)
			System.out.println("B");	
		else
			System.out.println("A");	
	}
       
}
