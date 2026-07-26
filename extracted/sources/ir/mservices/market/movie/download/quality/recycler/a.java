package ir.mservices.market.movie.download.quality.recycler;

import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.dt1;
import defpackage.f88;
import defpackage.js3;
import defpackage.lw;
import defpackage.og5;
import defpackage.q73;
import defpackage.qg5;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.ys1;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public final og5 w;
    public q73 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, ys1 ys1Var) {
        super(view);
        js3.p(ys1Var, "onRecentDownloadClickListener");
        this.w = ys1Var;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        DownloadQualityRecentData downloadQualityRecentData = (DownloadQualityRecentData) myketRecyclerData;
        js3.p(downloadQualityRecentData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new DownloadQualityRecentViewHolder$onAttach$1(downloadQualityRecentData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        DownloadQualityRecentData downloadQualityRecentData = (DownloadQualityRecentData) myketRecyclerData;
        js3.p(downloadQualityRecentData, "data");
        View view = this.a;
        String string = view.getResources().getString(rs6.recent_download_message);
        js3.o(string, "getString(...)");
        String string2 = view.getResources().getString(rs6.recent_download_title);
        js3.o(string2, "getString(...)");
        int iL0 = f88.l0(string, string2, 0, false, 6);
        int length = string2.length() + iL0;
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new dt1(this, downloadQualityRecentData), iL0, length, 33);
        spannableString.setSpan(new ForegroundColorSpan(sj8.b().j), iL0, length, 33);
        q73 q73Var = this.x;
        if (q73Var == null) {
            js3.V("binding");
            throw null;
        }
        q73Var.v.setText(spannableString);
        q73 q73Var2 = this.x;
        if (q73Var2 != null) {
            q73Var2.v.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            js3.V("binding");
            throw null;
        }
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof q73) {
            this.x = (q73) a79Var;
        } else {
            lw.g(null, "Binding is incompatible", null);
        }
    }
}
