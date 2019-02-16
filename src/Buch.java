public class Buch extends Medium{

    private String autor;
    private BuchArt art;

    public Buch (String autor, String name, int erscheinungsJahr, String verlag, BuchArt art) {
        this.autor = autor;
        this.name = name;
        this.erscheinungsJahr = erscheinungsJahr;
        this.verlag = verlag;
        this.art = art;
        this.medienNr = Medium.mediumZaehler++;
    }


    public void print () {
        System.out.println("Medium mit Nr. "+ medienNr + "ist Buch der Art " + art + ".");
        System.out.println("Titel des Buches:" + name);
        System.out.println("Autor/-in des Buches:" + autor);
        System.out.println("erschienen"+ erscheinungsJahr + "beim Verlag " + verlag + ".");
    }
}
