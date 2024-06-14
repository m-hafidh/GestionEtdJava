// La classe abstract
abstract class MainApp {

    public String name="Abdou";
    public int age = 25;

    // Methode abstract 
    public abstract void Etudier ();

    // Partie Heritage
    protected String prenom = "Maoulida"; // Attribut pour la class MainApp()
    public void FirtsPrenom(){ // La methode de la classe MainApp()
        System.out.println("je suis la class MainApp !!!!");

    }
}
// creer les sous class qui va heriter de la classe mere qui est le MainApp
class Etudiant2 extends MainApp{
    private String modelPrenom = "Bezos"; // Attribut Etudiant2

public static void main(String[] args) {
    Etudiant2 myEtudiant2= new Etudiant2();

    // appel la methode firstprenom 
    myEtudiant2.FirtsPrenom();

    System.out.println(myEtudiant2.prenom + " " + myEtudiant2.modelPrenom);
}
}

// le sous class qui herite la class Main

class Etudiant extends MainApp{
    public int DiplomeAnnee = 2024;
    public void Etudier (){
    System.out.println( "ça fait longtemps qu'il a étudié ici !");
    }
}