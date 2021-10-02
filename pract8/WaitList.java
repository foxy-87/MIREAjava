package mirea.pract8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList <E> implements IWaitList{

    protected ConcurrentLinkedQueue<E> content;

    public WaitList(){
        content = new ConcurrentLinkedQueue<>();
    }

    public WaitList(Collection<E> collection){
        content = new ConcurrentLinkedQueue<>(collection);
    }

    public String toString() {
        return  " " + content ;
    }

    public void add(Object element) {
        content.add((E)element);
    }

    public E remove() {
        if(isEmpty()){
            throw new IllegalStateException("Очередь пуста!");
        }
        else{
            return content.remove();
        }
    }

    public boolean contains(Object element) {
        boolean res = false;
        for(int i = 0; i < content.size(); i++){
            E el = content.remove();
            if(el.equals(element)) res = true;
            content.add(el);
        }
        return res;
    }

    public boolean containsAll(Collection collection) {
        ArrayList<E> al = new ArrayList<>(collection);
        for(int i = 0; i < collection.size(); i++){
            boolean res = false;
            for(int j = 0; j < content.size(); j++){
                E el = content.remove();
                if(el.equals(al.get(i))) res = true;
                content.add(el);
            }
            if(!res) return false;
        }
        return true;
    }

    public boolean isEmpty() {
        return content.isEmpty();
    }
}
