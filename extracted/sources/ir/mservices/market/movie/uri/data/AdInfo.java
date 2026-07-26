package ir.mservices.market.movie.uri.data;

import defpackage.vo7;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class AdInfo implements Serializable {

    @vo7("queryStrings")
    private final Map<String, String> queryStrings;

    @vo7("time")
    private final int time;

    public AdInfo(int i, Map<String, String> map) {
        this.time = i;
        this.queryStrings = map;
    }

    public final Map<String, String> getQueryStrings() {
        return this.queryStrings;
    }

    public final int getTime() {
        return this.time;
    }
}
