package org.jocean.lbsyun.spi;

import com.alibaba.fastjson.annotation.JSONField;

public class StatusResponse {

	private String status;

	private LocationResponse result;

	@JSONField(name = "status" )
	public String getStatus() {
		return status;
	}
	@JSONField(name = "status" )
	public void setStatus(final String status) {
		this.status = status;
	}
	@JSONField(name = "result" )
	public LocationResponse getResult() {
		return result;
	}
	@JSONField(name = "result" )
	public void setResult(final LocationResponse result) {
		this.result = result;
	}




}
