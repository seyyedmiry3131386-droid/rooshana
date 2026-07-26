package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.myAccount.recycler.MyAccountHeaderData;
import ir.mservices.market.myAccount.recycler.MyAccountInfoNestedData;
import ir.mservices.market.myAccount.recycler.MyAccountPrivacyNestedData;
import ir.mservices.market.myAccount.recycler.MyAccountPrivateNestedData;
import ir.mservices.market.myAccount.recycler.b;
import ir.mservices.market.version2.ui.recycler.adapter.a;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class gc5 extends a {
    public final GraphicUtils$Dimension l;
    public final boolean m;
    public sc5 n;
    public sc5 o;
    public sc5 p;
    public ur4 q;
    public sc5 r;
    public sc5 s;

    public gc5(int i, GraphicUtils$Dimension graphicUtils$Dimension, boolean z) {
        super(i);
        this.l = graphicUtils$Dimension;
        this.m = z;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == MyAccountHeaderData.c) {
            sc5 sc5Var = this.n;
            if (sc5Var == null) {
                js3.V("onCameraClickListener");
                throw null;
            }
            sc5 sc5Var2 = this.o;
            if (sc5Var2 == null) {
                js3.V("onAvatarClickListener");
                throw null;
            }
            b bVar = new b(view, sc5Var, sc5Var2);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            StaggeredGridLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof StaggeredGridLayoutManager.LayoutParams ? (StaggeredGridLayoutManager.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.f = true;
            }
            return bVar;
        }
        int i2 = MyAccountInfoNestedData.h;
        boolean z = this.m;
        GraphicUtils$Dimension graphicUtils$Dimension = this.l;
        if (i == i2) {
            sc5 sc5Var3 = this.p;
            if (sc5Var3 != null) {
                return new kc5(view, graphicUtils$Dimension, z, sc5Var3);
            }
            js3.V("onClickListener");
            throw null;
        }
        if (i == MyAccountPrivacyNestedData.h) {
            sc5 sc5Var4 = this.s;
            if (sc5Var4 != null) {
                return new kc5(view, graphicUtils$Dimension, z, sc5Var4, (byte) 0);
            }
            js3.V("onLinkItemClickListener");
            throw null;
        }
        if (i != MyAccountPrivateNestedData.h) {
            if (i == DividerData.k) {
                return new oq1(view);
            }
            return null;
        }
        ur4 ur4Var = this.q;
        if (ur4Var == null) {
            js3.V("onCheckboxClickListener");
            throw null;
        }
        sc5 sc5Var5 = this.r;
        if (sc5Var5 != null) {
            return new rc5(view, this.l, this.m, ur4Var, sc5Var5);
        }
        js3.V("onSpannableTextClickListener");
        throw null;
    }
}
