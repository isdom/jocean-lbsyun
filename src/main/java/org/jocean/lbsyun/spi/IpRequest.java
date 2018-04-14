package org.jocean.lbsyun.spi;

import com.alibaba.fastjson.annotation.JSONField;


public class IpRequest {
	private String ip;
	@JSONField(name = "ip")
	public String getIp() {
		return ip;
	}
	@JSONField(name = "ip")
	public void setIp(final String ip) {
		this.ip = ip;
	}
}
