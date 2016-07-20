package client;

import component.Component;
import composite.Composite;
import leaf.Leaf;

public class HtmlTagListGenerator {
	public static void main(String[] args) {
		
		//Head component
		Component head = new Composite("HEAD");
		head.add(new Leaf("TITLE"));
		
		//body component
		Component body = new Composite("BODY");

		Component com1 = new Composite("CENTER");
		com1.add(new Leaf("Image"));
		body.add(com1);
		
		body.add(new Leaf("a"));
		body.add(new Leaf("H1"));
		body.add(new Leaf("H2"));
		body.add(new Leaf("B"));
		
		Component com2=new Composite("B");
		com2.add(new Leaf("I"));
		body.add(com2);
		
		// Top level component that holds everything
		
		Component html = new Composite("HTML");

		// Composite that holds individual groups of leaf
		// This holds leaf plus a composite with leaf

		html.add(head);
		html.add(body);

		

		Client client = new Client(html);

		client.getComponentList();

	}
}
