package Test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tinhbieuthuc extends JFrame {

	private JPanel contentPane;
	private JTextField txtnhapn;
	private JTextField txtketqua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tinhbieuthuc frame = new tinhbieuthuc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * fffCreate the frame.
	 */
	public tinhbieuthuc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 755, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("sn = 1/(1*2) + 1/(2*3) + 1/(3*4) + ... + 1/n(n+1) ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(145, 107, 507, 48);
		contentPane.add(lblNewLabel);
		
		txtnhapn = new JTextField();
		txtnhapn.setBounds(247, 206, 180, 22);
		contentPane.add(txtnhapn);
		txtnhapn.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nhap n :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(145, 205, 94, 21);
		contentPane.add(lblNewLabel_1);
		
		JButton btntinh = new JButton("Tinh");
		btntinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double s = 0;
				if(txtnhapn.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "chua nhap n !");
				}
				else {
					for(double i = 1; i <= Integer.parseInt(txtnhapn.getText()) ; i++) {
						s += 1/(i*(i+1)) ;
						System.out.println(s);
					}
				}
				
				
				String a = String.valueOf(s);
				txtketqua.setText(a);
				
			}
		});
		btntinh.setBounds(145, 295, 97, 25);
		contentPane.add(btntinh);
		
		txtketqua = new JTextField();
		txtketqua.setColumns(10);
		txtketqua.setBounds(247, 371, 180, 22);
		contentPane.add(txtketqua);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ket qua :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(145, 370, 94, 21);
		contentPane.add(lblNewLabel_1_1);
	}
}
