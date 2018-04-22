package org.jocean.lbsyun.spi;

import com.alibaba.fastjson.annotation.JSONField;

public class StatusResponse {

	@JSONField(name = "status" )
	public String getStatus() {
		return status;
	}

	@JSONField(name = "status" )
	public void setStatus(final String status) {
		this.status = status;
	}

    protected String status;
}
