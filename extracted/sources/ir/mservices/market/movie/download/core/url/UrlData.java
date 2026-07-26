package ir.mservices.market.movie.download.core.url;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.bl4;
import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class UrlData implements Serializable {

    @vo7(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @vo7("url")
    private final String url;

    public UrlData(String str, String str2) {
        js3.p(str, "url");
        js3.p(str2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.url = str;
        this.name = str2;
    }

    public static /* synthetic */ UrlData copy$default(UrlData urlData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = urlData.url;
        }
        if ((i & 2) != 0) {
            str2 = urlData.name;
        }
        return urlData.copy(str, str2);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.name;
    }

    public final UrlData copy(String str, String str2) {
        js3.p(str, "url");
        js3.p(str2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return new UrlData(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlData)) {
            return false;
        }
        UrlData urlData = (UrlData) obj;
        return js3.i(this.url, urlData.url) && js3.i(this.name, urlData.name);
    }

    public final String getName() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.name.hashCode() + (this.url.hashCode() * 31);
    }

    public String toString() {
        return bl4.w("UrlData(url=", this.url, ", name=", this.name, ")");
    }
}
