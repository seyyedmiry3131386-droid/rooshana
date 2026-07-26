package defpackage;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class hf0 extends bf0 {
    public final Boolean a;
    public final lf9 b;
    public Window c;
    public boolean d;

    public hf0(View view, lf9 lf9Var) {
        this.b = lf9Var;
        fk4 fk4Var = BottomSheetBehavior.F(view).i;
        ColorStateList backgroundTintList = fk4Var != null ? fk4Var.b.d : view.getBackgroundTintList();
        if (backgroundTintList != null) {
            this.a = Boolean.valueOf(m91.w(backgroundTintList.getDefaultColor()));
            return;
        }
        ColorStateList colorStateListT = te.t(view.getBackground());
        Integer numValueOf = colorStateListT != null ? Integer.valueOf(colorStateListT.getDefaultColor()) : null;
        if (numValueOf != null) {
            this.a = Boolean.valueOf(m91.w(numValueOf.intValue()));
        } else {
            this.a = null;
        }
    }

    @Override // defpackage.bf0
    public final void a(View view) {
        d(view);
    }

    @Override // defpackage.bf0
    public final void b(View view) {
        d(view);
    }

    @Override // defpackage.bf0
    public final void c(int i, View view) {
        d(view);
    }

    public final void d(View view) {
        int top = view.getTop();
        lf9 lf9Var = this.b;
        if (top < lf9Var.d()) {
            Window window = this.c;
            if (window != null) {
                Boolean bool = this.a;
                boolean zBooleanValue = bool == null ? this.d : bool.booleanValue();
                hl5 hl5Var = new hl5(window.getDecorView());
                int i = Build.VERSION.SDK_INT;
                (i >= 35 ? new pf9(window, hl5Var) : i >= 30 ? new of9(window, hl5Var) : i >= 26 ? new nf9(window, hl5Var) : new mf9(window, hl5Var)).m(zBooleanValue);
            }
            view.setPadding(view.getPaddingLeft(), lf9Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.c;
            if (window2 != null) {
                boolean z = this.d;
                hl5 hl5Var2 = new hl5(window2.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                (i2 >= 35 ? new pf9(window2, hl5Var2) : i2 >= 30 ? new of9(window2, hl5Var2) : i2 >= 26 ? new nf9(window2, hl5Var2) : new mf9(window2, hl5Var2)).m(z);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        if (this.c == window) {
            return;
        }
        this.c = window;
        if (window != null) {
            hl5 hl5Var = new hl5(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            this.d = (i >= 35 ? new pf9(window, hl5Var) : i >= 30 ? new of9(window, hl5Var) : i >= 26 ? new nf9(window, hl5Var) : new mf9(window, hl5Var)).i();
        }
    }
}
