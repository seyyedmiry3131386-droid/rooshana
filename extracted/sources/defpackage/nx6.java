package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nx6 implements jr2 {
    public static final nx6 a;
    private static final no7 descriptor;

    static {
        nx6 nx6Var = new nx6();
        a = nx6Var;
        ug6 ug6Var = new ug6("ir.myket.movie.common.model.dto.RecommendationDto", nx6Var, 4);
        ug6Var.j("title", false);
        ug6Var.j("analyticsName", false);
        ug6Var.j("movies", false);
        ug6Var.j("displayMode", false);
        descriptor = ug6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        c24[] c24VarArr = px6.e;
        b88 b88Var = b88.a;
        return new px3[]{b88Var, ct2.n(b88Var), c24VarArr[2].getValue(), b88Var};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        c24[] c24VarArr = px6.e;
        int i = 0;
        String strO = null;
        String str = null;
        List list = null;
        String strO2 = null;
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
                list = (List) tz0VarC.s(no7Var, 2, (px3) c24VarArr[2].getValue(), list);
                i |= 4;
            } else {
                if (i2 != 3) {
                    throw new UnknownFieldException(i2);
                }
                strO2 = tz0VarC.o(no7Var, 3);
                i |= 8;
            }
        }
        tz0VarC.a(no7Var);
        return new px6(i, strO, str, list, strO2);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        px6 px6Var = (px6) obj;
        js3.p(px6Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        c24[] c24VarArr = px6.e;
        uz0VarC.w(no7Var, 0, px6Var.a);
        uz0VarC.z(no7Var, 1, b88.a, px6Var.b);
        uz0VarC.o(no7Var, 2, (px3) c24VarArr[2].getValue(), px6Var.c);
        uz0VarC.w(no7Var, 3, px6Var.d);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
