package hw4;

public class p26 {

	public static void main(String[] args) {
		Car26[] cars;
		cars = new Car26[2];
		
		cars[0] = new Car26();
		cars[1] = new RacingCar26();
		for(int i=0;i<cars.length;i++)
		{
			Class cl = cars[i].getClass();
			System.out.println("��" + (i+1)+ "���������O�O" + cl);
		}
	}

}
class Car26
{
	protected int num;
	protected double gas;
	public Car26()
	{
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
}
class RacingCar26 extends Car26
{
	public RacingCar26()
	{
		System.out.println("�Ͳ��F�ɨ�");
	}
}
