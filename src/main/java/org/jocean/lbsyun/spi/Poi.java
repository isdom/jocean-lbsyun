package org.jocean.lbsyun.spi;

import com.alibaba.fastjson.annotation.JSONField;

public class Poi {
	private String addr;
	private String cp;
	private String direction;
	private String distance;
	private String name;
	private String poiType;
	private String point;
	private String tel;
	private String uid;
	private String zip;
	private ParentPoi parent_poi;
	@JSONField(name = "addr" )
	public String getAddr() {
		return addr;
	}
	@JSONField(name = "addr" )
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@JSONField(name = "cp" )
	public String getCp() {
		return cp;
	}
	@JSONField(name = "cp" )
	public void setCp(String cp) {
		this.cp = cp;
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
	@JSONField(name = "name" )
	public String getName() {
		return name;
	}
	@JSONField(name = "name" )
	public void setName(String name) {
		this.name = name;
	}
	@JSONField(name = "poiType" )
	public String getPoiType() {
		return poiType;
	}
	@JSONField(name = "poiType" )
	public void setPoiType(String poiType) {
		this.poiType = poiType;
	}
	@JSONField(name = "point" )
	public String getPoint() {
		return point;
	}
	@JSONField(name = "point" )
	public void setPoint(String point) {
		this.point = point;
	}
	@JSONField(name = "tel" )
	public String getTel() {
		return tel;
	}
	@JSONField(name = "tel" )
	public void setTel(String tel) {
		this.tel = tel;
	}
	@JSONField(name = "uid" )
	public String getUid() {
		return uid;
	}
	@JSONField(name = "uid" )
	public void setUid(String uid) {
		this.uid = uid;
	}
	@JSONField(name = "zip" )
	public String getZip() {
		return zip;
	}
	@JSONField(name = "zip" )
	public void setZip(String zip) {
		this.zip = zip;
	}
	@JSONField(name = "parent_poi" )
	public ParentPoi getParent_poi() {
		return parent_poi;
	}
	@JSONField(name = "parent_poi" )
	public void setParent_poi(ParentPoi parent_poi) {
		this.parent_poi = parent_poi;
	}
	
	
	
	


}
