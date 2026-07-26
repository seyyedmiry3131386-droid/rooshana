package defpackage;

import com.google.android.material.textfield.TextInputEditText;
import ir.mservices.market.views.MyketEditText;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iz2 extends TextInputEditText implements br2 {
    public fu i;
    public boolean j;

    public final void b() {
        if (this.j) {
            return;
        }
        this.j = true;
        ((MyketEditText) this).p = (d04) ((u91) ((le5) e())).a.p.get();
    }

    @Override // defpackage.br2
    public final Object e() {
        if (this.i == null) {
            this.i = new fu(this);
        }
        return this.i.e();
    }
}
