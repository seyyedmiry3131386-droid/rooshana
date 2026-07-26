package ir.mservices.market.app.suggest.search.data;

import defpackage.bf5;
import defpackage.f88;
import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class PlayApplicationsDto implements Serializable, bf5 {

    @vo7("apps")
    private final List<PlayApplicationDto> apps;

    @vo7("eol")
    private final boolean eol;

    @vo7("nextPageUrl")
    private final String nextPageUrl;

    public PlayApplicationsDto(List<PlayApplicationDto> list, String str, boolean z) {
        js3.p(list, "apps");
        this.apps = list;
        this.nextPageUrl = str;
        this.eol = z;
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        String str;
        return this.eol || (str = this.nextPageUrl) == null || f88.n0(str) || this.apps.isEmpty();
    }

    public final List<PlayApplicationDto> getApps() {
        return this.apps;
    }

    public final boolean getEol() {
        return this.eol;
    }

    public final String getNextPageUrl() {
        return this.nextPageUrl;
    }
}
