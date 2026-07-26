package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.app.detail.ui.recycler.AppSummaryIconData;
import ir.mservices.market.app.detail.ui.recycler.AppSummaryRateData;
import ir.mservices.market.app.detail.ui.recycler.AppSummarySizeData;
import ir.mservices.market.app.detail.ui.recycler.AppSummaryTextData;
import ir.mservices.market.app.detail.ui.recycler.f;
import ir.mservices.market.movie.ui.detail.recycler.VerticalLineData;

/* JADX INFO: loaded from: classes3.dex */
public final class vc3 extends l06 {
    public og5 m;
    public og5 n;
    public og5 o;
    public og5 p;

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == AppSummaryTextData.b) {
            og5 og5Var = this.m;
            if (og5Var != null) {
                return new nt(view, og5Var);
            }
            js3.V("onTextClickListener");
            throw null;
        }
        if (i == AppSummaryIconData.b) {
            og5 og5Var2 = this.n;
            if (og5Var2 != null) {
                return new lt(view, og5Var2);
            }
            js3.V("onIconClickListener");
            throw null;
        }
        if (i == AppSummaryRateData.b) {
            og5 og5Var3 = this.o;
            if (og5Var3 != null) {
                return new mt(view, og5Var3);
            }
            js3.V("onRateClickListener");
            throw null;
        }
        if (i != AppSummarySizeData.e) {
            if (i == VerticalLineData.a) {
                return new l5(28, view);
            }
            return null;
        }
        og5 og5Var4 = this.p;
        if (og5Var4 != null) {
            return new f(view, og5Var4);
        }
        js3.V("onSizeClickListener");
        throw null;
    }
}
