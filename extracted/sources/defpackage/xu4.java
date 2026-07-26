package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xu4 implements jr2 {
    public static final xu4 a;
    private static final no7 descriptor;

    static {
        xu4 xu4Var = new xu4();
        a = xu4Var;
        ug6 ug6Var = new ug6("ir.myket.movie.common.model.dto.MessageBoxDto", xu4Var, 3);
        ug6Var.j(ConfirmDTO.INPUT_TYPE_TEXT, false);
        ug6Var.j("iconUrl", false);
        ug6Var.j("lineColor", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        b88 b88Var = b88.a;
        return new px3[]{b88Var, ct2.n(b88Var), ct2.n(b88Var)};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        String strO = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                strO = tz0VarC.o(no7Var, 0);
                i |= 1;
            } else if (i2 == 1) {
                str = (String) tz0VarC.z(no7Var, 1, b88.a, str);
                i |= 2;
            } else {
                if (i2 != 2) {
                    throw new UnknownFieldException(i2);
                }
                str2 = (String) tz0VarC.z(no7Var, 2, b88.a, str2);
                i |= 4;
            }
        }
        tz0VarC.a(no7Var);
        return new zu4(strO, i, str, str2);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        zu4 zu4Var = (zu4) obj;
        js3.p(zu4Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        uz0VarC.w(no7Var, 0, zu4Var.a);
        b88 b88Var = b88.a;
        uz0VarC.z(no7Var, 1, b88Var, zu4Var.b);
        uz0VarC.z(no7Var, 2, b88Var, zu4Var.c);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
