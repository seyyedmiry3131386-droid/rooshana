package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.compose.ui.node.Owner;
import defpackage.c26;
import defpackage.dp2;
import defpackage.gx4;
import defpackage.jg2;
import defpackage.km0;
import defpackage.lg2;
import defpackage.ng2;
import defpackage.pg2;
import defpackage.rf0;
import defpackage.rn3;
import defpackage.sy6;
import defpackage.ti1;
import defpackage.tx8;
import defpackage.y40;
import defpackage.zb5;
import defpackage.zk8;

/* JADX INFO: loaded from: classes.dex */
public final class f extends gx4 implements pg2, ViewTreeObserver.OnGlobalFocusChangeListener {
    public View o;
    public ViewTreeObserver p;
    public final dp2 q = new dp2() { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onEnter$1
        {
            super(1);
        }

        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            km0 km0Var = (km0) obj;
            f fVar = this.g;
            View viewF = c26.f(fVar);
            if (!viewF.isFocused() && !viewF.hasFocus()) {
                lg2 focusOwner = y40.I(fVar).getFocusOwner();
                View viewJ = rf0.J(fVar);
                Integer numC = jg2.c(km0Var.a);
                int[] iArr = new int[2];
                viewJ.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewF.getLocationOnScreen(iArr2);
                androidx.compose.ui.focus.d dVarA = zk8.A(((androidx.compose.ui.focus.c) focusOwner).c);
                Rect rect = null;
                sy6 sy6VarC = dVarA != null ? zk8.C(dVarA) : null;
                if (sy6VarC != null) {
                    int i = (int) sy6VarC.a;
                    int i2 = iArr[0];
                    int i3 = iArr2[0];
                    int i4 = (int) sy6VarC.b;
                    int i5 = iArr[1];
                    int i6 = iArr2[1];
                    rect = new Rect((i + i2) - i3, (i4 + i5) - i6, (((int) sy6VarC.c) + i2) - i3, (((int) sy6VarC.d) + i5) - i6);
                }
                if (!jg2.b(viewF, numC, rect)) {
                    km0Var.b = true;
                }
            }
            return tx8.a;
        }
    };
    public final dp2 r = new dp2() { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onExit$1
        {
            super(1);
        }

        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            c26.f(this.g);
            return tx8.a;
        }
    };

    public final androidx.compose.ui.focus.d C0() {
        if (!this.a.n) {
            rn3.b("visitLocalDescendants called on an unattached node");
        }
        gx4 gx4Var = this.a;
        if ((gx4Var.d & 1024) != 0) {
            boolean z = false;
            for (gx4 gx4Var2 = gx4Var.f; gx4Var2 != null; gx4Var2 = gx4Var2.f) {
                if ((gx4Var2.c & 1024) != 0) {
                    gx4 gx4VarJ = gx4Var2;
                    zb5 zb5Var = null;
                    while (gx4VarJ != null) {
                        if (gx4VarJ instanceof androidx.compose.ui.focus.d) {
                            androidx.compose.ui.focus.d dVar = (androidx.compose.ui.focus.d) gx4VarJ;
                            if (z) {
                                return dVar;
                            }
                            z = true;
                        } else if ((gx4VarJ.c & 1024) != 0 && (gx4VarJ instanceof ti1)) {
                            int i = 0;
                            for (gx4 gx4Var3 = ((ti1) gx4VarJ).p; gx4Var3 != null; gx4Var3 = gx4Var3.f) {
                                if ((gx4Var3.c & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        gx4VarJ = gx4Var3;
                                    } else {
                                        if (zb5Var == null) {
                                            zb5Var = new zb5(0, new gx4[16]);
                                        }
                                        if (gx4VarJ != null) {
                                            zb5Var.b(gx4VarJ);
                                            gx4VarJ = null;
                                        }
                                        zb5Var.b(gx4Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        gx4VarJ = y40.j(zb5Var);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        if (y40.H(this).p == null) {
            return;
        }
        View viewF = c26.f(this);
        lg2 focusOwner = y40.I(this).getFocusOwner();
        Owner ownerI = y40.I(this);
        boolean z2 = true;
        if (view == null || view.equals(ownerI)) {
            z = false;
        } else {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == viewF.getParent()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (view2 == null || view2.equals(ownerI)) {
            z2 = false;
        } else {
            for (ViewParent parent2 = view2.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                if (parent2 == viewF.getParent()) {
                    break;
                }
            }
            z2 = false;
        }
        if (z && z2) {
            this.o = view2;
            return;
        }
        if (z2) {
            this.o = view2;
            androidx.compose.ui.focus.d dVarC0 = C0();
            if (dVarC0.H0().a()) {
                return;
            }
            androidx.compose.ui.focus.e.q(dVarC0);
            return;
        }
        if (!z) {
            this.o = null;
            return;
        }
        this.o = null;
        if (C0().H0().b()) {
            ((androidx.compose.ui.focus.c) focusOwner).b(8, false, false);
        }
    }

    @Override // defpackage.gx4
    public final void s0() {
        ViewTreeObserver viewTreeObserver = rf0.J(this).getViewTreeObserver();
        this.p = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // defpackage.gx4
    public final void u0() {
        ViewTreeObserver viewTreeObserver = this.p;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.p = null;
        rf0.J(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.o = null;
    }

    @Override // defpackage.pg2
    public final void w(ng2 ng2Var) {
        ng2Var.b(false);
        ng2Var.c(this.q);
        ng2Var.d(this.r);
    }
}
