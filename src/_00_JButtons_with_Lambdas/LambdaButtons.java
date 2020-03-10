package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");

	public LambdaButtons() {
		Random r = new Random();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);

		// 1. Call the addActionListener methods for each button. Use lambdas
		// to define to functionality of the buttons.

		window.setVisible(true);
		window.pack();
		addNumbers.addActionListener((ActionEvent e) -> {
			int num1 = r.nextInt(1000000);
			int num2 = r.nextInt(1000000);
			System.out.println(num1 + " + " + num2 + " = " + Math.addExact(num1, num2));
		});
		randNumber.addActionListener((ActionEvent e) -> {
			System.out.println(r.nextInt(1000000));
		});
		tellAJoke.addActionListener((ActionEvent e) -> {
			System.out.println("What do I add to powdered Water?");
		});
	}

	public static void main(String[] args) {
		new LambdaButtons();
	}

}
