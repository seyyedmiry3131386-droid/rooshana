package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class x29 extends s70 {
    public final Object i;

    public x29(hh2 hh2Var, Object obj) {
        super(Collections.EMPTY_LIST);
        j(hh2Var);
        this.i = obj;
    }

    @Override // defpackage.s70
    public final float b() {
        return 1.0f;
    }

    @Override // defpackage.s70
    public final Object e() {
        hh2 hh2Var = this.e;
        Object obj = this.i;
        float f = this.d;
        return hh2Var.C(0.0f, 0.0f, obj, obj, f, f, f);
    }

    @Override // defpackage.s70
    public final Object f(uy3 uy3Var, float f) {
        return e();
    }

    @Override // defpackage.s70
    public final void h() {
        if (this.e != null) {
            super.h();
        }
    }

    @Override // defpackage.s70
    public final void i(float f) {
        this.d = f;
    }
}
