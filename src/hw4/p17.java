package hw4;

public class p17 {

	public static void main(String[] args) {
		Car17 cars[];
		cars = new Car17[2];
		cars[0] = new Car17();
		cars[0].setCar17(1234,20.5);
		cars[1] = new RacingCar17();
		cars[1].setCar17(4567,30.5);
		for(int i=0;i<cars.length;i++)
		{
			cars[i].show();
		}
	}
}
class Car17
{
	protected int num;
	protected double gas;
	public Car17()
	{
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
	public void setCar17(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��"+num+"�o�q�]��"+gas);
	}
	public void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�o�q�O"+gas);
	}
}
class RacingCar17 extends Car17
{
	private int course;
	public RacingCar17()
	{
		course = 0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	public void setCourse(int c)
	{
		course =c;
		System.out.println("�N�ɨ��s���]��"+course);
	}
	public void show()
	{
		System.out.println("�ɨ��������O"+num);
		System.out.println("�o�q�O"+gas);
		System.out.println("�ɨ��s���O"+course);
	}
}