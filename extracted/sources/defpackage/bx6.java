package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.download.recentDownload.recycler.RecentDownloadData;
import ir.mservices.market.version2.ui.recycler.adapter.a;

/* JADX INFO: loaded from: classes3.dex */
public final class bx6 extends a {
    public ts5 l;
    public bn6 m;

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i != RecentDownloadData.c) {
            return null;
        }
        ts5 ts5Var = this.l;
        if (ts5Var == null) {
            js3.V("onClickListener");
            throw null;
        }
        bn6 bn6Var = this.m;
        if (bn6Var != null) {
            return new jx6(view, ts5Var, bn6Var);
        }
        js3.V("fastDownloadListener");
        throw null;
    }
}
