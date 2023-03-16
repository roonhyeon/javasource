package network;

import java.net.URL;

//URL
// https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=박스오피스

public class UrlEx1 {

	public static void main(String[] args) {
		
		try {
			URL url= new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=박스오피스");
			
			//url을 이용한 여러 메소드
			System.out.println("url.getAuthority() : "+url.getAuthority());
			System.out.println("url.getContent() : "+url.getContent());
			System.out.println("url.getDefaultPort() : "+url.getDefaultPort());
			System.out.println("url.getPort() : "+url.getPort());
			System.out.println("url.getFile() : "+url.getFile());
			System.out.println("url.getHost() : "+url.getHost());
			System.out.println("url.getPath() : "+url.getPath());
			System.out.println("url.getProtocol() : "+url.getProtocol());
			System.out.println("url.getQuery() : "+url.getQuery());
			System.out.println("url.getUserInfo() : "+url.getUserInfo());
			System.out.println("url.toExternalForm() : "+url.toExternalForm()); //URL을 문자열로 반환
			System.out.println("url.toURI() : "+url.toURI()); //URL을 URI로 변환 (URI가 URL을 포함하고 있다.)
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
