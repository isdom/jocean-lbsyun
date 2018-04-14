package org.jocean.lbsyun.spi;

import com.alibaba.fastjson.annotation.JSONField;

public class ContentResponse {

	private AddressResponse address_details;
	private String address;
	private PointResponse point;
	@JSONField(name = "address_details" )
	public AddressResponse getAddress_details() {
		return address_details;
	}
	@JSONField(name = "address_details" )
	public void setAddress_details(final AddressResponse address_details) {
		this.address_details = address_details;
	}
	@JSONField(name = "address" )
	public String getAddress() {
		return address;
	}
	@JSONField(name = "address" )
	public void setAddress(final String address) {
		this.address = address;
	}
	@JSONField(name = "point" )
	public PointResponse getPoint() {
		return point;
	}
	@JSONField(name = "point" )
	public void setPoint(final PointResponse point) {
		this.point = point;
	}
	@Override
	public String toString() {
		return "ContentResponse [address_details=" + address_details + ", address=" + address + ", point=" + point
				+ "]";
	}


}
