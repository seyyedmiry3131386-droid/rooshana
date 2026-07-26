package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ks implements jr2 {
    public static final ks a;
    private static final no7 descriptor;

    static {
        ks ksVar = new ks();
        a = ksVar;
        ug6 ug6Var = new ug6("ir.myket.network.server.AppServersModel", ksVar, 2);
        ug6Var.j("defaultServerList", true);
        ug6Var.j("serviceServerLists", true);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        return new px3[]{ct2.n(yo7.a), ct2.n((px3) ps.c[1].getValue())};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        c24[] c24VarArr = ps.c;
        boolean z = true;
        int i = 0;
        ap7 ap7Var = null;
        List list = null;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                ap7Var = (ap7) tz0VarC.z(no7Var, 0, yo7.a, ap7Var);
                i |= 1;
            } else {
                if (i2 != 1) {
                    throw new UnknownFieldException(i2);
                }
                list = (List) tz0VarC.z(no7Var, 1, (px3) c24VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        tz0VarC.a(no7Var);
        ps psVar = new ps();
        if ((i & 1) == 0) {
            psVar.a = null;
        } else {
            psVar.a = ap7Var;
        }
        if ((i & 2) == 0) {
            psVar.b = null;
            return psVar;
        }
        psVar.b = list;
        return psVar;
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        ps psVar = (ps) obj;
        js3.p(psVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        List list = psVar.b;
        ap7 ap7Var = psVar.a;
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        c24[] c24VarArr = ps.c;
        if (uz0VarC.f(no7Var) || ap7Var != null) {
            uz0VarC.z(no7Var, 0, yo7.a, ap7Var);
        }
        if (uz0VarC.f(no7Var) || list != null) {
            uz0VarC.z(no7Var, 1, (px3) c24VarArr[1].getValue(), list);
        }
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
