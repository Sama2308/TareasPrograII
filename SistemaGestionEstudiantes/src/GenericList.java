import java.util.ArrayList;
import java.util.List;

public class GenericList<T> {
    private List<T> list = new ArrayList<>();

    public void add(T element) {
        list.add(element);
    }

    public void remove(T element) {
        list.remove(element);
    }

    public T find(int id) {
        for (T element : list) {
            if (element instanceof Student && ((Student) element).getId() == id) {
                return element;
            }
        }
        return null;
    }

    public int size() {
        return list.size();
    }

    public List<T> getAll() {
        return new ArrayList<>(list);
    }
}
