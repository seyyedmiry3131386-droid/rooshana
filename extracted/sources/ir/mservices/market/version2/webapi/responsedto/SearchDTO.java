package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SearchDTO implements Serializable {
    private List<ApplicationSuggestDTO> applications;

    public List<ApplicationSuggestDTO> getApplications() {
        return this.applications;
    }
}
