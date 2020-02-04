package 메뉴판;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FoodMenu {
	
	// 선언의 위치가 변수를 사용할 수 있는 범위
	// 클래스 전체 영역에서 쓸 수 있는 변수 : 전역 변수
	static int 짜장 = 0; // 주문수 카운트
	static int 우동 = 0; // 주문수 카운트
	static int 짬뽕 = 0; // 주문수 카운트
	static int count = 0; // 주문수 카운트
	static int sum = 0; // 전체 금액 계산
	private static JTextField t2;
	private static JTextField t1;


	public static void main(String[] args) {
		JFrame f = new JFrame();
		// 지역변수
		f.getContentPane().setBackground(new Color(255, 192, 203));
		f.setSize(735, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("지불할 총 금액");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel.setBounds(37, 393, 200, 35);
		f.getContentPane().add(lblNewLabel);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 30));
		t2.setBounds(299, 393, 290, 35);
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 30));
		t1.setColumns(10);
		t1.setBounds(534, 25, 160, 35);
		f.getContentPane().add(t1);
		
		JLabel img = new JLabel("");
		img.setHorizontalAlignment(SwingConstants.CENTER);
		img.setIcon(new ImageIcon("D:\\hspark\\my07\\china.jpg"));
		img.setBounds(12, 95, 682, 261);
		f.getContentPane().add(img);
		
		JLabel j = new JLabel("");
		JLabel w = new JLabel("");
		JLabel ja = new JLabel("");
		
		JButton btnNewButton = new JButton("짜장");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				count++; // 증감연산자
				t1.setText(count + "개");
				sum = count * 5000;
				t2.setText(sum + "원");
				
				ImageIcon icon = new ImageIcon("짜장면.jpg");
				img.setIcon(icon);
				
				짜장++;
				j.setText(짜장 + "개");
				
			}
		});
		btnNewButton.setBackground(new Color(153, 0, 102));
		btnNewButton.setBounds(12, 25, 136, 35);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("우동");
		button.setForeground(new Color(255, 255, 255));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++; // 증감연산자
				t1.setText(count + "개");
				sum = count * 6000;
				t2.setText(sum + "원");
				// 우동 그림을 img 라벨에 icon 으로 집어 넣어야 함.
				ImageIcon icon = new ImageIcon("우동.jpg");
				img.setIcon(icon);
				
				우동++;
				w.setText(우동 + "개");
				
			}
		});
		button.setBackground(new Color(102, 0, 204));
		button.setBounds(179, 25, 145, 35);
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("짬뽕");
		button_1.setForeground(new Color(255, 255, 255));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++; // 증감연산자
				t1.setText(count + "개");
				sum = count * 7000;
				t2.setText(sum + "원");
				
				ImageIcon icon = new ImageIcon("짬뽕.png");
				img.setIcon(icon);
				
				짬뽕++;
				ja.setText(짬뽕 + "개");
			}
		});
		button_1.setBackground(new Color(102, 51, 102));
		button_1.setBounds(353, 25, 153, 35);
		f.getContentPane().add(button_1);
		
		j.setBounds(49, 70, 57, 15);
		f.getContentPane().add(j);
		
		w.setBounds(223, 70, 57, 15);
		f.getContentPane().add(w);
		
		ja.setBounds(403, 70, 57, 15);
		f.getContentPane().add(ja);
		
		
		f.setVisible(true);

	}
}
