package org.jocean.lbsyun.spi;

import com.alibaba.fastjson.annotation.JSONField;

public class PoiRegin {

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

	@JSONField(name = "direction_desc" )
	public String getDirectionDesc() {
		return directionDesc;
	}

	@JSONField(name = "direction_desc" )
	public void setDirectionDesc(final String directionDesc) {
		this.directionDesc = directionDesc;
	}

    private String name;
    private String tag;
    private String directionDesc;
}
