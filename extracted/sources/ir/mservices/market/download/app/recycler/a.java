package ir.mservices.market.download.app.recycler;

import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.cq;
import defpackage.dv2;
import defpackage.e63;
import defpackage.it1;
import defpackage.js3;
import defpackage.lw;
import defpackage.lw8;
import defpackage.og5;
import defpackage.pq6;
import defpackage.ps1;
import defpackage.qg5;
import defpackage.r82;
import defpackage.rs6;
import defpackage.s82;
import defpackage.w91;
import defpackage.xf5;
import defpackage.yq6;
import defpackage.z95;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.download.common.data.AppDownloadInfo;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.views.AppIconView;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends ir.mservices.market.version2.ui.recycler.holder.a {
    public static final /* synthetic */ int I = 0;
    public final og5 A;
    public final ps1 B;
    public final xf5 C;
    public final dv2 D;
    public final ir.mservices.market.version2.manager.a E;
    public final lw8 F;
    public cq G;
    public final boolean H;
    public final s82 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, s82 s82Var, it1 it1Var, z95 z95Var) {
        super(view, z95Var);
        js3.p(it1Var, "onClickListener");
        this.z = s82Var;
        this.A = it1Var;
        w91 w91Var = (w91) qg5.r();
        this.B = (ps1) w91Var.w.get();
        this.C = (xf5) w91Var.F.get();
        this.D = (dv2) w91Var.q.get();
        this.E = (ir.mservices.market.version2.manager.a) w91Var.D.get();
        this.F = (lw8) w91Var.E.get();
        dv2 dv2Var = this.D;
        if (dv2Var != null) {
            this.H = dv2Var.e() >= 360.0f;
        } else {
            js3.V("graphicUtils");
            throw null;
        }
    }

    public final lw8 C() {
        lw8 lw8Var = this.F;
        if (lw8Var != null) {
            return lw8Var;
        }
        js3.V("uiUtils");
        throw null;
    }

    @Override // ir.mservices.market.version2.ui.recycler.holder.a, defpackage.qg5
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final void s(AppDownloadData appDownloadData) {
        js3.p(appDownloadData, "data");
        super.s(appDownloadData);
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new AppDownloadActiveViewHolder$onAttach$1(null, this, appDownloadData), 3);
        bt2.G(cc7.q(view), null, null, new AppDownloadActiveViewHolder$onAttach$2(null, this, appDownloadData), 3);
        bt2.G(cc7.q(view), null, null, new AppDownloadActiveViewHolder$onAttach$3(null, this, appDownloadData), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(ir.mservices.market.download.app.recycler.AppDownloadData r21, ir.mservices.market.download.common.data.AppDownloadInfo r22) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.download.app.recycler.a.E(ir.mservices.market.download.app.recycler.AppDownloadData, ir.mservices.market.download.common.data.AppDownloadInfo):void");
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        AppDownloadData appDownloadData = (AppDownloadData) myketRecyclerData;
        js3.p(appDownloadData, "data");
        B(appDownloadData);
        ps1 ps1Var = this.B;
        if (ps1Var == null) {
            js3.V("downloadManager");
            throw null;
        }
        AppDownloadInfo appDownloadInfoI = ps1Var.i(appDownloadData.m, null);
        if (appDownloadInfoI != null) {
            E(appDownloadData, appDownloadInfoI);
        }
        cq cqVar = this.G;
        if (cqVar == null) {
            js3.V("binding");
            throw null;
        }
        cqVar.w.setText(appDownloadData.p);
        cq cqVar2 = this.G;
        if (cqVar2 == null) {
            js3.V("binding");
            throw null;
        }
        cqVar2.v.setErrorImageResId(yq6.icon);
        cq cqVar3 = this.G;
        if (cqVar3 == null) {
            js3.V("binding");
            throw null;
        }
        AppIconView appIconView = cqVar3.v;
        js3.o(appIconView, "appIcon");
        AppIconView.setImageUrl$default(appIconView, appDownloadData.o, null, false, 6, null);
        r82 r82Var = new r82(false, appDownloadData.m, appDownloadData.p, appDownloadData.r, this.a.getContext().getResources().getString(rs6.install_app), appDownloadData.n, appDownloadData.q, appDownloadData.s, appDownloadData.t, appDownloadData.o, appDownloadData.y);
        String str = appDownloadData.u;
        Bundle bundle = r82Var.k;
        bundle.putString("refId", str);
        bundle.putString("installCallbackUrl", appDownloadData.v);
        bundle.putString("BUNDLE_KEY_CALLBACK_URL", appDownloadData.w);
        bundle.putString("BUNDLE_KEY_DOWNLOAD_REF", CommonDataKt.HOME_MOVIE_TYPE_LIST);
        cq cqVar4 = this.G;
        if (cqVar4 != null) {
            cqVar4.z.setData(r82Var, this.z);
        } else {
            js3.V("binding");
            throw null;
        }
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (!(a79Var instanceof e63)) {
            lw.g(null, "Binding is incompatible", null);
            return;
        }
        cq cqVar = ((e63) a79Var).v;
        js3.o(cqVar, "selectLayout");
        this.G = cqVar;
    }

    @Override // ir.mservices.market.version2.ui.recycler.holder.a
    public final og5 x() {
        return this.A;
    }

    @Override // ir.mservices.market.version2.ui.recycler.holder.a
    public final Point z() {
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.app_icon_size);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.space_4);
        Point point = new Point();
        point.x = dimensionPixelSize - dimensionPixelSize2;
        point.y = dimensionPixelSize - (dimensionPixelSize2 * 2);
        return point;
    }
}
