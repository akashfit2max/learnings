package work;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow {
	public static void main(String[] args) {

		JFrame frame = new JFrame("My Window");
		frame.setSize(400, 400);
		frame.setLayout(new FlowLayout());

		// creating button
		JButton button = new JButton("clickme");

		// using anonymous class
		// button.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// // TODO Auto-generated method stub
		// System.out.println("button click");
		// JOptionPane.showMessageDialog(null, "Hey button clicked");
		//
		// }
		// });

		// using lambda expression
		button.addActionListener(e -> {
			System.out.println("button click");
			JOptionPane.showMessageDialog(null, "Hey button clicked");
		});

		frame.add(button);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
