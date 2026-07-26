package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.movie.ui.common.MovieHomeReelData;

/* JADX INFO: loaded from: classes3.dex */
public final class w35 extends l06 {
    public og5 m;

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == MovieHomeReelData.b) {
            return new u35(this.l, view);
        }
        return null;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a, androidx.recyclerview.widget.g
    /* JADX INFO: renamed from: K */
    public final void l(qg5 qg5Var, int i) {
        if (e(i) == MovieHomeReelData.b) {
            ((u35) qg5Var).x = this.m;
        }
        super.l(qg5Var, i);
    }
}
