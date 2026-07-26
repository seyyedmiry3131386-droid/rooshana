package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class nv3 implements px3 {
    public static final nv3 a = new nv3();
    public static final po7 b = z27.c("kotlinx.serialization.json.JsonElement", oh6.c, new no7[0], new us3(2));

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        return ml9.h(cc1Var).m();
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return b;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        kv3 kv3Var = (kv3) obj;
        js3.p(kv3Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        ml9.g(q12Var);
        if (kv3Var instanceof hw3) {
            q12Var.g(lw3.a, kv3Var);
        } else if (kv3Var instanceof cw3) {
            q12Var.g(fw3.a, kv3Var);
        } else {
            if (!(kv3Var instanceof uu3)) {
                throw new NoWhenBranchMatchedException();
            }
            q12Var.g(xu3.a, kv3Var);
        }
    }
}
