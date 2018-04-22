package org.jocean.lbsyun.spi;

import com.alibaba.fastjson.annotation.JSONField;

public class PositionResponse extends StatusResponse {

    @JSONField(name = "address" )
	public String getAddress() {
		return address;
	}
    @JSONField(name = "address" )
	public void setAddress(final String address) {
		this.address = address;
	}

    @JSONField(name = "content" )
	public PositionContent getContent() {
		return content;
	}
    @JSONField(name = "content" )
	public void setContent(final PositionContent content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "PositionResponse [address=" + address + ", status=" + status + ", content=" + content + "]";
	}

    private String address;
    private PositionContent content;
}
