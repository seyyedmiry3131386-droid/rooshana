package defpackage;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class if0 extends nn {
    public BottomSheetBehavior g;
    public FrameLayout h;
    public CoordinatorLayout i;
    public FrameLayout j;
    public boolean k;
    public boolean l;
    public boolean m;
    public hf0 n;
    public boolean o;
    public pa2 p;
    public gf0 q;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        h();
        super.cancel();
    }

    public final void g() {
        if (this.h == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), is6.design_bottom_sheet_dialog, null);
            this.h = frameLayout;
            this.i = (CoordinatorLayout) frameLayout.findViewById(qr6.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.h.findViewById(qr6.design_bottom_sheet);
            this.j = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorF = BottomSheetBehavior.F(frameLayout2);
            this.g = bottomSheetBehaviorF;
            bottomSheetBehaviorF.y(this.q);
            this.g.M(this.k);
            this.p = new pa2(this.g, this.j);
        }
    }

    public final BottomSheetBehavior h() {
        if (this.g == null) {
            g();
        }
        return this.g;
    }

    public final FrameLayout i(View view, int i, ViewGroup.LayoutParams layoutParams) {
        g();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.h.findViewById(qr6.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.o) {
            FrameLayout frameLayout = this.h;
            nm5 nm5Var = new nm5(9, this);
            WeakHashMap weakHashMap = q69.a;
            h69.m(frameLayout, nm5Var);
        }
        this.j.removeAllViews();
        if (layoutParams == null) {
            this.j.addView(view);
        } else {
            this.j.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(qr6.touch_outside).setOnClickListener(new r5(2, this));
        q69.q(this.j, new n90(1, this));
        this.j.setOnTouchListener(new q90(1));
        return this.h;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.o && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.h;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.i;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            j97.d(window, !z);
            hf0 hf0Var = this.n;
            if (hf0Var != null) {
                hf0Var.e(window);
            }
        }
        pa2 pa2Var = this.p;
        if (pa2Var == null) {
            return;
        }
        if (this.k) {
            pa2Var.E(false);
        } else {
            pa2Var.H();
        }
    }

    @Override // defpackage.nn, defpackage.jy0, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        hf0 hf0Var = this.n;
        if (hf0Var != null) {
            hf0Var.e(null);
        }
        pa2 pa2Var = this.p;
        if (pa2Var != null) {
            pa2Var.H();
        }
    }

    @Override // defpackage.jy0, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.g;
        if (bottomSheetBehavior == null || bottomSheetBehavior.N != 5) {
            return;
        }
        bottomSheetBehavior.O(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        pa2 pa2Var;
        super.setCancelable(z);
        if (this.k != z) {
            this.k = z;
            BottomSheetBehavior bottomSheetBehavior = this.g;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.M(z);
            }
            if (getWindow() == null || (pa2Var = this.p) == null) {
                return;
            }
            if (this.k) {
                pa2Var.E(false);
            } else {
                pa2Var.H();
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.k) {
            this.k = true;
        }
        this.l = z;
        this.m = true;
    }

    @Override // defpackage.nn, defpackage.jy0, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(i(null, i, null));
    }

    @Override // defpackage.nn, defpackage.jy0, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(i(view, 0, null));
    }

    @Override // defpackage.nn, defpackage.jy0, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(i(view, 0, layoutParams));
    }
}
