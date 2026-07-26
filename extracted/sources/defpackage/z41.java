package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z41 implements no7 {
    public final po7 a;
    public final zw3 b;
    public final String c;

    public z41(po7 po7Var, ps0 ps0Var) {
        js3.p(ps0Var, "kClass");
        this.a = po7Var;
        this.b = ps0Var;
        this.c = po7Var.a + '<' + ps0Var.d() + '>';
    }

    @Override // defpackage.no7
    public final String a() {
        return this.c;
    }

    @Override // defpackage.no7
    public final boolean c() {
        return false;
    }

    @Override // defpackage.no7
    public final int d(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return this.a.d(str);
    }

    @Override // defpackage.no7
    public final int e() {
        return this.a.c;
    }

    public final boolean equals(Object obj) {
        z41 z41Var = obj instanceof z41 ? (z41) obj : null;
        return z41Var != null && this.a.equals(z41Var.a) && js3.i(z41Var.b, this.b);
    }

    @Override // defpackage.no7
    public final String f(int i) {
        return this.a.f[i];
    }

    @Override // defpackage.no7
    public final List g(int i) {
        return this.a.h[i];
    }

    @Override // defpackage.no7
    public final List getAnnotations() {
        return this.a.d;
    }

    @Override // defpackage.no7
    public final o37 getKind() {
        return this.a.b;
    }

    @Override // defpackage.no7
    public final no7 h(int i) {
        return this.a.g[i];
    }

    public final int hashCode() {
        return this.c.hashCode() + (((ps0) this.b).hashCode() * 31);
    }

    @Override // defpackage.no7
    public final boolean i(int i) {
        return this.a.i[i];
    }

    @Override // defpackage.no7
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.b + ", original: " + this.a + ')';
    }
}
