package defpackage;

import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import ir.mservices.market.views.BindAutoCompleteView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dz2 extends MaterialAutoCompleteTextView implements br2 {
    public fu m;
    public boolean n;

    public final void d() {
        if (this.n) {
            return;
        }
        this.n = true;
        ((BindAutoCompleteView) this).o = (qb0) ((u91) ((ob0) e())).a.p1.get();
    }

    @Override // defpackage.br2
    public final Object e() {
        if (this.m == null) {
            this.m = new fu(this);
        }
        return this.m.e();
    }
}
