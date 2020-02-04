package 크롤링;

import java.io.FileWriter;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class 네이버증권크롤링3 {

	public static void main(String[] args) throws Exception {
		String site = "https://finance.naver.com/item/main.nhn?code=";
		String[] company = {"012690", "005930", "068270", "017670", "215600"}; // 모나리자, 삼성전자, 셀트리온, sk텔레콤, 신라젠
		String[] name = {"모나리자", "삼성전자", "셀트리온", "sk텔레콤", "신라젠"};
		
		// 배열 반복
		for (int i = 0; i < company.length; i++) {
			Connection con = Jsoup.connect(site + company[i]); // site 연결
			Document doc = con.get();
			String date = doc.select("em.date").text();
			// 장마감을 잘라보자!
			String date2 = date.substring(0, 10); // 0~9까지의 인덱스
			System.out.println(date2);
			
			System.out.println("회사명 : " + name[i]);
			String today = doc.select("span.blind").get(12).text();
			System.out.println("오늘가 : " + today);
			String yester = doc.select("span.blind").get(15).text();
			System.out.println("전일가 : " + yester);
			String now = doc.select("span.blind").get(19).text();
			System.out.println("시가 : " + now);
			String high = doc.select("span.blind").get(16).text();
			System.out.println("고가 : " + high);
			String low = doc.select("span.blind").get(20).text();
			System.out.println("저가 : " + low);
			System.out.println("-------------------------------");
			
			FileWriter f = new FileWriter(date2 + "-" + name[i] + ".txt");
			f.write("날짜 : " + date2 + "\n");
			f.write("이름 : " + name[i] + "\n");
			f.write("오늘가 : " + today + "\n");
			f.write("전일가 : " + yester + "\n");
			f.write("시가 : " + now + "\n");
			f.write("고가 : " + high + "\n");
			f.write("저가 : " + low + "\n");
			f.close();
			
		}

	}

}
