package org.jocean.lbsyun.spi;

import com.alibaba.fastjson.annotation.JSONField;

public class PositionContent {

	@JSONField(name = "address_detail" )
	public AddressDetail getAddressDetail() {
		return _addressDetail;
	}
	@JSONField(name = "address_detail" )
	public void setAddressDetail(final AddressDetail addressDetail) {
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
	public LocationPoint getPoint() {
		return _point;
	}
	@JSONField(name = "point" )
	public void setPoint(final LocationPoint point) {
		this._point = point;
	}
	@Override
	public String toString() {
		return "Content [addressDetail=" + _addressDetail + ", address=" + _address + ", point=" + _point
				+ "]";
	}

    private AddressDetail _addressDetail;
    private String _address;
    private LocationPoint _point;
}
