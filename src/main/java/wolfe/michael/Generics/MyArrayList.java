package wolfe.michael.Generics;

import java.util.Arrays;

/**
 * Created by michaelwolfe on 2/22/17.
 */
public class MyArrayList<T> {
    public Object[] array;
    @SuppressWarnings("unchecked")

    public int size;
    public T element;

    public MyArrayList(){
        this.array = new Object[10];
    }

    public MyArrayList(int size){
        if(size < 0)
            throw new IllegalArgumentException("Illegal capacity: " + size);
        this.array = new Object[size];
    }

    public boolean add(T newElement){
        int length = this.array.length;
        Object[] newArray = Arrays.copyOf(this.array, length + 1);
        newArray[length] = newElement;
        this.array = newArray;
        return true;
    }

    public void add(int index, T newElement){
        int length = this.array.length;
        Object[] newArray = new Object[length + 1];
        Object[] tempArray = Arrays.copyOf(this.array, length + 1);
        for(int i = 0; i < length + 1; i++){
            if(i == index){
                newArray[index] = newElement;
            }
            if(i > index){
                newArray[i] = tempArray[i];
            }
            if(i < index){
                newArray[i] = tempArray[i+1];
            }
            this.array = newArray;
        }
    }

    public T get(int index){ return (T)array[index]; }

    public boolean remove(Object element) {
        boolean contains = false;
        int length = this.array.length;
        int indexOfSpecifiedElement = 0;

        if(this.array != null){
            for(int i = 0; i < length; i++){
                if(this.array[i] == element){
                    indexOfSpecifiedElement = i;
                    contains = true;
                }
            }
            if(contains == true){
                Object[] newArray = new Object[length - 1];
                for(int i = 0; i < length - 1; i++){
                    if(i < indexOfSpecifiedElement){
                        newArray[i] = this.array[i];
                    }
                    if(i >= indexOfSpecifiedElement){
                        newArray[i] = this.array[i + 1];
                    }
                }
                this.array = newArray;
            }

        }
        return contains;
    }

    public boolean remove(int index) {
        boolean contains = false;
        int length = this.array.length;

        if(index > length || index < 0)
            return false;

        Object[] newArray = new Object[length - 1];
        for(int i = 0; i < length - 1; i++){
            if(i < index){
                newArray[i] = this.array[i];
            }
            if(i >= index){
                newArray[i] = this.array[i+1];
            }
        }
        return true;
    }

    public T set(int index, T newElement) {
        int length = this.array.length;
        Object[] newArray = Arrays.copyOf(this.array, length + 1);
        newArray[index] = newElement;
        return (T)array[index];
    }

    public void clear(){
        int length = this.array.length;
        for(int i = 0; i < length; i++){
            this.array[i] = null;
        }

    }

    public boolean isEmpty(){
        int emptyCount = 0;
        int length = this.array.length;
        for(int i = 0; i < length; i++){
            if(this.array[i] == null){
                emptyCount++;
            }
        }
        if(emptyCount > 0)
            return true;
        return true;
    }

    public boolean contains(T element) {
        boolean contains = false;
        int length = this.array.length;
        for(int i = 0; i < length; i++){
            if(this.array[i] == (element))
                contains = true;
        }
        return contains;
    }
}
