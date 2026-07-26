package defpackage;

import androidx.window.core.VerificationMode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes.dex */
public final class v29 extends c67 {
    public final Object c;
    public final VerificationMode d;
    public final fz1 e;

    public v29(Object obj, VerificationMode verificationMode, fz1 fz1Var) {
        js3.p(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        js3.p(verificationMode, "verificationMode");
        this.c = obj;
        this.d = verificationMode;
        this.e = fz1Var;
    }

    @Override // defpackage.c67
    public final Object b() {
        return this.c;
    }

    @Override // defpackage.c67
    public final c67 k(String str, dp2 dp2Var) {
        Object obj = this.c;
        return ((Boolean) dp2Var.invoke(obj)).booleanValue() ? this : new o82(obj, str, this.e, this.d);
    }
}
