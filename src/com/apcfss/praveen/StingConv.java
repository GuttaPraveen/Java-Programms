package com.apcfss.praveen;

import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class StingConv 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<String> list=List.of("raj", "sURESH", "mahesh", "kiran", "test");
		
		UnaryOperator<String> up=w->w.toUpperCase();
		//upper case
		List<String> upper=list.stream().map(up).collect(Collectors.toList());
		System.out.println(upper);
		//first letter upper case
		UnaryOperator<String> fup=w->w.substring(0,1).toUpperCase()+w.substring(1);
		List<String> firstLetterUpper=list.stream().map(fup).collect(Collectors.toList());
		System.out.println(firstLetterUpper);
		List<String> strLen=list.stream().map(a->a+":"+a.length()).collect(Collectors.toList());
		System.out.println(strLen);

	}

}
