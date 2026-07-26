package defpackage;

import android.os.ConditionVariable;

/* JADX INFO: loaded from: classes.dex */
public final class gw7 extends Thread {
    public final /* synthetic */ ConditionVariable a;
    public final /* synthetic */ hw7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw7(hw7 hw7Var, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.b = hw7Var;
        this.a = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            this.a.open();
            hw7.a(this.b);
            this.b.b.getClass();
        }
    }
}
