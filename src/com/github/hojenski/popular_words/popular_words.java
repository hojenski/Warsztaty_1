package com.github.hojenski.popular_words;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



public class popular_words {
	public static void main(String[] args) {
		Connection connect = Jsoup.connect("http://www.onet.pl/");
		try {
		    Document document = connect.get();
		    Elements links = document.select("span.title");
		    PrintWriter	pop	=	new	PrintWriter("popular.txt");
	
		    for (Element elem : links) {
//		        System.out.println(elem2);
		    	String[] newText = elem.text().split("\\s|\\?|:|\\.|\"|!|,");
		    	
		    		for (String eachWord : newText) {	
		    			if (eachWord.length() >3 ) {
		    			pop.println(eachWord);
		    			}
		    		}
		    }
		    pop.close();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	
		}
}


//PrintWriter	mostPop	=	new	PrintWriter("mostPopular.txt");
