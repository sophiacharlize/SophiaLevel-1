import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker {

	public static void main(String[] args) {
		ChuckleClicker clicker = new ChuckleClicker();
		clicker.makeButtons();
		
	}
	
	public static void makeButtons() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		panel.setVisible(true);
		frame.add(panel);
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		panel.add(button1);
		panel.add(button2);
		button1.setText("joke");
		button2.setText("punchline");	
		button1.addActionListener(null);
		button2.addActionListener(null);
		JOptionPane.showMessageDialog(null, "Hi");
		
		
		
		if(arg0.getSource() == jokeButton) {
			
		}
		
		

	}

}
