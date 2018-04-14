package org.jocean.lbsyun.internal;

import java.util.concurrent.TimeUnit;

import org.jocean.http.Feature;
import org.jocean.http.Interact;
import org.jocean.http.MessageUtil;
import org.jocean.lbsyun.LbsyunAPI;
import org.jocean.lbsyun.spi.IpResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import rx.Observable;
import rx.functions.Func1;


public class DefaultLbsyunAPI implements LbsyunAPI {

    private static final Logger LOG =
            LoggerFactory.getLogger(DefaultLbsyunAPI.class);

    private static final String PATH_DOMAIN= "http://api.map.baidu.com";
    private static final String PATH_QUERY2IP = "/location/ip";
//    private static final String PATH_QUERY2LOCATION = "/geocoder/v2/";

    public void setTimeout(final long timeout) {
        this._timeout = timeout;
    }

    private long _timeout;

    @Value("${ip.baiduAK}")
    private String ak;

	@Override
    public Func1<Interact, Observable<IpResponse>> ip2location(final String ip) {
        return interact -> {
            try {
                 return interact.feature(Feature.ENABLE_LOGGING)
                         .uri(PATH_DOMAIN).path(PATH_QUERY2IP)
                         .paramAsQuery("ip", ip)
                         .paramAsQuery("ak", ak)
                         .execution()
                         .compose(MessageUtil.responseAs(IpResponse.class, MessageUtil::unserializeAsJson))
//                         .map(response -> {
//                                if (null == response || !"0000".equals(((IpResponse)response).getCode())) {
//                                    LOG.error("BdlbsSPIImpl {} failed {} -> {}", "/location/ip", JSON.toJSONString(ip), JSON.toJSONString(response));
//                                    return null;
//                                } else {
//                                    return response;
//                                }
//                            })
                         .timeout(this._timeout, TimeUnit.SECONDS);
            } catch (final Exception e) {
                return Observable.error(e);
            }
        };
	}
}
