package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h75 implements jr2 {
    public static final h75 a;
    private static final no7 descriptor;

    static {
        h75 h75Var = new h75();
        a = h75Var;
        ug6 ug6Var = new ug6("ir.myket.movie.common.model.dto.MovieSummaryDto", h75Var, 3);
        ug6Var.j("type", false);
        ug6Var.j(ConfirmDTO.INPUT_TYPE_TEXT, false);
        ug6Var.j("icon", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        return new px3[]{ct2.n(b88.a), ct2.n(p75.a), ct2.n(l75.a)};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        String str = null;
        boolean z = true;
        int i = 0;
        r75 r75Var = null;
        n75 n75Var = null;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                str = (String) tz0VarC.z(no7Var, 0, b88.a, str);
                i |= 1;
            } else if (i2 == 1) {
                r75Var = (r75) tz0VarC.z(no7Var, 1, p75.a, r75Var);
                i |= 2;
            } else {
                if (i2 != 2) {
                    throw new UnknownFieldException(i2);
                }
                n75Var = (n75) tz0VarC.z(no7Var, 2, l75.a, n75Var);
                i |= 4;
            }
        }
        tz0VarC.a(no7Var);
        return new j75(i, str, r75Var, n75Var);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        j75 j75Var = (j75) obj;
        js3.p(j75Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        uz0VarC.z(no7Var, 0, b88.a, j75Var.a);
        uz0VarC.z(no7Var, 1, p75.a, j75Var.b);
        uz0VarC.z(no7Var, 2, l75.a, j75Var.c);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
