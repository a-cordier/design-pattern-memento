package com.acordier.patterns;

public class MementoApp {
	
	public static void main(String[]args) {
		Document document = new Document("Greetings");
		DocumentHelper documentHelper = new DocumentHelper();
		document.appendContent("Hello, world!");
		documentHelper.save(document);
		System.out.println(document);
		document.appendContent("\n Say what ?");
		System.out.println(document);
		documentHelper.restore(document);
		System.out.println(document);
	}
	
	
}
