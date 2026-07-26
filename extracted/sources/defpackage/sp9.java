package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class sp9 extends vj9 {
    public final /* synthetic */ d70 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp9(d70 d70Var, int i, Bundle bundle) {
        super(d70Var, i, bundle);
        this.g = d70Var;
    }

    @Override // defpackage.vj9
    public final boolean a() {
        this.g.zzc.d(ConnectionResult.f);
        return true;
    }

    @Override // defpackage.vj9
    public final void b(ConnectionResult connectionResult) {
        d70 d70Var = this.g;
        if (d70Var.enableLocalFallback() && d70Var.zzg()) {
            d70Var.zzf(16);
        } else {
            d70Var.zzc.d(connectionResult);
            d70Var.onConnectionFailed(connectionResult);
        }
    }
}
