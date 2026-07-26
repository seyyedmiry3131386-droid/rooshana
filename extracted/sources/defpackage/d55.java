package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d55 implements jr2 {
    public static final d55 a;
    private static final no7 descriptor;

    static {
        d55 d55Var = new d55();
        a = d55Var;
        ug6 ug6Var = new ug6("ir.myket.movie.common.model.dto.MovieReviewDto", d55Var, 9);
        ug6Var.j("id", false);
        ug6Var.j("avatarUrl", false);
        ug6Var.j("nickname", false);
        ug6Var.j("isLike", true);
        ug6Var.j("date", false);
        ug6Var.j("accountKey", false);
        ug6Var.j("positiveLikes", true);
        ug6Var.j("negativeLikes", true);
        ug6Var.j(ConfirmDTO.INPUT_TYPE_TEXT, false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        xq3 xq3Var = xq3.a;
        b88 b88Var = b88.a;
        return new px3[]{xq3Var, ct2.n(b88Var), b88Var, ee0.a, b88Var, ct2.n(b88Var), ct2.n(xq3Var), ct2.n(xq3Var), ct2.n(b88Var)};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        String str = null;
        String strO = null;
        String strO2 = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        String str3 = null;
        int i = 0;
        int iT = 0;
        boolean zA = false;
        boolean z = true;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            switch (i2) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iT = tz0VarC.t(no7Var, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) tz0VarC.z(no7Var, 1, b88.a, str);
                    i |= 2;
                    break;
                case 2:
                    strO = tz0VarC.o(no7Var, 2);
                    i |= 4;
                    break;
                case 3:
                    zA = tz0VarC.A(no7Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strO2 = tz0VarC.o(no7Var, 4);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) tz0VarC.z(no7Var, 5, b88.a, str2);
                    i |= 32;
                    break;
                case 6:
                    num = (Integer) tz0VarC.z(no7Var, 6, xq3.a, num);
                    i |= 64;
                    break;
                case 7:
                    num2 = (Integer) tz0VarC.z(no7Var, 7, xq3.a, num2);
                    i |= 128;
                    break;
                case 8:
                    str3 = (String) tz0VarC.z(no7Var, 8, b88.a, str3);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(i2);
            }
        }
        tz0VarC.a(no7Var);
        return new f55(i, iT, str, strO, zA, strO2, str2, num, num2, str3);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        f55 f55Var = (f55) obj;
        js3.p(f55Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        int i = f55Var.a;
        Integer num = f55Var.h;
        Integer num2 = f55Var.g;
        boolean z = f55Var.d;
        uz0VarC.v(0, i, no7Var);
        b88 b88Var = b88.a;
        uz0VarC.z(no7Var, 1, b88Var, f55Var.b);
        uz0VarC.w(no7Var, 2, f55Var.c);
        if (uz0VarC.f(no7Var) || !z) {
            uz0VarC.n(no7Var, 3, z);
        }
        uz0VarC.w(no7Var, 4, f55Var.e);
        uz0VarC.z(no7Var, 5, b88Var, f55Var.f);
        if (uz0VarC.f(no7Var) || num2 == null || num2.intValue() != 0) {
            uz0VarC.z(no7Var, 6, xq3.a, num2);
        }
        if (uz0VarC.f(no7Var) || num == null || num.intValue() != 0) {
            uz0VarC.z(no7Var, 7, xq3.a, num);
        }
        uz0VarC.z(no7Var, 8, b88Var, f55Var.i);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
