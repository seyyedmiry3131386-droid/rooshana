package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wc7 implements jr2 {
    public static final wc7 a;
    private static final no7 descriptor;

    static {
        wc7 wc7Var = new wc7();
        a = wc7Var;
        ug6 ug6Var = new ug6("ir.myket.movie.common.model.dto.SampleWatchDto", wc7Var, 5);
        ug6Var.j("boxTitle", false);
        ug6Var.j("hint", false);
        ug6Var.j("dialogTitle", false);
        ug6Var.j("dialogDescription", false);
        ug6Var.j("primaryButton", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        b88 b88Var = b88.a;
        return new px3[]{ct2.n(b88Var), ct2.n(b88Var), ct2.n(b88Var), ct2.n(b88Var), ct2.n(x77.a)};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        z77 z77Var = null;
        boolean z = true;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                str = (String) tz0VarC.z(no7Var, 0, b88.a, str);
                i |= 1;
            } else if (i2 == 1) {
                str2 = (String) tz0VarC.z(no7Var, 1, b88.a, str2);
                i |= 2;
            } else if (i2 == 2) {
                str3 = (String) tz0VarC.z(no7Var, 2, b88.a, str3);
                i |= 4;
            } else if (i2 == 3) {
                str4 = (String) tz0VarC.z(no7Var, 3, b88.a, str4);
                i |= 8;
            } else {
                if (i2 != 4) {
                    throw new UnknownFieldException(i2);
                }
                z77Var = (z77) tz0VarC.z(no7Var, 4, x77.a, z77Var);
                i |= 16;
            }
        }
        tz0VarC.a(no7Var);
        return new yc7(i, str, str2, str3, str4, z77Var);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        yc7 yc7Var = (yc7) obj;
        js3.p(yc7Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        b88 b88Var = b88.a;
        uz0VarC.z(no7Var, 0, b88Var, yc7Var.a);
        uz0VarC.z(no7Var, 1, b88Var, yc7Var.b);
        uz0VarC.z(no7Var, 2, b88Var, yc7Var.c);
        uz0VarC.z(no7Var, 3, b88Var, yc7Var.d);
        uz0VarC.z(no7Var, 4, x77.a, yc7Var.e);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
