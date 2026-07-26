package ir.mservices.market.views;

import android.widget.LinearLayout;
import defpackage.br2;
import defpackage.fu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_MyketMultiRadio extends LinearLayout implements br2 {
    public fu a;
    public boolean b;

    @Override // defpackage.br2
    public final Object e() {
        if (this.a == null) {
            this.a = new fu(this);
        }
        return this.a.e();
    }
}
