package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vx6 implements jr2 {
    public static final vx6 a;
    private static final no7 descriptor;

    static {
        vx6 vx6Var = new vx6();
        a = vx6Var;
        ug6 ug6Var = new ug6("ir.myket.player.data.models.RecommendationMovieListDto", vx6Var, 1);
        ug6Var.j("movies", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        return new px3[]{ct2.n((px3) xx6.b[0].getValue())};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        c24[] c24VarArr = xx6.b;
        List list = null;
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
                list = (List) tz0VarC.z(no7Var, 0, (px3) c24VarArr[0].getValue(), list);
                i = 1;
            }
        }
        tz0VarC.a(no7Var);
        return new xx6(i, list);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        xx6 xx6Var = (xx6) obj;
        js3.p(xx6Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        uz0VarC.z(no7Var, 0, (px3) xx6.b[0].getValue(), xx6Var.a);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
