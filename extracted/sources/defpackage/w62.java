package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.common.ext.ui.recycler.ExtHeaderData;

/* JADX INFO: loaded from: classes3.dex */
public final class w62 extends l06 {
    public final Integer m;
    public og5 n;

    public w62(Integer num) {
        super(1);
        this.m = num;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        Integer num = this.m;
        if (num != null) {
            this.l = num.intValue();
        }
        if (i != ExtHeaderData.j) {
            if (i == ExtHeaderData.i) {
                return new u62(view, this.l, 0);
            }
            return null;
        }
        int i2 = this.l;
        og5 og5Var = this.n;
        if (og5Var != null) {
            return new v62(i2, og5Var, view);
        }
        js3.V("onAppClickListener");
        throw null;
    }
}
