package inheritance;

public class BounsPointAccount extends Account{
	
	//은행+보너스포인트	
	private int bonusPoint;
	
	public BounsPointAccount(String ano, String owner, int balance, int bonusPoint) {
		super(ano, owner, balance);
		this.bonusPoint=bonusPoint;
	}
	
	//예금기능, 보너스포인트+=예금액*1%
	@Override
	public void deposit(int amount) {
		//예금하다
		super.deposit(amount);
		//보너스포인트+=예금액*1%
		bonusPoint+=amount*0.01;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

}
