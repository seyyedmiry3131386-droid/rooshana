package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class d84 extends b47 {
    public final ps0 d;
    public final Object e;
    public final b47 f;

    public d84(ps0 ps0Var, Object obj, b47 b47Var) {
        js3.p(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        js3.p(b47Var, "next");
        this.d = ps0Var;
        this.e = obj;
        this.f = b47Var;
    }

    @Override // defpackage.b47
    public final Object e(ps0 ps0Var) {
        return ps0Var.equals(this.d) ? yh0.u(ps0Var).cast(this.e) : this.f.e(ps0Var);
    }

    @Override // defpackage.b47
    public final b47 i(ps0 ps0Var, Object obj) {
        ps0 ps0Var2 = this.d;
        boolean zEquals = ps0Var.equals(ps0Var2);
        b47 d84Var = this.f;
        if (!zEquals) {
            b47 b47VarI = d84Var.i(ps0Var, null);
            d84Var = b47VarI == d84Var ? this : new d84(ps0Var2, this.e, b47VarI);
        }
        return obj != null ? new d84(ps0Var, obj, d84Var) : d84Var;
    }

    public final String toString() {
        return a.t0(a.H0(mo7.w(mo7.s(new us3(10), this))), null, "{", "}", new us3(11), 25);
    }
}
