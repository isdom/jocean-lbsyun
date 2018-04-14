package org.jocean.lbsyun.spi;

import com.alibaba.fastjson.annotation.JSONField;

public class AddressComponent {
	private String country;
	private String province;
	private String city;
	private String district;
	private String town;
	private String street;
	private String street_number;
	private Integer adcode;
	private Integer country_code;
	private String direction;
	private String distance;
	
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
	@JSONField(name = "country" )
	public String getCountry() {
		return country;
	}
	@JSONField(name = "country" )
	public void setCountry(String country) {
		this.country = country;
	}
	@JSONField(name = "town" )
	public String getTown() {
		return town;
	}
	@JSONField(name = "town" )
	public void setTown(String town) {
		this.town = town;
	}
	@JSONField(name = "adcode" )
	public Integer getAdcode() {
		return adcode;
	}
	@JSONField(name = "adcode" )
	public void setAdcode(Integer adcode) {
		this.adcode = adcode;
	}
	@JSONField(name = "country_code" )
	public Integer getCountry_code() {
		return country_code;
	}
	@JSONField(name = "country_code" )
	public void setCountry_code(Integer country_code) {
		this.country_code = country_code;
	}
	@JSONField(name = "direction" )
	public String getDirection() {
		return direction;
	}
	@JSONField(name = "direction" )
	public void setDirection(String direction) {
		this.direction = direction;
	}
	@JSONField(name = "distance" )
	public String getDistance() {
		return distance;
	}
	@JSONField(name = "distance" )
	public void setDistance(String distance) {
		this.distance = distance;
	}
	
}
