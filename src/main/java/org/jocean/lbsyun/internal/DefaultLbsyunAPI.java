package org.jocean.lbsyun.internal;

import org.jocean.http.Interact;
import org.jocean.http.MessageUtil;
import org.jocean.lbsyun.LbsyunAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import rx.Observable;
import rx.functions.Func1;


public class DefaultLbsyunAPI implements LbsyunAPI {

    @SuppressWarnings("unused")
    private static final Logger LOG =
            LoggerFactory.getLogger(DefaultLbsyunAPI.class);

    private static final String PATH_DOMAIN= "http://api.map.baidu.com";
    private static final String PATH_QUERY2IP = "/location/ip";
    private static final String PATH_QUERY2LOCATION = "/geocoder/v2/";

    @Value("${api.baiduak}")
    private String _ak;

	@Override
    public Func1<Interact, Observable<PositionResponse>> ip2position(final String ip, final String coor) {
	//  .map(response -> {
	//  if (null == response || !"0000".equals(((PositionResponse)response).getCode())) {
//	      LOG.error("BdlbsSPIImpl {} failed {} -> {}", "/location/ip", JSON.toJSONString(ip), JSON.toJSONString(response));
//	      return null;
	//  } else {
//	      return response;
	//  }
	//})
        return interact -> {
            interact.uri(PATH_DOMAIN).path(PATH_QUERY2IP).paramAsQuery("ip", ip).paramAsQuery("ak", this._ak);
            if (null != coor) {
                interact.paramAsQuery("coor", coor);
            }

            return interact.execution()
                .compose(MessageUtil.responseAs(PositionResponse.class, MessageUtil::unserializeAsJson));
        };
	}

    @Override
    public Func1<Interact, Observable<AddressResponse>> location2address(final String location, final String coor) {
        return interact -> {
             interact
             .uri(PATH_DOMAIN).path(PATH_QUERY2LOCATION)
             .paramAsQuery("location", location)
             .paramAsQuery("ak", this._ak)
             .paramAsQuery("output", "json")
             .paramAsQuery("pois", "0");
             if (null != coor) {
                 interact.paramAsQuery("ret_coordtype", coor);
             }

             return interact.execution()
                 .compose(MessageUtil.responseAs(AddressResponse.class, MessageUtil::unserializeAsJson));
        };
    }

}
