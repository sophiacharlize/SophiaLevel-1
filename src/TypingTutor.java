import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener {
	char currentLetter = 'a';

	public static void main(String[] args) {
		TypingTutor tutor = new TypingTutor();
		tutor.createUI();

	}

	JFrame frame = new JFrame();
	JLabel label = new JLabel();

	void createUI() {
		label.setFont(label.getFont().deriveFont((float) 28));
		label.setHorizontalAlignment(label.CENTER);
		frame.addKeyListener(this);
		frame.setVisible(true);
		label.setText(currentLetter + "");
		frame.add(label);
		frame.pack();

	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		if (e.getKeyChar() == currentLetter) {
			System.out.println("correct!");
			label.setOpaque(true);
			label.setBackground(Color.green);
		} else {
			label.setOpaque(true);
			label.setBackground(Color.red);
		}
		System.out.println("key pressed: " + e.getKeyChar());

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//label = new JLabel();
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");
		System.out.println("new letter: " + currentLetter);

	}

}
