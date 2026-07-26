package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public final class br5 implements px3 {
    public final Object a;
    public final List b;
    public final Object c;

    public br5(String str, Object obj) {
        js3.p(obj, "objectInstance");
        this.a = obj;
        this.b = EmptyList.a;
        this.c = a.b(LazyThreadSafetyMode.b, new xv3(str, this, 11));
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 descriptor = getDescriptor();
        tz0 tz0VarC = cc1Var.c(descriptor);
        int i = tz0VarC.i(getDescriptor());
        if (i != -1) {
            throw new SerializationException(rm7.n(i, "Unexpected index "));
        }
        tz0VarC.a(descriptor);
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return (no7) this.c.getValue();
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        js3.p(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        q12Var.c(getDescriptor()).a(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public br5(String str, kj5 kj5Var, Annotation[] annotationArr) {
        this(str, kj5Var);
        js3.p(kj5Var, "objectInstance");
        this.b = ew.r0(annotationArr);
    }
}
