package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionEx1 {

	public static void main(String[] args) {
		
		BufferedReader input=null;
		String line="";
		
		try {
			URL url=new URL("https://www.naver.com");
			
//			url.openStream() 대신에 URLConeection 사용하기
//			URLConnection con=url.openConnection();
//			con.getInputStream();
			
			// url.openStream(): 지금 현재 연결된 url에서 데이터를 읽어와서 InputStream의 형태로 리턴
			// InputStreamReader(): InputStream으로 들어온 것을 Reader로 변환해준다.
			// Reader로 변환되어서 그래서 BufferedReader를 사용할 수 있게 되는 것이다.
			input=new BufferedReader(new InputStreamReader(url.openStream())); //제일 안쪽 가로부터 해석해나간다.
			
			while ((line=input.readLine())!=null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
