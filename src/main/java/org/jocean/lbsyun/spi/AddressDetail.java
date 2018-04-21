package org.jocean.lbsyun.spi;

import com.alibaba.fastjson.annotation.JSONField;

public class AddressDetail {
	private String province;
	private String city;
	private String district;
	private String street;
	private String street_number;
	private String city_code;
	@JSONField(name = "province" )
	public String getProvince() {
		return province;
	}
	@JSONField(name = "province" )
	public void setProvince(String province) {
		this.province = province;
	}
	@JSONField(name = "city" )
	public String getCity() {
		return city;
	}
	@JSONField(name = "city" )
	public void setCity(String city) {
		this.city = city;
	}
	@JSONField(name = "district" )
	public String getDistrict() {
		return district;
	}
	@JSONField(name = "district" )
	public void setDistrict(String district) {
		this.district = district;
	}
	@JSONField(name = "street" )
	public String getStreet() {
		return street;
	}
	@JSONField(name = "street" )
	public void setStreet(String street) {
		this.street = street;
	}
	@JSONField(name = "street_number" )
	public String getStreet_number() {
		return street_number;
	}
	@JSONField(name = "street_number" )
	public void setStreet_number(String street_number) {
		this.street_number = street_number;
	}
	@JSONField(name = "city_code" )
	public String getCity_code() {
		return city_code;
	}
	@JSONField(name = "city_code" )
	public void setCity_code(String city_code) {
		this.city_code = city_code;
	}
	@Override
	public String toString() {
		return "AddressBean [province=" + province + ", city=" + city + ", district=" + district + ", street=" + street
				+ ", street_number=" + street_number + ", city_code=" + city_code + "]";
	}
	
}
