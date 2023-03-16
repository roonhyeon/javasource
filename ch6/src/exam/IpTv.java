package exam;

public class IpTv extends ColorTv {

	private String address;

	public IpTv(int size, int color, String address) {
		super(size, color);
		this.address=address;
	}
	
	@Override
	public void printProperty() {
		System.out.println("나의 IpTv는 "+getSize()+"인치, "+getColor()+"컬러, 주소는 "+address+" 입니다.");
	}

}
