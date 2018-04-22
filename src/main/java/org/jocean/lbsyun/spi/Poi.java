package org.jocean.lbsyun.spi;

import com.alibaba.fastjson.annotation.JSONField;

public class Poi {
	@JSONField(name = "addr" )
	public String getAddr() {
		return addr;
	}
	@JSONField(name = "addr" )
	public void setAddr(final String addr) {
		this.addr = addr;
	}

	@JSONField(name = "cp" )
	public String getCp() {
		return cp;
	}
	@JSONField(name = "cp" )
	public void setCp(final String cp) {
		this.cp = cp;
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

	@JSONField(name = "name" )
	public String getName() {
		return name;
	}
	@JSONField(name = "name" )
	public void setName(final String name) {
		this.name = name;
	}

	@JSONField(name = "poiType" )
	public String getPoiType() {
		return poiType;
	}
	@JSONField(name = "poiType" )
	public void setPoiType(final String poiType) {
		this.poiType = poiType;
	}

	@JSONField(name = "point" )
	public String getPoint() {
		return point;
	}
	@JSONField(name = "point" )
	public void setPoint(final String point) {
		this.point = point;
	}

	@JSONField(name = "tel" )
	public String getTel() {
		return tel;
	}
	@JSONField(name = "tel" )
	public void setTel(final String tel) {
		this.tel = tel;
	}

	@JSONField(name = "uid" )
	public String getUid() {
		return uid;
	}
	@JSONField(name = "uid" )
	public void setUid(final String uid) {
		this.uid = uid;
	}

	@JSONField(name = "zip" )
	public String getZip() {
		return zip;
	}
	@JSONField(name = "zip" )
	public void setZip(final String zip) {
		this.zip = zip;
	}

	@JSONField(name = "parent_poi" )
	public ParentPoi getParentPoi() {
		return parentPoi;
	}
	@JSONField(name = "parent_poi" )
	public void setParentPoi(final ParentPoi parentPoi) {
		this.parentPoi = parentPoi;
	}

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
    private ParentPoi parentPoi;
}
