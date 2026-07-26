package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class tx1 implements px3 {
    public static final tx1 a = new tx1();
    public static final bk6 b = new bk6("kotlin.time.Duration", xj6.j);

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        int i = qx1.d;
        String strV = cc1Var.v();
        js3.p(strV, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        try {
            return new qx1(wq2.e(strV));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(o40.y("Invalid ISO duration string format: '", strV, "'."), e);
        }
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return b;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        long j = ((qx1) obj).a;
        int i = qx1.d;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long j2 = j < 0 ? qx1.j(j) : j;
        long jH = qx1.h(j2, DurationUnit.g);
        boolean z = false;
        int iH = qx1.f(j2) ? 0 : (int) (qx1.h(j2, DurationUnit.f) % ((long) 60));
        int iH2 = qx1.f(j2) ? 0 : (int) (qx1.h(j2, DurationUnit.e) % ((long) 60));
        int iE = qx1.e(j2);
        if (qx1.f(j)) {
            jH = 9999999999999L;
        }
        boolean z2 = jH != 0;
        boolean z3 = (iH2 == 0 && iE == 0) ? false : true;
        if (iH != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jH);
            sb.append('H');
        }
        if (z) {
            sb.append(iH);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            qx1.b(sb, iH2, iE, 9, "S", true);
        }
        q12Var.C(sb.toString());
    }
}
