package org.jocean.lbsyun.spi;

import com.alibaba.fastjson.annotation.JSONField;

public class AddressDetail {

    @Override
    public String toString() {
        return "AddressDetail [province=" + province + ", city=" + city + ", district=" + district + ", street=" + street
                + ", street_number=" + streetNumber + ", city_code=" + cityCode + "]";
    }

	@JSONField(name = "province" )
	public String getProvince() {
		return province;
	}
	@JSONField(name = "province" )
	public void setProvince(final String province) {
		this.province = province;
	}

	@JSONField(name = "city" )
	public String getCity() {
		return city;
	}
	@JSONField(name = "city" )
	public void setCity(final String city) {
		this.city = city;
	}

	@JSONField(name = "district" )
	public String getDistrict() {
		return district;
	}
	@JSONField(name = "district" )
	public void setDistrict(final String district) {
		this.district = district;
	}

	@JSONField(name = "street" )
	public String getStreet() {
		return street;
	}
	@JSONField(name = "street" )
	public void setStreet(final String street) {
		this.street = street;
	}

	@JSONField(name = "street_number" )
	public String getStreetNumber() {
		return streetNumber;
	}
	@JSONField(name = "street_number" )
	public void setStreetNumber(final String streetNumber) {
		this.streetNumber = streetNumber;
	}

	@JSONField(name = "city_code" )
	public String getCityCode() {
		return cityCode;
	}
	@JSONField(name = "city_code" )
	public void setCityCode(final String cityCode) {
		this.cityCode = cityCode;
	}

    private String province;
    private String city;
    private String district;
    private String street;
    private String streetNumber;
    private String cityCode;
}
