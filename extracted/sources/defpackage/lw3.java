package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes3.dex */
public final class lw3 implements px3 {
    public static final lw3 a = new lw3();
    public static final po7 b = z27.d("kotlinx.serialization.json.JsonPrimitive", xj6.j, new no7[0]);

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        kv3 kv3VarM = ml9.h(cc1Var).m();
        if (kv3VarM instanceof hw3) {
            return (hw3) kv3VarM;
        }
        throw br9.i(-1, kv3VarM.toString(), "Unexpected JSON element, expected JsonPrimitive, had " + g27.a(kv3VarM.getClass()));
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return b;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        hw3 hw3Var = (hw3) obj;
        js3.p(hw3Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        ml9.g(q12Var);
        if (hw3Var instanceof yv3) {
            q12Var.g(aw3.a, yv3.INSTANCE);
        } else {
            q12Var.g(vv3.a, (uv3) hw3Var);
        }
    }
}
