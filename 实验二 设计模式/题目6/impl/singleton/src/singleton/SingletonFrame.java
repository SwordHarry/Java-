package singleton;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SingletonFrame extends JFrame {

	private JPanel contentPane;
	private JButton button;
	private SubFrame internalFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SingletonFrame frame = new SingletonFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SingletonFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		// 南部的按钮
		button = new JButton("\u70B9\u51FB\u521B\u5EFA\u4E00\u4E2A\u5185\u90E8\u7A97\u4F53");
		button.setBounds(5, 221, 422, 27);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				internalFrame = SubFrame.getSubFrame();
				contentPane.add(internalFrame,BorderLayout.NORTH);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(button);
		
	
		
	}
}
