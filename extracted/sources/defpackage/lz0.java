package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes3.dex */
public final class lz0 extends xe1 {
    public final boolean e;

    public lz0(yr3 yr3Var, boolean z) {
        super(yr3Var);
        this.e = z;
    }

    @Override // defpackage.xe1
    public final void u(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (this.e) {
            super.u(str);
        } else {
            r(str);
        }
    }
}
