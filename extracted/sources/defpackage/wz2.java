package defpackage;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wz2 extends h90 {
    public int g;

    @Override // defpackage.p62
    public final void b(long j, long j2, long j3, List list, mm4[] mm4VarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (a(this.g, jElapsedRealtime)) {
            for (int i = this.b - 1; i >= 0; i--) {
                if (!a(i, jElapsedRealtime)) {
                    this.g = i;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }

    @Override // defpackage.p62
    public final int d() {
        return this.g;
    }

    @Override // defpackage.p62
    public final int n() {
        return 0;
    }

    @Override // defpackage.p62
    public final Object q() {
        return null;
    }
}
