package androidx.appcompat.widget;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import defpackage.gu4;
import defpackage.ot4;
import defpackage.p98;
import defpackage.pu0;
import defpackage.vt4;

/* JADX INFO: loaded from: classes.dex */
public final class k implements gu4 {
    public ot4 a;
    public vt4 b;
    public final /* synthetic */ Toolbar c;

    public k(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.gu4
    public final void c(boolean z) {
        if (this.b != null) {
            ot4 ot4Var = this.a;
            if (ot4Var != null) {
                int size = ot4Var.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            g(this.b);
        }
    }

    @Override // defpackage.gu4
    public final boolean e(p98 p98Var) {
        return false;
    }

    @Override // defpackage.gu4
    public final boolean f() {
        return false;
    }

    @Override // defpackage.gu4
    public final boolean g(vt4 vt4Var) {
        Toolbar toolbar = this.c;
        KeyEvent.Callback callback = toolbar.mExpandedActionView;
        if (callback instanceof pu0) {
            ((pu0) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.mExpandedActionView);
        toolbar.removeView(toolbar.mCollapseButtonView);
        toolbar.mExpandedActionView = null;
        toolbar.a();
        this.b = null;
        toolbar.requestLayout();
        vt4Var.C = false;
        vt4Var.n.p(false);
        toolbar.A();
        return true;
    }

    @Override // defpackage.gu4
    public final int getId() {
        return 0;
    }

    @Override // defpackage.gu4
    public final void h(Parcelable parcelable) {
    }

    @Override // defpackage.gu4
    public final boolean j(vt4 vt4Var) {
        Toolbar toolbar = this.c;
        toolbar.e();
        ViewParent parent = toolbar.mCollapseButtonView.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.mCollapseButtonView);
            }
            toolbar.addView(toolbar.mCollapseButtonView);
        }
        View actionView = vt4Var.getActionView();
        toolbar.mExpandedActionView = actionView;
        this.b = vt4Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.mExpandedActionView);
            }
            Toolbar.LayoutParams layoutParamsJ = Toolbar.j();
            layoutParamsJ.a = (toolbar.mButtonGravity & 112) | 8388611;
            layoutParamsJ.b = 2;
            toolbar.mExpandedActionView.setLayoutParams(layoutParamsJ);
            toolbar.addView(toolbar.mExpandedActionView);
        }
        toolbar.x();
        toolbar.requestLayout();
        vt4Var.C = true;
        vt4Var.n.p(false);
        KeyEvent.Callback callback = toolbar.mExpandedActionView;
        if (callback instanceof pu0) {
            ((pu0) callback).onActionViewExpanded();
        }
        toolbar.A();
        return true;
    }

    @Override // defpackage.gu4
    public final void l(Context context, ot4 ot4Var) {
        vt4 vt4Var;
        ot4 ot4Var2 = this.a;
        if (ot4Var2 != null && (vt4Var = this.b) != null) {
            ot4Var2.d(vt4Var);
        }
        this.a = ot4Var;
    }

    @Override // defpackage.gu4
    public final Parcelable m() {
        return null;
    }

    @Override // defpackage.gu4
    public final void d(ot4 ot4Var, boolean z) {
    }
}
