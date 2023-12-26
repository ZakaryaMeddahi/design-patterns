public class Element extends Composant {
  Element(String name) {
    super(name);
  }

  @Override
  public void operation() {
    String tab = "";
    for(int i = 0; i < level; i++) {
      tab += "--";
    }
    System.out.println(tab + name);
  }
}
