package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yo7 implements jr2 {
    public static final yo7 a;
    private static final no7 descriptor;

    static {
        yo7 yo7Var = new yo7();
        a = yo7Var;
        ug6 ug6Var = new ug6("ir.myket.network.domain.models.ServerList", yo7Var, 3);
        ug6Var.j("id", false);
        ug6Var.j("index", false);
        ug6Var.j("servers", false);
        descriptor = ug6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        c24[] c24VarArr = ap7.d;
        xq3 xq3Var = xq3.a;
        return new px3[]{xq3Var, xq3Var, c24VarArr[2].getValue()};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        c24[] c24VarArr = ap7.d;
        List list = null;
        boolean z = true;
        int i = 0;
        int iT = 0;
        int iT2 = 0;
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
            } else {
                if (i2 != 2) {
                    throw new UnknownFieldException(i2);
                }
                list = (List) tz0VarC.s(no7Var, 2, (px3) c24VarArr[2].getValue(), list);
                i |= 4;
            }
        }
        tz0VarC.a(no7Var);
        return new ap7(i, iT, iT2, list);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        ap7 ap7Var = (ap7) obj;
        js3.p(ap7Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        c24[] c24VarArr = ap7.d;
        uz0VarC.v(0, ap7Var.a, no7Var);
        uz0VarC.v(1, ap7Var.b, no7Var);
        uz0VarC.o(no7Var, 2, (px3) c24VarArr[2].getValue(), ap7Var.c);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
