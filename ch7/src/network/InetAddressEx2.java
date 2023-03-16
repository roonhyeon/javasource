package network;

import java.net.InetAddress;

public class InetAddressEx2 { //IP 주소를 다루기 위한 클래스

	public static void main(String[] args) {
		
		InetAddress ip=null;
		
		try {
			ip=InetAddress.getLocalHost(); //내 컴퓨터 호출
			System.out.println("getHostName(): "+ip.getHostName());
			System.out.println("getHostAddress(): "+ip.getHostAddress());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
