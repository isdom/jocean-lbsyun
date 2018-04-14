package org.jocean.lbsyun.spi;

import com.alibaba.fastjson.annotation.JSONField;

public class PoiRegin {
	private String name;
	private String tag;
	private String direction_desc;
	
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

	@JSONField(name = "direction_desc" )
	public String getDirection_desc() {
		return direction_desc;
	}

	@JSONField(name = "direction_desc" )
	public void setDirection_desc(String direction_desc) {
		this.direction_desc = direction_desc;
	}


}
