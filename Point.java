package com.zgw.homework0409;
/* ��һ�⣺
 * ����һ������Point������2����Ա����x��y�ֱ��ʾx��y���꣬
 * 2��������Point()��Point(intx0,y0),
 * �Լ�һ��movePoint��int dx,int dy)����ʵ�ֵ��λ���ƶ���
 * ��������Point����p1��p2���ֱ����movePoint�����󣬴�ӡp1��p2�����ꡣ
 * 
 */
public class Point {
	int x;
	int y;
	//����������Point()��Point(intx0,y0)
	public Point()
	{
		
	}
	public Point(int x0,int y0)
	{
		this.x=x0;
		this.y=y0;
	}
	//movePoint��int dx,int dy)����ʵ�ֵ��λ���ƶ�
	public void movePoint(int dx,int dy)
	{
		this.x+= dx;
		this.y+= dy;
		System.out.print("��x���ƶ���"+dx+"����y���ƶ���"+dy+"��");
		System.out.println("�ƶ��������Ϊ" + "(" + this.x + "," + this.y + ")");
	}
	
	public static void main(String[] args)
	{
		Point p1 = new Point(0,0);
		Point p2 = new Point(1,2);
		
		System.out.println("p1������Ϊ" + "(" + p1.x + "," + p1.y + ")");
		p1.movePoint(2,3);
		System.out.println("p2������Ϊ" + "(" + p2.x + "," + p2.y + ")");
		p2.movePoint(2,3);
	}
}

