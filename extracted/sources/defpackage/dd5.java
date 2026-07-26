package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.myMarket.recycler.MyMarketAboutData;
import ir.mservices.market.myMarket.recycler.MyMarketHeaderData;
import ir.mservices.market.myMarket.recycler.MyMarketHorizontalNestedData;
import ir.mservices.market.myMarket.recycler.MyMarketNestedData;
import ir.mservices.market.version2.ui.recycler.adapter.a;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class dd5 extends a {
    public final GraphicUtils$Dimension l;
    public final boolean m;
    public md5 n;
    public md5 o;
    public md5 p;
    public md5 q;
    public md5 r;

    public dd5(int i, GraphicUtils$Dimension graphicUtils$Dimension, boolean z) {
        super(i);
        this.l = graphicUtils$Dimension;
        this.m = z;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == MyMarketHeaderData.d) {
            md5 md5Var = this.n;
            if (md5Var != null) {
                return new gd5(view, md5Var);
            }
            js3.V("onActionClickListener");
            throw null;
        }
        int i2 = MyMarketHorizontalNestedData.h;
        boolean z = this.m;
        GraphicUtils$Dimension graphicUtils$Dimension = this.l;
        if (i == i2) {
            md5 md5Var2 = this.o;
            if (md5Var2 != null) {
                return new kc5(view, graphicUtils$Dimension, z, md5Var2);
            }
            js3.V("onHorizontalItemClickListener");
            throw null;
        }
        if (i == MyMarketNestedData.h) {
            md5 md5Var3 = this.p;
            if (md5Var3 != null) {
                return new kc5(view, graphicUtils$Dimension, z, md5Var3, (byte) 0);
            }
            js3.V("onNestedItemClickListener");
            throw null;
        }
        if (i != MyMarketAboutData.a) {
            return null;
        }
        md5 md5Var4 = this.q;
        if (md5Var4 == null) {
            js3.V("onInviteFriendClickListener");
            throw null;
        }
        md5 md5Var5 = this.r;
        if (md5Var5 != null) {
            return new zc5(view, md5Var4, md5Var5);
        }
        js3.V("onAboutClickListener");
        throw null;
    }
}
