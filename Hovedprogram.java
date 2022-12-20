import java.util.ArrayList;

class Hovedprogram {
  public static void main(String[] args) {
    Node liten = new Node(4, 512);
    Node stor = new Node(8, 1024);

    ArrayList<Rack> RackListe = new ArrayList<>();
    Dataklynge saga = new Dataklynge(RackListe);

    for (int i = 0; i < 450; i++) {
      saga.LeggInnNode(liten);

    }
    for (int i = 0; i < 16; i++) {
      saga.LeggInnNode(stor);

    }
    System.out.println("Antall Racks: " + " " + saga.AntallRacks());
    System.out.println("Antall prossesorer i Dataklynge:" + " " + saga.AntallProsData());
    System.out.println("Antall Noder med Minne over 128 GB:" + " " + saga.noderMedNokMinne(128));
    System.out.println("Antall Noder med Minne over 512 GB:" + " " + saga.noderMedNokMinne(512));
    System.out.println("Antall Noder med Minne over 1024 GB:" + " " + saga.noderMedNokMinne(1024));
  }
}
