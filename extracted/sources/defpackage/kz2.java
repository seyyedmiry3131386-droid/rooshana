package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kz2 extends View implements br2 {
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
