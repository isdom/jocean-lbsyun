package org.jocean.lbsyun.spi;

import com.alibaba.fastjson.annotation.JSONField;

public class Location {
	private float lat;
	private float lng;
	@JSONField(name = "lat" )
	public float getLat() {
		return lat;
	}
	@JSONField(name = "lat" )
	public void setLat(float lat) {
		this.lat = lat;
	}
	@JSONField(name = "lng" )
	public float getLng() {
		return lng;
	}
	@JSONField(name = "lng" )
	public void setLng(float lng) {
		this.lng = lng;
	}
	
	
}
