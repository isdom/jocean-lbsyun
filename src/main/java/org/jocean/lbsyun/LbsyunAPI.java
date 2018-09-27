package org.jocean.lbsyun;

import org.jocean.http.RpcRunner;

import com.alibaba.fastjson.annotation.JSONField;

import rx.Observable.Transformer;


public interface LbsyunAPI {

    public static final String COOR_BD09LL = "bd09ll";
    public static final String COOR_GCJ02 = "gcj02";

    public interface StatusResponse {
        @JSONField(name = "status" )
        public String getStatus();
        @JSONField(name = "status" )
        public void setStatus(final String status);
    }

    public interface AddressDetail {
        @JSONField(name = "province" )
        public String getProvince();
        @JSONField(name = "province" )
        public void setProvince(final String province);

        @JSONField(name = "city" )
        public String getCity();
        @JSONField(name = "city" )
        public void setCity(final String city);

        @JSONField(name = "district" )
        public String getDistrict();
        @JSONField(name = "district" )
        public void setDistrict(final String district);

        @JSONField(name = "street")
        public String getStreet();
        @JSONField(name = "street")
        public void setStreet(final String street);

        @JSONField(name = "street_number" )
        public String getStreetNumber();
        @JSONField(name = "street_number" )
        public void setStreetNumber(final String streetNumber);

        @JSONField(name = "city_code" )
        public String getCityCode();
        @JSONField(name = "city_code" )
        public void setCityCode(final String cityCode);
    }

    public interface X_Y {
        @JSONField(name = "x" )
        public String getX();
        @JSONField(name = "x" )
        public void setX(final String x);
        @JSONField(name = "y" )
        public String getY();
        @JSONField(name = "y" )
        public void setY(final String y);
    }

    public interface PositionContent {
        @JSONField(name = "address_detail" )
        public AddressDetail getAddressDetail();
        @JSONField(name = "address_detail" )
        public void setAddressDetail(final AddressDetail addressDetail);
        @JSONField(name = "address" )
        public String getAddress();
        @JSONField(name = "address" )
        public void setAddress(final String address);
        @JSONField(name = "point" )
        public X_Y getPoint();
        @JSONField(name = "point" )
        public void setPoint(final X_Y point);
    }

    public interface PositionResponse extends StatusResponse {
        @JSONField(name = "address" )
        public String getAddress();
        @JSONField(name = "address" )
        public void setAddress(final String address);

        @JSONField(name = "content" )
        public PositionContent getContent();
        @JSONField(name = "content" )
        public void setContent(final PositionContent content);
    }

    public Transformer<RpcRunner, PositionResponse> ip2position(final String ip, final String coor);

    public interface AddressComponent {
        @JSONField(name = "province" )
        public String getProvince();
        @JSONField(name = "province" )
        public void setProvince(final String province);

        @JSONField(name = "city" )
        public String getCity();
        @JSONField(name = "city" )
        public void setCity(final String city);

        @JSONField(name = "district" )
        public String getDistrict();
        @JSONField(name = "district" )
        public void setDistrict(final String district);

        @JSONField(name = "street" )
        public String getStreet();
        @JSONField(name = "street" )
        public void setStreet(final String street);

        @JSONField(name = "street_number" )
        public String getStreetNumber();
        @JSONField(name = "street_number" )
        public void setStreetNumber(final String streetNumber);

        @JSONField(name = "country" )
        public String getCountry();
        @JSONField(name = "country" )
        public void setCountry(final String country);
        @JSONField(name = "town" )
        public String getTown();
        @JSONField(name = "town" )
        public void setTown(final String town);

        @JSONField(name = "adcode" )
        public Integer getAdcode();
        @JSONField(name = "adcode" )
        public void setAdcode(final Integer adcode);

        @JSONField(name = "country_code" )
        public Integer getCountryCode();
        @JSONField(name = "country_code" )
        public void setCountryCode(final Integer countryCode);

        @JSONField(name = "direction" )
        public String getDirection();
        @JSONField(name = "direction" )
        public void setDirection(final String direction);

        @JSONField(name = "distance" )
        public String getDistance();
        @JSONField(name = "distance" )
        public void setDistance(final String distance);
    }

    public interface Location {
        @JSONField(name = "lat" )
        public float getLat();
        @JSONField(name = "lat" )
        public void setLat(final float lat);

        @JSONField(name = "lng" )
        public float getLng();
        @JSONField(name = "lng" )
        public void setLng(final float lng);
    }

    public interface PoiRegin {
        @JSONField(name = "name" )
        public String getName();
        @JSONField(name = "name" )
        public void setName(final String name);

        @JSONField(name = "tag" )
        public String getTag();
        @JSONField(name = "tag" )
        public void setTag(final String tag);

        @JSONField(name = "direction_desc" )
        public String getDirectionDesc();
        @JSONField(name = "direction_desc" )
        public void setDirectionDesc(final String directionDesc);
    }

    public interface ParentPoi {
        @JSONField(name = "name" )
        public String getName();
        @JSONField(name = "name" )
        public void setName(final String name);

        @JSONField(name = "tag" )
        public String getTag();
        @JSONField(name = "tag" )
        public void setTag(final String tag);

        @JSONField(name = "addr" )
        public String getAddr();
        @JSONField(name = "addr" )
        public void setAddr(final String addr);

        @JSONField(name = "point" )
        public X_Y getPoint();
        @JSONField(name = "point" )
        public void setPoint(final X_Y point);

        @JSONField(name = "direction" )
        public String getDirection();
        @JSONField(name = "direction" )
        public void setDirection(final String direction);

        @JSONField(name = "distance" )
        public String getDistance();
        @JSONField(name = "distance" )
        public void setDistance(final String distance);

        @JSONField(name = "uid" )
        public String getUid();
        @JSONField(name = "uid" )
        public void setUid(final String uid);
    }

    public interface Poi {
        @JSONField(name = "addr" )
        public String getAddr();
        @JSONField(name = "addr" )
        public void setAddr(final String addr);

        @JSONField(name = "cp" )
        public String getCp();
        @JSONField(name = "cp" )
        public void setCp(final String cp);

        @JSONField(name = "direction" )
        public String getDirection();
        @JSONField(name = "direction" )
        public void setDirection(final String direction);

        @JSONField(name = "distance" )
        public String getDistance();
        @JSONField(name = "distance" )
        public void setDistance(final String distance);

        @JSONField(name = "name" )
        public String getName();
        @JSONField(name = "name" )
        public void setName(final String name);

        @JSONField(name = "poiType" )
        public String getPoiType();
        @JSONField(name = "poiType" )
        public void setPoiType(final String poiType);

        @JSONField(name = "point" )
        public String getPoint();
        @JSONField(name = "point" )
        public void setPoint(final String point);

        @JSONField(name = "tel" )
        public String getTel();
        @JSONField(name = "tel" )
        public void setTel(final String tel);

        @JSONField(name = "uid" )
        public String getUid();
        @JSONField(name = "uid" )
        public void setUid(final String uid);

        @JSONField(name = "zip" )
        public String getZip();
        @JSONField(name = "zip" )
        public void setZip(final String zip);

        @JSONField(name = "parent_poi" )
        public ParentPoi getParentPoi();
        @JSONField(name = "parent_poi" )
        public void setParentPoi(final ParentPoi parentPoi);
    }

    public interface AddressResult {
        @JSONField(name = "location" )
        public Location getLocation();
        @JSONField(name = "location" )
        public void setLocation(final Location location);

        @JSONField(name = "formatted_address" )
        public String getFormattedAddress();
        @JSONField(name = "formatted_address" )
        public void setFormattedAddress(final String formattedAddress);

        @JSONField(name = "confidence" )
        public Integer getConfidence();
        @JSONField(name = "confidence" )
        public void setConfidence(final Integer confidence);

        @JSONField(name = "business" )
        public String getBusiness();
        @JSONField(name = "business")
        public void setBusiness(final String business);

        @JSONField(name = "addressComponent" )
        public AddressComponent getAddressComponent();
        @JSONField(name = "addressComponent" )
        public void setAddressComponent(final AddressComponent addressComponent);

        @JSONField(name = "sematic_description" )
        public String getSematicDescription();
        @JSONField(name = "sematic_description" )
        public void setSematicDescription(final String sematicDescription);

        @JSONField(name = "cityCode" )
        public String getCityCode();
        @JSONField(name = "cityCode" )
        public void setCityCode(final String cityCode);

        @JSONField(name = "poiRegions" )
        public PoiRegin[] getPoiRegions();
        @JSONField(name = "poiRegions" )
        public void setPoiRegions(final PoiRegin[] poiRegions);

        @JSONField(name = "pois" )
        public Poi[] getPois();
        @JSONField(name = "pois" )
        public void setPois(final Poi[] pois);
    }

    public interface AddressResponse extends StatusResponse {
        @JSONField(name = "result" )
        public AddressResult getResult();
        @JSONField(name = "result" )
        public void setResult(final AddressResult result);
    }
    public Transformer<RpcRunner, AddressResponse> location2address(final String location, final String coor);
}
