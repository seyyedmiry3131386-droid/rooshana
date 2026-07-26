package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.movie.ui.common.MovieHomeMovieData;

/* JADX INFO: loaded from: classes3.dex */
public final class t35 extends l06 {
    public og5 m;

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == MovieHomeMovieData.g) {
            return new s35(this.l, view);
        }
        return null;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a, androidx.recyclerview.widget.g
    /* JADX INFO: renamed from: K */
    public final void l(qg5 qg5Var, int i) {
        if (e(i) == MovieHomeMovieData.g) {
            s35 s35Var = (s35) qg5Var;
            og5 og5Var = this.m;
            if (og5Var == null) {
                js3.V("onMovieClickListener");
                throw null;
            }
            s35Var.x = og5Var;
        }
        super.l(qg5Var, i);
    }
}
