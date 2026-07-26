package ir.mservices.market.movie.streamers.recycler;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.pv6;
import defpackage.rm7;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamerNameData implements MyketRecyclerData, g32 {
    public static final int h = js6.streamer_name_item_view;
    public final String a;
    public final String b;
    public final boolean c;
    public final pv6 d;
    public final pv6 e;
    public final String f;
    public boolean g;

    public StreamerNameData(String str, String str2, boolean z, pv6 pv6Var, pv6 pv6Var2) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        js3.p(str2, "subtitle");
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = pv6Var;
        this.e = pv6Var2;
        long j = is3.p + 1;
        is3.p = j;
        this.f = String.valueOf(j);
        this.g = z;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return h;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!StreamerNameData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.streamers.recycler.StreamerNameData");
        StreamerNameData streamerNameData = (StreamerNameData) obj;
        return js3.i(this.b, streamerNameData.b) && js3.i(this.a, streamerNameData.a) && this.c == streamerNameData.c;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.f;
    }

    public final int hashCode() {
        return rm7.k(this.f, rm7.k(this.a, this.b.hashCode() * 31, 31), 31) + (this.c ? 1231 : 1237);
    }
}
