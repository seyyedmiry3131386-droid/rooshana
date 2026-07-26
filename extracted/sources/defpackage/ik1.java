package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ik1 implements jr2 {
    public static final ik1 a;
    private static final no7 descriptor;

    static {
        ik1 ik1Var = new ik1();
        a = ik1Var;
        ug6 ug6Var = new ug6("ir.myket.movie.common.model.dto.DetailStreamerDto", ik1Var, 3);
        ug6Var.j("title", false);
        ug6Var.j("avatarUrl", false);
        ug6Var.j("streamerKey", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        b88 b88Var = b88.a;
        return new px3[]{b88Var, b88Var, b88Var};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        String strO = null;
        boolean z = true;
        int i = 0;
        String strO2 = null;
        String strO3 = null;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                strO = tz0VarC.o(no7Var, 0);
                i |= 1;
            } else if (i2 == 1) {
                strO2 = tz0VarC.o(no7Var, 1);
                i |= 2;
            } else {
                if (i2 != 2) {
                    throw new UnknownFieldException(i2);
                }
                strO3 = tz0VarC.o(no7Var, 2);
                i |= 4;
            }
        }
        tz0VarC.a(no7Var);
        return new kk1(strO, i, strO2, strO3);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        kk1 kk1Var = (kk1) obj;
        js3.p(kk1Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        uz0VarC.w(no7Var, 0, kk1Var.a);
        uz0VarC.w(no7Var, 1, kk1Var.b);
        uz0VarC.w(no7Var, 2, kk1Var.c);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
