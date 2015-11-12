import java.util.ArrayList;

public class ContainerArray<E> {
    private ArrayList<Object> internalArray;

    public ContainerArray () {
        this(10);
    }

    public ContainerArray (int initialCapacity) {
        internalArray = new ArrayList<>(initialCapacity);
    }

    public void add (E element) {
        internalArray.add(element);
    }

    public int size () {
        return internalArray.size();
    }

    public void remove (E objectToRemove) {
    	internalArray.remove(objectToRemove);
    }

    @SuppressWarnings("unchecked")
    public E get (int index) {
        return (E)internalArray.get(index);
    }
}
