package com.neuedu.part07;
/**
 * ���Shape��ʾͼ���࣬���������area���ܳ�����per����ɫ����color�����������췽����һ����Ĭ�ϵġ�һ����Ϊ��ɫ��ֵ�ģ�������3�����󷽷����ֱ��ǣ�getArea���������getPer�����ܳ���showAll���������Ϣ������һ������ɫ�ķ���getColor��
��� 2�����ࣺ

Rectangle��ʾ�����࣬�����������ԣ�Width��ʾ���ȡ�height��ʾ��ȣ���дgetPer��getArea��showAll��������������������һ�����췽����һ����Ĭ�ϵġ�һ����Ϊ�߶ȡ���ȡ���ɫ��ֵ�ģ���

Circle��ʾԲ�࣬����1�����ԣ�radius��ʾ�뾶����дgetPer��getArea��showAll���������������������������췽����Ϊ�뾶����ɫ��ֵ�ģ���

��main�����У���������ÿ������Ķ��󣬲�����2�������showAll������
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
		System.out.println("�����"+area);
		System.out.println("�ܳ���"+per);
		System.out.println("��ɫ��"+color);
	}
	
	//�����õ�main����
    public static void main(String[] args) {
		
    	Rectangle rectangle = new Rectangle(10,15,"��ɫ");
    	Circle circle = new Circle(20,"��ɫ");
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
		System.out.println("�����"+getArea());
		System.out.println("�ܳ���"+getPer());
		System.out.println("��ɫ��"+getColor());
		System.out.println("����"+this.weight);
		System.out.println("����"+this.height);
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
		System.out.println("�����"+getArea());
		System.out.println("�ܳ���"+getPer());
		System.out.println("��ɫ��"+getColor());
		System.out.println("�뾶��"+this.radius);
	}
    
    

}


