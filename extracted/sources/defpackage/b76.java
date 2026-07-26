package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b76 implements jr2 {
    public static final b76 a;
    private static final no7 descriptor;

    static {
        b76 b76Var = new b76();
        a = b76Var;
        ug6 ug6Var = new ug6("ir.myket.movie.common.model.dto.PersonDto", b76Var, 1);
        ug6Var.j(AppMeasurementSdk.ConditionalUserProperty.NAME, false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        return new px3[]{b88.a};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        String strO = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            if (i2 == -1) {
                z = false;
            } else {
                if (i2 != 0) {
                    throw new UnknownFieldException(i2);
                }
                strO = tz0VarC.o(no7Var, 0);
                i = 1;
            }
        }
        tz0VarC.a(no7Var);
        return new d76(i, strO);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        d76 d76Var = (d76) obj;
        js3.p(d76Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        uz0VarC.w(no7Var, 0, d76Var.a);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
