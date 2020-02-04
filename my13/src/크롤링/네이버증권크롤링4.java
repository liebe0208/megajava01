package 크롤링;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 네이버증권크롤링4 {
	private static JTextField t1;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(SystemColor.activeCaption);
		f.setSize(350, 470);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("모나미");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("005360");
			}
		});
		
		t1 = new JTextField();
		t1.setBackground(SystemColor.inactiveCaptionBorder);
		t1.setBounds(131, 169, 167, 34);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JTextArea t2 = new JTextArea();
		t2.setBounds(33, 290, 265, 119);
		f.getContentPane().add(t2);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(240, 128, 128));
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton.setBounds(69, 10, 189, 43);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("삼성전자");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("005930");
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(119, 136, 153));
		button.setFont(new Font("굴림", Font.PLAIN, 30));
		button.setBounds(69, 63, 189, 43);
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("셀트리온");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("068270");
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(new Color(95, 158, 160));
		button_1.setFont(new Font("굴림", Font.PLAIN, 30));
		button_1.setBounds(69, 116, 189, 43);
		f.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("크롤링 시작");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // 에러발생했을 때에 대해 명시해야함
				// 1. 코드값을 가지고 온다.
				String code = t1.getText();
				// 2. 그 코드값으로 크롤링한다.
				try {
					String site = "https://finance.naver.com/item/main.nhn?code=";
					Connection con = Jsoup.connect(site + code); // site 연결
					Document doc = con.get();
					String date = doc.select("em.date").text();
					// 장마감을 잘라보자!
					String date2 = date.substring(0, 10); // 0~9까지의 인덱스
					String today = doc.select("span.blind").get(12).text();
					String yester = doc.select("span.blind").get(15).text();
					String now = doc.select("span.blind").get(19).text();
					String high = doc.select("span.blind").get(16).text();
					String low = doc.select("span.blind").get(20).text();
					
					t2.setText("");
					t2.append("날짜 : " + date2 + "\n"); // append 채팅창처럼, 꾸준히 쌓임
					t2.append("오늘 : " + today + "\n");
					t2.append("어제 : " + yester + "\n");
					t2.append("시가 : " + now + "\n");
					t2.append("고가 : " + high + "\n"); 
					t2.append("저가 : " + low + "\n"); 
				} catch (Exception e2) {
					System.out.println("에러발생! 에러발생!");
				}
				// 3. 가져온 크롤링값을 화면에 넣는다. => t2
			}
		});
		button_2.setBackground(new Color(255, 99, 71));
		button_2.setFont(new Font("굴림", Font.PLAIN, 30));
		button_2.setBounds(33, 225, 265, 43);
		f.getContentPane().add(button_2);
		
		JLabel lblNewLabel = new JLabel("CODE : ");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel.setBounds(12, 169, 116, 35);
		f.getContentPane().add(lblNewLabel);
		f.setVisible(true);

	}
}
