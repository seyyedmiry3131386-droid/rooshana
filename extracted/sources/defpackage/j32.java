package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ir.myket.network.model.ErrorDto;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j32 implements jr2 {
    public static final j32 a;
    private static final no7 descriptor;

    static {
        j32 j32Var = new j32();
        a = j32Var;
        ug6 ug6Var = new ug6("ir.myket.network.model.ErrorDto", j32Var, 4);
        ug6Var.j("messageCode", false);
        ug6Var.j("code", false);
        ug6Var.j("translatedMessage", true);
        ug6Var.j("httpStatus", true);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        b88 b88Var = b88.a;
        px3 px3VarN = ct2.n(b88Var);
        xq3 xq3Var = xq3.a;
        return new px3[]{px3VarN, ct2.n(xq3Var), ct2.n(b88Var), xq3Var};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        int i = 0;
        int iT = 0;
        String str = null;
        Integer num = null;
        String str2 = null;
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
            } else {
                if (i2 != 3) {
                    throw new UnknownFieldException(i2);
                }
                iT = tz0VarC.t(no7Var, 3);
                i |= 8;
            }
        }
        tz0VarC.a(no7Var);
        return new ErrorDto(i, str, num, str2, iT, (to7) null);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        ErrorDto errorDto = (ErrorDto) obj;
        js3.p(errorDto, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        ErrorDto.write$Self$network_release(errorDto, uz0VarC, no7Var);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
