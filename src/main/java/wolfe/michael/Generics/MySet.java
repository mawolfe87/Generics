package wolfe.michael.Generics;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by michaelwolfe on 2/22/17.
 */
public class MySet<T> {
    public Object[] arraySet;

    public MySet(){
        this.arraySet = new Object[10];
    }

    public MySet(T[] inputArray){
        int length = inputArray.length;
        for(int i = 0; i < length; i++){

        }
    }

    public boolean add(T newElement){
        if(this.contains(newElement))
            return false;
        int length = this.arraySet.length;
        Object[] newSet = Arrays.copyOf(this.arraySet, length + 1);
        newSet[length] = newElement;
        this.arraySet = newSet;
        return true;
    }

    public boolean addAll(Collection<T> collection){
        int modCount = 0;
        T[] newSet = (T[])collection.toArray();
        int newSetSize = newSet.length;
        for(int i = 0; i < newSetSize; i++){
            if(!contains(newSet[i])){
                this.add(newSet[i]);
                modCount++;
            }
        }
        if(modCount > 0)
            return true;
        return false;
    }

    public void clear(){
        int length = arraySet.length;
        for(int i = 0; i < length; i++){
            toArray()[i] = null;
        }
    }

    public boolean contains(T element){
        boolean contains = false;
        int length = this.arraySet.length;
        for(int i = 0; i < length; i++){
            if(this.arraySet[i] == element)
                contains = true;
        }
        return contains;
    }

    public boolean containsAll(Collection<T> collection){
        int containsCount = 0;
        T[] newSet = (T[])collection.toArray();
        int newSetSize = newSet.length;
        for(int i = 0; i < newSetSize; i++){
            if(this.contains(newSet[i]))
                containsCount++;
        }
        if(containsCount == newSetSize)
            return true;
        return false;
    }

    public boolean equals(Object object){
        return this.arraySet.equals(object);
    }

    public int hashCode(){

        return -1;
    }

    public boolean isEmpty(){

        return arraySet.length == 0;
    }

    public Iterator<T> iterator(){

        return null;
    }

    public boolean remove(T object){
        if(contains(object)){
            int length = arraySet.length;
            int indexOfSpecifiedElement = 0;

            for(int i = 0; i < length; i++){
                if(arraySet[i].equals(object)){
                    indexOfSpecifiedElement = i;
                }
            }
            Object[] newArraySet = new Object[length - 1];
            for(int i = 0; i < length - 1; i++){
                if(i < indexOfSpecifiedElement){
                    newArraySet[i] = arraySet[i];
                }
                if(i >= indexOfSpecifiedElement){
                    newArraySet[i] = arraySet[i + 1];
                }
            }
            arraySet = newArraySet;
            return true;
        }
        return false;
    }

    public boolean removeAll(Collection<T> collection){
        int modCount = 0;
        T[] newSet = (T[])collection.toArray();
        int newSetSize = newSet.length;
        for(int i = 0; i < newSetSize; i++){
            if(this.remove(newSet[i]))
                modCount++;
        }
        if(modCount > 0)
            return true;
        return false;
    }

    public boolean retainAll(Collection<T> collection){
        int modCount = 0;
        T[] newSet = (T[])collection.toArray();
        int newSetSize = newSet.length;
        for(int i = 0; i < newSetSize; i++){
            if(!this.contains(newSet[i])) {
                modCount++;
                this.remove(newSet[i]);
            }
        }
        if(modCount > 0)
            return true;
        return false;
    }

    public int size(){

        return this.arraySet.length;
    }

    public Object[] toArray(){

        return null;
    }

    public T[] toArray(T[] inputArray){

        return null;
    }
}
