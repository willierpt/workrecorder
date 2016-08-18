package com.github.willierpt.workrecorder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;

public class Launch extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Launch frame = new Launch();
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
	public Launch() {
		setTitle("Work Recorder");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 285, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWillier = new JLabel("\u00A9 willier");
		lblWillier.setForeground(Color.LIGHT_GRAY);
		lblWillier.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblWillier.setBounds(223, 396, 36, 14);
		contentPane.add(lblWillier);
		
		JRadioButton rdbtnEn = new JRadioButton("EN");
		rdbtnEn.setBounds(220, 7, 39, 23);
		contentPane.add(rdbtnEn);
		
		JRadioButton rdbtnPt = new JRadioButton("PT");
		rdbtnPt.setBounds(220, 30, 39, 23);
		contentPane.add(rdbtnPt);
		
		JLabel lblNewLabel = new JLabel("TESTE");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 204, 62);
		contentPane.add(lblNewLabel);
	}
}
