/**
 * Eleve
 */
public class Eleve {

    public static void main(String[] args) {
        Etudiant etd = new Etudiant(); // L'objet 
        System.out.println("Le nom est :" +etd.name);

        System.out.println("l'age est :" + etd.age);

        System.out.println("l'année d'obtention de son diplome est :" +etd.DiplomeAnnee);
        etd.Etudier(); // on afait appel a la methode abstract
    }
}