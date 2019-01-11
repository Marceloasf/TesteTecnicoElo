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
	public void testAlphabetic() {
		Alphabetic alphabeticTest = new Alphabetic();

		Assert.assertEquals("dsbaz", alphabeticTest.alphabetic("crazy"));
		Assert.assertEquals("a", alphabeticTest.alphabetic("z"));
		Assert.assertEquals("bbbbcccdde", alphabeticTest.alphabetic("aaaabbbccd"));
		Assert.assertEquals("gvaaz", alphabeticTest.alphabetic("fuzzy"));
		Assert.assertEquals("dpeftjhobm", alphabeticTest.alphabetic("codesignal"));
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

}
