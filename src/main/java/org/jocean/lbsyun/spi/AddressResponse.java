package org.jocean.lbsyun.spi;

import com.alibaba.fastjson.annotation.JSONField;

public class AddressResponse extends StatusResponse {

    @JSONField(name = "location" )
    public Location getLocation() {
		return location;
	}

    @JSONField(name = "location" )
	public void setLocation(final Location location) {
		this.location = location;
	}

    @JSONField(name = "formatted_address" )
	public String getFormattedAddress() {
		return formattedAddress;
	}

    @JSONField(name = "formatted_address" )
	public void setFormattedAddress(final String formattedAddress) {
		this.formattedAddress = formattedAddress;
	}

    @JSONField(name = "confidence" )
    public int getConfidence() {
        return confidence;
    }

    @JSONField(name = "confidence" )
    public void setConfidence(final int confidence) {
        this.confidence = confidence;
    }

    @JSONField(name = "business" )
	public String getBusiness() {
		return business;
	}

    @JSONField(name = "business")
	public void setBusiness(final String business) {
		this.business = business;
	}

    @JSONField(name = "addressComponent" )
	public AddressComponent getAddressComponent() {
		return addressComponent;
	}
    @JSONField(name = "addressComponent" )
	public void setAddressComponent(final AddressComponent addressComponent) {
		this.addressComponent = addressComponent;
	}

    @JSONField(name = "sematic_description" )
	public String getSematicDescription() {
		return sematicDescription;
	}
    @JSONField(name = "sematic_description" )
	public void setSematic_description(final String sematicDescription) {
		this.sematicDescription = sematicDescription;
	}

    @JSONField(name = "cityCode" )
	public String getCityCode() {
		return cityCode;
	}
    @JSONField(name = "cityCode" )
	public void setCityCode(final String cityCode) {
		this.cityCode = cityCode;
	}

    @JSONField(name = "poiRegions" )
	public PoiRegin[] getPoiRegions() {
		return poiRegions;
	}
    @JSONField(name = "poiRegions" )
	public void setPoiRegions(final PoiRegin[] poiRegions) {
		this.poiRegions = poiRegions;
	}

    @JSONField(name = "pois" )
	public Poi[] getPois() {
		return pois;
	}
    @JSONField(name = "pois" )
	public void setPois(final Poi[] pois) {
		this.pois = pois;
	}

    private  Location location;
    private String formattedAddress;
    private int confidence;
    private String business;
    private AddressComponent addressComponent;
    private Poi[] pois;
    private PoiRegin[] poiRegions;
    private String sematicDescription;
    private String cityCode;
}
