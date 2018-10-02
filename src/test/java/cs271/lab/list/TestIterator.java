package cs271.lab.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.LinkedList;

public class TestIterator {

  private List<Integer> list;
  // See the Java List Interface documentation to understand what all the List methods do ...
  
  List<Integer> list = new LinkedList(); 

  @Before
  public void setUp() throws Exception {
    list = new ArrayList<Integer>();
    
    // TODO also try with a LinkedList - does it make any difference?
    
  }
  
  @Before 
  public void setUpLinked() throws Exception  {
      LinkedList<Integer> LinkedList = new LinkedList<Integer>();
  }

  @After
  public void tearDown() throws Exception {
    list = null;
  }
  
  @After 
  public void tearDownLinked() throws Exception {
      LinkedList = null;
  }

  @Test
  public void testEmpty() {
    final Iterator<Integer> i = list.iterator();
    assertFalse(i.hasNext());
  }
  
  @Test
  public void testEmptyLinked() {
      final Iterator<Integer> i = LinkedList.iterator();
      assertFalse(i.hasNext());
  }

  @Test
  public void testNonempty() {
    list.add(33);
    list.add(77);
    list.add(44);
    list.add(77);
    list.add(55);
    list.add(77);
    list.add(66);
    final Iterator<Integer> i = list.iterator();
    assertTrue(i.hasNext());
    assertEquals(33, i.next().intValue());
    // TODO fix the expected values in the assertions below
    assertTrue(i.hasNext());
    assertEquals(33, i.next().intValue());
    assertTrue(i.hasNext());
    assertEquals(77, i.next().intValue());
    assertTrue(i.hasNext());
    assertEquals(44, i.next().intValue());
    assertTrue(i.hasNext());
    assertEquals(77, i.next().intValue());
    assertTrue(i.hasNext());
    assertEquals(55, i.next().intValue());
    assertTrue(i.hasNext());
    assertEquals(66, i.next().intValue());
    assertFalse(i.hasNext());
  }
  
  @Test
  public void testNonemptyLinked() {
    LinkedList.add(33);
    LinkedList.add(77);
    LinkedList.add(44);
    LinkedList.add(77);
    LinkedList.add(55);
    LinkedList.add(77);
    LinkedList.add(66);
    final Iterator<Integer> i = LinkedList.iterator();
    assertTrue(i.hasNext());
    assertEquals(33, i.next().intValue());
    // TODO fix the expected values in the assertions below
    assertTrue(i.hasNext());
    // assertEquals(0, i.next().intValue());
    assertEquals(33, i.next().intValue());
    assertTrue(i.hasNext());
    //assertEquals(0, i.next().intValue());
    assertEquals(77, i.next().intValue());
    assertTrue(i.hasNext());
    //assertEquals(0, i.next().intValue());
    assertEquals(44, i.next().intValue());
    assertTrue(i.hasNext());
    //assertEquals(0, i.next().intValue());
    assertEquals(77, i.next().intValue());
    assertTrue(i.hasNext());
    //assertEquals(0, i.next().intValue());
    assertEquals(55, i.next().intValue());
    assertTrue(i.hasNext());
    //assertEquals(0, i.next().intValue());
    assertEquals(66, i.next().intValue());
    assertFalse(i.hasNext());
    
  }


  @Test
  public void testRemove() {
    list.add(33);
    list.add(77);
    list.add(44);
    list.add(77);
    list.add(55);
    list.add(77);
    list.add(66);
    final Iterator<Integer> i = list.iterator();
    while (i.hasNext()) {
      if (i.next() == 77) {
        i.remove(); // TODO what happens if you use list.remove(Integer.valueOf(77))?
      }
    }
    // TODO using assertEquals and Arrays.asList, express which values are left in the list
    // See TestList.java for examples of how to use Arrays.asList; also see the Java Arrays
    // class for more information
    fail("Not yet implemented"); // remove this line when done
  }
  
  @Test
  public void testRemoveLinked() {
    LinkedList.add(33);
    LinkedList.add(77);
    LinkedList.add(44);
    LinkedList.add(77);
    LinkedList.add(55);
    LinkedList.add(77);
    LinkedList.add(66);
    final Iterator<Integer> i = LinkedList.iterator();
    while (i.hasNext()) {
      if (i.next() == 77) {
        i.remove(); // TODO what happens if you use list.remove(Integer.valueOf(77))?
      }
    }
    i.
    // TODO using assertEquals and Arrays.asList, express which values are left in the list
    // See TestList.java for examples of how to use Arrays.asList; also see the Java Arrays
    // class for more information
    fail("Not yet implemented"); // remove this line when done
  }


  @Test
  public void testAverageValues() {
    list.add(33);
    list.add(77);
    list.add(44);
    list.add(77);
    list.add(55);
    list.add(77);
    list.add(66);
    double sum = 0;
    int n = 0;
    // TODO use an iterator and a while loop to compute the average (mean) of the values
    // (defined as the sum of the items divided by the number of items)
    // testNonempty shows how to use an iterator; use i.hasNext() in the while loop condition
    assertEquals(61.3, sum / n, 0.1);
    assertEquals(7, n);
  
  
  while (list != null)
  {
   list = i.hasNext
   if (list != null) {
       sum += list;
       num++;
   }
  


@Test
  public void testAverageValuesLinked() {
    LinkedList.add(33);
    LinkedList.add(77);
    LinkedList.add(44);
    LinkedList.add(77);
    LinkedList.add(55);
    LinkedList.add(77);
    LinkedList.add(66);
    double sum = 0;
    int n = 0;
    // TODO use an iterator and a while loop to compute the average (mean) of the values
    // (defined as the sum of the items divided by the number of items)
    // testNonempty shows how to use an iterator; use i.hasNext() in the while loop condition
    assertEquals(61.3, sum / n, 0.1);
    assertEquals(7, n);
  }}


while (LinkedList != null)
  {
   LinkedList = i.hasNext
   if (LinkedList != null) {
       sum += LinkedList;
       num++;
   }}
