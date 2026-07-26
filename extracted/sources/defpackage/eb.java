package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eb implements jr2 {
    public static final eb a;
    private static final no7 descriptor;

    static {
        eb ebVar = new eb();
        a = ebVar;
        ug6 ug6Var = new ug6("ir.myket.player.data.models.AdProgressBarConfigDto", ebVar, 4);
        ug6Var.j("showProgressBar", false);
        ug6Var.j("showProgressSeconds", false);
        ug6Var.j("progressBarTitle", false);
        ug6Var.j("hidePlayerOffset", false);
        descriptor = ug6Var;
    }

    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        ee0 ee0Var = ee0.a;
        return new px3[]{ct2.n(ee0Var), ct2.n(ee0Var), ct2.n(b88.a), ct2.n(xq3.a)};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        int i = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        Integer num = null;
        boolean z = true;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                bool = (Boolean) tz0VarC.z(no7Var, 0, ee0.a, bool);
                i |= 1;
            } else if (i2 == 1) {
                bool2 = (Boolean) tz0VarC.z(no7Var, 1, ee0.a, bool2);
                i |= 2;
            } else if (i2 == 2) {
                str = (String) tz0VarC.z(no7Var, 2, b88.a, str);
                i |= 4;
            } else {
                if (i2 != 3) {
                    throw new UnknownFieldException(i2);
                }
                num = (Integer) tz0VarC.z(no7Var, 3, xq3.a, num);
                i |= 8;
            }
        }
        tz0VarC.a(no7Var);
        return new gb(i, bool, bool2, str, num);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        gb gbVar = (gb) obj;
        js3.p(gbVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        ee0 ee0Var = ee0.a;
        uz0VarC.z(no7Var, 0, ee0Var, gbVar.a);
        uz0VarC.z(no7Var, 1, ee0Var, gbVar.b);
        uz0VarC.z(no7Var, 2, b88.a, gbVar.c);
        uz0VarC.z(no7Var, 3, xq3.a, gbVar.d);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
