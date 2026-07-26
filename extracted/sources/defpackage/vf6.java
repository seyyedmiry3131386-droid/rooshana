package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ir.myket.player.domain.models.PlayerMovie;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vf6 implements jr2 {
    public static final vf6 a;
    private static final no7 descriptor;

    static {
        vf6 vf6Var = new vf6();
        a = vf6Var;
        ug6 ug6Var = new ug6("ir.myket.player.domain.models.PlayerRequestData", vf6Var, 5);
        ug6Var.j("moviePlayId", false);
        ug6Var.j("moviePlayerData", false);
        ug6Var.j("movieRefId", false);
        ug6Var.j("loadProgressState", true);
        ug6Var.j("jumpToFirstEpisode", true);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        b88 b88Var = b88.a;
        px3 px3VarN = ct2.n(b88Var);
        ee0 ee0Var = ee0.a;
        return new px3[]{b88Var, me6.a, px3VarN, ee0Var, ee0Var};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        int i = 0;
        boolean zA = false;
        boolean zA2 = false;
        String strO = null;
        PlayerMovie playerMovie = null;
        String str = null;
        boolean z = true;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                strO = tz0VarC.o(no7Var, 0);
                i |= 1;
            } else if (i2 == 1) {
                playerMovie = (PlayerMovie) tz0VarC.s(no7Var, 1, me6.a, playerMovie);
                i |= 2;
            } else if (i2 == 2) {
                str = (String) tz0VarC.z(no7Var, 2, b88.a, str);
                i |= 4;
            } else if (i2 == 3) {
                zA = tz0VarC.A(no7Var, 3);
                i |= 8;
            } else {
                if (i2 != 4) {
                    throw new UnknownFieldException(i2);
                }
                zA2 = tz0VarC.A(no7Var, 4);
                i |= 16;
            }
        }
        tz0VarC.a(no7Var);
        return new xf6(i, strO, playerMovie, str, zA, zA2);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        xf6 xf6Var = (xf6) obj;
        js3.p(xf6Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        String str = xf6Var.a;
        boolean z = xf6Var.e;
        boolean z2 = xf6Var.d;
        uz0VarC.w(no7Var, 0, str);
        uz0VarC.o(no7Var, 1, me6.a, xf6Var.b);
        uz0VarC.z(no7Var, 2, b88.a, xf6Var.c);
        if (uz0VarC.f(no7Var) || !z2) {
            uz0VarC.n(no7Var, 3, z2);
        }
        if (uz0VarC.f(no7Var) || z) {
            uz0VarC.n(no7Var, 4, z);
        }
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
