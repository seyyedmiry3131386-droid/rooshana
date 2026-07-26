package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yl0 implements jr2 {
    public static final yl0 a;
    private static final no7 descriptor;

    static {
        yl0 yl0Var = new yl0();
        a = yl0Var;
        ug6 ug6Var = new ug6("ir.myket.callback.analytics.model.CallbackUrlSpixRequestData", yl0Var, 6);
        ug6Var.j("type", false);
        ug6Var.j("url", false);
        ug6Var.j("count", false);
        ug6Var.j("httpStatus", false);
        ug6Var.j("host", false);
        ug6Var.j("ip", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        b88 b88Var = b88.a;
        px3 px3VarN = ct2.n(b88Var);
        px3 px3VarN2 = ct2.n(b88Var);
        xq3 xq3Var = xq3.a;
        return new px3[]{b88Var, b88Var, xq3Var, xq3Var, px3VarN, px3VarN2};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        int i = 0;
        int iT = 0;
        int iT2 = 0;
        String strO = null;
        String strO2 = null;
        String str = null;
        String str2 = null;
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
                    iT = tz0VarC.t(no7Var, 2);
                    i |= 4;
                    break;
                case 3:
                    iT2 = tz0VarC.t(no7Var, 3);
                    i |= 8;
                    break;
                case 4:
                    str = (String) tz0VarC.z(no7Var, 4, b88.a, str);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) tz0VarC.z(no7Var, 5, b88.a, str2);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(i2);
            }
        }
        tz0VarC.a(no7Var);
        return new am0(i, strO, strO2, iT, iT2, str, str2);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        am0 am0Var = (am0) obj;
        js3.p(am0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        uz0VarC.w(no7Var, 0, am0Var.a);
        uz0VarC.w(no7Var, 1, am0Var.b);
        uz0VarC.v(2, am0Var.c, no7Var);
        uz0VarC.v(3, am0Var.d, no7Var);
        b88 b88Var = b88.a;
        uz0VarC.z(no7Var, 4, b88Var, am0Var.e);
        uz0VarC.z(no7Var, 5, b88Var, am0Var.f);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
