package network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressEx1 { //IP 주소를 다루기 위한 클래스

	public static void main(String[] args) {
		
		InetAddress ip=null;
		
		try {
			ip=InetAddress.getByName("www.naver.com"); //getByName(호스트명): ip 주소를 얻게 된다.
			System.out.println("getHostName(): "+ip.getHostName()); //반대로 바로 위에서 얻은 주소를 통해 호스트명을 얻을 수 있다.
			System.out.println("getHostAddress(): "+ip.getHostAddress()); //getHostAddress( ): IP 주소
			System.out.println("toString(): "+ip.toString()); //ip.toString( ): 변수 ip의 내용
			
			//ip 주소를 byte 배열로 반환
			byte[] ipAddr=ip.getAddress();
			System.out.println("getAddress(): "+Arrays.toString(ipAddr));
			
			String result="";
			for (int i = 0; i < ipAddr.length; i++) {
				result+=(ipAddr[i] < 0 ? ipAddr[i]+256:ipAddr[i]+"."); 
			}
			
			System.out.println("getAddress()+256: "+result);
			System.out.println();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			InetAddress ipArr[]=InetAddress.getAllByName("www.naver.com"); //getAllByName(): 하나의 도메인명에 여러 IP주소가 매핑될 떄 모든 IP 주소를 가져온다.
			
			for (int i = 0; i < ipArr.length; i++) {
				System.out.println("ipArr["+i+"] : "+ipArr[i]);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
