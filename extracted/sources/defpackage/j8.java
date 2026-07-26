package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j8 implements jr2 {
    public static final j8 a;
    private static final no7 descriptor;

    static {
        j8 j8Var = new j8();
        a = j8Var;
        ug6 ug6Var = new ug6("ir.myket.player.data.models.AdAppInfoDto", j8Var, 2);
        ug6Var.j("collapseOffset", false);
        ug6Var.j("app", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        return new px3[]{ct2.n(xq3.a), n8.a};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        Integer num = null;
        boolean z = true;
        int i = 0;
        p8 p8Var = null;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                num = (Integer) tz0VarC.z(no7Var, 0, xq3.a, num);
                i |= 1;
            } else {
                if (i2 != 1) {
                    throw new UnknownFieldException(i2);
                }
                p8Var = (p8) tz0VarC.s(no7Var, 1, n8.a, p8Var);
                i |= 2;
            }
        }
        tz0VarC.a(no7Var);
        return new l8(i, num, p8Var);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        l8 l8Var = (l8) obj;
        js3.p(l8Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        uz0VarC.z(no7Var, 0, xq3.a, l8Var.a);
        uz0VarC.o(no7Var, 1, n8.a, l8Var.b);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
