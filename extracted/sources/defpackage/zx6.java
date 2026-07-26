package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zx6 implements jr2 {
    public static final zx6 a;
    private static final no7 descriptor;

    static {
        zx6 zx6Var = new zx6();
        a = zx6Var;
        ug6 ug6Var = new ug6("ir.myket.movie.common.model.dto.RecommendationTimeDto", zx6Var, 1);
        ug6Var.j("second", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        return new px3[]{xq3.a};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        boolean z = true;
        int i = 0;
        int iT = 0;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            if (i2 == -1) {
                z = false;
            } else {
                if (i2 != 0) {
                    throw new UnknownFieldException(i2);
                }
                iT = tz0VarC.t(no7Var, 0);
                i = 1;
            }
        }
        tz0VarC.a(no7Var);
        return new by6(i, iT);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        by6 by6Var = (by6) obj;
        js3.p(by6Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        uz0VarC.v(0, by6Var.a, no7Var);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
