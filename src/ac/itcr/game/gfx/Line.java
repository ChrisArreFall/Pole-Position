package ac.itcr.game.gfx;

import org.newdawn.slick.Image;

public class Line {

	public Integer width;
	public Integer height;
	public Integer roadW;
	public float camD;
	public float x,y,z; //3d center of line
	public float X; //screen coord
	public float Y;
	private float W;
	public float curve,scale;
	public double spriteX;
	public Image sprite;

	public Line(Integer width,Integer height,Integer roadW,float camD){
		curve=x=y=z=0;
		this.width = width;
		this.height = height;
		this.roadW = roadW;
		this.camD = camD;
		}
	public void project(float camX,int camY,int camZ){
		scale = camD/(z-camZ);
		X = (1 + scale*(x - camX)) * width/2;
		Y = (1 - scale*(y - camY)) * height/2;
		setW(scale * roadW  * width/2);
		System.out.println("w "+getW());
		}
	 
	public float getX() {
		return X;
		}
	public float getY() {
		return Y;
		}
	public float getW() {
		return W;
		}
	public void setW(float w) {
		W = w;
		}
}
