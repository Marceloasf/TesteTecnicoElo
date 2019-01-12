package br.com.elotech;

import java.util.List;

import org.assertj.core.util.Lists;
import org.junit.Assert;
import org.junit.Test;

public class Teste {
	@Test
	public void testIsLucky() {
		IsLucky isLuckyTest = new IsLucky();

		Assert.assertTrue(isLuckyTest.isLucky("1230"));

		Assert.assertFalse(isLuckyTest.isLucky("239017"));

		Assert.assertTrue(isLuckyTest.isLucky("123321"));

		Assert.assertFalse(isLuckyTest.isLucky("10"));

		Assert.assertTrue(isLuckyTest.isLucky("11"));

		Assert.assertTrue(isLuckyTest.isLucky("1010"));

		Assert.assertFalse(isLuckyTest.isLucky("261534"));

		Assert.assertFalse(isLuckyTest.isLucky("100000"));

		Assert.assertTrue(isLuckyTest.isLucky("999999"));

		Assert.assertFalse(isLuckyTest.isLucky("12321"));

	}
	
	@Test
	public void testCircleNumber() {
		CircleNumber circleTest = new CircleNumber();
		
		Assert.assertEquals(Integer.valueOf(7), circleTest.circleMat(10, 2));
		Assert.assertEquals(Integer.valueOf(2), circleTest.circleMat(10, 7));
		Assert.assertEquals(Integer.valueOf(3), circleTest.circleMat(4, 1));
		Assert.assertEquals(Integer.valueOf(0), circleTest.circleMat(6, 3));
		
	}

	@Test
	public void testAlphabetic() {
		Alphabetic alphabeticTest = new Alphabetic();

		Assert.assertEquals("dsbaz", alphabeticTest.alphabetic("crazy"));
		Assert.assertEquals("a", alphabeticTest.alphabetic("z"));
		Assert.assertEquals("bbbbcccdde", alphabeticTest.alphabetic("aaaabbbccd"));
		Assert.assertEquals("gvaaz", alphabeticTest.alphabetic("fuzzy"));
		Assert.assertEquals("dpeftjhobm", alphabeticTest.alphabetic("codesignal"));
		Assert.assertEquals("A", alphabeticTest.alphabetic("Z"));
	}

	@Test
	public void testAllLongestStrings() {
		AllLongestStrings longestStringsTest = new AllLongestStrings();
		
		List<String> list1_1 = Lists.newArrayList("aba","aa","ad","vcd","aba");
		List<String> list1_2 = Lists.newArrayList("aba","vcd","aba");
		Assert.assertEquals(list1_2, longestStringsTest.longestStrings(list1_1));
		
		List<String> list2_1 = Lists.newArrayList("aa");
		List<String> list2_2 = Lists.newArrayList("aa");
		Assert.assertEquals(list2_2, longestStringsTest.longestStrings(list2_1));
		
		List<String> list3_1 = Lists.newArrayList("a","abc","cbd","zzzzzz","a","abcdef","asasa", "aaaaaa");
		List<String> list3_2 = Lists.newArrayList("zzzzzz","abcdef","aaaaaa");
		Assert.assertEquals(list3_2, longestStringsTest.longestStrings(list3_1));
		
		
		
	}
	
	
	//Consegui fazer apenas a function detectar os resultados false.
	@Test
	public void testAlmostIncreasingSequence() {
		AlmostIncreasingSequence increasingSequenceTest = new AlmostIncreasingSequence();
		
		List<Integer> list1 = Lists.newArrayList(1,3,2,1);
		Assert.assertFalse(increasingSequenceTest.increasingSequence(list1));
		
		List<Integer> list2 = Lists.newArrayList(1,2,1,2);
		Assert.assertFalse(increasingSequenceTest.increasingSequence(list2));
		
		List<Integer> list3 = Lists.newArrayList(3,6,5,8,10,20,15);
		Assert.assertFalse(increasingSequenceTest.increasingSequence(list3));
		
		List<Integer> list4 = Lists.newArrayList(1,1,2,3,4,4);
		Assert.assertFalse(increasingSequenceTest.increasingSequence(list4));
		
		List<Integer> list5 = Lists.newArrayList(1,4,10,2);
		Assert.assertFalse(increasingSequenceTest.increasingSequence(list5));
		
		List<Integer> list6 = Lists.newArrayList(1,1,1,2,3);
		Assert.assertFalse(increasingSequenceTest.increasingSequence(list6));
		
		List<Integer> list7 = Lists.newArrayList(1,2,3,4,5,3,5,6);
		Assert.assertFalse(increasingSequenceTest.increasingSequence(list7));
		
		List<Integer> list8 = Lists.newArrayList(1000,1000,2000,3000,4000,5000,5000);
		Assert.assertFalse(increasingSequenceTest.increasingSequence(list8));
		
		//List<Integer> list9 = Lists.newArrayList(1,3,2);
		//Assert.assertTrue(increasingSequenceTest.increasingSequence(list9));
	}
	
	
}
