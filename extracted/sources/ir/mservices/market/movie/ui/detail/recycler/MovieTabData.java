package ir.mservices.market.movie.ui.detail.recycler;

import defpackage.g32;
import defpackage.h45;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieTabData implements MyketRecyclerData, wo2, h45, g32 {
    public static final int e = js6.movie_detail_tab_view;
    public final boolean a;
    public final boolean b;
    public final v48 c;
    public final String d;

    public MovieTabData(boolean z, boolean z2, v48 v48Var) {
        js3.p(v48Var, "isTabletDeviceFlow");
        this.a = z;
        this.b = z2;
        this.c = v48Var;
        long j = is3.p + 1;
        is3.p = j;
        this.d = String.valueOf(j);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return e;
    }

    @Override // defpackage.h45
    public final String a() {
        return "movie_tab";
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MovieTabData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.ui.detail.recycler.MovieTabData");
        MovieTabData movieTabData = (MovieTabData) obj;
        return ((Boolean) movieTabData.c.getValue()).booleanValue() == ((Boolean) this.c.getValue()).booleanValue() && this.b == movieTabData.b && this.a == movieTabData.a;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.d;
    }

    public final int hashCode() {
        int i = (((this.a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31;
        String str = this.d;
        return i + (str != null ? str.hashCode() : 0);
    }
}
