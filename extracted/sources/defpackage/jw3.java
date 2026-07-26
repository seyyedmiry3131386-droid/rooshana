package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes3.dex */
public final class jw3 extends u0 {
    public final kv3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw3(pu3 pu3Var, kv3 kv3Var, String str) {
        super(pu3Var, str);
        js3.p(pu3Var, "json");
        js3.p(kv3Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f = kv3Var;
        this.a.add("primitive");
    }

    @Override // defpackage.u0
    public final kv3 S() {
        return this.f;
    }

    @Override // defpackage.u0
    public final kv3 d(String str) {
        js3.p(str, "tag");
        if (str == "primitive") {
            return this.f;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // defpackage.tz0
    public final int i(no7 no7Var) {
        js3.p(no7Var, "descriptor");
        return 0;
    }
}
