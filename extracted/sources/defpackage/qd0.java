package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qd0 implements jr2 {
    public static final qd0 a;
    private static final no7 descriptor;

    static {
        qd0 qd0Var = new qd0();
        a = qd0Var;
        ug6 ug6Var = new ug6("ir.myket.movie.common.model.dto.BookmarkInfoDto", qd0Var, 1);
        ug6Var.j("isBookmarked", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        return new px3[]{ee0.a};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        boolean z = true;
        int i = 0;
        boolean zA = false;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            if (i2 == -1) {
                z = false;
            } else {
                if (i2 != 0) {
                    throw new UnknownFieldException(i2);
                }
                zA = tz0VarC.A(no7Var, 0);
                i = 1;
            }
        }
        tz0VarC.a(no7Var);
        return new sd0(i, zA);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        sd0 sd0Var = (sd0) obj;
        js3.p(sd0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        uz0VarC.n(no7Var, 0, sd0Var.a);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
