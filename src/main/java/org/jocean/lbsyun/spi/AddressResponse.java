package org.jocean.lbsyun.spi;

import com.alibaba.fastjson.annotation.JSONField;

public class AddressResponse extends StatusResponse {

    @JSONField(name = "result" )
    public AddressResult getResult() {
        return result;
    }
    @JSONField(name = "result" )
    public void setResult(final AddressResult result) {
        this.result = result;
    }

    private AddressResult result;
}
