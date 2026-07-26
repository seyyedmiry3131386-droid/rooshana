package ir.mservices.market.app.detail.ui.recycler;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import defpackage.a79;
import defpackage.b77;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.cp;
import defpackage.e73;
import defpackage.ec9;
import defpackage.f88;
import defpackage.js3;
import defpackage.l06;
import defpackage.lw;
import defpackage.og5;
import defpackage.pq6;
import defpackage.q39;
import defpackage.qg5;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.vc3;
import defpackage.w91;
import defpackage.yq6;
import ir.mservices.market.app.detail.data.TrafficPriceDto;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import ir.mservices.market.views.MyketTextView;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends ir.mservices.market.version2.ui.recycler.a {
    public static final /* synthetic */ int R = 0;
    public final og5 K;
    public final og5 L;
    public final og5 M;
    public final og5 N;
    public final og5 O;
    public final ec9 P;
    public e73 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z, cp cpVar, og5 og5Var, og5 og5Var2, og5 og5Var3, og5 og5Var4) {
        super(view, graphicUtils$Dimension, z);
        js3.p(graphicUtils$Dimension, "dimension");
        js3.p(cpVar, "onIconClickListener");
        this.K = cpVar;
        this.L = og5Var;
        this.M = og5Var2;
        this.N = og5Var3;
        this.O = og5Var4;
        this.P = (ec9) ((w91) qg5.r()).C.get();
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final l06 A() {
        return new vc3(1);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final int B() {
        return -1;
    }

    public final void J(int i) {
        Drawable drawable;
        View view = this.a;
        Resources resources = view.getResources();
        js3.o(resources, "getResources(...)");
        try {
            drawable = q39.a(resources, i, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(i, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(i, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(sj8.b().c, PorterDuff.Mode.MULTIPLY));
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.app_content_info_icon_size);
        drawableMutate.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        e73 e73Var = this.Q;
        if (e73Var != null) {
            e73Var.x.setCompoundDrawablesRelative(drawableMutate, null, null, null);
        } else {
            js3.V("binding");
            throw null;
        }
    }

    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final void s(AppBarData appBarData) {
        js3.p(appBarData, "data");
        super.s(appBarData);
        l06 l06Var = this.C;
        js3.n(l06Var, "null cannot be cast to non-null type ir.mservices.market.movie.ui.detail.recycler.HorizontalSummaryAdapter");
        og5 og5Var = this.L;
        js3.p(og5Var, "<set-?>");
        ((vc3) l06Var).m = og5Var;
        l06 l06Var2 = this.C;
        js3.n(l06Var2, "null cannot be cast to non-null type ir.mservices.market.movie.ui.detail.recycler.HorizontalSummaryAdapter");
        og5 og5Var2 = this.M;
        js3.p(og5Var2, "<set-?>");
        ((vc3) l06Var2).n = og5Var2;
        l06 l06Var3 = this.C;
        js3.n(l06Var3, "null cannot be cast to non-null type ir.mservices.market.movie.ui.detail.recycler.HorizontalSummaryAdapter");
        og5 og5Var3 = this.N;
        js3.p(og5Var3, "<set-?>");
        ((vc3) l06Var3).o = og5Var3;
        l06 l06Var4 = this.C;
        js3.n(l06Var4, "null cannot be cast to non-null type ir.mservices.market.movie.ui.detail.recycler.HorizontalSummaryAdapter");
        og5 og5Var4 = this.O;
        js3.p(og5Var4, "<set-?>");
        ((vc3) l06Var4).p = og5Var4;
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new AppBarViewHolder$onAttach$1(null, appBarData, this), 3);
        bt2.G(cc7.q(view), null, null, new AppBarViewHolder$onAttach$2(null, appBarData, this), 3);
        bt2.G(cc7.q(view), null, null, new AppBarViewHolder$onAttach$3(null, appBarData, this), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(ir.mservices.market.app.detail.ui.recycler.AppBarData r8) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.detail.ui.recycler.a.t(ir.mservices.market.app.detail.ui.recycler.AppBarData):void");
    }

    public final void M(boolean z, TrafficPriceDto trafficPriceDto, String str) {
        String downloadingText;
        if (!z) {
            e73 e73Var = this.Q;
            if (e73Var == null) {
                js3.V("binding");
                throw null;
            }
            e73Var.x.setVisibility(8);
            e73 e73Var2 = this.Q;
            if (e73Var2 == null) {
                js3.V("binding");
                throw null;
            }
            MyketTextView myketTextView = e73Var2.z;
            myketTextView.setVisibility((str == null || f88.n0(str)) ? 4 : 0);
            myketTextView.setText(str);
            return;
        }
        e73 e73Var3 = this.Q;
        if (e73Var3 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView2 = e73Var3.x;
        js3.o(myketTextView2, "downloadHint");
        if (myketTextView2.getVisibility() != 0) {
            e73 e73Var4 = this.Q;
            if (e73Var4 == null) {
                js3.V("binding");
                throw null;
            }
            e73Var4.z.setVisibility(4);
            J(yq6.ic_security_shield);
            e73 e73Var5 = this.Q;
            if (e73Var5 == null) {
                js3.V("binding");
                throw null;
            }
            MyketTextView myketTextView3 = e73Var5.x;
            js3.m(myketTextView3);
            myketTextView3.setVisibility(0);
            myketTextView3.setText(rs6.check_security_txt);
        }
        if (trafficPriceDto == null || (downloadingText = trafficPriceDto.getDownloadingText()) == null || f88.n0(downloadingText)) {
            return;
        }
        if (trafficPriceDto.getCanHalfPrice()) {
            ec9 ec9Var = this.P;
            if (ec9Var == null) {
                js3.V("vpnUtils");
                throw null;
            }
            if (ec9Var.a()) {
                return;
            }
        }
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new AppBarViewHolder$setTrafficHint$1$1(this, trafficPriceDto, null), 3);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof e73) {
            this.Q = (e73) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final PaddingLayoutManager$Padding y(NestedRecyclerData nestedRecyclerData) {
        js3.p((AppBarData) nestedRecyclerData, "data");
        return new PaddingLayoutManager$Padding(0, 0, 0, 0);
    }
}
