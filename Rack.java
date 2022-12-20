
import java.util.Arrays;

class Rack {
  Node[] nodeliste = new Node[12];

  public Rack(Node[] nodeliste) {
    this.nodeliste = nodeliste;
  }

  public void SettInnNode(Node node) {
    for (int i = 0; i < nodeliste.length; i++) {
      if (nodeliste[i] == null) {
        nodeliste[i] = node;
        break;
      }
    }
  }

  public int AntallNoder() {
    int teller = 0;
    for (Node node : nodeliste) {
      if (node != null) {
        teller++;
      }

    }
    return teller;

  }

  public boolean HarPlass() {
    for (Node node : nodeliste) {
      if (node == null) {
        return true;
      }
    }
    return false;
  }

  public int AntallProsRack() {
    int Total = 0;
    for (Node node : nodeliste) {
      if (node != null) {
        Total += node.AntallProsessorer();
      }

    }
    return Total;
  }

  public int AntallNoderMedNokMinneRack(int PaakrevdMinne) {

    int teller = 0;
    for (Node node : nodeliste) {
      if (node != null && node.NodeMedNokMinne(PaakrevdMinne) == true) {
        teller++;

      }

    }
    return teller;
  }

}
