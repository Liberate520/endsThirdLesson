import java.util.Collections;

public class GenTreeService {
    private GenealogicalTree genealogicalTree;
    private static int idHuman;

    public GenTreeService(GenealogicalTree genealogicalTree) {
        this.genealogicalTree = genealogicalTree;
        idHuman = 0;
    }

    public void addHuman(String name, Sex sex, int birthYear){
        Human human = new Human(idHuman++, name, sex, birthYear);
        genealogicalTree.addHuman(human);
    }

    public void sortByName(GenealogicalTree genealogicalTree) { 
        Collections.sort(genealogicalTree.getAllPeople());
    }

    public void sortByAge() {
        Collections.sort(genealogicalTree.getAllPeople(), new HumanComporatorByAge());        
    }
}
    
