package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a94 implements no7 {
    public final no7 a;

    public a94(no7 no7Var) {
        this.a = no7Var;
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
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
    }

    @Override // defpackage.no7
    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a94)) {
            return false;
        }
        a94 a94Var = (a94) obj;
        return js3.i(this.a, a94Var.a) && js3.i(a(), a94Var.a());
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
        StringBuilder sbR = rm7.r(i, "Illegal index ", ", ");
        sbR.append(a());
        sbR.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbR.toString().toString());
    }

    @Override // defpackage.no7
    public final List getAnnotations() {
        return EmptyList.a;
    }

    @Override // defpackage.no7
    public final o37 getKind() {
        return g98.c;
    }

    @Override // defpackage.no7
    public final no7 h(int i) {
        if (i >= 0) {
            return this.a;
        }
        StringBuilder sbR = rm7.r(i, "Illegal index ", ", ");
        sbR.append(a());
        sbR.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbR.toString().toString());
    }

    public final int hashCode() {
        return a().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.no7
    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder sbR = rm7.r(i, "Illegal index ", ", ");
        sbR.append(a());
        sbR.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbR.toString().toString());
    }

    @Override // defpackage.no7
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return a() + '(' + this.a + ')';
    }
}
