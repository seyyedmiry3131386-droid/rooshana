package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w00 implements jr2 {
    public static final w00 a;
    private static final no7 descriptor;

    static {
        w00 w00Var = new w00();
        a = w00Var;
        ug6 ug6Var = new ug6("ir.myket.auth.model.dto.AuthDataDto", w00Var, 4);
        ug6Var.j("token", false);
        ug6Var.j("accountId", false);
        ug6Var.j("accountKey", false);
        ug6Var.j("hasPhoneBind", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        b88 b88Var = b88.a;
        return new px3[]{b88Var, b88Var, b88Var, ee0.a};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        int i = 0;
        boolean zA = false;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        boolean z = true;
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
            } else if (i2 == 2) {
                strO3 = tz0VarC.o(no7Var, 2);
                i |= 4;
            } else {
                if (i2 != 3) {
                    throw new UnknownFieldException(i2);
                }
                zA = tz0VarC.A(no7Var, 3);
                i |= 8;
            }
        }
        tz0VarC.a(no7Var);
        return new y00(i, strO, strO2, strO3, zA);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        y00 y00Var = (y00) obj;
        js3.p(y00Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        uz0VarC.w(no7Var, 0, y00Var.a);
        uz0VarC.w(no7Var, 1, y00Var.b);
        uz0VarC.w(no7Var, 2, y00Var.c);
        uz0VarC.n(no7Var, 3, y00Var.d);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
