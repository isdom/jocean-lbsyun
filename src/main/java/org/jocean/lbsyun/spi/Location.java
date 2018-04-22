package org.jocean.lbsyun.spi;

import com.alibaba.fastjson.annotation.JSONField;


public class Location {

	@JSONField(name = "lat" )
	public float getLat() {
		return lat;
	}

	@JSONField(name = "lat" )
	public void setLat(final float lat) {
		this.lat = lat;
	}

	@JSONField(name = "lng" )
	public float getLng() {
		return lng;
	}

	@JSONField(name = "lng" )
	public void setLng(final float lng) {
		this.lng = lng;
	}

    private float lat;
    private float lng;
}
