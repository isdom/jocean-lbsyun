package org.jocean.lbsyun.spi;

import java.io.Serializable;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

public class LocationResponse implements Serializable {

    private static final long serialVersionUID = -6109848942202149446L;
    public  Location location;
    private String formatted_address;
    private String business;
    private AddressComponent addressComponent;
    private String sematic_description;
    private String cityCode;
    private List<PoiRegin> poiRegions;
    private List<Poi> pois;
    @JSONField(name = "location" )
    public Location getLocation() {
		return location;
	}
    @JSONField(name = "location" )
	public void setLocation(Location location) {
		this.location = location;
	}
    @JSONField(name = "formatted_address" )
	public String getFormatted_address() {
		return formatted_address;
	}
    @JSONField(name = "formatted_address" )
	public void setFormatted_address(String formatted_address) {
		this.formatted_address = formatted_address;
	}
    @JSONField(name = "business" )
	public String getBusiness() {
		return business;
	}
    @JSONField(name = "business")
	public void setBusiness(String business) {
		this.business = business;
	}
    @JSONField(name = "addressComponent" )
	public AddressComponent getAddressComponent() {
		return addressComponent;
	}
    @JSONField(name = "addressComponent" )
	public void setAddressComponent(AddressComponent addressComponent) {
		this.addressComponent = addressComponent;
	}
    @JSONField(name = "sematic_description" )
	public String getSematic_description() {
		return sematic_description;
	}
    @JSONField(name = "sematic_description" )
	public void setSematic_description(String sematic_description) {
		this.sematic_description = sematic_description;
	}
    @JSONField(name = "cityCode" )
	public String getCityCode() {
		return cityCode;
	}
    @JSONField(name = "cityCode" )
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
    @JSONField(name = "poiRegions" )
	public List<PoiRegin> getPoiRegions() {
		return poiRegions;
	}
    @JSONField(name = "poiRegions" )
	public void setPoiRegions(List<PoiRegin> poiRegions) {
		this.poiRegions = poiRegions;
	}
    @JSONField(name = "pois" )
	public List<Poi> getPois() {
		return pois;
	}
    @JSONField(name = "pois" )
	public void setPois(List<Poi> pois) {
		this.pois = pois;
	}
    
    
    
}
