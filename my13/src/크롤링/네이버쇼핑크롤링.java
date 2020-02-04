package 크롤링;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class 네이버쇼핑크롤링 {

	public static void main(String[] args) throws Exception {
		String site = "https://shopping.naver.com/";
		// 네트워크 프로그래밍 (네트워크 연결)
		// 에러처리 반드시 해야함
		
		//ctrl+shift+o 
		Connection con = Jsoup.connect(site); // site 연결
		System.out.println("1. 사이트 연결 성공");
		
		Document doc = con.get();
		System.out.println("2. 연결된 사이트에서 문서를 다 가지고 오기 성공");
		System.out.println("3. 내용==========================");
		System.out.println(doc);

	}

}
