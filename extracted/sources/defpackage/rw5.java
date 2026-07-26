package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.movie.streamers.recycler.OtherStreamerData;

/* JADX INFO: loaded from: classes3.dex */
public final class rw5 extends l06 {
    public ts5 m;

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i != OtherStreamerData.b) {
            return null;
        }
        int i2 = this.l;
        ts5 ts5Var = this.m;
        if (ts5Var != null) {
            return new sw5(i2, ts5Var, view);
        }
        js3.V("onStreamerClickListener");
        throw null;
    }
}
