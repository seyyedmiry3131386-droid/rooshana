package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ir.myket.movie.common.domain.common.ItemType;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nk7 implements jr2 {
    public static final nk7 a;
    private static final no7 descriptor;

    static {
        nk7 nk7Var = new nk7();
        a = nk7Var;
        ug6 ug6Var = new ug6("ir.myket.movie.common.domain.models.Season", nk7Var, 5);
        ug6Var.j("id", false);
        ug6Var.j("title", false);
        ug6Var.j("episodes", false);
        ug6Var.j("analyticsName", false);
        ug6Var.j("type", true);
        descriptor = ug6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        c24[] c24VarArr = pk7.f;
        b88 b88Var = b88.a;
        return new px3[]{b88Var, b88Var, c24VarArr[2].getValue(), ct2.n(b88Var), c24VarArr[4].getValue()};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        c24[] c24VarArr = pk7.f;
        int i = 0;
        String strO = null;
        String strO2 = null;
        pj3 pj3Var = null;
        String str = null;
        ItemType itemType = null;
        boolean z = true;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                strO = tz0VarC.o(no7Var, 0);
                i |= 1;
            } else if (i2 == 1) {
                strO2 = tz0VarC.o(no7Var, 1);
                i |= 2;
            } else if (i2 == 2) {
                pj3Var = (pj3) tz0VarC.s(no7Var, 2, (px3) c24VarArr[2].getValue(), pj3Var);
                i |= 4;
            } else if (i2 == 3) {
                str = (String) tz0VarC.z(no7Var, 3, b88.a, str);
                i |= 8;
            } else {
                if (i2 != 4) {
                    throw new UnknownFieldException(i2);
                }
                itemType = (ItemType) tz0VarC.s(no7Var, 4, (px3) c24VarArr[4].getValue(), itemType);
                i |= 16;
            }
        }
        tz0VarC.a(no7Var);
        return new pk7(i, strO, strO2, pj3Var, str, itemType);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        pk7 pk7Var = (pk7) obj;
        js3.p(pk7Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        c24[] c24VarArr = pk7.f;
        String str = pk7Var.a;
        ItemType itemType = pk7Var.e;
        uz0VarC.w(no7Var, 0, str);
        uz0VarC.w(no7Var, 1, pk7Var.b);
        uz0VarC.o(no7Var, 2, (px3) c24VarArr[2].getValue(), pk7Var.c);
        uz0VarC.z(no7Var, 3, b88.a, pk7Var.d);
        if (uz0VarC.f(no7Var) || itemType != ItemType.a) {
            uz0VarC.o(no7Var, 4, (px3) c24VarArr[4].getValue(), itemType);
        }
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
