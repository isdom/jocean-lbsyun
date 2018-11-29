package org.jocean.lbsyun;

import org.jocean.http.RpcRunner;
import org.jocean.idiom.BeanFinder;
import org.jocean.lbsyun.LbsyunAPI.PositionResponse;

import rx.Observable;
import rx.Observable.Transformer;

public class LbsyunUtil {
    public static Observable<Transformer<RpcRunner, PositionResponse>> ip2position(final BeanFinder finder, final String ip) {
        return finder.find(LbsyunAPI.class).map(api -> api.ip2position(ip, LbsyunAPI.COOR_GCJ02));
    }
}
