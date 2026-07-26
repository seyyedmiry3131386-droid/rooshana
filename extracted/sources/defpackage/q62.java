package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class q62 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ r62 c;
    public final /* synthetic */ ExpandableBehavior d;

    public q62(ExpandableBehavior expandableBehavior, View view, int i, r62 r62Var) {
        this.d = expandableBehavior;
        this.a = view;
        this.b = i;
        this.c = r62Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.d;
        if (expandableBehavior.a == this.b) {
            Object obj = this.c;
            expandableBehavior.y((View) obj, view, ((FloatingActionButton) obj).o.b, false);
        }
        return false;
    }
}
