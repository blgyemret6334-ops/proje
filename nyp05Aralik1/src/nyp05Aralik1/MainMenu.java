package nyp05Aralik1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.UIManager;
import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class MainMenu {

	
	private JFrame frame;
	private JPanel panelSiyah;
	private JPanel panelBeyaz;
	private JPanel panelLogin;

	
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton girisButton;


	private JLabel lblID;
	private JLabel lblParola;
	private JLabel lblYolcu;
	private JLabel lblAdmin;
	
	private Color a ;
	private Color b ;

	private int girisModu = 1; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainMenu() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setPreferredSize(new Dimension(400, 300));
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		panelSiyah = new JPanel();
		panelSiyah.setPreferredSize(new Dimension(125, 10));
		panelSiyah.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(panelSiyah, BorderLayout.WEST);
		panelSiyah.setLayout(null);
		panelSiyah.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        makeLightLogin();
		    }
		});
		
		a = new Color (0 , 0 , 0) ; // beyaz
		b = new Color (255 , 255 , 255) ; // Siyah
		
		
		lblAdmin = new JLabel("Admin ");
		lblAdmin.setFont(new Font("Impact", Font.PLAIN, 26));
		lblAdmin.setForeground(new Color(255, 255, 255));
		lblAdmin.setBounds(44, 112, 81, 40);
		panelSiyah.add(lblAdmin);
		
		panelBeyaz = new JPanel();
		panelBeyaz.setBackground(new Color(255, 255, 255));
		panelBeyaz.setPreferredSize(new Dimension(125, 10));
		frame.getContentPane().add(panelBeyaz, BorderLayout.EAST);
		panelBeyaz.setLayout(null);
		panelBeyaz.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        makeDarkLogin();
		    }
		});
		
		lblYolcu = new JLabel("Yolcu\r\n");
		lblYolcu.setBackground(new Color(0, 0, 0));
		lblYolcu.setForeground(new Color(0, 0, 0));
		lblYolcu.setFont(new Font("Impact", Font.PLAIN, 26));
		lblYolcu.setBounds(10, 115, 105, 33);
		panelBeyaz.add(lblYolcu);
		
		panelLogin = new JPanel();
		panelLogin.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panelLogin, BorderLayout.CENTER);
		panelLogin.setLayout(null);
		
		lblID = new JLabel("ID:");
		lblID.setFont(new Font("Impact", Font.PLAIN, 16));
		lblID.setHorizontalAlignment(SwingConstants.CENTER);
		lblID.setToolTipText("");
		lblID.setBounds(10, 101, 71, 21);
		panelLogin.add(lblID);
		
		lblParola = new JLabel("Parola:");
		lblParola.setFont(new Font("Impact", Font.PLAIN, 16));
		lblParola.setToolTipText("");
		lblParola.setHorizontalAlignment(SwingConstants.CENTER);
		lblParola.setBounds(10, 144, 71, 21);
		panelLogin.add(lblParola);
		
		textField = new JTextField();
		textField.setBounds(79, 101, 112, 21);
		panelLogin.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(79, 144, 112, 20);
		panelLogin.add(passwordField);
		
		girisButton = new JButton("Giriş Yap");
		girisButton.setBackground(new Color(255, 255, 255));
		girisButton.setBounds(99, 181, 92, 22);
		panelLogin.add(girisButton);
		frame.setBackground(SystemColor.textText);
		frame.setFont(new Font("Segoe UI Historic", Font.PLAIN, 13));
		frame.setForeground(SystemColor.inactiveCaptionText);
		frame.setBounds(100, 100, 479, 318);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		girisButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String ID = textField.getText();
		        String pass = new String(passwordField.getPassword());
		        textField.setText("");
		        passwordField.setText(""); 
		        

		        if (ID.equals("admin") && pass.equals("1234") && girisModu == 0) {
		            
		            // 2. ADMIN PENCERESİNİ BAŞLATMA
		            AdminFrame adminEkranı = new AdminFrame();
		            adminEkranı.setVisible(true);
		            
		            // 3. LOGİN PENCERESİNİ KAPATMA
		           frame.dispose();
		            
		        } else if (ID.equals("yolcu") && pass.equals("abc") && girisModu  == 1) {
		            
		     
		            PassangerFrame yolcuEkranı = new PassangerFrame();
		            yolcuEkranı.setVisible(true);
		            frame.dispose();
		            
		        } else {
		            JOptionPane.showMessageDialog(null, "Hatalı Giriş!");
		        }
		    }
		});
	}
	public void makeDarkLogin() {
	    panelLogin.setBackground(b);
	    
	    for (Component c : panelLogin.getComponents()) {
	        c.setBackground(b);
	        c.setForeground(a);
	        girisModu = 1;
	    }
	}
	public void makeLightLogin() {
	    panelLogin.setBackground(a);
	    
	    for (Component c : panelLogin.getComponents()) {
	        c.setBackground(a);
	        c.setForeground(b);
	        girisModu = 0;
	    }
	}
	
}
