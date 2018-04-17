package org.jocean.lbsyun;

import org.jocean.http.Interact;
import org.jocean.lbsyun.spi.IpResponse;

import rx.Observable;
import rx.functions.Func1;


public interface LbsyunAPI {

    public static final String COOR_BD09LL = "bd09ll";
    public static final String COOR_GCJ02 = "gcj02";

	public Func1<Interact, Observable<IpResponse>> ip2location(final String ip, final String coor);
}
