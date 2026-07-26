package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.a96;
import defpackage.b96;
import defpackage.bp2;
import defpackage.dl4;
import defpackage.dp2;
import defpackage.dy3;
import defpackage.eg2;
import defpackage.el4;
import defpackage.f14;
import defpackage.fs8;
import defpackage.gg9;
import defpackage.gx4;
import defpackage.hy3;
import defpackage.in7;
import defpackage.is3;
import defpackage.jg2;
import defpackage.js3;
import defpackage.mb5;
import defpackage.nn7;
import defpackage.rb5;
import defpackage.rg0;
import defpackage.ri1;
import defpackage.rq3;
import defpackage.s08;
import defpackage.sy6;
import defpackage.tx3;
import defpackage.tx8;
import defpackage.uf9;
import defpackage.v04;
import defpackage.vf9;
import defpackage.wb5;
import defpackage.we4;
import defpackage.wf9;
import defpackage.wy6;
import defpackage.ya5;
import defpackage.yk4;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class a extends gx4 implements rg0, in7, hy3, f14, fs8, ri1 {
    public final dp2 o = new dp2() { // from class: androidx.compose.ui.platform.AndroidComposeView$RootModifierNode$rulerLambda$1
        {
            super(1);
        }

        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            we4 we4Var = (we4) obj;
            AndroidComposeView androidComposeView = this.g.p;
            if (androidComposeView.getInsetsListener().g.h() > 0) {
                ya5 ya5Var = wf9.a;
                we4Var.a = true;
                androidx.compose.ui.node.j jVar = we4Var.d;
                v04 v04VarP0 = jVar.p0();
                if (rq3.a(we4Var.b, 9223372034707292159L)) {
                    we4Var.b = is3.I(v04VarP0.q(0L));
                    we4Var.c = v04VarP0.k();
                }
                jVar.f0().t().b();
                long jK = v04VarP0.k();
                rb5 rb5Var = androidComposeView.getInsetsListener().f;
                int i = (int) (jK >> 32);
                int i2 = (int) (jK & 4294967295L);
                for (uf9 uf9Var : wf9.b) {
                    Object objG = rb5Var.g(uf9Var);
                    js3.m(objG);
                    gg9 gg9Var = (gg9) objG;
                    vf9 vf9Var = (vf9) uf9Var;
                    wf9.a(we4Var, vf9Var.c, gg9Var.h, i, i2);
                    if (((Boolean) ((s08) gg9Var.b).getValue()).booleanValue()) {
                        wf9.a(we4Var, gg9Var.f, gg9Var.j, i, i2);
                        wf9.a(we4Var, gg9Var.g, gg9Var.k, i, i2);
                    }
                    wf9.a(we4Var, vf9Var.d, gg9Var.i, i, i2);
                }
                mb5 mb5Var = androidComposeView.getInsetsListener().h;
                if (mb5Var.e()) {
                    SnapshotStateList snapshotStateList = androidComposeView.getInsetsListener().i;
                    Object[] objArr = mb5Var.a;
                    int i3 = mb5Var.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        wb5 wb5Var = (wb5) objArr[i4];
                        wy6 wy6Var = (wy6) snapshotStateList.get(i4);
                        Rect rect = (Rect) wb5Var.getValue();
                        we4Var.a(wy6Var.b(), rect.left);
                        we4Var.a(wy6Var.c(), rect.top);
                        we4Var.a(wy6Var.d(), rect.right);
                        we4Var.a(wy6Var.a(), rect.bottom);
                    }
                }
            }
            return tx8.a;
        }
    };
    public final /* synthetic */ AndroidComposeView p;

    public a(AndroidComposeView androidComposeView) {
        this.p = androidComposeView;
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // defpackage.rg0
    public final Object W(androidx.compose.ui.node.m mVar, bp2 bp2Var, ContinuationImpl continuationImpl) {
        long jK = mVar.K(0L);
        sy6 sy6Var = (sy6) bp2Var.invoke();
        sy6 sy6VarI = sy6Var != null ? sy6Var.i(jK) : null;
        if (sy6VarI != null) {
            this.p.requestRectangleOnScreen(new Rect((int) sy6VarI.a, (int) sy6VarI.b, (int) sy6VarI.c, (int) sy6VarI.d), false);
        }
        return tx8.a;
    }

    @Override // defpackage.f14
    public final /* synthetic */ int a(androidx.compose.ui.node.j jVar, yk4 yk4Var, int i) {
        return androidx.compose.ui.node.f.d(this, jVar, yk4Var, i);
    }

    @Override // defpackage.f14
    public final /* synthetic */ int b(androidx.compose.ui.node.j jVar, yk4 yk4Var, int i) {
        return androidx.compose.ui.node.f.c(this, jVar, yk4Var, i);
    }

    @Override // defpackage.f14
    public final dl4 c(el4 el4Var, yk4 yk4Var, long j) {
        final b96 b96VarT = yk4Var.t(j);
        return el4Var.Z(b96VarT.a, b96VarT.b, kotlin.collections.b.I(), this.o, new dp2() { // from class: androidx.compose.ui.platform.AndroidComposeView$RootModifierNode$measure$1
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                ((a96) obj).g(b96VarT, 0, 0, 0.0f);
                return tx8.a;
            }
        });
    }

    @Override // defpackage.f14
    public final /* synthetic */ int e(androidx.compose.ui.node.j jVar, yk4 yk4Var, int i) {
        return androidx.compose.ui.node.f.b(this, jVar, yk4Var, i);
    }

    @Override // defpackage.f14
    public final /* synthetic */ int f(androidx.compose.ui.node.j jVar, yk4 yk4Var, int i) {
        return androidx.compose.ui.node.f.a(this, jVar, yk4Var, i);
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // defpackage.hy3
    public final boolean i(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.fs8
    public final Object l() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean m0() {
        return false;
    }

    @Override // defpackage.hy3
    public final boolean x(KeyEvent keyEvent) {
        final eg2 eg2Var;
        int[] iArr = jg2.a;
        long jW = dy3.w(keyEvent);
        boolean z = true;
        if (tx3.a(jW, tx3.b)) {
            eg2Var = new eg2(2);
        } else if (tx3.a(jW, tx3.c)) {
            eg2Var = new eg2(1);
        } else if (tx3.a(jW, tx3.p)) {
            eg2Var = new eg2(keyEvent.isShiftPressed() ? 2 : 1);
        } else {
            eg2Var = tx3.a(jW, tx3.g) ? new eg2(4) : tx3.a(jW, tx3.f) ? new eg2(3) : (tx3.a(jW, tx3.d) || tx3.a(jW, tx3.C)) ? new eg2(5) : (tx3.a(jW, tx3.e) || tx3.a(jW, tx3.D)) ? new eg2(6) : (tx3.a(jW, tx3.h) || tx3.a(jW, tx3.r) || tx3.a(jW, tx3.E)) ? new eg2(7) : (tx3.a(jW, tx3.a) || tx3.a(jW, tx3.u)) ? new eg2(8) : null;
        }
        if (eg2Var != null) {
            int i = eg2Var.a;
            if (dy3.z(keyEvent) == 2) {
                AndroidComposeView androidComposeView = this.p;
                androidx.compose.ui.focus.d dVarF = ((androidx.compose.ui.focus.c) androidComposeView.getFocusOwner()).f();
                if (dVarF == null || !dVarF.o || !androidComposeView.v(i)) {
                    Boolean boolE = ((androidx.compose.ui.focus.c) androidComposeView.getFocusOwner()).e(i, androidComposeView.getEmbeddedViewFocusRect(), new dp2() { // from class: androidx.compose.ui.platform.AndroidComposeView$RootModifierNode$onKeyEvent$focusWasMovedOrCancelled$1
                        {
                            super(1);
                        }

                        @Override // defpackage.dp2
                        public final Object invoke(Object obj) {
                            return Boolean.valueOf(((androidx.compose.ui.focus.d) obj).J0(eg2Var.a));
                        }
                    });
                    if (!(boolE != null ? boolE.booleanValue() : true)) {
                        if (i != 1 && i != 2) {
                            z = false;
                        }
                        if (z) {
                            Integer numC = jg2.c(i);
                            int iIntValue = numC != null ? numC.intValue() : 2;
                            FocusFinder focusFinder = FocusFinder.getInstance();
                            View rootView = androidComposeView.getRootView();
                            js3.n(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, androidComposeView.getView(), iIntValue);
                            if (viewFindNextFocus == null || viewFindNextFocus.equals(androidComposeView)) {
                                return ((androidx.compose.ui.focus.c) androidComposeView.getFocusOwner()).h(i);
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.in7
    public final void k0(nn7 nn7Var) {
    }
}
