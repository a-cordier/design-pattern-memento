package com.acordier.patterns;

/* << Originator >> */
public class Document { 
	
	private String title;
	private StringBuilder contentBuilder;
	
	public Document(String title) {
		this.contentBuilder = new StringBuilder();
		this.title = title;
	}
	
	public void appendContent(String content){
		this.contentBuilder.append(content);
	}
	
	@Override
	public String toString() {
		return String.format(
				"Document title: %s\n%s\n\n",
				this.title, this.contentBuilder.toString() );
	}

	public Memento saveCurrentState(){
		return new Memento(this.title, this.contentBuilder);
	}
	
	public void restorePreviousState(Object object){
		Memento memento = (Memento)object;
		this.title = memento.title;
		this.contentBuilder = memento.contentBuilder;
	}

	/* << Memento >> */
	private class Memento {
		
		private String title;
		private StringBuilder contentBuilder;
		
		private Memento(String title, StringBuilder contentBuilder) {
			this.title = title;
			this.contentBuilder = new StringBuilder(contentBuilder); // deep copy content
		}
		
		
	}
}
