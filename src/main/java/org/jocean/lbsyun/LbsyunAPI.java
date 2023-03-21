package org.jocean.lbsyun;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.jocean.http.Interact;
import org.jocean.rpc.annotation.ConstParams;
import org.jocean.rpc.annotation.OnInteract;
import org.jocean.rpc.annotation.RpcBuilder;
import org.jocean.rpc.annotation.RpcResource;

import com.alibaba.fastjson.annotation.JSONField;

import rx.Observable;
import rx.Observable.Transformer;

public interface LbsyunAPI {

    public interface LbsyunSignable<BUILDER> {
        @RpcResource("signer")
        BUILDER signer(final Transformer<Interact, Interact> signer);
    }

    public static final String COOR_BD09LL = "bd09ll";
    public static final String COOR_GCJ02 = "gcj02";

    static final String PATH_DOMAIN= "http://api.map.baidu.com";
    static final String PATH_QUERY2IP = "/location/ip";
    static final String PATH_QUERY2LOCATION = "/geocoder/v2/";

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

    @RpcBuilder
    interface Ip2positionBuilder extends LbsyunSignable<Ip2positionBuilder> {
        @QueryParam("ip")
        Ip2positionBuilder ip(final String ip);

        @QueryParam("coor")
        Ip2positionBuilder coor(final String coor);

        @GET
        @Path(PATH_DOMAIN + PATH_QUERY2IP)
        @Consumes(MediaType.APPLICATION_JSON)
        @OnInteract("signer")
        public Observable<PositionResponse> call();
    }

    // http://lbsyun.baidu.com/index.php?title=webapi/ip-api
    public Ip2positionBuilder ip2position();

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

    // http://lbsyun.baidu.com/index.php?title=webapi/guide/webservice-geocoding-abroad
    //  TODO: 注意：当前为V3.0版本接口文档，V2.0及以前版本自2019.6.18起新用户无法使用。
    //          老用户仍可继续使用V2.0及以前版本请求实现逆地理编码服务，为保障用户体验，建议您尽快迁移到V3.0版本。
    @RpcBuilder
    interface Location2addressBuilder extends LbsyunSignable<Location2addressBuilder> {
        @QueryParam("location")
        Location2addressBuilder location(final String location);

        @QueryParam("ret_coordtype")
        Location2addressBuilder ret_coordtype(final String coor);

        // https://lbsyun.baidu.com/index.php?title=webapi/guide/webservice-geocoding-abroad
        // coordtype	坐标的类型，目前支持的坐标类型包括：bd09ll（百度经纬度坐标）、bd09mc（百度米制坐标）、gcj02ll（国测局经纬度坐标，仅限中国）、wgs84ll（ GPS经纬度） 坐标系说明	string	
        // bd09ll、gcj02ll	bd09ll
        @QueryParam("coordtype")
        Location2addressBuilder coordtype(final String coordtype);
        
        @GET
        @Path(PATH_DOMAIN + PATH_QUERY2LOCATION)
        @Consumes(MediaType.APPLICATION_JSON)
        @ConstParams({"output", "json", "pois", "0"})
        @OnInteract("signer")
        public Observable<AddressResponse> call();
    }
    public Location2addressBuilder location2address();
}
