package org.jocean.lbsyun.spi;

import com.alibaba.fastjson.annotation.JSONField;

public class ParentPoi {
	private String name;
	private String tag;
	private String addr;
	private PointResponse point;
	private String direction;
	private String distance;
	private String uid;
	@JSONField(name = "name" )
	public String getName() {
		return name;
	}
	@JSONField(name = "name" )
	public void setName(String name) {
		this.name = name;
	}
	@JSONField(name = "tag" )
	public String getTag() {
		return tag;
	}
	@JSONField(name = "tag" )
	public void setTag(String tag) {
		this.tag = tag;
	}
	@JSONField(name = "addr" )
	public String getAddr() {
		return addr;
	}
	@JSONField(name = "addr" )
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@JSONField(name = "point" )
	public PointResponse getPoint() {
		return point;
	}
	@JSONField(name = "point" )
	public void setPoint(PointResponse point) {
		this.point = point;
	}
	@JSONField(name = "direction" )
	public String getDirection() {
		return direction;
	}
	@JSONField(name = "direction" )
	public void setDirection(String direction) {
		this.direction = direction;
	}
	@JSONField(name = "distance" )
	public String getDistance() {
		return distance;
	}
	@JSONField(name = "distance" )
	public void setDistance(String distance) {
		this.distance = distance;
	}
	@JSONField(name = "uid" )
	public String getUid() {
		return uid;
	}
	@JSONField(name = "uid" )
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	
	
	


}
