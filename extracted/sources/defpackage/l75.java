package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l75 implements jr2 {
    public static final l75 a;
    private static final no7 descriptor;

    static {
        l75 l75Var = new l75();
        a = l75Var;
        ug6 ug6Var = new ug6("ir.myket.movie.common.model.dto.MovieSummaryIconDto", l75Var, 4);
        ug6Var.j("title", false);
        ug6Var.j("iconUrl", false);
        ug6Var.j("iconTint", false);
        ug6Var.j(PackageListMetaDataDTO.KEY_BG, false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        b88 b88Var = b88.a;
        return new px3[]{ct2.n(b88Var), ct2.n(b88Var), ct2.n(b88Var), ct2.n(b88Var)};
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
            } else {
                if (i2 != 3) {
                    throw new UnknownFieldException(i2);
                }
                str4 = (String) tz0VarC.z(no7Var, 3, b88.a, str4);
                i |= 8;
            }
        }
        tz0VarC.a(no7Var);
        return new n75(i, str, str2, str3, str4);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        n75 n75Var = (n75) obj;
        js3.p(n75Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        b88 b88Var = b88.a;
        uz0VarC.z(no7Var, 0, b88Var, n75Var.a);
        uz0VarC.z(no7Var, 1, b88Var, n75Var.b);
        uz0VarC.z(no7Var, 2, b88Var, n75Var.c);
        uz0VarC.z(no7Var, 3, b88Var, n75Var.d);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
