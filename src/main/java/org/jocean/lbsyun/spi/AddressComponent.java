package org.jocean.lbsyun.spi;

import com.alibaba.fastjson.annotation.JSONField;

public class AddressComponent {

	@Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("AddressComponent [country=").append(country).append(", province=").append(province)
                .append(", city=").append(city).append(", district=").append(district).append(", town=").append(town)
                .append(", street=").append(street).append(", streetNumber=").append(streetNumber).append(", adcode=")
                .append(adcode).append(", countryCode=").append(countryCode).append(", direction=").append(direction)
                .append(", distance=").append(distance).append("]");
        return builder.toString();
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

	@JSONField(name = "country" )
	public String getCountry() {
		return country;
	}
	@JSONField(name = "country" )
	public void setCountry(final String country) {
		this.country = country;
	}
	@JSONField(name = "town" )
	public String getTown() {
		return town;
	}
	@JSONField(name = "town" )
	public void setTown(final String town) {
		this.town = town;
	}

	@JSONField(name = "adcode" )
	public int getAdcode() {
		return adcode;
	}
	@JSONField(name = "adcode" )
	public void setAdcode(final int adcode) {
		this.adcode = adcode;
	}

	@JSONField(name = "country_code" )
	public int getCountryCode() {
		return countryCode;
	}
	@JSONField(name = "country_code" )
	public void setCountryCode(final int countryCode) {
		this.countryCode = countryCode;
	}

	@JSONField(name = "direction" )
	public String getDirection() {
		return direction;
	}
	@JSONField(name = "direction" )
	public void setDirection(final String direction) {
		this.direction = direction;
	}

	@JSONField(name = "distance" )
	public String getDistance() {
		return distance;
	}
	@JSONField(name = "distance" )
	public void setDistance(final String distance) {
		this.distance = distance;
	}

    private String country;
    private String province;
    private String city;
    private String district;
    private String town;
    private String street;
    private String streetNumber;
    private int adcode = -1;
    private int countryCode = -1;
    private String direction;
    private String distance;
}
