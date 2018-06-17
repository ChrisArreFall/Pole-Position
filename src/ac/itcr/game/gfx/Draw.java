package ac.itcr.game.gfx;

import org.newdawn.slick.geom.Polygon;

public class Draw {
	Polygon shape = new Polygon();
	public Draw() {
		
	}
	public Polygon drawQuad(int x1,int y1,int w1,int x2,int y2,int w2) {
	    shape.addPoint(x1-w1,y1);
	    shape.addPoint(x2-w2,y2);
	    shape.addPoint(x2+w2,y2);
	    shape.addPoint(x1+w1,y1);
	    return shape;
	}
	public void clear() {
		shape = new Polygon();
	}

}
