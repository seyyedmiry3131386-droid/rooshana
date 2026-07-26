package ir.mservices.market.views;

import android.view.View;
import defpackage.br2;
import defpackage.fu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_MovieWatchProgressBackgroundView extends View implements br2 {
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
