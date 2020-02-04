package 크롤링;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class 네이버증권크롤링2 {

	public static void main(String[] args) throws Exception {
		String site = "https://finance.naver.com/item/main.nhn?code=";
		String[] company = {"012690", "005930", "068270", "017670", "215600"}; // 모나리자, 삼성전자, 셀트리온, sk텔레콤, 신라젠
		String[] name = {"모나리자", "삼성전자", "셀트리온", "sk텔레콤", "신라젠"};
		
		// 배열 반복
		for (int i = 0; i < company.length; i++) {
			Connection con = Jsoup.connect(site + company[i]); // site 연결
			Document doc = con.get();
			System.out.println("회사명 : " + name[i]);
			System.out.print("오늘가 : ");
			System.out.println(doc.select("p.no_today").text());
			System.out.println(doc.select("td.first").text());
			System.out.println("-------------------------------");
		}
		
		
		

	}

}
