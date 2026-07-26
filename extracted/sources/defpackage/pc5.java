package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.myAccount.recycler.MyAccountCheckBoxData;
import ir.mservices.market.myAccount.recycler.a;

/* JADX INFO: loaded from: classes3.dex */
public final class pc5 extends k06 {
    public qc5 o;
    public qc5 p;

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i != MyAccountCheckBoxData.c) {
            return null;
        }
        qc5 qc5Var = this.o;
        if (qc5Var == null) {
            js3.V("onCheckboxClickListener");
            throw null;
        }
        qc5 qc5Var2 = this.p;
        if (qc5Var2 != null) {
            return new a(view, qc5Var, qc5Var2);
        }
        js3.V("onSpannableTextClickListener");
        throw null;
    }
}
