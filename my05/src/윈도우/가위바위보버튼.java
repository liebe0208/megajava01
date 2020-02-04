package 윈도우;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 가위바위보버튼 {

	public static void main(String[] args) {
		 
		JFrame f = new JFrame();
		f.setBackground(Color.MAGENTA);
		f.getContentPane().setBackground(new Color(255, 153, 255));
		
		JButton button = new JButton("가위");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 버튼을 더블클릭하면 -> 가위 버튼을 클릭했을 때 처리 내용
				JOptionPane.showMessageDialog(null, "가위를 누르셨군요.");
			}
		});
		button.setBackground(Color.RED);
		f.getContentPane().add(button, BorderLayout.WEST);
		
		JButton btnNewButton = new JButton("바위");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "바위를 누르셨군요.");
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("보");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "보를 누르셨군요.");
			}
		});
		btnNewButton_1.setBackground(Color.MAGENTA);
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		f.setSize(300, 300);
		
		
		
		
		
		f.setVisible(true);

	}

}
