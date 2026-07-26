package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m71 implements jr2 {
    public static final m71 a;
    private static final no7 descriptor;

    static {
        m71 m71Var = new m71();
        a = m71Var;
        ug6 ug6Var = new ug6("ir.myket.movie.common.model.dto.CreditsDto", m71Var, 2);
        ug6Var.j("openingCredit", false);
        ug6Var.j("closingCredit", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        s05 s05Var = s05.a;
        return new px3[]{ct2.n(s05Var), ct2.n(s05Var)};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        u05 u05Var = null;
        boolean z = true;
        int i = 0;
        u05 u05Var2 = null;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                u05Var = (u05) tz0VarC.z(no7Var, 0, s05.a, u05Var);
                i |= 1;
            } else {
                if (i2 != 1) {
                    throw new UnknownFieldException(i2);
                }
                u05Var2 = (u05) tz0VarC.z(no7Var, 1, s05.a, u05Var2);
                i |= 2;
            }
        }
        tz0VarC.a(no7Var);
        return new o71(i, u05Var, u05Var2);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        o71 o71Var = (o71) obj;
        js3.p(o71Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        s05 s05Var = s05.a;
        uz0VarC.z(no7Var, 0, s05Var, o71Var.a);
        uz0VarC.z(no7Var, 1, s05Var, o71Var.b);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
