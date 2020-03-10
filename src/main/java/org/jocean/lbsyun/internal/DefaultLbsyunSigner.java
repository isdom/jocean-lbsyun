package org.jocean.lbsyun.internal;

import org.jocean.http.Interact;
import org.jocean.lbsyun.LbsyunSigner;
import org.springframework.beans.factory.annotation.Value;

public class DefaultLbsyunSigner implements LbsyunSigner {

    @Value("${api.baiduak}")
    private String _ak;

    @Override
    public void call(final Interact interact) {
        interact.paramAsQuery("ak", this._ak);
    }
}
