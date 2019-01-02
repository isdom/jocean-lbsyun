package org.jocean.lbsyun.internal;

import org.jocean.http.ContentUtil;
import org.jocean.http.RpcRunner;
import org.jocean.lbsyun.LbsyunAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import rx.Observable.Transformer;


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
    public Transformer<RpcRunner, PositionResponse> ip2position(final String ip, final String coor) {
        return runners -> runners.flatMap(runner -> runner.name("lbsyun.ip2position").execute(interact -> {
            interact.uri(PATH_DOMAIN).path(PATH_QUERY2IP).paramAsQuery("ip", ip).paramAsQuery("ak", this._ak);
            if (null != coor) {
                interact.paramAsQuery("coor", coor);
            }

            return interact.responseAs(ContentUtil.ASJSON, PositionResponse.class);
        }));
	}

    @Override
    public Transformer<RpcRunner, AddressResponse> location2address(final String location, final String coor) {
        return runners -> runners.flatMap(runner -> runner.name("lbsyun.location2address").execute(interact -> {
             interact
             .uri(PATH_DOMAIN).path(PATH_QUERY2LOCATION)
             .paramAsQuery("location", location)
             .paramAsQuery("ak", this._ak)
             .paramAsQuery("output", "json")
             .paramAsQuery("pois", "0");
             if (null != coor) {
                 interact.paramAsQuery("ret_coordtype", coor);
             }

             return interact.responseAs(ContentUtil.ASJSON, AddressResponse.class);
        }));
    }

}
