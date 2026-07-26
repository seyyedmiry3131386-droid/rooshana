package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y9 implements jr2 {
    public static final y9 a;
    private static final no7 descriptor;

    static {
        y9 y9Var = new y9();
        a = y9Var;
        ug6 ug6Var = new ug6("ir.myket.player.data.models.AdEndCardDto", y9Var, 5);
        ug6Var.j("url", false);
        ug6Var.j("duration", false);
        ug6Var.j("viewCallback", false);
        ug6Var.j("clickCallback", false);
        ug6Var.j("dismissCallback", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        b88 b88Var = b88.a;
        return new px3[]{ct2.n(b88Var), ct2.n(xq3.a), ct2.n(b88Var), ct2.n(b88Var), ct2.n(b88Var)};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        int i = 0;
        String str = null;
        Integer num = null;
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
                num = (Integer) tz0VarC.z(no7Var, 1, xq3.a, num);
                i |= 2;
            } else if (i2 == 2) {
                str2 = (String) tz0VarC.z(no7Var, 2, b88.a, str2);
                i |= 4;
            } else if (i2 == 3) {
                str3 = (String) tz0VarC.z(no7Var, 3, b88.a, str3);
                i |= 8;
            } else {
                if (i2 != 4) {
                    throw new UnknownFieldException(i2);
                }
                str4 = (String) tz0VarC.z(no7Var, 4, b88.a, str4);
                i |= 16;
            }
        }
        tz0VarC.a(no7Var);
        return new aa(i, str, num, str2, str3, str4);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        aa aaVar = (aa) obj;
        js3.p(aaVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        b88 b88Var = b88.a;
        uz0VarC.z(no7Var, 0, b88Var, aaVar.a);
        uz0VarC.z(no7Var, 1, xq3.a, aaVar.b);
        uz0VarC.z(no7Var, 2, b88Var, aaVar.c);
        uz0VarC.z(no7Var, 3, b88Var, aaVar.d);
        uz0VarC.z(no7Var, 4, b88Var, aaVar.e);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
