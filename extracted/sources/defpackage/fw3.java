package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class fw3 implements px3 {
    public static final fw3 a = new fw3();
    public static final ew3 b = ew3.b;

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        ml9.h(cc1Var);
        return new cw3((Map) ct2.e(b88.a, nv3.a).deserialize(cc1Var));
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return b;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        cw3 cw3Var = (cw3) obj;
        js3.p(cw3Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        ml9.g(q12Var);
        ct2.e(b88.a, nv3.a).serialize(q12Var, cw3Var);
    }
}
