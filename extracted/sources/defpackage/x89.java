package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class x89 {
    public final WeakReference a;

    public x89(View view) {
        this.a = new WeakReference(view);
    }

    public final void a(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void b() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(Interpolator interpolator) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
    }

    public final void e(z89 z89Var) {
        View view = (View) this.a.get();
        if (view != null) {
            if (z89Var != null) {
                view.animate().setListener(new jw1(z89Var, view, 4));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void f() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public final void g(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
