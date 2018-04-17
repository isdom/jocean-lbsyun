package org.jocean.lbsyun.spi;

import com.alibaba.fastjson.annotation.JSONField;

public class ContentResponse {

	@JSONField(name = "address_detail" )
	public AddressResponse getAddressDetail() {
		return _addressDetail;
	}
	@JSONField(name = "address_detail" )
	public void setAddressDetail(final AddressResponse addressDetail) {
		this._addressDetail = addressDetail;
	}
	@JSONField(name = "address" )
	public String getAddress() {
		return _address;
	}
	@JSONField(name = "address" )
	public void setAddress(final String address) {
		this._address = address;
	}
	@JSONField(name = "point" )
	public PointResponse getPoint() {
		return _point;
	}
	@JSONField(name = "point" )
	public void setPoint(final PointResponse point) {
		this._point = point;
	}
	@Override
	public String toString() {
		return "ContentResponse [addressDetail=" + _addressDetail + ", address=" + _address + ", point=" + _point
				+ "]";
	}

    private AddressResponse _addressDetail;
    private String _address;
    private PointResponse _point;
}
