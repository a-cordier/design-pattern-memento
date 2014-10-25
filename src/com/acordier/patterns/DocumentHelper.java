package com.acordier.patterns;

/* << Care taker >> */
public class DocumentHelper {

	private Object memento;
	
	public void save(Document document){
		this.memento = document.saveCurrentState();
	}
	
	public void restore(Document document){
		document.restorePreviousState(memento);
	}
}
