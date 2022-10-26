import java.util.Scanner;


public class task001{
	public static void Hannoi(char x, char y, char z, int count){
		if(count  == 1){
			System.out.println("From "+ x + " to " + y);
		}else{
			Hannoi(x, z, y, count-1);
			System.out.println("From "+ x + " to " + y);
			Hannoi(z, y, x, count-1);
		}
	}
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Введите количество дисков: ");
		int count = scr.nextInt();
		Hannoi('A','B','C', count);
	}
}