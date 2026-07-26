package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rx6 implements jr2 {
    public static final rx6 a;
    private static final no7 descriptor;

    static {
        rx6 rx6Var = new rx6();
        a = rx6Var;
        ug6 ug6Var = new ug6("ir.myket.player.data.models.RecommendationMovieDto", rx6Var, 10);
        ug6Var.j("id", false);
        ug6Var.j("title", false);
        ug6Var.j("type", false);
        ug6Var.j("playId", false);
        ug6Var.j("posterUrl", false);
        ug6Var.j("posterLandscapeUrl", false);
        ug6Var.j("refId", false);
        ug6Var.j("secondaryTitle", false);
        ug6Var.j("seasons", false);
        ug6Var.j("shareModel", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        c24[] c24VarArr = tx6.k;
        b88 b88Var = b88.a;
        return new px3[]{b88Var, b88Var, b88Var, b88Var, b88Var, b88Var, ct2.n(b88Var), ct2.n(b88Var), ct2.n((px3) c24VarArr[8].getValue()), tt7.a};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        c24[] c24VarArr;
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        c24[] c24VarArr2 = tx6.k;
        List list = null;
        xt7 xt7Var = null;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        String strO5 = null;
        String strO6 = null;
        String str = null;
        String str2 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            switch (i2) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    c24VarArr = c24VarArr2;
                    strO = tz0VarC.o(no7Var, 0);
                    i |= 1;
                    break;
                case 1:
                    c24VarArr = c24VarArr2;
                    strO2 = tz0VarC.o(no7Var, 1);
                    i |= 2;
                    break;
                case 2:
                    c24VarArr = c24VarArr2;
                    strO3 = tz0VarC.o(no7Var, 2);
                    i |= 4;
                    break;
                case 3:
                    c24VarArr = c24VarArr2;
                    strO4 = tz0VarC.o(no7Var, 3);
                    i |= 8;
                    break;
                case 4:
                    c24VarArr = c24VarArr2;
                    strO5 = tz0VarC.o(no7Var, 4);
                    i |= 16;
                    break;
                case 5:
                    c24VarArr = c24VarArr2;
                    strO6 = tz0VarC.o(no7Var, 5);
                    i |= 32;
                    break;
                case 6:
                    c24VarArr = c24VarArr2;
                    str = (String) tz0VarC.z(no7Var, 6, b88.a, str);
                    i |= 64;
                    break;
                case 7:
                    c24VarArr = c24VarArr2;
                    str2 = (String) tz0VarC.z(no7Var, 7, b88.a, str2);
                    i |= 128;
                    break;
                case 8:
                    c24VarArr = c24VarArr2;
                    list = (List) tz0VarC.z(no7Var, 8, (px3) c24VarArr[8].getValue(), list);
                    i |= 256;
                    break;
                case 9:
                    c24VarArr = c24VarArr2;
                    xt7Var = (xt7) tz0VarC.s(no7Var, 9, tt7.a, xt7Var);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(i2);
            }
            c24VarArr2 = c24VarArr;
        }
        tz0VarC.a(no7Var);
        return new tx6(i, strO, strO2, strO3, strO4, strO5, strO6, str, str2, list, xt7Var);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        tx6 tx6Var = (tx6) obj;
        js3.p(tx6Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        c24[] c24VarArr = tx6.k;
        uz0VarC.w(no7Var, 0, tx6Var.a);
        uz0VarC.w(no7Var, 1, tx6Var.b);
        uz0VarC.w(no7Var, 2, tx6Var.c);
        uz0VarC.w(no7Var, 3, tx6Var.d);
        uz0VarC.w(no7Var, 4, tx6Var.e);
        uz0VarC.w(no7Var, 5, tx6Var.f);
        b88 b88Var = b88.a;
        uz0VarC.z(no7Var, 6, b88Var, tx6Var.g);
        uz0VarC.z(no7Var, 7, b88Var, tx6Var.h);
        uz0VarC.z(no7Var, 8, (px3) c24VarArr[8].getValue(), tx6Var.i);
        uz0VarC.o(no7Var, 9, tt7.a, tx6Var.j);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
