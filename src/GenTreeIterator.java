import java.util.Iterator;
import java.util.List;

public class GenTreeIterator implements Iterator<Human> {
    private List<Human> allPeople;
    private int index;

    public GenTreeIterator(List<Human> allPeople) {
        this.allPeople = allPeople;
    }

    @Override
    public boolean hasNext() {
        return index < allPeople.size();
    }

    @Override
    public Human next() {
        return allPeople.get(index++);
    }
}
