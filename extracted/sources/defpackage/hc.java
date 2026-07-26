package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hc implements jr2 {
    public static final hc a;
    private static final no7 descriptor;

    static {
        hc hcVar = new hc();
        a = hcVar;
        ug6 ug6Var = new ug6("ir.myket.movie.common.model.dto.AddaxBoxDto", hcVar, 8);
        ug6Var.j("id", false);
        ug6Var.j("type", false);
        ug6Var.j("title", false);
        ug6Var.j("message", false);
        ug6Var.j("iconUrl", false);
        ug6Var.j("actionText", false);
        ug6Var.j("actionIntent", false);
        ug6Var.j("displayMode", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        b88 b88Var = b88.a;
        return new px3[]{b88Var, b88Var, ct2.n(b88Var), ct2.n(b88Var), ct2.n(b88Var), ct2.n(b88Var), ct2.n(b88Var), ct2.n(b88Var)};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        int i = 0;
        String strO = null;
        String strO2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
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
                    str = (String) tz0VarC.z(no7Var, 2, b88.a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) tz0VarC.z(no7Var, 3, b88.a, str2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) tz0VarC.z(no7Var, 4, b88.a, str3);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) tz0VarC.z(no7Var, 5, b88.a, str4);
                    i |= 32;
                    break;
                case 6:
                    str5 = (String) tz0VarC.z(no7Var, 6, b88.a, str5);
                    i |= 64;
                    break;
                case 7:
                    str6 = (String) tz0VarC.z(no7Var, 7, b88.a, str6);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(i2);
            }
        }
        tz0VarC.a(no7Var);
        return new jc(i, strO, strO2, str, str2, str3, str4, str5, str6);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        jc jcVar = (jc) obj;
        js3.p(jcVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        uz0VarC.w(no7Var, 0, jcVar.a);
        uz0VarC.w(no7Var, 1, jcVar.b);
        b88 b88Var = b88.a;
        uz0VarC.z(no7Var, 2, b88Var, jcVar.c);
        uz0VarC.z(no7Var, 3, b88Var, jcVar.d);
        uz0VarC.z(no7Var, 4, b88Var, jcVar.e);
        uz0VarC.z(no7Var, 5, b88Var, jcVar.f);
        uz0VarC.z(no7Var, 6, b88Var, jcVar.g);
        uz0VarC.z(no7Var, 7, b88Var, jcVar.h);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
