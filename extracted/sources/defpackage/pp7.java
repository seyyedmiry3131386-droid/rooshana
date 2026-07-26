package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pp7 implements jr2 {
    public static final pp7 a;
    private static final no7 descriptor;

    static {
        pp7 pp7Var = new pp7();
        a = pp7Var;
        ug6 ug6Var = new ug6("ir.myket.network.domain.models.ServiceServerList", pp7Var, 2);
        ug6Var.j("serviceList", false);
        ug6Var.j("serverList", false);
        descriptor = ug6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        return new px3[]{rp7.c[0].getValue(), yo7.a};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        c24[] c24VarArr = rp7.c;
        List list = null;
        boolean z = true;
        int i = 0;
        ap7 ap7Var = null;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                list = (List) tz0VarC.s(no7Var, 0, (px3) c24VarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (i2 != 1) {
                    throw new UnknownFieldException(i2);
                }
                ap7Var = (ap7) tz0VarC.s(no7Var, 1, yo7.a, ap7Var);
                i |= 2;
            }
        }
        tz0VarC.a(no7Var);
        return new rp7(i, list, ap7Var);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        rp7 rp7Var = (rp7) obj;
        js3.p(rp7Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        uz0VarC.o(no7Var, 0, (px3) rp7.c[0].getValue(), rp7Var.a);
        uz0VarC.o(no7Var, 1, yo7.a, rp7Var.b);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
