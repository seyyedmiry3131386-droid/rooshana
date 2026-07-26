package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public final class vo5 implements px3 {
    public static final vo5 a = new vo5();
    public static final uo5 b = uo5.a;

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return b;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        js3.p((Void) obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }
}
