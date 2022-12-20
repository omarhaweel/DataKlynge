import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;;

class LesFraFil {
  public static void main(String[] args) {

    ArrayList<Rack> RackListe = new ArrayList<>();
    Dataklynge Klynge = new Dataklynge(RackListe);

    Scanner sc = null;
    try {
      String filnavn = "dataklynge.csv";
      sc = new Scanner(new File(filnavn));
      while (sc.hasNextLine()) {
        String linje = sc.nextLine();
        String[] delt = linje.split(" ");
        int antnoder = Integer.parseInt(delt[0]);
        int antpros = Integer.parseInt(delt[1]);
        if (antpros > 12) {
          System.out.println("Jeg TåLeR Ikke Så MaNgE ProSseSoreR Oo");
          System.exit(1);
        }
        int Minne = Integer.parseInt(delt[2]);
        if (Minne > 1024) {
          System.out.println("AlT FoR MyE MiNnE Per NOdE ^^");
          System.exit(1);
        }
        Node node = new Node(antpros, Minne);
        int teller = 0;
        while (teller < antnoder) {
          Klynge.LeggInnNode(node);
          teller++;
        }

      }
      sc.close();

    } catch (

    Exception e) {
      System.out.println("fant ikke filen!");
      System.exit(1);
    }
    System.out.println("Antall Racks: " + " " + Klynge.AntallRacks());
    System.out.println("Antall prossesorer i Dataklynge:" + " " + Klynge.AntallProsData());
    System.out.println("Antall Noder med Minne over 128 GB:" + " " + Klynge.noderMedNokMinne(128));
    System.out.println("Antall Noder med Minne over 512 GB:" + " " + Klynge.noderMedNokMinne(512));
    System.out.println("Antall Noder med Minne over 1024 GB:" + " " + Klynge.noderMedNokMinne(1024));

  }

}
