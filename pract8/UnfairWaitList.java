package mirea.pract8;

public class UnfairWaitList <E> extends WaitList<E>{

    public UnfairWaitList(){
        super();
    }

    public void remove(E element){
        boolean removed = false;
        for(int i = 0; i < content.size(); i++){
            E el = content.remove();
            if(!removed && el.equals(element)){
                removed = true;
            }else{
                content.add(el);
            }
        }
        if(removed){
            content.add(content.remove());
        }
    }

    public void moveToBack(E element){
        int prevSize = content.size();
        remove(element);
        if(content.size() < prevSize){
            content.add(element);
        }
    }
}
