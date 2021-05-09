import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 double ucret = 10;
		 System.out.println("Gidilen kilometre mesafesini giriniz :");
		 Scanner scan = new Scanner(System.in);
		 double kilometre = scan.nextDouble();
		 
		 ucret = ucret + kilometre*2.20;

		 if(ucret<=20) {
			 System.out.println("Ücret 20 TL");
		 }
		 else if(ucret>20)
		 {
			 System.out.println("Ücret :" + ucret);
		 }
	}

}
