package org.jocean.lbsyun.internal;

import org.jocean.http.Interact;
import org.jocean.lbsyun.LbsyunSigner;
import org.springframework.beans.factory.annotation.Value;

import rx.Observable;

public class DefaultLbsyunSigner implements LbsyunSigner {

    @Override
    public Observable<Interact> call(final Observable<Interact> interacts) {
        return interacts.doOnNext(interact -> interact.paramAsQuery("ak", this._ak));
    }

    @Value("${api.baiduak}")
    private String _ak;
}
