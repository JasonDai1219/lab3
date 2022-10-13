import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input2 = {1,3,5};
    int[] x = ArrayExamples.reversed(input2);
    assertArrayEquals(new int[]{5,3,1}, x);
  }

  @Test
  public void testReverseInPlace2() {
    int[] input = {1,3,5,7,9};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{9,7,5,3,1}, input);
  }

  @Test
  public void testaverageWithoutLowest() {
    double[] input = {1.0,1.0,2.0,2.0,2.0,2.0};
    double average = ArrayExamples.averageWithoutLowest(input);
    assertEquals(2.0, average, 0);
  }
}
