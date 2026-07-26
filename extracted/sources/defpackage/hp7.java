package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hp7 implements jr2 {
    public static final hp7 a;
    private static final no7 descriptor;

    static {
        hp7 hp7Var = new hp7();
        a = hp7Var;
        ug6 ug6Var = new ug6("ir.myket.network.server.models.ServerUrlDto", hp7Var, 2);
        ug6Var.j("asl", false);
        ug6Var.j("serviceServerLists", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        c24[] c24VarArr = jp7.c;
        return new px3[]{ct2.n((px3) c24VarArr[0].getValue()), ct2.n((px3) c24VarArr[1].getValue())};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        c24[] c24VarArr = jp7.c;
        List list = null;
        boolean z = true;
        int i = 0;
        List list2 = null;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                list = (List) tz0VarC.z(no7Var, 0, (px3) c24VarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (i2 != 1) {
                    throw new UnknownFieldException(i2);
                }
                list2 = (List) tz0VarC.z(no7Var, 1, (px3) c24VarArr[1].getValue(), list2);
                i |= 2;
            }
        }
        tz0VarC.a(no7Var);
        return new jp7(i, list, list2);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        jp7 jp7Var = (jp7) obj;
        js3.p(jp7Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        c24[] c24VarArr = jp7.c;
        uz0VarC.z(no7Var, 0, (px3) c24VarArr[0].getValue(), jp7Var.a);
        uz0VarC.z(no7Var, 1, (px3) c24VarArr[1].getValue(), jp7Var.b);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
