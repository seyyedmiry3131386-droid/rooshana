package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ut7 implements jr2 {
    public static final ut7 a;
    private static final no7 descriptor;

    static {
        ut7 ut7Var = new ut7();
        a = ut7Var;
        ug6 ug6Var = new ug6("ir.myket.movie.common.model.dto.ShareModelDto", ut7Var, 2);
        ug6Var.j("url", false);
        ug6Var.j("title", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        b88 b88Var = b88.a;
        return new px3[]{b88Var, b88Var};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        String strO = null;
        boolean z = true;
        int i = 0;
        String strO2 = null;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                strO = tz0VarC.o(no7Var, 0);
                i |= 1;
            } else {
                if (i2 != 1) {
                    throw new UnknownFieldException(i2);
                }
                strO2 = tz0VarC.o(no7Var, 1);
                i |= 2;
            }
        }
        tz0VarC.a(no7Var);
        return new yt7(i, strO, strO2);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        yt7 yt7Var = (yt7) obj;
        js3.p(yt7Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        uz0VarC.w(no7Var, 0, yt7Var.a);
        uz0VarC.w(no7Var, 1, yt7Var.b);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
