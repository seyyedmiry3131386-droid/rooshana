package ir.mservices.market.version2.ui.recycler.data;

import defpackage.ja1;
import defpackage.js3;
import defpackage.rv6;
import defpackage.v48;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MultiSelectRecyclerData implements MyketRecyclerData, Cloneable {
    public final v48 a;
    public final l b;
    public final rv6 c;
    public final l d;
    public final rv6 e;
    public boolean f;
    public boolean g;

    public MultiSelectRecyclerData(v48 v48Var) {
        js3.p(v48Var, "multiSelectVisibilityState");
        this.a = v48Var;
        l lVarB = ja1.b(Boolean.FALSE);
        this.b = lVarB;
        this.c = new rv6(lVarB);
        l lVarB2 = ja1.b(Boolean.TRUE);
        this.d = lVarB2;
        this.e = new rv6(lVarB2);
    }

    public /* bridge */ Object clone() {
        return super.clone();
    }
}
