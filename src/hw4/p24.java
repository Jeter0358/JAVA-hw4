package hw4;

public class p24 {

	public static void main(String[] args) {
		Car24 car1;
		car1 = new Car24();
		car1.setCar24(1234,20.5);
		System.out.println(car1);
	}

}
class Car24
{
	protected int num;
	protected double gas;
	public Car24()
	{
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
	public void setCar24(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��"+num+"�o�q�]��"+gas);
	}
	public String toString()
	{
		String str = "����:" +num+ ";�T�o�q:" +gas;
		return str;
	}
}