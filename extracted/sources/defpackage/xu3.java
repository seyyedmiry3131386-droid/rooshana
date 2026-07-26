package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xu3 implements px3 {
    public static final xu3 a = new xu3();
    public static final wu3 b = wu3.b;

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        ml9.h(cc1Var);
        return new uu3((List) new qv(nv3.a, 0).deserialize(cc1Var));
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return b;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        uu3 uu3Var = (uu3) obj;
        js3.p(uu3Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        ml9.g(q12Var);
        nv3 nv3Var = nv3.a;
        no7 descriptor = nv3Var.getDescriptor();
        js3.p(descriptor, "elementDesc");
        mv mvVar = new mv(descriptor, 1);
        int size = uu3Var.size();
        uz0 uz0VarD = q12Var.D(mvVar, size);
        Iterator<kv3> it = uu3Var.iterator();
        for (int i = 0; i < size; i++) {
            uz0VarD.o(mvVar, i, nv3Var, it.next());
        }
        uz0VarD.a(mvVar);
    }
}
