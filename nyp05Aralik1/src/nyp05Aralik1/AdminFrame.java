package nyp05Aralik1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.CardLayout;
import java.awt.FlowLayout;

public class AdminFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminFrame frame = new AdminFrame();
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
	public AdminFrame() {
		setSize(new Dimension(800, 585));
		setName("adminFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(900, 1600));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel altPanel = new JPanel();
		contentPane.add(altPanel, BorderLayout.WEST);
		altPanel.setLayout(new CardLayout(0, 0));
		
		JPanel ustPanel = new JPanel();
		ustPanel.setPreferredSize(new Dimension(10, 60));
		contentPane.add(ustPanel, BorderLayout.NORTH);
		ustPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setPreferredSize(new Dimension(60, 23));
		ustPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		ustPanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		ustPanel.add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		panel.setSize(new Dimension(25, 0));
		ustPanel.add(panel);

	}

}
