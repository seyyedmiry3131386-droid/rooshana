package ir.mservices.market.common.ui.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.pq6;
import defpackage.to2;
import defpackage.wo2;

/* JADX INFO: loaded from: classes3.dex */
public class DividerData implements MyketRecyclerData, g32, wo2, to2 {
    public static final int k = js6.divider;
    public static final int l = pq6.divider_height;
    public String a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final int h;
    public final int i;
    public int j;

    public DividerData() {
        long j = is3.p + 1;
        is3.p = j;
        String.valueOf(j);
        this.b = true;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = l;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return k;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DividerData)) {
            return false;
        }
        DividerData dividerData = (DividerData) obj;
        return js3.i(this.a, dividerData.a) && this.b == dividerData.b && this.c == dividerData.c && this.d == dividerData.d && this.e == dividerData.e && this.f == dividerData.f && this.g == dividerData.g && this.h == dividerData.h && this.i == dividerData.i && this.j == dividerData.j;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return "DIVIDER";
    }

    public final int hashCode() {
        String str = this.a;
        return ((((((((((((((((((str != null ? str.hashCode() : 0) * 31) + (this.b ? 1231 : 1237)) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j;
    }
}
