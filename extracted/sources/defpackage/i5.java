package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.app.home.ui.recycler.HomeMoreTitleRowData;
import ir.mservices.market.social.users.common.recycler.OwnUsersEmptyData;
import ir.mservices.market.social.users.common.recycler.UserCardData;
import ir.mservices.market.social.users.common.recycler.UserCardRowData;
import ir.mservices.market.version2.ui.recycler.adapter.a;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class i5 extends a {
    public final int l;
    public final GraphicUtils$Dimension m;
    public final boolean n;
    public p50 o;
    public p50 p;
    public p50 q;
    public p50 r;

    public i5(int i, int i2, GraphicUtils$Dimension graphicUtils$Dimension, boolean z) {
        super(i);
        this.l = i2;
        this.m = graphicUtils$Dimension;
        this.n = z;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == UserCardData.d) {
            p50 p50Var = this.o;
            if (p50Var != null) {
                return new d19(this.l, p50Var, view);
            }
            js3.V("onUserHorizontalClickListener");
            throw null;
        }
        if (i == OwnUsersEmptyData.d) {
            p50 p50Var2 = this.p;
            if (p50Var2 != null) {
                return new ey5(view, p50Var2);
            }
            js3.V("onMyNetClickListener");
            throw null;
        }
        int i2 = UserCardRowData.j;
        boolean z = this.n;
        GraphicUtils$Dimension graphicUtils$Dimension = this.m;
        if (i == i2) {
            p50 p50Var3 = this.q;
            if (p50Var3 != null) {
                return new y09(view, graphicUtils$Dimension, z, p50Var3, 3);
            }
            js3.V("onUserClickListener");
            throw null;
        }
        if (i == UserCardRowData.k) {
            p50 p50Var4 = this.o;
            if (p50Var4 != null) {
                return new y09(view, graphicUtils$Dimension, z, p50Var4, 0);
            }
            js3.V("onUserHorizontalClickListener");
            throw null;
        }
        if (i == UserCardRowData.l) {
            p50 p50Var5 = this.o;
            if (p50Var5 != null) {
                return new y09(view, graphicUtils$Dimension, z, p50Var5, 2);
            }
            js3.V("onUserHorizontalClickListener");
            throw null;
        }
        if (i == UserCardRowData.m) {
            p50 p50Var6 = this.o;
            if (p50Var6 != null) {
                return new y09(view, graphicUtils$Dimension, z, p50Var6, 1);
            }
            js3.V("onUserHorizontalClickListener");
            throw null;
        }
        if (i != HomeMoreTitleRowData.j) {
            return null;
        }
        p50 p50Var7 = this.r;
        if (p50Var7 != null) {
            return new tb3(0, p50Var7, view);
        }
        js3.V("onMoreClickListener");
        throw null;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a, androidx.recyclerview.widget.g
    /* JADX INFO: renamed from: K */
    public final void l(qg5 qg5Var, int i) {
        super.l(qg5Var, i);
        if (e(i) == UserCardData.d) {
            View view = ((d19) qg5Var).x().z;
            js3.o(view, "space");
            view.setVisibility(8);
        }
    }
}
