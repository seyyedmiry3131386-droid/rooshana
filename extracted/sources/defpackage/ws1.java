package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.movie.download.quality.recycler.DownloadQualityData;
import ir.mservices.market.movie.download.quality.recycler.DownloadQualityHalfPriceData;
import ir.mservices.market.movie.download.quality.recycler.DownloadQualityRecentData;
import ir.mservices.market.movie.download.quality.recycler.DownloadQualityTitleData;
import ir.mservices.market.movie.download.quality.recycler.b;
import ir.mservices.market.version2.ui.recycler.adapter.a;

/* JADX INFO: loaded from: classes3.dex */
public final class ws1 extends a {
    public ys1 l;
    public ys1 m;

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == DownloadQualityData.d) {
            ys1 ys1Var = this.l;
            if (ys1Var != null) {
                return new b(view, ys1Var);
            }
            js3.V("onDownloadQualityClickListener");
            throw null;
        }
        if (i == DownloadQualityHalfPriceData.b) {
            return new l5(5, view);
        }
        if (i == DownloadQualityRecentData.c) {
            ys1 ys1Var2 = this.m;
            if (ys1Var2 != null) {
                return new ir.mservices.market.movie.download.quality.recycler.a(view, ys1Var2);
            }
            js3.V("onRecentMovieDownloadClickListener");
            throw null;
        }
        if (i != DownloadQualityTitleData.b) {
            return null;
        }
        ft1 ft1Var = new ft1(0, view);
        ft1Var.x = (lw8) ((w91) qg5.r()).E.get();
        return ft1Var;
    }
}
