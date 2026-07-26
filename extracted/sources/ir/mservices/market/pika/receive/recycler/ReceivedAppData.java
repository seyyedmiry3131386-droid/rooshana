package ir.mservices.market.pika.receive.recycler;

import android.graphics.Bitmap;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.rv6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class ReceivedAppData implements MyketRecyclerData, g32 {
    public static final int h = js6.received_app_holder;
    public final long a;
    public final String b;
    public final String c;
    public final Bitmap d;
    public final rv6 e;
    public final boolean f;
    public final boolean g;

    public ReceivedAppData(long j, String str, String str2, Bitmap bitmap, rv6 rv6Var, boolean z, boolean z2) {
        js3.p(str, "packageName");
        js3.p(str2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = bitmap;
        this.e = rv6Var;
        this.f = z;
        this.g = z2;
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
        if (!ReceivedAppData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.pika.receive.recycler.ReceivedAppData");
        return this.a == ((ReceivedAppData) obj).a;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(this.a);
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }
}
