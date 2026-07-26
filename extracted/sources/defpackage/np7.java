package defpackage;

import android.view.View;
import androidx.lifecycle.Lifecycle$Event;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class np7 implements Runnable {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final Object c;
    public final Object d;

    public np7(i64 i64Var, Lifecycle$Event lifecycle$Event) {
        js3.p(i64Var, "registry");
        js3.p(lifecycle$Event, "event");
        this.c = i64Var;
        this.d = lifecycle$Event;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nm5 nm5Var;
        switch (this.a) {
            case 0:
                if (!this.b) {
                    ((i64) this.c).d((Lifecycle$Event) this.d);
                    this.b = true;
                }
                break;
            default:
                View view = (View) this.c;
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.d;
                b79 b79Var = swipeDismissBehavior.a;
                if (b79Var != null && b79Var.h()) {
                    view.postOnAnimation(this);
                    break;
                } else if (this.b && (nm5Var = swipeDismissBehavior.b) != null) {
                    nm5Var.u(view);
                    break;
                }
                break;
        }
    }

    public np7(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.d = swipeDismissBehavior;
        this.c = view;
        this.b = z;
    }
}
