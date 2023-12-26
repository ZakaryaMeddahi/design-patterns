public abstract class Composant {
  protected String name;
  protected int level;

  Composant(String name) {
    this.name = name;
  }

  public abstract void operation();
}
