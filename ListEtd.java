/**
 * ListEtd
 */
public class ListEtd {
 
 final int ID = 1; //  la methode final() a pour empecher la modification
 String nom ="hafidhou";
 String prenom = "Abdou";
 int age = 25;
 String niveau =" Bac +5";
 String filiere = " Big Data";
 String village = "Fes";
 String ecole = "Sup";
 // attribut de modification
 String sexe;

 // crrer les Attributs avec le mot clé "static"
 static void myMethodeStatic(){
    System.out.println("les notes des tous les étudiants");
 }

  // crrer les Attributs avec le mot clé "public"
  static void myMethodePublic(){
    System.out.println("les notes des tous les étudiants pour le public ");
 }


    public static void main(String[] args) {

        // Crrer l'objet
         ListEtd etd = new ListEtd();
         System.out.println("ID : " +etd.ID);
         System.out.println("Nom :"+etd.nom);
         /*  Remplacer une valeur qui exixte 
          on remplace le prenom */ 
        etd.prenom = "Maoulida Abdou";
        System.out.println("Prenom :"+etd.prenom);
        // System.out.println(etd.prenom);
         System.out.println("Age :" +etd.age);
         System.out.println("Niveau :" +etd.niveau);
         System.out.println("Filiere :"+etd.filiere);
         System.out.println("Village :" +etd.village);
         System.out.println("Ecole :" +etd.ecole);
         // la modification
         etd.sexe = "M";
         System.out.println("Sexe : " + etd.sexe);
         System.out.println("**********************************************");

         // Appellons la Methode myMethode()
         myMethodeStatic(); // Static 

         /* par contre "public " on doit creer un objet pour appeler notre methode  */

         ListEtd etd2 = new ListEtd();
         etd2.myMethodePublic();

        

        
    }
}
