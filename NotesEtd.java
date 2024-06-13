public class NotesEtd {

    // les Attributs
    final int IdEtd;
    String NomEtd;
    Double NoteMathEtd;
    int AnnéeEtd;

    // Constructeurs
    public NotesEtd ( int ID, String nom, double NoteMath, int Année ){
        IdEtd = ID;
        NomEtd = nom;
        NoteMathEtd= NoteMath;
        AnnéeEtd = Année;
    }
    public static void main(String[] args) {
        NotesEtd note = new NotesEtd(1,"Maoulida", 18, 2005); // objet avec parametre 
        System.out.println(note.IdEtd + " "+note.NomEtd+ " " +note.NoteMathEtd+ " " +note.AnnéeEtd);
        
    }
}