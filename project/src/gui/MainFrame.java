package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MainFrame extends JFrame {
	public MainFrame() {
		super("Systemy ekspertowe - Piotr Sotor, 200882");
		setSize(400, 400);
		add(new JLabel("Hello world!!"));

		System.out.println("Hello console");

		JButton button = new JButton("click");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(MainFrame.this, "Sample #5");
			}
		});
		button.setVisible(true);
		add(button);
		setVisible(true);

	}

}
