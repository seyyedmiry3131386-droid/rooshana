package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x77 implements jr2 {
    public static final x77 a;
    private static final no7 descriptor;

    static {
        x77 x77Var = new x77();
        a = x77Var;
        ug6 ug6Var = new ug6("ir.myket.movie.common.model.dto.RestrictionInfoButtonDto", x77Var, 2);
        ug6Var.j("actionText", false);
        ug6Var.j(PackageListMetaDataDTO.KEY_ACTION, false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        b88 b88Var = b88.a;
        return new px3[]{ct2.n(b88Var), ct2.n(b88Var)};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                str = (String) tz0VarC.z(no7Var, 0, b88.a, str);
                i |= 1;
            } else {
                if (i2 != 1) {
                    throw new UnknownFieldException(i2);
                }
                str2 = (String) tz0VarC.z(no7Var, 1, b88.a, str2);
                i |= 2;
            }
        }
        tz0VarC.a(no7Var);
        return new z77(i, str, str2);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        z77 z77Var = (z77) obj;
        js3.p(z77Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        b88 b88Var = b88.a;
        uz0VarC.z(no7Var, 0, b88Var, z77Var.a);
        uz0VarC.z(no7Var, 1, b88Var, z77Var.b);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
