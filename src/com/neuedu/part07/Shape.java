package com.neuedu.part07;
/**
 * 设计Shape表示图形类，有面积属性area、周长属性per，颜色属性color，有两个构造方法（一个是默认的、一个是为颜色赋值的），还有3个抽象方法，分别是：getArea计算面积、getPer计算周长、showAll输出所有信息，还有一个求颜色的方法getColor。
设计 2个子类：

Rectangle表示矩形类，增加两个属性，Width表示长度、height表示宽度，重写getPer、getArea和showAll三个方法，另外又增加一个构造方法（一个是默认的、一个是为高度、宽度、颜色赋值的）。

Circle表示圆类，增加1个属性，radius表示半径，重写getPer、getArea和showAll三个方法，另外又增加两个构造方法（为半径、颜色赋值的）。

在main方法中，声明创建每个子类的对象，并调用2个子类的showAll方法。
 *
 *
 */
public class Shape {

	private int area;
	private int per;
	private String color;
	
	
	public Shape(){
		
	}
	
	public Shape(String color){
		this.color=color;
	}

	public int getArea() {
		return area;
	}

	public int getPer() {
		return per;
	}

	public String getColor() {
		return color;
	}
	
	public void showAll(){
		System.out.println("面积是"+area);
		System.out.println("周长是"+per);
		System.out.println("颜色是"+color);
	}
	
	//测试用的main方法
    public static void main(String[] args) {
		
    	Rectangle rectangle = new Rectangle(10,15,"红色");
    	Circle circle = new Circle(20,"黄色");
    	rectangle.showAll();
    	circle.showAll();
	}
	
	
}


class Rectangle extends Shape{
	
	private int weight;
	private int height;
	
	public Rectangle(){
		
	}
	
    public Rectangle(int weight,int height,String color){
		super(color);
		this.height=height;
		this.weight=weight;
	}

	@Override
	public int getArea() {
		return weight*height;
	}

	@Override
	public int getPer() {
		return (weight+height)*2;
	}

	@Override
	public void showAll() {
		System.out.println("面积是"+getArea());
		System.out.println("周长是"+getPer());
		System.out.println("颜色是"+getColor());
		System.out.println("长是"+this.weight);
		System.out.println("宽是"+this.height);
	}
	
	
}
class Circle extends Shape{
	
	private int radius;
	
	public Circle(){
		
	}
	
    public Circle(int radius,String color){
    	super(color);
		this.radius=radius;
	}

	@Override
	public int getArea() {
		
		return 3*radius*radius;
	}

	@Override
	public int getPer() {
		
		return 2*3*radius;
	}

	@Override
	public void showAll() {
		System.out.println("面积是"+getArea());
		System.out.println("周长是"+getPer());
		System.out.println("颜色是"+getColor());
		System.out.println("半径是"+this.radius);
	}
    
    

}


