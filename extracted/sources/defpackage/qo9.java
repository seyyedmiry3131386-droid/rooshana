package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzjp;

/* JADX INFO: loaded from: classes.dex */
public final class qo9 extends kn9 {
    public final zzjp n;

    public qo9(zzjp zzjpVar) {
        this.n = zzjpVar;
    }

    @Override // defpackage.rn9
    public final int a() {
        return System.identityHashCode(this.n);
    }

    @Override // defpackage.rn9
    public final void m(String str, String str2, Bundle bundle, long j) {
        this.n.interceptEvent(str, str2, bundle, j);
    }
}
