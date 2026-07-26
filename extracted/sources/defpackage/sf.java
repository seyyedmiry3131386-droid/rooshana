package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public final class sf implements ComponentCallbacks2 {
    public final /* synthetic */ q67 a;

    public sf(q67 q67Var) {
        this.a = q67Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        q67 q67Var = this.a;
        synchronized (q67Var) {
            q67Var.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        q67 q67Var = this.a;
        synchronized (q67Var) {
            q67Var.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        q67 q67Var = this.a;
        synchronized (q67Var) {
            q67Var.a.c();
        }
    }
}
