package org.jocean.lbsyun.spi;

import com.alibaba.fastjson.annotation.JSONField;

public class ParentPoi {
	@JSONField(name = "name" )
	public String getName() {
		return name;
	}
	@JSONField(name = "name" )
	public void setName(final String name) {
		this.name = name;
	}

	@JSONField(name = "tag" )
	public String getTag() {
		return tag;
	}
	@JSONField(name = "tag" )
	public void setTag(final String tag) {
		this.tag = tag;
	}

	@JSONField(name = "addr" )
	public String getAddr() {
		return addr;
	}
	@JSONField(name = "addr" )
	public void setAddr(final String addr) {
		this.addr = addr;
	}

	@JSONField(name = "point" )
	public X_Y getPoint() {
		return point;
	}
	@JSONField(name = "point" )
	public void setPoint(final X_Y point) {
		this.point = point;
	}

	@JSONField(name = "direction" )
	public String getDirection() {
		return direction;
	}
	@JSONField(name = "direction" )
	public void setDirection(final String direction) {
		this.direction = direction;
	}

	@JSONField(name = "distance" )
	public String getDistance() {
		return distance;
	}
	@JSONField(name = "distance" )
	public void setDistance(final String distance) {
		this.distance = distance;
	}

	@JSONField(name = "uid" )
	public String getUid() {
		return uid;
	}
	@JSONField(name = "uid" )
	public void setUid(final String uid) {
		this.uid = uid;
	}

    private String name;
    private String tag;
    private String addr;
    private X_Y point;
    private String direction;
    private String distance;
    private String uid;
}
