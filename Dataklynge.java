import java.util.ArrayList;

class Dataklynge {

  ArrayList<Rack> RackListe = new ArrayList<>();

  public Dataklynge(ArrayList<Rack> RackListe) {
    this.RackListe = RackListe;

  }

  public void LeggInnNode(Node node) {
    for (Rack rack : RackListe) {
      if (rack.HarPlass()) {
        rack.SettInnNode(node);
        return;
      }
    }

    Rack ny = new Rack(new Node[12]);

    ny.SettInnNode(node);
    RackListe.add(ny);
  }

  public void SettInnRack(Rack rack) {
    RackListe.add(rack);
  }

  public int AntallProsData() {
    int collect = 0;
    for (Rack rack : RackListe) {
      collect += rack.AntallProsRack();
    }
    return collect;
  }

  public int noderMedNokMinne(int PaakrevdMinne) {
    int NoderMedNok = 0;
    for (Rack rack : RackListe) {
      NoderMedNok += rack.AntallNoderMedNokMinneRack(PaakrevdMinne);

    }
    return NoderMedNok;
  }

  public int AntallRacks() {
    return RackListe.size();
  }

}
