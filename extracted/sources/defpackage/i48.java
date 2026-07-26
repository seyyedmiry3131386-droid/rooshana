package defpackage;

import android.os.SystemClock;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i48 implements nm4 {
    public long a;
    public long b;
    public boolean c;
    public final Object d;
    public Object e;

    public i48(td8 td8Var) {
        this.d = td8Var;
        this.e = ua6.d;
    }

    public void a(long j) {
        this.a = j;
        if (this.c) {
            ((td8) this.d).getClass();
            this.b = SystemClock.elapsedRealtime();
        }
    }

    public void b() {
        if (this.c) {
            return;
        }
        ((td8) this.d).getClass();
        this.b = SystemClock.elapsedRealtime();
        this.c = true;
    }

    @Override // defpackage.nm4
    public void d(ua6 ua6Var) {
        if (this.c) {
            a(h());
        }
        this.e = ua6Var;
    }

    @Override // defpackage.nm4
    public ua6 g() {
        return (ua6) this.e;
    }

    @Override // defpackage.nm4
    public long h() {
        long j = this.a;
        if (!this.c) {
            return j;
        }
        ((td8) this.d).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.b;
        ua6 ua6Var = (ua6) this.e;
        return (ua6Var.a == 1.0f ? j29.V(jElapsedRealtime) : jElapsedRealtime * ((long) ua6Var.c)) + j;
    }

    @Override // defpackage.nm4
    public /* synthetic */ boolean i() {
        return false;
    }

    public i48(long j, long j2, boolean z, File file, HashMap map) {
        this.a = j;
        this.d = file;
        this.b = j2;
        this.e = map;
        this.c = z;
    }
}
