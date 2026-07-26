package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ra implements jr2 {
    public static final ra a;
    private static final no7 descriptor;

    static {
        ra raVar = new ra();
        a = raVar;
        ug6 ug6Var = new ug6("ir.myket.movie.common.model.dto.AdInfoDto", raVar, 2);
        ug6Var.j("time", false);
        ug6Var.j("queryStrings", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        return new px3[]{xq3.a, ct2.n((px3) ta.c[1].getValue())};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        c24[] c24VarArr = ta.c;
        Map map = null;
        boolean z = true;
        int i = 0;
        int iT = 0;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                iT = tz0VarC.t(no7Var, 0);
                i |= 1;
            } else {
                if (i2 != 1) {
                    throw new UnknownFieldException(i2);
                }
                map = (Map) tz0VarC.z(no7Var, 1, (px3) c24VarArr[1].getValue(), map);
                i |= 2;
            }
        }
        tz0VarC.a(no7Var);
        return new ta(i, iT, map);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        ta taVar = (ta) obj;
        js3.p(taVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        c24[] c24VarArr = ta.c;
        uz0VarC.v(0, taVar.a, no7Var);
        uz0VarC.z(no7Var, 1, (px3) c24VarArr[1].getValue(), taVar.b);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
