package com.classofjava.java1702.websocket;

import java.awt.*;

public class DrawingObject {
	public static String MESSAGE_NAME = "DrawingObject";
	private Shape shape;
	private Point center;
	private int radius = 0;
	private Color color;
	public DrawingObject(Shape shape, Point center, int radius, Color color) {
		this.shape = shape;
		this.center = center;
		this.radius = radius;
		this.color = color;
	}
	
	public Shape getShape() {
		return this.shape;
	}

	public Point getCenter() {
		return this.center;
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public void draw(Graphics g) {
		g.setColor(this.color);
		switch (shape) {
			case CIRCLE:
				g.fillOval(center.x - radius,
				center.y - radius, 2 * radius,
				2 * radius);
				break;
			case TRIANGLE:
				Polygon triangle = new Polygon();
				triangle.addPoint(center.x, center.y-radius);68 Java WebSocket Programming
				triangle.addPoint(center.x+radius, center.y+radius);
				triangle.addPoint(center.x-radius, center.y+radius);
				g.fillPolygon(triangle);
				break;
			case SQUARE:
				Polygon square = new Polygon();
				square.addPoint(center.x-radius, center.y-radius);
				square.addPoint(center.x+radius, center.y-radius);
				square.addPoint(center.x+radius, center.y+radius);
				square.addPoint(center.x-radius, center.y+radius);
				g.fillPolygon(square);
				break;
			case PENTAGON:
				Polygon pentagon = new Polygon();
				pentagon.addPoint(center.x, center.y-radius);
				pentagon.addPoint(center.x+radius, center.y-(radius/5));
				pentagon.addPoint(center.x+(3*radius/5), center.y+radius);
				pentagon.addPoint(center.x-(3*radius/5), center.y+radius);
				pentagon.addPoint(center.x-radius, center.y-(radius/5));
				g.fillPolygon(pentagon);
			default:
				g.fillOval(center.x - 5, center.y - 5, 10, 10);
				break;
		}
	}
}