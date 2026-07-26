package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yc6 implements jr2 {
    public static final yc6 a;
    private static final no7 descriptor;

    static {
        yc6 yc6Var = new yc6();
        a = yc6Var;
        ug6 ug6Var = new ug6("ir.myket.movie.common.model.dto.PlayerConfigDto", yc6Var, 2);
        ug6Var.j("minHeight", false);
        ug6Var.j("minBitrate", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        xq3 xq3Var = xq3.a;
        return new px3[]{ct2.n(xq3Var), ct2.n(xq3Var)};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        Integer num = null;
        boolean z = true;
        int i = 0;
        Integer num2 = null;
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
                num2 = (Integer) tz0VarC.z(no7Var, 1, xq3.a, num2);
                i |= 2;
            }
        }
        tz0VarC.a(no7Var);
        return new ad6(i, num, num2);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        ad6 ad6Var = (ad6) obj;
        js3.p(ad6Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        xq3 xq3Var = xq3.a;
        uz0VarC.z(no7Var, 0, xq3Var, ad6Var.a);
        uz0VarC.z(no7Var, 1, xq3Var, ad6Var.b);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
