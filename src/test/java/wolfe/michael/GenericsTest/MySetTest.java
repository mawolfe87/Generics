package wolfe.michael.GenericsTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import wolfe.michael.Generics.MySet;

import java.util.ArrayList;

/**
 * Created by michaelwolfe on 2/22/17.
 */
public class MySetTest {
    MySet<String> mySet;
    ArrayList<String> testSet;
    ArrayList<String> testCollection;

    @Before
    public void setUp(){
        mySet = new MySet<>();
        testSet = new ArrayList<>();
        testCollection = new ArrayList<>();
        mySet.add("Mike");
        mySet.add("Dave");
        mySet.add("Eric");
        mySet.add("Sheri");
        testCollection.add("Dean");
        testCollection.add("Liam");
        testSet.add("Mike");
        testSet.add("Dave");
    }

    @Test
    public void addElementIsTrueTest(){
        Assert.assertTrue(mySet.add("Alison"));
    }

    @Test
    public void addElementIsFalseTest(){
        Assert.assertFalse(mySet.add("Mike"));
    }

    @Test
    public void addAllElementsFromSpecifiedCollectionIsTrueTest(){
        Assert.assertTrue(mySet.addAll(testCollection));
    }

    @Test
    public void addAllElementsFromSpecifiedCollectionIsFalseTest(){
        Assert.assertFalse(mySet.addAll(testSet));
    }

    @Test
    public void containsSpecifiedElementIsTrueTest(){
        Assert.assertTrue(mySet.contains("Mike"));
    }

    @Test
    public void containsSpecifiedElementIsFalseTest(){
        Assert.assertFalse(mySet.contains("These Hands"));
    }

    @Test
    public void containsAllElementsFromSpecifiedCollectionIsTrueTest(){
        Assert.assertTrue(mySet.containsAll(testSet));
    }

    @Test
    public void containsAllElementsFromSpecifiedCollectionIsFalseTest(){
        Assert.assertFalse(mySet.containsAll(testCollection));
    }

    @Test
    public void equalsSpecifiedObjectIsTrueTest(){

    }

    @Test
    public void equalsSpecifiedObjectIsFalseTest(){

    }

    @Test
    public void hashCodeTest(){

    }

    @Test
    public void isEmptyIsTrueTest(){

    }

    @Test
    public void isEmptyIsFalseTest(){

    }

    @Test
    public void removeSpecifiedObjectIsTrueTest(){

    }

    @Test
    public void removeSpecifiedObjectIsFalseTest(){

    }

    @Test
    public void removeAllElementsFromSpecifiedCollectionIsTrueTest(){

    }

    @Test
    public void removeAllElementsFromSpecifiedCollectionIsFalesTest(){

    }

    @Test
    public void retainAllElementsFromSpecifiedCollectionIsTrueTest(){

    }

    @Test
    public void retainAllElementsFromSpecifiedCollectionIsFalseTest(){

    }

    @Test
    public void sizeTest(){

    }

    @Test
    public void toArrayNoArgumentsTest(){

    }

    @Test
    public void toArrayWithSpecifiedArrayTest(){

    }
}
