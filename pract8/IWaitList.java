package mirea.pract8;

import java.util.Collection;

public interface IWaitList <E>{

    public void add(E element);

    E remove();

    public boolean contains(E element);

    public boolean containsAll(Collection<E> collection);

    public boolean isEmpty();
}
