package hw4;

public class p41 {

	public static void main(String[] args) {
		Car41 car1 = new Car41(1234,20.5);
		car1.vShow();
		car1.mShow();
	}
}
interface iVehicle41
{
	void vShow();
}
interface iMaterial
{
	void mShow();
}
class Car41 implements iMaterial,iVehicle41
{
	private int num;
	private double gas;
	public Car41(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��"+num+"�o�q�]��"+gas+"�����l");
	}
	public void vShow()
	{
		System.out.println("�����O"+num);
		System.out.println("�o�q�O"+gas);
	}
	public void mShow()
	{
		System.out.println("����������O�K");
	}
}