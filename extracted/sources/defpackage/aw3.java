package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* JADX INFO: loaded from: classes3.dex */
public final class aw3 implements px3 {
    public static final aw3 a = new aw3();
    public static final po7 b = z27.d("kotlinx.serialization.json.JsonNull", ro7.b, new no7[0]);

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        ml9.h(cc1Var);
        if (cc1Var.y()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        return yv3.INSTANCE;
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return b;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        js3.p((yv3) obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        ml9.g(q12Var);
        q12Var.e();
    }
}
