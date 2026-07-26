package defpackage;

import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class k18 extends ch0 {
    public final long a;

    public k18(long j) {
        this.a = j;
    }

    @Override // defpackage.ch0
    public final void a(float f, long j, jx9 jx9Var) {
        jx9Var.n(1.0f);
        long jB = this.a;
        if (f != 1.0f) {
            jB = zu0.b(zu0.d(jB) * f, jB);
        }
        jx9Var.p(jB);
        if (((Shader) jx9Var.c) != null) {
            jx9Var.s(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k18) {
            return zu0.c(this.a, ((k18) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = zu0.i;
        return tw8.a(this.a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) zu0.i(this.a)) + ')';
    }
}
