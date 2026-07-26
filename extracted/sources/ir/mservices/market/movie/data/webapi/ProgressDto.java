package ir.mservices.market.movie.data.webapi;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ProgressDto implements Serializable {

    @vo7("second")
    private final int second;

    @vo7("url")
    private final String url;

    public ProgressDto(String str, int i) {
        js3.p(str, "url");
        this.url = str;
        this.second = i;
    }

    public final int getSecond() {
        return this.second;
    }

    public final String getUrl() {
        return this.url;
    }
}
