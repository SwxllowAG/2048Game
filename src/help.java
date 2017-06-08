import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class help {

	private static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					help window = new help();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public help() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnHelloDearUser = new JTextPane();
		txtpnHelloDearUser.setText("Hello dear user!\r\nThis is 2048 game\r\nYour purpose is to move boxes with numbers using ^, v, < and > buttons\r\nWhen you press the button all numbers will move in the chosen direction\r\nIf same numbers collide, they will be added\r\nGame is until 2048 number is reached in any box\r\nPress any key to start!\r\nWish you good game!");
		txtpnHelloDearUser.setBounds(10, 11, 360, 176);
		frame.getContentPane().add(txtpnHelloDearUser);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(144, 198, 89, 23);
		frame.getContentPane().add(btnNewButton);
		getFrame().setBounds(100, 100, 450, 300);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
