package project;

import dataStructures.WojewodzctwoContainer;
import gui.MainFrame;

public class StartClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WojewodzctwoContainer container = new WojewodzctwoContainer();
		System.out.println(container.toString());
		new MainFrame();
	}

}
