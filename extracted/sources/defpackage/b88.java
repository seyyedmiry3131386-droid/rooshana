package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes3.dex */
public final class b88 implements px3 {
    public static final b88 a = new b88();
    public static final bk6 b = new bk6("kotlin.String", xj6.j);

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        return cc1Var.v();
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return b;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        String str = (String) obj;
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        q12Var.C(str);
    }
}
