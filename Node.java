class Node {
  private int AntPros;
  private int Minne;

  public Node(int AntPros, int Minne) {
    this.AntPros = AntPros;
    this.Minne = Minne;
  }

  public int AntallProsessorer() {
    return this.AntPros;
  }

  public int MinneStorrelse() {
    return Minne;
  }

  public boolean NodeMedNokMinne(int PaakrevdMinne) {
    if (Minne >= PaakrevdMinne) {
      return true;
    } else {
      return false;
    }

  }
}
