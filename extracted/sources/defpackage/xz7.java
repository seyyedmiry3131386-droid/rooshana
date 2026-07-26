package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* JADX INFO: loaded from: classes.dex */
public final class xz7 extends r90 {
    public static final int[] F = {vp6.snackbarButtonStyle, vp6.snackbarTextViewStyle};
    public final AccessibilityManager E;

    public xz7(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.E = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[LOOP:0: B:3:0x0002->B:35:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.xz7 i(android.view.View r7) {
        /*
            r0 = 0
            r1 = r0
        L2:
            boolean r2 = r7 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r2 == 0) goto L9
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L2d
        L9:
            boolean r2 = r7 instanceof android.widget.FrameLayout
            if (r2 == 0) goto L1c
            int r1 = r7.getId()
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            if (r1 != r2) goto L19
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L2d
        L19:
            r1 = r7
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L1c:
            if (r7 == 0) goto L2a
            android.view.ViewParent r7 = r7.getParent()
            boolean r2 = r7 instanceof android.view.View
            if (r2 == 0) goto L29
            android.view.View r7 = (android.view.View) r7
            goto L2a
        L29:
            r7 = r0
        L2a:
            if (r7 != 0) goto L2
            r7 = r1
        L2d:
            if (r7 == 0) goto L74
            android.content.Context r0 = r7.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            int[] r2 = defpackage.xz7.F
            android.content.res.TypedArray r2 = r0.obtainStyledAttributes(r2)
            r3 = 0
            r4 = -1
            int r5 = r2.getResourceId(r3, r4)
            r6 = 1
            int r6 = r2.getResourceId(r6, r4)
            r2.recycle()
            if (r5 == r4) goto L52
            if (r6 == r4) goto L52
            int r2 = defpackage.is6.mtrl_layout_snackbar_include
            goto L54
        L52:
            int r2 = defpackage.is6.design_layout_snackbar_include
        L54:
            android.view.View r1 = r1.inflate(r2, r7, r3)
            com.google.android.material.snackbar.SnackbarContentLayout r1 = (com.google.android.material.snackbar.SnackbarContentLayout) r1
            xz7 r2 = new xz7
            r2.<init>(r0, r7, r1, r1)
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r7 = r2.i
            android.view.View r7 = r7.getChildAt(r3)
            com.google.android.material.snackbar.SnackbarContentLayout r7 = (com.google.android.material.snackbar.SnackbarContentLayout) r7
            android.widget.TextView r7 = r7.getMessageView()
            java.lang.String r0 = ""
            r7.setText(r0)
            r7 = -2
            r2.k = r7
            return r2
        L74:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "No suitable parent found from the given view. Please provide a valid view."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xz7.i(android.view.View):xz7");
    }

    public final boolean h() {
        boolean zV;
        o77 o77VarT = o77.t();
        o90 o90Var = this.x;
        synchronized (o77VarT.a) {
            zV = o77VarT.v(o90Var);
        }
        return zV;
    }

    public final void j() {
        o77 o77VarT = o77.t();
        int recommendedTimeoutMillis = this.k;
        if (recommendedTimeoutMillis == -2) {
            recommendedTimeoutMillis = -2;
        } else if (Build.VERSION.SDK_INT >= 29) {
            recommendedTimeoutMillis = this.E.getRecommendedTimeoutMillis(recommendedTimeoutMillis, 3);
        }
        o90 o90Var = this.x;
        synchronized (o77VarT.a) {
            try {
                if (o77VarT.v(o90Var)) {
                    yz7 yz7Var = (yz7) o77VarT.c;
                    yz7Var.b = recommendedTimeoutMillis;
                    ((Handler) o77VarT.b).removeCallbacksAndMessages(yz7Var);
                    o77VarT.D((yz7) o77VarT.c);
                    return;
                }
                yz7 yz7Var2 = (yz7) o77VarT.d;
                if (yz7Var2 != null && yz7Var2.a.get() == o90Var) {
                    ((yz7) o77VarT.d).b = recommendedTimeoutMillis;
                } else {
                    o77VarT.d = new yz7(recommendedTimeoutMillis, o90Var);
                }
                yz7 yz7Var3 = (yz7) o77VarT.c;
                if (yz7Var3 == null || !o77VarT.l(yz7Var3, 4)) {
                    o77VarT.c = null;
                    o77VarT.F();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
