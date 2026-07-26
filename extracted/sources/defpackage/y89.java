package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class y89 {
    public Interpolator c;
    public z89 d;
    public boolean e;
    public long b = -1;
    public final wn8 f = new wn8(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((x89) it.next()).b();
            }
            this.e = false;
        }
    }

    public final void b() {
        if (this.e) {
            return;
        }
        for (x89 x89Var : this.a) {
            long j = this.b;
            if (j >= 0) {
                x89Var.c(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null) {
                x89Var.d(interpolator);
            }
            if (this.d != null) {
                x89Var.e(this.f);
            }
            x89Var.f();
        }
        this.e = true;
    }
}
