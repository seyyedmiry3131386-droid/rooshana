package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class oo7 implements no7, yk0 {
    public final no7 a;
    public final String b;
    public final Set c;

    public oo7(no7 no7Var) {
        js3.p(no7Var, "original");
        this.a = no7Var;
        this.b = no7Var.a() + '?';
        this.c = yq2.M(no7Var);
    }

    @Override // defpackage.no7
    public final String a() {
        return this.b;
    }

    @Override // defpackage.yk0
    public final Set b() {
        return this.c;
    }

    @Override // defpackage.no7
    public final boolean c() {
        return true;
    }

    @Override // defpackage.no7
    public final int d(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return this.a.d(str);
    }

    @Override // defpackage.no7
    public final int e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oo7) {
            return js3.i(this.a, ((oo7) obj).a);
        }
        return false;
    }

    @Override // defpackage.no7
    public final String f(int i) {
        return this.a.f(i);
    }

    @Override // defpackage.no7
    public final List g(int i) {
        return this.a.g(i);
    }

    @Override // defpackage.no7
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // defpackage.no7
    public final o37 getKind() {
        return this.a.getKind();
    }

    @Override // defpackage.no7
    public final no7 h(int i) {
        return this.a.h(i);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // defpackage.no7
    public final boolean i(int i) {
        return this.a.i(i);
    }

    @Override // defpackage.no7
    public final boolean isInline() {
        return this.a.isInline();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
