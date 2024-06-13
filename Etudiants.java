// Importation de Scanner 
import java.util.Scanner;

/**
 * Etudiants
 */
public class Etudiants {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        

        // L'entrer du chaine
        System.out.println("Entrer votre Nom");
        String nom = SC.nextLine();

        // l'entrer du int
        System.out.println("Entrer votre  Age ");
        
        int age = SC.nextInt();

        // L'entrer de Double 
        System.out.println("Entrer votre  Moyenne ");
        double Moyenne = SC.nextDouble();

        // Les sorties de des utilistaurs 

        System.out.println("le Nom de l'etudiant est :" + nom);
        System.out.println("l'age de l'etudiant est :" + age+ " ans ");
        System.out.println("la Moyenne de l'etudiant est :" + Moyenne);

    }
}