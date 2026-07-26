package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class af0 extends sb7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CoordinatorLayout.Behavior b;

    public /* synthetic */ af0(CoordinatorLayout.Behavior behavior, int i) {
        this.a = i;
        this.b = behavior;
    }

    @Override // defpackage.sb7
    public final int c(int i, View view) {
        switch (this.a) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                return at2.S(i, sideSheetBehavior.a.k(), sideSheetBehavior.a.j());
        }
    }

    @Override // defpackage.sb7
    public final int d(int i, View view) {
        switch (this.a) {
            case 0:
                return at2.S(i, ((BottomSheetBehavior) this.b).H(), l());
            default:
                return view.getTop();
        }
    }

    @Override // defpackage.sb7
    public int k(View view) {
        switch (this.a) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                return sideSheetBehavior.l + sideSheetBehavior.o;
            default:
                return super.k(view);
        }
    }

    @Override // defpackage.sb7
    public int l() {
        switch (this.a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.b;
                int i = BottomSheetBehavior.G0;
                return bottomSheetBehavior.I ? bottomSheetBehavior.V : bottomSheetBehavior.G;
            default:
                return super.l();
        }
    }

    @Override // defpackage.sb7
    public final void t(int i) {
        switch (this.a) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.b;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.P(1);
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                    if (sideSheetBehavior.g) {
                        sideSheetBehavior.z(1);
                    }
                }
                break;
        }
    }

    @Override // defpackage.sb7
    public final void u(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.a) {
            case 0:
                ((BottomSheetBehavior) this.b).D(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                WeakReference weakReference = sideSheetBehavior.q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.a.z(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.v;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.a.c(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw bl4.o(it);
                }
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    @Override // defpackage.sb7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.af0.v(android.view.View, float, float):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    @Override // defpackage.sb7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w(int r5, android.view.View r6) {
        /*
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 0: goto L1c;
                default: goto L5;
            }
        L5:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r5 = r4.b
            com.google.android.material.sidesheet.SideSheetBehavior r5 = (com.google.android.material.sidesheet.SideSheetBehavior) r5
            int r0 = r5.h
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L10
            goto L1b
        L10:
            java.lang.ref.WeakReference r5 = r5.p
            if (r5 == 0) goto L1b
            java.lang.Object r5 = r5.get()
            if (r5 != r6) goto L1b
            r1 = r2
        L1b:
            return r1
        L1c:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r4.b
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            int r1 = r0.N
            r2 = 1
            if (r1 != r2) goto L26
            goto L56
        L26:
            boolean r3 = r0.C0
            if (r3 == 0) goto L2b
            goto L56
        L2b:
            r3 = 3
            if (r1 != r3) goto L48
            int r1 = r0.A0
            if (r1 != r5) goto L48
            java.lang.ref.WeakReference r5 = r0.Z
            if (r5 == 0) goto L3d
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            goto L3e
        L3d:
            r5 = 0
        L3e:
            if (r5 == 0) goto L48
            r1 = -1
            boolean r5 = r5.canScrollVertically(r1)
            if (r5 == 0) goto L48
            goto L56
        L48:
            android.os.SystemClock.uptimeMillis()
            java.lang.ref.WeakReference r5 = r0.W
            if (r5 == 0) goto L56
            java.lang.Object r5 = r5.get()
            if (r5 != r6) goto L56
            goto L57
        L56:
            r2 = 0
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.af0.w(int, android.view.View):boolean");
    }
}
