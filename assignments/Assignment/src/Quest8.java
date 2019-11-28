import java.util.Scanner;

public class Quest8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your height");
		double h=sc.nextDouble();
		sc.nextLine();
		System.out.println("enter your weight");
		double w=sc.nextDouble();
		sc.nextLine();
		double bmi=w/(h*h);
		if(bmi>29.9) {
			System.out.println("obsese");
		}
		else if(bmi>24.9) {
			System.out.println("overweight");
		}
		else if(bmi>18.5) {
			System.out.println("normal");
		}
		else {
			System.out.println("underwight");
		}
	}

}
