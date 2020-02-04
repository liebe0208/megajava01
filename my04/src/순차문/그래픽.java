package 순차문;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;

public class 그래픽 {

	public static void main(String[] args) {
		// 그래픽 부품(class) 사용해서 화면을 띄워봅시다!
		
		 JFrame f = new JFrame();
		 f.setSize(800, 800);
		 
		 JButton b = new JButton();
		 b.setForeground(new Color(255, 0, 255));
		 b.setFont(new Font("양재인장체M", Font.PLAIN, 16));
		 b.setBackground(new Color(0, 255, 127));
		 b.setText("나를 눌러요... 꾹꾹!!");
		 
		 f.getContentPane().add(b, BorderLayout.CENTER);
		 // 프레임에 b라는 버튼을 올려줘!

		 f.setVisible(true); // 위에 있는 것들 다 보여주는 성질 -> 맨 아래 있어야 함

	}

}
