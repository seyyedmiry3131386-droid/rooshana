package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class p90 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final WeakReference a;
    public final WeakReference b;

    public p90(xz7 xz7Var, BottomNavigationView bottomNavigationView) {
        this.a = new WeakReference(xz7Var);
        this.b = new WeakReference(bottomNavigationView);
    }

    public final void a() {
        WeakReference weakReference = this.b;
        if (weakReference.get() != null) {
            ((View) weakReference.get()).removeOnAttachStateChangeListener(this);
            View view = (View) weakReference.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
        weakReference.clear();
        this.a.clear();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null) {
            a();
            return;
        }
        r90 r90Var = (r90) weakReference.get();
        w82 w82Var = r90.y;
        r90Var.getClass();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.a.get() == null) {
            a();
        } else if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.a.get() == null) {
            a();
        } else if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
