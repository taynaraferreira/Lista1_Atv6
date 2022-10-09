import java.util.Scanner;

public class App {

public static void main(String[] args) {
double area;

System.out.println("Escreva o valor do raio");
Scanner scan = new Scanner(System.in);
double raio = scan.nextDouble();

area = Math.PI * Math.pow(raio, 2);
System.out.print( "O valor da area é " + Math.round (area) );
scan.close();
}
}



        

