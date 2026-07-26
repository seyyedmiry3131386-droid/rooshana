package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: loaded from: classes.dex */
public final class nj4 implements OnBackAnimationCallback {
    public final /* synthetic */ lj4 a;
    public final /* synthetic */ oj4 b;

    public nj4(oj4 oj4Var, lj4 lj4Var) {
        this.b = oj4Var;
        this.a = lj4Var;
    }

    public final void onBackCancelled() {
        if (this.b.a != null) {
            this.a.d();
        }
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.b(new f40(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.c(new f40(backEvent));
        }
    }
}
