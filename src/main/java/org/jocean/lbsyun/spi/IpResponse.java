package org.jocean.lbsyun.spi;

import com.alibaba.fastjson.annotation.JSONField;

public class IpResponse {

    @JSONField(name = "address" )
	public String getAddress() {
		return address;
	}
    @JSONField(name = "address" )
	public void setAddress(final String address) {
		this.address = address;
	}
    @JSONField(name = "status" )
	public String getStatus() {
		return status;
	}
    @JSONField(name = "status" )
	public void setStatus(final String status) {
		this.status = status;
	}
    @JSONField(name = "content" )
	public ContentResponse getContent() {
		return content;
	}
    @JSONField(name = "content" )
	public void setContent(final ContentResponse content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "IpResponse [address=" + address + ", status=" + status + ", content=" + content + "]";
	}

    private String address;
    private String status;
    private ContentResponse content;
}
