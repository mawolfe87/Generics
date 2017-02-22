package wolfe.michael.GenericsTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import wolfe.michael.Generics.MyArrayList;

/**
 * Created by michaelwolfe on 2/22/17.
 */
public class MyArrayListTest {

    MyArrayList<Integer> myArray;
    MyArrayList<String> myStringArray;
    MyArrayList myEmptyArrayList;
    
    @Before
    public void setUp(){
        myEmptyArrayList = new MyArrayList();
        myArray = new MyArrayList<>(8);
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        myArray.add(5);
        myArray.add(6);
        myArray.add(7);
        myArray.add(8);
        myStringArray = new MyArrayList<>(5);
        myStringArray.add("Mike");
        myStringArray.add("John");
        myStringArray.add("Tony");
        myStringArray.add("BBC");
        myStringArray.add("Tariq");
    }

    @Test
    public void addElementToArrayIsTrueTest(){
        Assert.assertTrue(myArray.add(10));
    }

    @Test
    public void addElementToArrayIsFalseTest(){
        //throws index out of bounds exception
    }

    @Test
    public void addElementToArrayAtSpecifiedIndexIsTrueTest(){
        int expected = 1;
        myArray.add(0, 1);
        int actual = myArray.get(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addElementToArrayAtSpecifiedIndexIsFalseTest(){
        //throws index out of bounds exception
    }

    @Test
    public void getElementFromArrayAtSpecifiedIndexIsTrueTest(){

    }

    @Test
    public void getElementFromArrayAtSpecifiedIndexIsFalseTest(){
        //throw index out of bounds exception
    }

    @Test
    public void removeElementFromArrayBySpecifiedElementIsTrueTest(){
        Assert.assertTrue(myStringArray.remove("Tariq"));
    }

    @Test
    public void removeElementFromArrayBySpecifiedElementIsFalseTest(){
        Assert.assertFalse(myStringArray.remove("Euge"));
        //throw index out of bounds exception
    }

    @Test
    public void removeElementFromArrayAtSpecifiedIndexIsTrueTest(){
        Assert.assertTrue(myArray.remove(0));
    }

    @Test
    public void removeElementFromArrayAtSpecifiedIndexIsFalseTest(){
        //throw index out of bounds exception
    }

    @Test
    public void setElementFromArrayAtSpecifiedIndexToSpecifiedElementInMethodCallIsTrueTest(){
        MyArrayList<String> array = new MyArrayList<>(3);
        array.add("one");
        array.add("two");
        array.add("three");
        String expected = "four";
        MyArrayList<String> testArray = new MyArrayList<>(3);
        testArray.add("one");
        testArray.add("two");
        testArray.add("four");
        String actual = testArray.set(2, "three");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setElementFromArrayAtSpecifiedIndexToSpecifiedElementInMethodCallIsFalseTest(){
        //throws index out of bounds exception
    }

    @Test
    public void clearArrayOfAllElementsIsTrueTest(){

    }

    @Test
    public void isEmptyIsTrueTest(){
        Assert.assertTrue(myEmptyArrayList.isEmpty());
    }

    @Test
    public void isEmptyIsFalseTest(){
        Assert.assertFalse(myStringArray.isEmpty()); // ?????????
    }

    @Test
    public void containsSpecifiedElementIsTrueTest(){
        Assert.assertTrue(myStringArray.contains("Mike"));
    }

    @Test
    public void containsSpecifiedElementIsFalseTest(){
        Assert.assertFalse(myStringArray.contains("Mohammad"));
    }
}

