package project;

import javax.swing.JFrame;

import dataStructures.WojewodzctwoContainer;
import gui.MainFrame;

public class StartClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WojewodzctwoContainer container = new WojewodzctwoContainer();
		System.out.println(container.toString());
		JFrame frame = new MainFrame();
		frame.setVisible(true);
		frame.repaint();
	}

}
