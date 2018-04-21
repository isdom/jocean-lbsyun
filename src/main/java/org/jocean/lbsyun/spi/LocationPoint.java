package org.jocean.lbsyun.spi;

import com.alibaba.fastjson.annotation.JSONField;

public class LocationPoint {
	private String y;
	private String x;
	
	@JSONField(name = "y" )
	public String getY() {
		return y;
	}
	@JSONField(name = "y" )
	public void setY(String y) {
		this.y = y;
	}
	@JSONField(name = "x" )
	public String getX() {
		return x;
	}
	@JSONField(name = "x" )
	public void setX(String x) {
		this.x = x;
	}
	@Override
	public String toString() {
		return "LocationPoint [y=" + y + ", x=" + x + "]";
	}
	
}
