package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class u74 implements no7 {
    public final no7 a;
    public final no7 b;

    public u74(no7 no7Var, no7 no7Var2) {
        js3.p(no7Var, "keyDesc");
        js3.p(no7Var2, "valueDesc");
        this.a = no7Var;
        this.b = no7Var2;
    }

    @Override // defpackage.no7
    public final String a() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // defpackage.no7
    public final boolean c() {
        return false;
    }

    @Override // defpackage.no7
    public final int d(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        Integer numA0 = m88.a0(str);
        if (numA0 != null) {
            return numA0.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid map index"));
    }

    @Override // defpackage.no7
    public final int e() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u74)) {
            return false;
        }
        u74 u74Var = (u74) obj;
        return js3.i(this.a, u74Var.a) && js3.i(this.b, u74Var.b);
    }

    @Override // defpackage.no7
    public final String f(int i) {
        return String.valueOf(i);
    }

    @Override // defpackage.no7
    public final List g(int i) {
        if (i >= 0) {
            return EmptyList.a;
        }
        throw new IllegalArgumentException(bl4.q(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // defpackage.no7
    public final List getAnnotations() {
        return EmptyList.a;
    }

    @Override // defpackage.no7
    public final o37 getKind() {
        return g98.d;
    }

    @Override // defpackage.no7
    public final no7 h(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(bl4.q(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.a;
        }
        if (i2 == 1) {
            return this.b;
        }
        throw new IllegalStateException("Unreached");
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 710441009) * 31);
    }

    @Override // defpackage.no7
    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(bl4.q(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // defpackage.no7
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.a + ", " + this.b + ')';
    }
}
