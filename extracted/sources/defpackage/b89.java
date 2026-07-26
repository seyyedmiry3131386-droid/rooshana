package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class b89 extends e89 {
    public float[] g;
    public w21 h;

    @Override // defpackage.e89
    public final void d(w21 w21Var) {
        this.h = w21Var;
    }

    @Override // defpackage.e89
    public final void e(View view, float f) {
        float[] fArr = this.g;
        fArr[0] = a(f);
        zk8.j0(this.h, view, fArr);
    }
}
