package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p75 implements jr2 {
    public static final p75 a;
    private static final no7 descriptor;

    static {
        p75 p75Var = new p75();
        a = p75Var;
        ug6 ug6Var = new ug6("ir.myket.movie.common.model.dto.MovieSummaryTitleDto", p75Var, 1);
        ug6Var.j("title", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        return new px3[]{ct2.n(b88.a)};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        String str = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            if (i2 == -1) {
                z = false;
            } else {
                if (i2 != 0) {
                    throw new UnknownFieldException(i2);
                }
                str = (String) tz0VarC.z(no7Var, 0, b88.a, str);
                i = 1;
            }
        }
        tz0VarC.a(no7Var);
        return new r75(i, str);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        r75 r75Var = (r75) obj;
        js3.p(r75Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        uz0VarC.z(no7Var, 0, b88.a, r75Var.a);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
