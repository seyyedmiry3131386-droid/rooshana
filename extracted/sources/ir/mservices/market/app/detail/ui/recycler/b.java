package ir.mservices.market.app.detail.ui.recycler;

import android.content.res.Resources;
import android.view.View;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.d13;
import defpackage.dp3;
import defpackage.ds6;
import defpackage.dv2;
import defpackage.f88;
import defpackage.js3;
import defpackage.lw;
import defpackage.lw8;
import defpackage.og5;
import defpackage.ps1;
import defpackage.qg5;
import defpackage.qq1;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.vl8;
import defpackage.w91;
import defpackage.xb5;
import defpackage.xf5;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.download.common.data.AppDownloadInfo;
import ir.mservices.market.version2.model.AppDownloadFlowStatus;
import ir.mservices.market.views.DownloadProgressBar;
import ir.mservices.market.views.MyketTextView;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends qg5 {
    public static final /* synthetic */ int N = 0;
    public final og5 A;
    public final og5 B;
    public final og5 C;
    public final ps1 D;
    public final ir.mservices.market.version2.manager.a E;
    public final dp3 F;
    public final lw8 G;
    public final xf5 H;
    public final ir.mservices.market.version2.manager.install.a I;
    public final dv2 J;
    public final vl8 K;
    public d13 L;
    public String M;
    public final og5 w;
    public final og5 x;
    public final og5 y;
    public final og5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view, og5 og5Var, og5 og5Var2, og5 og5Var3, og5 og5Var4, og5 og5Var5, og5 og5Var6, og5 og5Var7) {
        super(view);
        js3.p(og5Var, "onDownloadClickListener");
        js3.p(og5Var2, "onPauseClickListener");
        js3.p(og5Var3, "onInstallClickListener");
        js3.p(og5Var4, "onUpdateClickListener");
        js3.p(og5Var5, "onRunClickListener");
        js3.p(og5Var6, "onIncompatibleClickListener");
        js3.p(og5Var7, "onButtonStateListener");
        this.w = og5Var;
        this.x = og5Var2;
        this.y = og5Var3;
        this.z = og5Var4;
        this.A = og5Var5;
        this.B = og5Var6;
        this.C = og5Var7;
        this.M = "";
        w91 w91Var = (w91) qg5.r();
        this.D = (ps1) w91Var.w.get();
        this.E = (ir.mservices.market.version2.manager.a) w91Var.D.get();
        this.F = (dp3) w91Var.v.get();
        this.G = (lw8) w91Var.E.get();
        this.H = (xf5) w91Var.F.get();
        this.I = (ir.mservices.market.version2.manager.install.a) w91Var.x.get();
        this.J = (dv2) w91Var.q.get();
        this.K = (vl8) w91Var.o0.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x047e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x050f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0340  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(ir.mservices.market.app.detail.ui.recycler.AppDownloadData r25) {
        /*
            Method dump skipped, instruction units count: 1342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.detail.ui.recycler.b.A(ir.mservices.market.app.detail.ui.recycler.AppDownloadData):void");
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        AppDownloadData appDownloadData = (AppDownloadData) myketRecyclerData;
        js3.p(appDownloadData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new AppDownloadViewHolder$onAttach$1(null, appDownloadData, this), 3);
        bt2.G(cc7.q(view), null, null, new AppDownloadViewHolder$onAttach$2(null, appDownloadData, this), 3);
        bt2.G(cc7.q(view), null, null, new AppDownloadViewHolder$onAttach$3(null, appDownloadData, this), 3);
        bt2.G(cc7.q(view), null, null, new AppDownloadViewHolder$onAttach$4(null, appDownloadData, this), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e3  */
    @Override // defpackage.qg5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(ir.mservices.market.common.ui.recycler.MyketRecyclerData r6) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.detail.ui.recycler.b.t(ir.mservices.market.common.ui.recycler.MyketRecyclerData):void");
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof d13) {
            this.L = (d13) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final d13 x() {
        d13 d13Var = this.L;
        if (d13Var != null) {
            return d13Var;
        }
        js3.V("binding");
        throw null;
    }

    public final String y(AppDownloadData appDownloadData, AppDownloadInfo appDownloadInfo) {
        int percent = (appDownloadInfo == null || appDownloadInfo.getVersionCode() != appDownloadData.j) ? 0 : appDownloadInfo.getPercent();
        if (percent < 1) {
            return "";
        }
        xf5 xf5Var = this.H;
        if (xf5Var != null) {
            return xf5Var.f(appDownloadInfo, percent);
        }
        js3.V("myketUIUtils");
        throw null;
    }

    public final void z(AppDownloadData appDownloadData, AppDownloadInfo appDownloadInfo) {
        String strE;
        if (appDownloadInfo != null) {
            int status = appDownloadInfo.getStatus();
            View view = this.a;
            int i = 1;
            if (status != 100) {
                if (status == 110) {
                    MyketTextView myketTextView = x().y;
                    js3.m(myketTextView);
                    myketTextView.setVisibility(0);
                    myketTextView.setText(rs6.download_wating);
                    myketTextView.setTextColor(sj8.b().m);
                    return;
                }
                if (status == 140) {
                    ir.mservices.market.version2.manager.a aVar = this.E;
                    if (aVar == null) {
                        js3.V("appManager");
                        throw null;
                    }
                    AppDownloadFlowStatus appDownloadFlowStatusD = aVar.d(appDownloadData.g, appDownloadData.j, appDownloadData.e, appDownloadData.k);
                    if ((appDownloadFlowStatusD == AppDownloadFlowStatus.e ? appDownloadFlowStatusD : null) != null) {
                        MyketTextView myketTextView2 = x().y;
                        js3.m(myketTextView2);
                        myketTextView2.setVisibility(0);
                        myketTextView2.setText(rs6.ready_for_install);
                        myketTextView2.setTextColor(sj8.b().x);
                        return;
                    }
                    return;
                }
                if (status == 150) {
                    MyketTextView myketTextView3 = x().y;
                    myketTextView3.setTextColor(sj8.b().m);
                    myketTextView3.setVisibility(4);
                    myketTextView3.setText("");
                    return;
                }
                String strY = y(appDownloadData, appDownloadInfo);
                if (f88.n0(strY)) {
                    MyketTextView myketTextView4 = x().y;
                    js3.o(myketTextView4, "downloadStats");
                    myketTextView4.setVisibility(4);
                    return;
                } else {
                    MyketTextView myketTextView5 = x().y;
                    myketTextView5.setTextColor(sj8.b().m);
                    myketTextView5.setVisibility(0);
                    myketTextView5.setText(view.getContext().getString(rs6.download_state_downloaded_size, strY));
                    return;
                }
            }
            int detailedStatus = appDownloadInfo.getDetailedStatus();
            boolean z = detailedStatus == 101;
            boolean z2 = detailedStatus == 102;
            boolean z3 = detailedStatus == 104;
            if (appDownloadInfo.getServerSize() == -1 || z || z2) {
                MyketTextView myketTextView6 = x().y;
                js3.m(myketTextView6);
                myketTextView6.setVisibility(0);
                myketTextView6.setText(rs6.download_connecting);
                myketTextView6.setTextColor(sj8.b().m);
                return;
            }
            if (z3 && appDownloadInfo.getLocalSize() == appDownloadInfo.getServerSize()) {
                MyketTextView myketTextView7 = x().y;
                js3.m(myketTextView7);
                myketTextView7.setVisibility(0);
                myketTextView7.setTextColor(sj8.b().m);
                myketTextView7.setText(rs6.download_post_process);
                return;
            }
            MyketTextView myketTextView8 = x().y;
            myketTextView8.setTextColor(sj8.b().m);
            myketTextView8.setVisibility(0);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            if (this.K == null) {
                js3.V("timeUtils");
                throw null;
            }
            long jLongValue = ((Number) ((l) appDownloadData.m).getValue()).longValue();
            if (Math.abs(jCurrentTimeMillis - jLongValue) <= view.getResources().getInteger(ds6.download_progress_update_interval) || jCurrentTimeMillis <= jLongValue) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                long jLongValue2 = lValueOf.longValue();
                xb5 xb5Var = appDownloadData.m;
                Long lValueOf2 = Long.valueOf(jLongValue2);
                l lVar = (l) xb5Var;
                lVar.getClass();
                lVar.p(null, lValueOf2);
                DownloadProgressBar downloadProgressBar = x().x;
                js3.o(downloadProgressBar, "downloadProgressBar");
                int percent = appDownloadInfo.getVersionCode() == appDownloadData.j ? appDownloadInfo.getPercent() : 0;
                int i2 = DownloadProgressBar.c;
                downloadProgressBar.b(percent, new qq1(i));
                String strY2 = y(appDownloadData, appDownloadInfo);
                MyketTextView myketTextView9 = x().y;
                if (f88.n0(strY2)) {
                    strE = view.getResources().getString(rs6.download_connecting);
                } else {
                    lw8 lw8Var = this.G;
                    if (lw8Var == null) {
                        js3.V("uiUtils");
                        throw null;
                    }
                    Resources resources = view.getResources();
                    int i3 = rs6.active_download_stats_detail;
                    if (lw8Var == null) {
                        js3.V("uiUtils");
                        throw null;
                    }
                    strE = lw8.e(lw8Var, resources.getString(i3, strY2, lw8.h(appDownloadInfo.getLocalSize())));
                }
                myketTextView9.setText(strE);
            }
        }
    }
}
