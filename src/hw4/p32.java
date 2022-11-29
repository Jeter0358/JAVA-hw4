package hw4;

public class p32 {

	public static void main(String[] args) {
		Vehicle[] vc = new Vehicle[2];
		vc[0] = new Car32(1234,20.5);
		vc[1] = new Plane32(232);
		for(int i=0;i<vc.length;i++)
		{
			if(vc[i] instanceof Car32)
				System.out.println("第" + (i+1)+ "個物件是Car類別");
			else
				System.out.println("第" + (i+1)+ "個物件不是Car類別");
		}
	}

}
abstract class Vehicle
{
	protected int speed;
	public void setSpeed(int s)
	{
		speed = s;
		System.out.println("將速度設為"+speed+"了");
	}
	abstract void show();
}
class Car32 extends Vehicle
{
	protected int num;
	protected double gas;
	public Car32(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"油量設為"+gas+"的車子");
	}
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("油量是"+gas);
		System.out.println("速度是"+speed);
	}
}
class Plane32 extends Vehicle 
{
	private int flight;
	public Plane32(int f)
	{
		flight = f;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	public void show()
	{
		System.out.println("飛機的班次是"+flight);
		System.out.println("速度是"+speed);
	}
}