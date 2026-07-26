package ir.mservices.market.movie.download.quality.recycler;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.js3;
import defpackage.lw;
import defpackage.lw8;
import defpackage.n73;
import defpackage.og5;
import defpackage.p25;
import defpackage.pq6;
import defpackage.q25;
import defpackage.qg5;
import defpackage.r25;
import defpackage.s25;
import defpackage.sj8;
import defpackage.t25;
import defpackage.u25;
import defpackage.w50;
import defpackage.w91;
import defpackage.yq6;
import defpackage.ys1;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.uri.downloadInfo.data.QualityItem;
import ir.mservices.market.views.LoadingView;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends qg5 {
    public boolean A;
    public final og5 w;
    public final lw8 x;
    public n73 y;
    public ValueAnimator z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view, ys1 ys1Var) {
        super(view);
        js3.p(ys1Var, "onDownloadQualityClickListener");
        this.w = ys1Var;
        this.A = true;
        this.x = (lw8) ((w91) qg5.r()).E.get();
    }

    public static final int x(b bVar, u25 u25Var) {
        if ((u25Var instanceof s25) || (u25Var instanceof r25) || (u25Var instanceof p25)) {
            return sj8.b().j;
        }
        if ((u25Var instanceof t25) || (u25Var instanceof q25)) {
            return sj8.b().v;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int y(b bVar, u25 u25Var) {
        if (u25Var instanceof s25) {
            return yq6.ic_play_downloaded_movie;
        }
        if ((u25Var instanceof r25) || (u25Var instanceof p25)) {
            return yq6.ic_download_start;
        }
        if ((u25Var instanceof t25) || (u25Var instanceof q25)) {
            return yq6.ic_pause_download;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        DownloadQualityData downloadQualityData = (DownloadQualityData) myketRecyclerData;
        js3.p(downloadQualityData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new DownloadQualityViewHolder$onAttach$1(downloadQualityData, this, null), 3);
        bt2.G(cc7.q(view), null, null, new DownloadQualityViewHolder$onAttach$2(downloadQualityData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        DownloadQualityData downloadQualityData = (DownloadQualityData) myketRecyclerData;
        js3.p(downloadQualityData, "data");
        QualityItem qualityItem = downloadQualityData.a;
        n73 n73Var = this.y;
        if (n73Var == null) {
            js3.V("binding");
            throw null;
        }
        n73Var.y.setText(qualityItem.getTitle());
        n73 n73Var2 = this.y;
        if (n73Var2 == null) {
            js3.V("binding");
            throw null;
        }
        n73Var2.v.setText(qualityItem.getDescription());
        n73 n73Var3 = this.y;
        if (n73Var3 == null) {
            js3.V("binding");
            throw null;
        }
        n73Var3.x.setColorFilter(new PorterDuffColorFilter(sj8.b().j, PorterDuff.Mode.MULTIPLY));
        n73 n73Var4 = this.y;
        if (n73Var4 == null) {
            js3.V("binding");
            throw null;
        }
        LoadingView loadingView = n73Var4.w;
        loadingView.setIndicatorColor(sj8.b().j);
        loadingView.setTrackColor(sj8.b().j);
        loadingView.setIndicatorSize(loadingView.getResources().getDimensionPixelSize(pq6.big_button_height));
        loadingView.setTrackThickness(loadingView.getResources().getDimensionPixelSize(pq6.circle_progress_thickness));
        loadingView.setIndeterminate(false);
        loadingView.setMax(10000);
        n73 n73Var5 = this.y;
        if (n73Var5 != null) {
            n73Var5.x.setOnClickListener(new w50(this, downloadQualityData, 2));
        } else {
            js3.V("binding");
            throw null;
        }
    }

    @Override // defpackage.qg5
    public final void u(MyketRecyclerData myketRecyclerData) {
        js3.p((DownloadQualityData) myketRecyclerData, "data");
        this.A = true;
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof n73) {
            this.y = (n73) a79Var;
        } else {
            lw.g(null, "Binding is incompatible", null);
        }
    }
}
