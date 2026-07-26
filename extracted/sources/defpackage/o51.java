package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public final class o51 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ o51(ViewGroup viewGroup, int i) {
        this.a = i;
        this.b = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view;
        switch (this.a) {
            case 0:
                ((CoordinatorLayout) this.b).u(0);
                break;
            default:
                ms2 ms2Var = (ms2) this.b;
                ms2Var.postInvalidateOnAnimation();
                ViewGroup viewGroup = ms2Var.a;
                if (viewGroup != null && (view = ms2Var.b) != null) {
                    viewGroup.endViewTransition(view);
                    ms2Var.a.postInvalidateOnAnimation();
                    ms2Var.a = null;
                    ms2Var.b = null;
                    break;
                }
                break;
        }
        return true;
    }
}
