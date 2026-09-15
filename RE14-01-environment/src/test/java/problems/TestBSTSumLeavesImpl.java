package problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestBSTSumLeavesImpl {

	private BSTSumLeaves implementation;
	BSTInteger bst;
	
	@BeforeEach
	public void setUp() throws Exception {
		implementation = new BSTSumLeavesImpl();
	}

	private void fillBST(Integer[] array){
		bst = new BSTInteger();
		for (Integer integer : array) {
			bst.insert(integer);
		}
	}

	@Test
	public void testBSTSumLeavesTC01() {
		Integer[] array = {};
		this.fillBST(array);
		int expected = Arrays.stream(array).mapToInt( i -> i.intValue()).sum();

		int actual = implementation.sumLeaves(this.bst);
		assertEquals(expected, actual);
	}

	@Test
	public void testBSTSumLeavesTC02() {
		Integer[] array = {4};
		this.fillBST(array);
		int expected = Arrays.stream(array).mapToInt( i -> i.intValue()).sum();

		int actual = implementation.sumLeaves(this.bst);
		assertEquals(expected, actual);
	}

	@Test
	public void testBSTSumLeavesTC03() {
		Integer[] array = {2,1,3};
		this.fillBST(array);
		int expected = 4;

		int actual = implementation.sumLeaves(this.bst);
		assertEquals(expected, actual);
	}

	@Test
	public void testBSTSumLeavesTC04() {
		Integer[] array = {1,2,3,4,5,6,7,8,9};
		this.fillBST(array);
		int expected = 9;

		int actual = implementation.sumLeaves(this.bst);
		assertEquals(expected, actual);
	}

	@Test
	public void testBSTSumLeavesTC05() {
		Integer[] array = {9,8,7,6,5,4,3,2,1};
		this.fillBST(array);
		int expected = 1;

		int actual = implementation.sumLeaves(this.bst);
		assertEquals(expected, actual);
	}

	@Test
	public void testBSTSumLeavesTC06() {
		Integer[] array = {4,2,1,3,6,5,7};
		this.fillBST(array);
		int expected = 16;

		int actual = implementation.sumLeaves(this.bst);
		assertEquals(expected, actual);
	}

	@Test
	public void testBSTSumLeavesTC07() {
		Integer[] array = {4,2,1,3,6,5,9,10};
		this.fillBST(array);
		int expected = 19;

		int actual = implementation.sumLeaves(this.bst);
		assertEquals(expected, actual);
	}

	@Test
	public void testBSTSumLeavesTC08() {
		Integer[] array = {4,2,1,3,6,5,9,12,10};
		this.fillBST(array);
		int expected = 19;

		int actual = implementation.sumLeaves(this.bst);
		assertEquals(expected, actual);
	}
	@Test
	public void testBSTSumLeavesTC09() {
		Integer[] array = {4,2,1,3,6,5,9,12,10,11};
		this.fillBST(array);
		int expected = 20;

		int actual = implementation.sumLeaves(this.bst);
		assertEquals(expected, actual);
	}

	@Test
	public void testBSTSumLeavesTC10() {
		Integer[] array = {8,7,6,5,4,3,2,1,9,10,11,12,13,14,15};
		this.fillBST(array);
		int expected = 16;

		int actual = implementation.sumLeaves(this.bst);
		assertEquals(expected, actual);
	}
}
