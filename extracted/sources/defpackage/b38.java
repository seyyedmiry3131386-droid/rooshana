package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b38 implements jr2 {
    public static final b38 a;
    private static final no7 descriptor;

    static {
        b38 b38Var = new b38();
        a = b38Var;
        ug6 ug6Var = new ug6("ir.myket.analytics.spix.data.models.SpixUserRequestDto", b38Var, 6);
        ug6Var.j("accountId", false);
        ug6Var.j("uuid", false);
        ug6Var.j("device", false);
        ug6Var.j("manufacturer", false);
        ug6Var.j("android", false);
        ug6Var.j("cpuAbis", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        b88 b88Var = b88.a;
        return new px3[]{b88Var, b88Var, b88Var, b88Var, b88Var, b88Var};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        int i = 0;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        String strO5 = null;
        String strO6 = null;
        boolean z = true;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            switch (i2) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strO = tz0VarC.o(no7Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strO2 = tz0VarC.o(no7Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strO3 = tz0VarC.o(no7Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strO4 = tz0VarC.o(no7Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strO5 = tz0VarC.o(no7Var, 4);
                    i |= 16;
                    break;
                case 5:
                    strO6 = tz0VarC.o(no7Var, 5);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(i2);
            }
        }
        tz0VarC.a(no7Var);
        return new d38(i, strO, strO2, strO3, strO4, strO5, strO6);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        d38 d38Var = (d38) obj;
        js3.p(d38Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        uz0VarC.w(no7Var, 0, d38Var.a);
        uz0VarC.w(no7Var, 1, d38Var.b);
        uz0VarC.w(no7Var, 2, d38Var.c);
        uz0VarC.w(no7Var, 3, d38Var.d);
        uz0VarC.w(no7Var, 4, d38Var.e);
        uz0VarC.w(no7Var, 5, d38Var.f);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
