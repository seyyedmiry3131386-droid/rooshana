package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public abstract class vj9 {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ d70 c;
    public final int d;
    public final Bundle e;
    public final /* synthetic */ d70 f;

    public vj9(d70 d70Var, int i, Bundle bundle) {
        this.f = d70Var;
        Boolean bool = Boolean.TRUE;
        this.c = d70Var;
        this.a = bool;
        this.b = false;
        this.d = i;
        this.e = bundle;
    }

    public abstract boolean a();

    public abstract void b(ConnectionResult connectionResult);

    public final void c() {
        d();
        d70 d70Var = this.c;
        synchronized (d70Var.zzj()) {
            d70Var.zzj().remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.a = null;
        }
    }
}
