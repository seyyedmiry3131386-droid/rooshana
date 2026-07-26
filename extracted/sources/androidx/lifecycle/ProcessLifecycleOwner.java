package androidx.lifecycle;

import android.os.Handler;
import defpackage.c35;
import defpackage.g64;
import defpackage.i64;
import defpackage.js3;
import defpackage.u03;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleOwner implements g64 {
    public static final ProcessLifecycleOwner i = new ProcessLifecycleOwner();
    public int a;
    public int b;
    public Handler e;
    public boolean c = true;
    public boolean d = true;
    public final i64 f = new i64(this, true);
    public final u03 g = new u03(18, this);
    public final c35 h = new c35(6, this);

    private ProcessLifecycleOwner() {
    }

    @Override // defpackage.g64
    public final i64 D() {
        return this.f;
    }

    public final void a() {
        int i2 = this.b + 1;
        this.b = i2;
        if (i2 == 1) {
            if (this.c) {
                this.f.d(Lifecycle$Event.ON_RESUME);
                this.c = false;
            } else {
                Handler handler = this.e;
                js3.m(handler);
                handler.removeCallbacks(this.g);
            }
        }
    }
}
