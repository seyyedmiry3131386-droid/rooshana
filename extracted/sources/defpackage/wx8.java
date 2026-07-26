package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes3.dex */
public final class wx8 implements px3 {
    public static final wx8 b = new wx8();
    public final /* synthetic */ br5 a = new br5("kotlin.Unit", tx8.a);

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        this.a.deserialize(cc1Var);
        return tx8.a;
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return this.a.getDescriptor();
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        tx8 tx8Var = (tx8) obj;
        js3.p(tx8Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.a.serialize(q12Var, tx8Var);
    }
}
