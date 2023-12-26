import java.util.ArrayList;
import java.util.List;

public class Composite extends Composant {
  private List<Composant> composants = new ArrayList<Composant>();

  Composite(String name) {
    super(name);
  }

  @Override
  public void operation() {
    String tab = "";
    for(int i = 0; i < level; i++) {
      tab += "--";
    }
    System.out.println(tab + name);
    for(Composant composant:composants) {
      composant.operation();
    }
  }

  public void add(Composant composant) {
    composant.level = level + 1;
    composants.add(composant);
  }

  public void remove(Composant composant) {
    composants.remove(composant);
  }

  public List<Composant> getAll() {
    return composants;
  }
}
