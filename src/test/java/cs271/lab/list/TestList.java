package cs271.lab.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestList {
    
public class TestLinkedList {

  private List<Integer> list;
  
  List<Integer> List = new LinkedList();

  @Before
  public void setUp() throws Exception {
    list = new ArrayList<Integer>();
    // TODO also try with a LinkedList - does it make any difference?
    
   // list = new LinkedList<Integer>();
  }
  

  @After
  public void tearDown() throws Exception {
    list = null;
  }

  @Test
  public void testSizeEmpty() {
    assertTrue(list.isEmpty());
    assertEquals(0, list.size());
    try {
      list.get(0);
      //fail("there should not be any items in the list");
    } catch (Exception ex) {
    }
  }
  

  @Test
  public void testSizeNonEmpty() {
    // TODO fix the expected values in the assertions below
    list.add(77);
    assertEquals(false, list.isEmpty());
    assertEquals(1, list.size());
    assertEquals(77, list.get(0).intValue());
  }
  
  

  @Test
  public void testContains() {
  assertEquals(true, list.contains(77));
// TODO write assertions using
    // list.contains(77)
    // that hold before and after adding 77 to the list
    //fail("Not yet implemented"); // remove this line when done
  }

  @Test
  public void testAddMultiple() {
    list.add(77);
    list.add(77);
    list.add(77);
    // TODO fix the expected values in the assertions below
    assertEquals(3, list.size());
    assertEquals(0, list.indexOf(77));
    assertEquals(77, list.get(1).intValue());
    assertEquals(2, list.lastIndexOf(77));
  }

  @Test
  public void testAddMultiple2() {
    list.add(33); //0
    list.add(77);
    list.add(44);
    list.add(77);
    list.add(55);
    list.add(77);//5
    list.add(66);
    // TODO fix the expected values in the assertions below
    assertEquals(7, list.size());
    assertEquals(1, list.indexOf(77));
    assertEquals(5, list.lastIndexOf(77));
    assertEquals(44, list.get(2).intValue());
    assertEquals(77, list.get(3).intValue());
    assertEquals(Arrays.asList(33, 77, 44), list);
  }

  @Test
  public void testRemoveObject() {
    list.add(3);
    list.add(77);
    list.add(4);
    list.add(77);
    list.add(5);
    list.add(77);
    list.add(6);
    list.remove(5); // what does this method do?
    // TODO fix the expected values in the assertions below
    assertEquals(7, list.size());
    assertEquals(1, list.indexOf(77));
    assertEquals(5, list.lastIndexOf(77));
    assertEquals(4, list.get(2).intValue());
    assertEquals(77, list.get(3).intValue());
    list.remove(Integer.valueOf(5)); // what does this one do?
    assertEquals(6, list.size());
    assertEquals(1, list.indexOf(77));
    assertEquals(4, list.lastIndexOf(77));
    assertEquals(4, list.get(2).intValue());
    assertEquals(77, list.get(3).intValue());
  }

  @Test
  public void testContainsAll() {
    list.add(33);
    list.add(77);
    list.add(44);
    list.add(77);
    list.add(55);
    list.add(77);
    list.add(66);
    //create a new array then add the unique values from above. 
    //then do list.containsAll(nameOfYourArray);
    


    //ArrayList<Integer> listone = new ArrayList<Integer>(33);
    
   assertEquals(true, list.containsAll(Arrays.asList(33,44,66,77)));
   assertEquals(false, list.containsAll(Arrays.asList(11,22,33)));
    // TODO using containsAll and Arrays.asList (see above),
    // 1) assert that list contains all five different numbers added
    // 2) assert that list does not contain all of 11, 22, and 33
     // remove this line when done
  }

  @Test
  public void testAddAll() {
    // TODO in a single statement using addAll and Arrays.asList,
    // add items to the list to make the following assertions pass
    // (without touching the assertions themselves)
    assertEquals(true, list.addAll(Arrays.asList(7, 33, 77, 44, 55, 66)));
    assertEquals(7, list.size());
    assertEquals(33, list.get(0).intValue());
    assertEquals(77, list.get(1).intValue());
    assertEquals(44, list.get(2).intValue());
    assertEquals(77, list.get(3).intValue());
    assertEquals(55, list.get(4).intValue());
    assertEquals(77, list.get(5).intValue());
    assertEquals(66, list.get(6).intValue());
  }

  @Test
  public void testRemoveAll() {
    list.add(33);
    list.add(77);
    list.add(44);
    list.add(77);
    list.add(55);
    list.add(77);
    list.add(66);
    assertEquals(true, list.removeAll(Arrays.asList(33, 44, 55, 66))); 
    // TODO in a single statement using removeAll and Arrays.asList,
    // remove items from the list to make the following assertions pass
    // (without touching the assertions themselves)
    assertEquals(3, list.size());
    assertEquals(Arrays.asList(77, 77, 77), list);
  }

  @Test
  public void testRetainAll() {
    list.add(33);
    list.add(77);
    list.add(44);
    list.add(77);
    list.add(55);
    list.add(77);
    list.add(66);
    assertEquals(true, list.retainAll(Arrays.asList(77)));
    // TODO in a single statement using retainAll and Arrays.asList,
    // remove items from the list to make the following assertions pass
    // (without touching the assertions themselves)
    assertEquals(3, list.size());
    assertEquals(Arrays.asList(77, 77, 77), list);
  }

  @Test
  public void testSet() {
    list.add(33);
    list.add(77);
    list.add(44);
    list.add(77);
    list.add(55);
    list.add(77);
    list.add(66);
    
   // list.set(0,33);
    list.set(1,99);
    // list.set(2,44);
    list.set(3,99);
    // list.set(4,55);
    list.set(5,99);
   // list.set(6, 66);
    // TODO use the set method to change specific elements in the list
    // such that the following assertions pass
    // (without touching the assertions themselves)
    assertEquals(7, list.size());
    assertEquals(33, list.get(0).intValue()); //0
    assertEquals(99, list.get(1).intValue()); //1
    assertEquals(44, list.get(2).intValue()); //2
    assertEquals(99, list.get(3).intValue()); //3
    assertEquals(55, list.get(4).intValue()); //4
    assertEquals(99, list.get(5).intValue()); //5
    assertEquals(66, list.get(6).intValue()); //6
  }

  @Test
  public void testSubList() {
    list.add(33);
    list.add(77);
    list.add(44);
    list.add(77);
    list.add(55);
    list.add(77);
    list.add(66);
    // TODO fix the arguments in the subList method so that the assertion
    // passes
    assertEquals(Arrays.asList(44, 77, 55), list.subList(0, 0));
  }
}}
