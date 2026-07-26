package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.movie.ui.common.MovieHomeMovieData;
import ir.mservices.market.movie.ui.detail.recycler.MovieScreenshotData;
import ir.mservices.market.version2.ui.recycler.adapter.a;

/* JADX INFO: loaded from: classes3.dex */
public final class l45 extends a {
    public final /* synthetic */ int l = 1;
    public og5 m;
    public int n;

    public /* synthetic */ l45(int i) {
        super(i);
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        switch (this.l) {
            case 0:
                if (i != MovieHomeMovieData.g) {
                    return null;
                }
                s35 s35Var = new s35(this.n, view);
                og5 og5Var = this.m;
                if (og5Var != null) {
                    s35Var.x = og5Var;
                    return s35Var;
                }
                js3.V("onMovieClickListener");
                throw null;
            default:
                if (i != MovieScreenshotData.d) {
                    return null;
                }
                int i2 = this.n;
                og5 og5Var2 = this.m;
                if (og5Var2 != null) {
                    return new d65(i2, og5Var2, view);
                }
                js3.V("onScreenshotClickListener");
                throw null;
        }
    }

    public l45(int i, int i2) {
        super(i2);
        this.n = i;
    }
}
