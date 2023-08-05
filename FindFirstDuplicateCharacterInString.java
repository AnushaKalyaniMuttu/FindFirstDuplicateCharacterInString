package com.demo;

import java.util.Map;
import java.util.stream.Collectors;

public class FindFirstDuplicateCharacterInString {

public static void main (String [] args) {
	String name="Anusha";
	 Map<Character, Long> charOccurrences = name.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(ch->ch,Collectors.counting()));
	Character c=name.chars().mapToObj(ch->(char)ch).filter(ch->charOccurrences.get(ch)>1).findFirst().orElse(null);
	System.out.println(c);
}

}
