package ir.mservices.market.movie.streamers.data;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.dw1;
import defpackage.js3;
import defpackage.rm7;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamerToolbarData {
    private final String avatarUrl;
    private final String name;
    private final String subtitle;

    public StreamerToolbarData(String str, String str2, String str3) {
        js3.p(str, "avatarUrl");
        js3.p(str2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        js3.p(str3, "subtitle");
        this.avatarUrl = str;
        this.name = str2;
        this.subtitle = str3;
    }

    public static /* synthetic */ StreamerToolbarData copy$default(StreamerToolbarData streamerToolbarData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streamerToolbarData.avatarUrl;
        }
        if ((i & 2) != 0) {
            str2 = streamerToolbarData.name;
        }
        if ((i & 4) != 0) {
            str3 = streamerToolbarData.subtitle;
        }
        return streamerToolbarData.copy(str, str2, str3);
    }

    public final String component1() {
        return this.avatarUrl;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final StreamerToolbarData copy(String str, String str2, String str3) {
        js3.p(str, "avatarUrl");
        js3.p(str2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        js3.p(str3, "subtitle");
        return new StreamerToolbarData(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreamerToolbarData)) {
            return false;
        }
        StreamerToolbarData streamerToolbarData = (StreamerToolbarData) obj;
        return js3.i(this.avatarUrl, streamerToolbarData.avatarUrl) && js3.i(this.name, streamerToolbarData.name) && js3.i(this.subtitle, streamerToolbarData.subtitle);
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        return this.subtitle.hashCode() + rm7.k(this.name, this.avatarUrl.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.avatarUrl;
        String str2 = this.name;
        return dw1.s(rm7.t("StreamerToolbarData(avatarUrl=", str, ", name=", str2, ", subtitle="), this.subtitle, ")");
    }
}
