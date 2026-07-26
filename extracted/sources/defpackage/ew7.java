package defpackage;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class ew7 extends a79 {
    public static final /* synthetic */ int x = 0;
    public final ImageView v;
    public long w;

    public ew7(ea1 ea1Var, View view, ImageView imageView) {
        super(0, view, ea1Var);
        this.v = imageView;
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.w;
            this.w = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().O.c : 0;
        if (j2 != 0) {
            uy6.n(i, this.v);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.w != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.w = 1L;
        }
        k0();
    }
}
