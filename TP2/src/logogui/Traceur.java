/*
 * Created on 12 sept. 2008
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package logogui;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Graphics;

public class Traceur {
	private static Traceur instance;
	private Graphics2D g2d;
	private double initx = 300, inity = 300;   // position initiale
	private double posx = initx, posy = inity; // position courante
	private int angle = 90;
	private double teta;
	private boolean isDrawing = true;
	
	public Traceur() {
		setTeta();
	}

	public void setGraphics(Graphics g) {
		g2d = (Graphics2D) g;	
	}
	
	private int toInt(double a) {
		return (int) Math.round(a);
	}
	
	public void avance(double r) {
		double a = posx + r * Math.cos(teta) ;
		double b = posy - r * Math.sin(teta) ;
		int x1 = toInt(posx);
		int y1 = toInt(posy);
		int x2 = toInt(a);
		int y2 = toInt(b);
		if (isDrawing) {
			g2d.drawLine(x1,y1,x2,y2);
		}
		posx = a;
		posy = b;
	}
	
	public void recule(double r) {
		avance(-r);
	}

	public void tg(double r) {
		angle = (angle + toInt(r)) % 360;
		setTeta();
	}
	
	public void td(double r) {
		angle = (angle - toInt(r)) % 360;
		setTeta();
	}
	
	public void clear() {
		g2d.clearRect(0, 0, 10000, 10000);
	}
	
	
	public void setPos(int x, int y) {
		posx = x;
		posy = y;
	}
	
	public void setColor(int color) {
		g2d.setColor(new Color(color));
	}
	
	private void setTeta() {
		teta = Math.toRadians(angle);
	}

	public boolean isDrawing() {
		return isDrawing;
	}

	public void setDrawing(boolean isDrawing) {
		this.isDrawing = isDrawing;
	}
	
	
}
