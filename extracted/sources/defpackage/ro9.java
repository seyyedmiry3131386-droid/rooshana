package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzjq;

/* JADX INFO: loaded from: classes.dex */
public final class ro9 extends kn9 {
    public final zzjq n;

    public ro9(zzjq zzjqVar) {
        this.n = zzjqVar;
    }

    @Override // defpackage.rn9
    public final int a() {
        return System.identityHashCode(this.n);
    }

    @Override // defpackage.rn9
    public final void m(String str, String str2, Bundle bundle, long j) {
        this.n.onEvent(str, str2, bundle, j);
    }
}
