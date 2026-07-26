package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s05 implements jr2 {
    public static final s05 a;
    private static final no7 descriptor;

    static {
        s05 s05Var = new s05();
        a = s05Var;
        ug6 ug6Var = new ug6("ir.myket.movie.common.model.dto.MovieCreditDto", s05Var, 2);
        ug6Var.j("start", false);
        ug6Var.j("end", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        xq3 xq3Var = xq3.a;
        return new px3[]{xq3Var, xq3Var};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        boolean z = true;
        int i = 0;
        int iT = 0;
        int iT2 = 0;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                iT = tz0VarC.t(no7Var, 0);
                i |= 1;
            } else {
                if (i2 != 1) {
                    throw new UnknownFieldException(i2);
                }
                iT2 = tz0VarC.t(no7Var, 1);
                i |= 2;
            }
        }
        tz0VarC.a(no7Var);
        return new u05(i, iT, iT2);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        u05 u05Var = (u05) obj;
        js3.p(u05Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        uz0VarC.v(0, u05Var.a, no7Var);
        uz0VarC.v(1, u05Var.b, no7Var);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
