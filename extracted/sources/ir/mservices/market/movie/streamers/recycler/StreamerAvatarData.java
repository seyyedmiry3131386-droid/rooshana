package ir.mservices.market.movie.streamers.recycler;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.rm7;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamerAvatarData implements MyketRecyclerData, g32 {
    public static final int f = js6.streamer_avatar_item_view;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public StreamerAvatarData(String str, String str2, String str3, String str4) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        js3.p(str2, "avatarImageUrl");
        js3.p(str3, "movieCount");
        js3.p(str4, "followerCount");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        long j = is3.p + 1;
        is3.p = j;
        this.e = String.valueOf(j);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return f;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!StreamerAvatarData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.streamers.recycler.StreamerAvatarData");
        StreamerAvatarData streamerAvatarData = (StreamerAvatarData) obj;
        return js3.i(this.b, streamerAvatarData.b) && js3.i(this.c, streamerAvatarData.c) && js3.i(this.d, streamerAvatarData.d) && js3.i(this.a, streamerAvatarData.a);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + rm7.k(this.a, rm7.k(this.d, rm7.k(this.c, this.b.hashCode() * 31, 31), 31), 31);
    }
}
