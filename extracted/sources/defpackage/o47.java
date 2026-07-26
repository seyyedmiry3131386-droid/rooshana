package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o47 implements jr2 {
    public static final o47 a;
    private static final no7 descriptor;

    static {
        o47 o47Var = new o47();
        a = o47Var;
        ug6 ug6Var = new ug6("ir.myket.player.data.models.ReportPlayerErrorRequestDto", o47Var, 2);
        ug6Var.j("id", false);
        ug6Var.j(ConfirmDTO.INPUT_TYPE_TEXT, false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        return new px3[]{xq3.a, b88.a};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        String strO = null;
        boolean z = true;
        int i = 0;
        int iT = 0;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                iT = tz0VarC.t(no7Var, 0);
                i |= 1;
            } else {
                if (i2 != 1) {
                    throw new UnknownFieldException(i2);
                }
                strO = tz0VarC.o(no7Var, 1);
                i |= 2;
            }
        }
        tz0VarC.a(no7Var);
        return new q47(strO, i, iT);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        q47 q47Var = (q47) obj;
        js3.p(q47Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        uz0VarC.v(0, q47Var.a, no7Var);
        uz0VarC.w(no7Var, 1, q47Var.b);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
