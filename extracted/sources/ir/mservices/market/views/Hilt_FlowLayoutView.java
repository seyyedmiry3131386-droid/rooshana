package ir.mservices.market.views;

import android.view.ViewGroup;
import defpackage.br2;
import defpackage.d04;
import defpackage.fu;
import defpackage.u91;
import defpackage.vf2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_FlowLayoutView extends ViewGroup implements br2 {
    public fu a;
    public boolean b;

    public void a() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((FlowLayoutView) this).c = (d04) ((u91) ((vf2) e())).a.p.get();
    }

    @Override // defpackage.br2
    public final Object e() {
        if (this.a == null) {
            this.a = new fu(this);
        }
        return this.a.e();
    }
}
