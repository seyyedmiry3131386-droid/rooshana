package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class zl2 extends a79 {
    public static final /* synthetic */ int x = 0;
    public final ConstraintLayout v;
    public long w;

    public zl2(ea1 ea1Var, View view, ConstraintLayout constraintLayout) {
        super(0, view, ea1Var);
        this.v = constraintLayout;
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.w = 0L;
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
