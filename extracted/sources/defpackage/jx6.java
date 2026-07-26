package defpackage;

import android.content.Context;
import android.view.View;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.download.common.data.AppDownloadInfo;
import ir.mservices.market.download.recentDownload.recycler.RecentDownloadData;
import ir.mservices.market.version2.download.DownloadTag;
import ir.mservices.market.version2.manager.install.InstallQueue$InstallState;
import ir.mservices.market.version2.manager.install.a;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class jx6 extends qg5 {
    public cx6 A;
    public final og5 w;
    public final s82 x;
    public final lw8 y;
    public final a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx6(View view, ts5 ts5Var, bn6 bn6Var) {
        super(view);
        js3.p(ts5Var, "onClickListener");
        js3.p(bn6Var, "fastDownloadListener");
        this.w = ts5Var;
        this.x = bn6Var;
        w91 w91Var = (w91) qg5.r();
        this.y = (lw8) w91Var.E.get();
        this.z = (a) w91Var.x.get();
    }

    public static void y(jx6 jx6Var, int i) {
        jx6Var.x(i, sj8.b().n, sj8.b().p);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        RecentDownloadData recentDownloadData = (RecentDownloadData) myketRecyclerData;
        js3.p(recentDownloadData, "data");
        AppDownloadInfo appDownloadInfo = recentDownloadData.a;
        cx6 cx6Var = this.A;
        if (cx6Var == null) {
            js3.V("binding");
            throw null;
        }
        cx6Var.w.setText(appDownloadInfo.getTitle());
        AppIconView appIconView = cx6Var.v;
        appIconView.setErrorImageResId(yq6.icon);
        AppIconView.setImageUrl$default(appIconView, appDownloadInfo.getIconPath(), null, false, 6, null);
        int iOrdinal = recentDownloadData.b.ordinal();
        if (iOrdinal == 3) {
            int status = appDownloadInfo.getStatus();
            if (status == 100) {
                y(this, rs6.download_status_downloading);
            } else if (status == 110) {
                y(this, rs6.download_status_wating);
            }
        } else if (iOrdinal == 4) {
            x(rs6.download_status_ready_to_install, sj8.b().z, sj8.b().y);
        } else if (iOrdinal == 5) {
            a aVar = this.z;
            if (aVar == null) {
                js3.V("installQueue");
                throw null;
            }
            String packageName = appDownloadInfo.getPackageName();
            js3.p(packageName, "packageName");
            InstallQueue$InstallState installQueue$InstallState = (InstallQueue$InstallState) aVar.f.get(packageName);
            int i = installQueue$InstallState == null ? -1 : ix6.a[installQueue$InstallState.ordinal()];
            if (i == 1) {
                y(this, rs6.download_status_wating_to_install);
            } else if (i == 2 || i == 3) {
                y(this, rs6.download_status_installing);
            }
        }
        DownloadTag tag = appDownloadInfo.getTag();
        String packageName2 = appDownloadInfo.getPackageName();
        String str = tag.r;
        boolean z = tag.u;
        int i2 = tag.a;
        long j = tag.l;
        int i3 = tag.c;
        cx6Var.x.setData(new r82(false, packageName2, str, z, "", i2, j, i3 == 120 || i3 == 140, i3 == 130 || i3 == 140, tag.s, appDownloadInfo.getForceUpdateDto()), this.x);
        View view = this.a;
        js3.o(view, "itemView");
        qg5.v(view, this.w, this, recentDownloadData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof cx6) {
            this.A = (cx6) a79Var;
        } else {
            lw.g(null, "Binding is incompatible", null);
        }
    }

    public final void x(int i, int i2, int i3) {
        cx6 cx6Var = this.A;
        if (cx6Var == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = cx6Var.y;
        lw8 lw8Var = this.y;
        if (lw8Var == null) {
            js3.V("uiUtils");
            throw null;
        }
        myketTextView.setText(lw8.e(lw8Var, myketTextView.getContext().getString(i)));
        myketTextView.setTextColor(i2);
        View view = this.a;
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = i3;
        ea7Var.c(view.getResources().getDimensionPixelSize(pq6.recent_download_status_radius));
        ea7Var.h = 0;
        ea7Var.p = sj8.b().N;
        myketTextView.setBackground(ea7Var.a());
    }
}
