package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yf7 implements jr2 {
    public static final yf7 a;
    private static final no7 descriptor;

    static {
        yf7 yf7Var = new yf7();
        a = yf7Var;
        ug6 ug6Var = new ug6("ir.myket.movie.common.model.dto.ScreenshotDto", yf7Var, 5);
        ug6Var.j("width", false);
        ug6Var.j("height", false);
        ug6Var.j("mainUrl", false);
        ug6Var.j("thumbnailUrl", false);
        ug6Var.j("miniThumbnailUrl", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        b88 b88Var = b88.a;
        px3 px3VarN = ct2.n(b88Var);
        px3 px3VarN2 = ct2.n(b88Var);
        xq3 xq3Var = xq3.a;
        return new px3[]{xq3Var, xq3Var, px3VarN, b88Var, px3VarN2};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        int i = 0;
        int iT = 0;
        int iT2 = 0;
        String str = null;
        String strO = null;
        String str2 = null;
        boolean z = true;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                iT = tz0VarC.t(no7Var, 0);
                i |= 1;
            } else if (i2 == 1) {
                iT2 = tz0VarC.t(no7Var, 1);
                i |= 2;
            } else if (i2 == 2) {
                str = (String) tz0VarC.z(no7Var, 2, b88.a, str);
                i |= 4;
            } else if (i2 == 3) {
                strO = tz0VarC.o(no7Var, 3);
                i |= 8;
            } else {
                if (i2 != 4) {
                    throw new UnknownFieldException(i2);
                }
                str2 = (String) tz0VarC.z(no7Var, 4, b88.a, str2);
                i |= 16;
            }
        }
        tz0VarC.a(no7Var);
        return new ag7(i, iT, iT2, str, strO, str2);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        ag7 ag7Var = (ag7) obj;
        js3.p(ag7Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        uz0VarC.v(0, ag7Var.a, no7Var);
        uz0VarC.v(1, ag7Var.b, no7Var);
        b88 b88Var = b88.a;
        uz0VarC.z(no7Var, 2, b88Var, ag7Var.c);
        uz0VarC.w(no7Var, 3, ag7Var.d);
        uz0VarC.z(no7Var, 4, b88Var, ag7Var.e);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
