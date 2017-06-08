import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Game2048 {

	 static int[][] numbers = new int[4][4];
	private static JFrame frame;
	 static boolean bool = false;
	 static boolean moved = true;
	 static boolean finish = false;
	 static boolean win = false;
	 static int newN1;
	 static int newN2;
	static JLabel n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15,n16;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game2048 window = new Game2048();
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
	public Game2048() {
		initialize();
		for (int xx = 0; xx<4; xx++)
		{
			for (int yy = 0; yy<4; yy++)
			{
				numbers[xx][yy] = 0;
			}
		}
		refreshIcons.check();
	}
	public void GUI() {
	    setLayout(null);
	}

	private void setLayout(Object frame) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().getContentPane().setBackground(Color.WHITE);
		getFrame().getContentPane().setForeground(Color.WHITE);
		getFrame().setBounds(100, 100, 580, 455);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		JLabel n1 = new JLabel("");
		n1.setBounds(10, 11, 90, 90);
		n1.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\0.jpg"));
		getFrame().getContentPane().add(n1);
		
		JLabel n2 = new JLabel("");
		n2.setBounds(110, 11, 90, 90);
		n2.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\0.jpg"));
		getFrame().getContentPane().add(n2);
		
		JLabel n3 = new JLabel("");
		n3.setBounds(210, 11, 90, 90);
		n3.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\0.jpg"));
		getFrame().getContentPane().add(n3);
		
		JLabel n4 = new JLabel("");
		n4.setBounds(310, 11, 90, 90);
		n4.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\0.jpg"));
		getFrame().getContentPane().add(n4);
		
		JLabel n5 = new JLabel("");
		n5.setBounds(10, 112, 90, 90);
		n5.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\0.jpg"));
		getFrame().getContentPane().add(n5);
		
		JLabel n9 = new JLabel("");
		n9.setBounds(10, 213, 90, 90);
		n9.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\0.jpg"));
		getFrame().getContentPane().add(n9);
		
		JLabel n13 = new JLabel("");
		n13.setBounds(10, 314, 90, 90);
		n13.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\0.jpg"));
		getFrame().getContentPane().add(n13);
		
		JLabel n6 = new JLabel("");
		n6.setBounds(110, 112, 90, 90);
		n6.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\0.jpg"));
		getFrame().getContentPane().add(n6);
		
		JLabel n10 = new JLabel("");
		n10.setBounds(110, 213, 90, 90);
		n10.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\0.jpg"));
		getFrame().getContentPane().add(n10);
		
		JLabel n14 = new JLabel("");
		n14.setBounds(110, 314, 90, 90);
		n14.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\0.jpg"));
		getFrame().getContentPane().add(n14);
		
		JLabel n7 = new JLabel("");
		n7.setBounds(210, 112, 90, 90);
		n7.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\0.jpg"));
		getFrame().getContentPane().add(n7);
		
		JLabel n11 = new JLabel("");
		n11.setBounds(210, 213, 90, 90);
		n11.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\0.jpg"));
		getFrame().getContentPane().add(n11);
		
		JLabel n15 = new JLabel("");
		n15.setBounds(210, 314, 90, 90);
		n15.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\0.jpg"));
		getFrame().getContentPane().add(n15);
		
		JLabel n8 = new JLabel("");
		n8.setBounds(310, 112, 90, 90);
		n8.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\0.jpg"));
		getFrame().getContentPane().add(n8);
		
		JLabel n12 = new JLabel("");
		n12.setBounds(310, 213, 90, 90);
		n12.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\0.jpg"));
		getFrame().getContentPane().add(n12);
		
		JLabel n16 = new JLabel("");
		n16.setBounds(310, 314, 90, 90);
		n16.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\0.jpg"));
		getFrame().getContentPane().add(n16);
		
		JButton btnNewButton = new JButton("^");
		btnNewButton.setBounds(469, 11, 50, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				move.up();
				if (moved)
				{
					refreshIcons.addNum();
				}
				n1.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[0][0]+".jpg"));
				n2.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[0][1]+".jpg"));
				n3.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[0][2]+".jpg"));
				n4.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[0][3]+".jpg"));
				n5.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[1][0]+".jpg"));
				n6.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[1][1]+".jpg"));
				n7.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[1][2]+".jpg"));
				n8.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[1][3]+".jpg"));
				n9.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[2][0]+".jpg"));
				n10.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[2][1]+".jpg"));
				n11.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[2][2]+".jpg"));
				n12.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[2][3]+".jpg"));
				n13.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[3][0]+".jpg"));
				n14.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[3][1]+".jpg"));
				n15.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[3][2]+".jpg"));
				n16.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[3][3]+".jpg"));
				refreshIcons.checkWin();
				moved = true;
			}
			});
		getFrame().getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<");
		btnNewButton_1.setBounds(431, 45, 50, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				move.left();
				if (moved)
				{
					refreshIcons.addNum();
				}
				n1.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[0][0]+".jpg"));
				n2.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[0][1]+".jpg"));
				n3.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[0][2]+".jpg"));
				n4.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[0][3]+".jpg"));
				n5.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[1][0]+".jpg"));
				n6.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[1][1]+".jpg"));
				n7.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[1][2]+".jpg"));
				n8.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[1][3]+".jpg"));
				n9.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[2][0]+".jpg"));
				n10.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[2][1]+".jpg"));
				n11.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[2][2]+".jpg"));
				n12.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[2][3]+".jpg"));
				n13.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[3][0]+".jpg"));
				n14.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[3][1]+".jpg"));
				n15.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[3][2]+".jpg"));
				n16.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[3][3]+".jpg"));
				refreshIcons.checkWin();
			}
		});
		getFrame().getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(">");
		btnNewButton_2.setBounds(504, 45, 50, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				move.right();
				if (moved)
				{
					refreshIcons.addNum();
				}
				n1.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[0][0]+".jpg"));
				n2.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[0][1]+".jpg"));
				n3.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[0][2]+".jpg"));
				n4.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[0][3]+".jpg"));
				n5.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[1][0]+".jpg"));
				n6.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[1][1]+".jpg"));
				n7.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[1][2]+".jpg"));
				n8.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[1][3]+".jpg"));
				n9.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[2][0]+".jpg"));
				n10.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[2][1]+".jpg"));
				n11.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[2][2]+".jpg"));
				n12.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[2][3]+".jpg"));
				n13.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[3][0]+".jpg"));
				n14.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[3][1]+".jpg"));
				n15.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[3][2]+".jpg"));
				n16.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[3][3]+".jpg"));
				refreshIcons.checkWin();
			}
		});
		getFrame().getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("v");
		btnNewButton_3.setBounds(469, 79, 50, 23);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				move.down();
				if (moved)
				{
					refreshIcons.addNum();
				}
				n1.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[0][0]+".jpg"));
				n2.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[0][1]+".jpg"));
				n3.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[0][2]+".jpg"));
				n4.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[0][3]+".jpg"));
				n5.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[1][0]+".jpg"));
				n6.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[1][1]+".jpg"));
				n7.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[1][2]+".jpg"));
				n8.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[1][3]+".jpg"));
				n9.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[2][0]+".jpg"));
				n10.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[2][1]+".jpg"));
				n11.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[2][2]+".jpg"));
				n12.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[2][3]+".jpg"));
				n13.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[3][0]+".jpg"));
				n14.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[3][1]+".jpg"));
				n15.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[3][2]+".jpg"));
				n16.setIcon(new ImageIcon("D:\\Program Files\\JavaProjects\\2048Game\\Image\\"+numbers[3][3]+".jpg"));
				refreshIcons.checkWin();
			}
		});
		getFrame().getContentPane().add(btnNewButton_3);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				help documentation = new help();
				help.getFrame().setVisible(true);
			}
		});
		btnHelp.setBounds(465, 381, 89, 23);
		getFrame().getContentPane().add(btnHelp);
		
	}

	public static JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
