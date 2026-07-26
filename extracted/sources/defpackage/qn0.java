package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qn0 implements jr2 {
    public static final qn0 a;
    private static final no7 descriptor;

    static {
        qn0 qn0Var = new qn0();
        a = qn0Var;
        ug6 ug6Var = new ug6("ir.myket.movie.common.model.dto.CastDto", qn0Var, 2);
        ug6Var.j("title", false);
        ug6Var.j("people", false);
        descriptor = ug6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        return new px3[]{b88.a, sn0.c[1].getValue()};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        c24[] c24VarArr = sn0.c;
        String strO = null;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                strO = tz0VarC.o(no7Var, 0);
                i |= 1;
            } else {
                if (i2 != 1) {
                    throw new UnknownFieldException(i2);
                }
                list = (List) tz0VarC.s(no7Var, 1, (px3) c24VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        tz0VarC.a(no7Var);
        return new sn0(i, strO, list);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        sn0 sn0Var = (sn0) obj;
        js3.p(sn0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        c24[] c24VarArr = sn0.c;
        uz0VarC.w(no7Var, 0, sn0Var.a);
        uz0VarC.o(no7Var, 1, (px3) c24VarArr[1].getValue(), sn0Var.b);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
