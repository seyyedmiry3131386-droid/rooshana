package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class bk6 implements no7 {
    public final String a;
    public final yj6 b;

    public bk6(String str, yj6 yj6Var) {
        js3.p(yj6Var, "kind");
        this.a = str;
        this.b = yj6Var;
    }

    @Override // defpackage.no7
    public final String a() {
        return this.a;
    }

    public final void b() {
        throw new IllegalStateException(dw1.s(new StringBuilder("Primitive descriptor "), this.a, " does not have elements"));
    }

    @Override // defpackage.no7
    public final boolean c() {
        return false;
    }

    @Override // defpackage.no7
    public final int d(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        b();
        throw null;
    }

    @Override // defpackage.no7
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk6)) {
            return false;
        }
        bk6 bk6Var = (bk6) obj;
        return js3.i(this.a, bk6Var.a) && js3.i(this.b, bk6Var.b);
    }

    @Override // defpackage.no7
    public final String f(int i) {
        b();
        throw null;
    }

    @Override // defpackage.no7
    public final List g(int i) {
        b();
        throw null;
    }

    @Override // defpackage.no7
    public final List getAnnotations() {
        return EmptyList.a;
    }

    @Override // defpackage.no7
    public final o37 getKind() {
        return this.b;
    }

    @Override // defpackage.no7
    public final no7 h(int i) {
        b();
        throw null;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.no7
    public final boolean i(int i) {
        b();
        throw null;
    }

    @Override // defpackage.no7
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return bl4.y(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}
