package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class AparatUrlInfoDTO implements Serializable {
    private String profile;
    private List<String> urls;

    public String getProfile() {
        return this.profile;
    }

    public List<String> getUrls() {
        return this.urls;
    }
}
