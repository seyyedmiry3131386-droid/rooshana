package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yf6 implements jr2 {
    public static final yf6 a;
    private static final no7 descriptor;

    static {
        yf6 yf6Var = new yf6();
        a = yf6Var;
        ug6 ug6Var = new ug6("ir.myket.player.core.analytics.models.PlayerSpixRequestData", yf6Var, 9);
        ug6Var.j("movieId", false);
        ug6Var.j("playId", false);
        ug6Var.j("mainUri", false);
        ug6Var.j("playerType", false);
        ug6Var.j("position", false);
        ug6Var.j("errorType", false);
        ug6Var.j("uri", false);
        ug6Var.j("httpStatus", false);
        ug6Var.j("message", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        b88 b88Var = b88.a;
        px3 px3VarN = ct2.n(b88Var);
        xq3 xq3Var = xq3.a;
        return new px3[]{b88Var, b88Var, b88Var, b88Var, xq3Var, b88Var, b88Var, xq3Var, px3VarN};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        String strO5 = null;
        String strO6 = null;
        String str = null;
        int i = 0;
        int iT = 0;
        int iT2 = 0;
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
                    iT = tz0VarC.t(no7Var, 4);
                    i |= 16;
                    break;
                case 5:
                    strO5 = tz0VarC.o(no7Var, 5);
                    i |= 32;
                    break;
                case 6:
                    strO6 = tz0VarC.o(no7Var, 6);
                    i |= 64;
                    break;
                case 7:
                    iT2 = tz0VarC.t(no7Var, 7);
                    i |= 128;
                    break;
                case 8:
                    str = (String) tz0VarC.z(no7Var, 8, b88.a, str);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(i2);
            }
        }
        tz0VarC.a(no7Var);
        return new ag6(i, strO, strO2, strO3, strO4, iT, strO5, strO6, iT2, str);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        ag6 ag6Var = (ag6) obj;
        js3.p(ag6Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        uz0VarC.w(no7Var, 0, ag6Var.a);
        uz0VarC.w(no7Var, 1, ag6Var.b);
        uz0VarC.w(no7Var, 2, ag6Var.c);
        uz0VarC.w(no7Var, 3, ag6Var.d);
        uz0VarC.v(4, ag6Var.e, no7Var);
        uz0VarC.w(no7Var, 5, ag6Var.f);
        uz0VarC.w(no7Var, 6, ag6Var.g);
        uz0VarC.v(7, ag6Var.h, no7Var);
        uz0VarC.z(no7Var, 8, b88.a, ag6Var.i);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
