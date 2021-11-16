package hu.petrik.MultiSet;

import java.util.ArrayList;
import java.util.List;

public class MultiSet<T> {
    private List<T> elements;

    public MultiSet(){
        this.elements = new ArrayList<>();
    }

    public void add(T element){
        this.elements.add(element);
    }
    private int db(T element){
        int elementDb = 0;
        for(T elem : this.elements){
            if (elem == element){
                elementDb++;
            }
        }
        return elementDb;
    }








}
