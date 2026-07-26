package ir.mservices.market.common.ext.ui.recycler;

import defpackage.a55;
import defpackage.bz6;
import defpackage.dp2;
import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.pv1;
import defpackage.v48;
import defpackage.wo2;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class ExtHeaderRowData extends NestedRecyclerData implements g32, a55, wo2 {
    public static final int l = js6.shimmer_ext_header;
    public final String g;
    public final boolean h;
    public final Integer i;
    public final v48 j;
    public final boolean k;

    public /* synthetic */ ExtHeaderRowData(bz6 bz6Var, String str, boolean z, dp2 dp2Var, int i) {
        this(bz6Var, str, (i & 4) != 0 ? false : z, null, null, false, dp2Var);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return l;
    }

    @Override // defpackage.a55
    public final pv1 a() {
        v48 v48Var = this.j;
        return new pv1(3, !(v48Var != null ? ((Boolean) v48Var.getValue()).booleanValue() : true) && this.k);
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final Integer b() {
        return this.i;
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final int c() {
        return 1;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final boolean e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ExtHeaderRowData) {
            return js3.i(this.g, ((ExtHeaderRowData) obj).g);
        }
        return false;
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final boolean f() {
        return true;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.g;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtHeaderRowData(bz6 bz6Var, String str, boolean z, Integer num, v48 v48Var, boolean z2, dp2 dp2Var) {
        super(bz6Var, dp2Var);
        js3.p(bz6Var, "headerFlow");
        js3.p(str, "id");
        this.g = str;
        this.h = z;
        this.i = num;
        this.j = v48Var;
        this.k = z2;
    }
}
