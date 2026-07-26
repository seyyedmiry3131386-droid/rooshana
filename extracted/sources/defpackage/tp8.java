package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tp8 implements jr2 {
    public static final tp8 a;
    private static final no7 descriptor;

    static {
        tp8 tp8Var = new tp8();
        a = tp8Var;
        ug6 ug6Var = new ug6("ir.myket.movie.common.model.dto.TrailerDto", tp8Var, 4);
        ug6Var.j("trailerUrl", false);
        ug6Var.j("thumbnailUrl", false);
        ug6Var.j("miniThumbnailUrl", false);
        ug6Var.j("title", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        b88 b88Var = b88.a;
        return new px3[]{b88Var, ct2.n(b88Var), ct2.n(b88Var), ct2.n(b88Var)};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        int i = 0;
        String strO = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z = true;
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
            } else if (i2 == 2) {
                str2 = (String) tz0VarC.z(no7Var, 2, b88.a, str2);
                i |= 4;
            } else {
                if (i2 != 3) {
                    throw new UnknownFieldException(i2);
                }
                str3 = (String) tz0VarC.z(no7Var, 3, b88.a, str3);
                i |= 8;
            }
        }
        tz0VarC.a(no7Var);
        return new vp8(i, strO, str, str2, str3);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        vp8 vp8Var = (vp8) obj;
        js3.p(vp8Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        uz0VarC.w(no7Var, 0, vp8Var.a);
        b88 b88Var = b88.a;
        uz0VarC.z(no7Var, 1, b88Var, vp8Var.b);
        uz0VarC.z(no7Var, 2, b88Var, vp8Var.c);
        uz0VarC.z(no7Var, 3, b88Var, vp8Var.d);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
