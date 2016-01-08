package com.ds.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class StringUtil
{

	public static String removeDuplicateCharacters( String strIn )
	{
		if( strIn == null )
		{
			throw new IllegalArgumentException();
		}
		StringBuilder str = new StringBuilder(strIn);

		HashSet<Character> charSet = new HashSet<Character>();

		for( int i = 0; i < str.length(); i++ )
		{
			char c = str.charAt(i);
			if( charSet.contains(c) )
			{
				str.deleteCharAt(i);
				i--;
			}
			else
			{
				charSet.add(c);
			}
		}

		return str.toString();

	}

	public static String removeDuplicateCharacters_v1( String strIn )
	{
		StringBuilder str = new StringBuilder(strIn);

		for( int i = 0; i < str.length(); i++ )
		{
			for( int j = i + 1; j < str.length(); j++ )
			{
				if( str.charAt(i) == str.charAt(j) )
				{
					str.deleteCharAt(j);
					j--;
				}
			}
		}

		return str.toString();
	}

	public static boolean areAnagrams( String str1, String str2 )
	{
		if( str1 == null || str2 == null )
		{
			throw new IllegalArgumentException();
		}
		
		if( str1.length() != str2.length() )
		{
			return false;
		}
		char[] str1CharArray = str1.toCharArray();
		char[] str2CharArray = str2.toCharArray();
		Arrays.sort(str1CharArray);
		Arrays.sort(str2CharArray);
		return Arrays.equals(str1CharArray, str2CharArray);
	}

	public static boolean areAnagrams_v1( String str1, String str2 )
	{
		if( str1 == null || str2 == null )
		{
			throw new IllegalArgumentException();
		}
		if( str1.length() != str2.length() )
		{
			return false;
		}
		char[] str1CharArray = str1.toCharArray();
		char[] str2CharArray = str2.toCharArray();
		HashMap<Character, Integer> charHashMap = new HashMap<Character, Integer>();
		for( int i = 0; i < str1CharArray.length; i++ )
		{
			Integer count = charHashMap.get(str1CharArray[i]);
			if( count == null )
			{
				count = 1;
			}
			else
			{
				count++;
			}
			charHashMap.put(str1CharArray[i], count);
		}
		for( int j = 0; j < str2CharArray.length; j++ )
		{
			Integer count = charHashMap.get(str2CharArray[j]);
			if( count == null || count == 0 )
			{
				return false;
			}
			else
			{
				count--;
				charHashMap.put(str2CharArray[j], count);
			}
		}
		return true;
	}

	public static void main( String[] args )
	{
		System.out.println(removeDuplicateCharacters("Saamppaath"));
		System.out.println(removeDuplicateCharacters_v1("Saamppaath"));
		
		System.out.println(areAnagrams_v1("ABC","CAB")); 
		System.out.println(areAnagrams_v1("ABCDEF","ABCDEE")); 


	}

}
