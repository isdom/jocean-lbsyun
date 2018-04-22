package org.jocean.lbsyun.spi;

import com.alibaba.fastjson.annotation.JSONField;

public class LocationPoint {
    @Override
    public String toString() {
        return "[y=" + y + ", x=" + x + "]";
    }

	@JSONField(name = "y" )
	public String getY() {
		return y;
	}
	@JSONField(name = "y" )
	public void setY(final String y) {
		this.y = y;
	}

	@JSONField(name = "x" )
	public String getX() {
		return x;
	}
	@JSONField(name = "x" )
	public void setX(final String x) {
		this.x = x;
	}

    private String y;
    private String x;
}
