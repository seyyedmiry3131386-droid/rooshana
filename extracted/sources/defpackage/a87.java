package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a87 implements jr2 {
    public static final a87 a;
    private static final no7 descriptor;

    static {
        a87 a87Var = new a87();
        a = a87Var;
        ug6 ug6Var = new ug6("ir.myket.movie.common.model.dto.RestrictionInfoDto", a87Var, 5);
        ug6Var.j("iconUrl", false);
        ug6Var.j("title", false);
        ug6Var.j(PackageListMetaDataDTO.KEY_DESCRIPTION, false);
        ug6Var.j("primaryButton", false);
        ug6Var.j("secondaryButton", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        b88 b88Var = b88.a;
        px3 px3VarN = ct2.n(b88Var);
        px3 px3VarN2 = ct2.n(b88Var);
        x77 x77Var = x77.a;
        return new px3[]{px3VarN, px3VarN2, b88Var, ct2.n(x77Var), ct2.n(x77Var)};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        int i = 0;
        String str = null;
        String str2 = null;
        String strO = null;
        z77 z77Var = null;
        z77 z77Var2 = null;
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
                strO = tz0VarC.o(no7Var, 2);
                i |= 4;
            } else if (i2 == 3) {
                z77Var = (z77) tz0VarC.z(no7Var, 3, x77.a, z77Var);
                i |= 8;
            } else {
                if (i2 != 4) {
                    throw new UnknownFieldException(i2);
                }
                z77Var2 = (z77) tz0VarC.z(no7Var, 4, x77.a, z77Var2);
                i |= 16;
            }
        }
        tz0VarC.a(no7Var);
        return new c87(i, str, str2, strO, z77Var, z77Var2);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        c87 c87Var = (c87) obj;
        js3.p(c87Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        b88 b88Var = b88.a;
        uz0VarC.z(no7Var, 0, b88Var, c87Var.a);
        uz0VarC.z(no7Var, 1, b88Var, c87Var.b);
        uz0VarC.w(no7Var, 2, c87Var.c);
        x77 x77Var = x77.a;
        uz0VarC.z(no7Var, 3, x77Var, c87Var.d);
        uz0VarC.z(no7Var, 4, x77Var, c87Var.e);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
