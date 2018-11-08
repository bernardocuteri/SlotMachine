package it.unical.asde2018.model;

import java.util.Random;

public class SlotMachineNumber {
	
	private int number1;
	private int number2;
	private int number3;
	
	private Random random;
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	public int getNumber3() {
		return number3;
	}
	public void setNumber3(int number3) {
		this.number3 = number3;
	}
	
	public SlotMachineNumber()
	{
		random = new Random();
		number1=random.nextInt(3) + 1;
		number2=random.nextInt(3) + 1;
		number3=random.nextInt(3) + 1;
	}
	
	public void generate()
	{
		random = new Random();
		number1=random.nextInt(3) + 1;
		number2=random.nextInt(3) + 1;
		number3=random.nextInt(3) + 1;
	}
	
	public boolean allNumberEqual()
	{
		if(number1==number2 && number2==number3)
		{
			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number1;
		result = prime * result + number2;
		result = prime * result + number3;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SlotMachineNumber other = (SlotMachineNumber) obj;
		if (number1 != other.number1)
			return false;
		if (number2 != other.number2)
			return false;
		if (number3 != other.number3)
			return false;
		return true;
	}
	
	
	
}
