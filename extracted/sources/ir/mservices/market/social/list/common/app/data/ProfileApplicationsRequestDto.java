package ir.mservices.market.social.list.common.app.data;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileApplicationsRequestDto implements RequestDTO {

    @vo7("apps")
    private final List<String> apps;

    @vo7("title")
    private final String title;

    public ProfileApplicationsRequestDto(String str, List<String> list) {
        js3.p(str, "title");
        js3.p(list, "apps");
        this.title = str;
        this.apps = list;
    }

    public final List<String> getApps() {
        return this.apps;
    }

    public final String getTitle() {
        return this.title;
    }
}
