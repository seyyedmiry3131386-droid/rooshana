package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.m;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes.dex */
public final class ge9 extends zk8 implements u5 {
    public static final AccelerateInterpolator P = new AccelerateInterpolator();
    public static final DecelerateInterpolator Q = new DecelerateInterpolator();
    public do3 A;
    public boolean B;
    public final ArrayList C;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public y89 J;
    public boolean K;
    public boolean L;
    public final ee9 M;
    public final ee9 N;
    public final xg5 O;
    public Context q;
    public Context r;
    public ActionBarOverlayLayout s;
    public ActionBarContainer t;
    public kc1 u;
    public ActionBarContextView v;
    public final View w;
    public boolean x;
    public fe9 y;
    public fe9 z;

    public ge9(Activity activity2, boolean z) {
        new ArrayList();
        this.C = new ArrayList();
        this.D = 0;
        this.E = true;
        this.I = true;
        this.M = new ee9(this, 0);
        this.N = new ee9(this, 1);
        this.O = new xg5(18, this);
        View decorView = activity2.getWindow().getDecorView();
        s0(decorView);
        if (z) {
            return;
        }
        this.w = decorView.findViewById(R.id.content);
    }

    @Override // defpackage.zk8
    public final int F() {
        return ((m) this.u).b;
    }

    @Override // defpackage.zk8
    public final Context G() {
        if (this.r == null) {
            TypedValue typedValue = new TypedValue();
            this.q.getTheme().resolveAttribute(xp6.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.r = new ContextThemeWrapper(this.q, i);
            } else {
                this.r = this.q;
            }
        }
        return this.r;
    }

    @Override // defpackage.zk8
    public final void H() {
        if (this.F) {
            return;
        }
        this.F = true;
        v0(false);
    }

    @Override // defpackage.zk8
    public final void R() {
        u0(w5.b(this.q).a.getResources().getBoolean(zp6.abc_action_bar_embed_tabs));
    }

    @Override // defpackage.zk8
    public final boolean T(int i, KeyEvent keyEvent) {
        ot4 ot4Var;
        fe9 fe9Var = this.y;
        if (fe9Var == null || (ot4Var = fe9Var.d) == null) {
            return false;
        }
        ot4Var.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return ot4Var.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.zk8
    public final void c0(boolean z) {
        if (this.x) {
            return;
        }
        d0(z);
    }

    @Override // defpackage.zk8
    public final void d0(boolean z) {
        t0(z ? 4 : 0, 4);
    }

    @Override // defpackage.zk8
    public final void e0() {
        t0(2, 2);
    }

    @Override // defpackage.zk8
    public final void f0() {
        t0(8, 8);
    }

    @Override // defpackage.zk8
    public final void g0(Drawable drawable) {
        m mVar = (m) this.u;
        mVar.f = drawable;
        Toolbar toolbar = mVar.a;
        if ((mVar.b & 4) != 0) {
            toolbar.setNavigationIcon(drawable);
        } else {
            toolbar.setNavigationIcon((Drawable) null);
        }
    }

    @Override // defpackage.zk8
    public final void h0() {
        this.u.getClass();
    }

    @Override // defpackage.zk8
    public final void i0() {
        m mVar = (m) this.u;
        mVar.d = null;
        mVar.e();
    }

    @Override // defpackage.zk8
    public final void k0(boolean z) {
        y89 y89Var;
        this.K = z;
        if (z || (y89Var = this.J) == null) {
            return;
        }
        y89Var.a();
    }

    @Override // defpackage.zk8
    public final void l0(CharSequence charSequence) {
        m mVar = (m) this.u;
        if (mVar.g) {
            return;
        }
        Toolbar toolbar = mVar.a;
        mVar.h = charSequence;
        if ((mVar.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (mVar.g) {
                q69.r(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.zk8
    public final void m0() {
        if (this.F) {
            this.F = false;
            v0(false);
        }
    }

    @Override // defpackage.zk8
    public final k6 n0(do3 do3Var) {
        fe9 fe9Var = this.y;
        if (fe9Var != null) {
            fe9Var.a();
        }
        this.s.setHideOnContentScrollEnabled(false);
        this.v.e();
        fe9 fe9Var2 = new fe9(this, this.v.getContext(), do3Var);
        ot4 ot4Var = fe9Var2.d;
        ot4Var.y();
        try {
            if (!((o77) fe9Var2.e.a).y(fe9Var2, ot4Var)) {
                return null;
            }
            this.y = fe9Var2;
            fe9Var2.j();
            this.v.c(fe9Var2);
            r0(true);
            return fe9Var2;
        } finally {
            ot4Var.x();
        }
    }

    public final void r0(boolean z) {
        x89 x89VarI;
        x89 x89VarI2;
        if (z) {
            if (!this.H) {
                this.H = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.s;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                v0(false);
            }
        } else if (this.H) {
            this.H = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.s;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            v0(false);
        }
        if (!this.t.isLaidOut()) {
            if (z) {
                ((m) this.u).a.setVisibility(4);
                this.v.setVisibility(0);
                return;
            } else {
                ((m) this.u).a.setVisibility(0);
                this.v.setVisibility(8);
                return;
            }
        }
        if (z) {
            m mVar = (m) this.u;
            x89VarI = q69.b(mVar.a);
            x89VarI.a(0.0f);
            x89VarI.c(100L);
            x89VarI.e(new wn8(mVar, 4));
            x89VarI2 = this.v.i(0, 200L);
        } else {
            m mVar2 = (m) this.u;
            x89 x89VarB = q69.b(mVar2.a);
            x89VarB.a(1.0f);
            x89VarB.c(200L);
            x89VarB.e(new wn8(mVar2, 0));
            x89VarI = this.v.i(8, 100L);
            x89VarI2 = x89VarB;
        }
        y89 y89Var = new y89();
        ArrayList arrayList = y89Var.a;
        arrayList.add(x89VarI);
        View view = (View) x89VarI.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) x89VarI2.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(x89VarI2);
        y89Var.b();
    }

    public final void s0(View view) {
        kc1 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(pr6.decor_content_parent);
        this.s = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(pr6.action_bar);
        if (callbackFindViewById instanceof kc1) {
            wrapper = (kc1) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : Ssh2PublicKeyAlgorithmName.NULL));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.u = wrapper;
        this.v = (ActionBarContextView) view.findViewById(pr6.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(pr6.action_bar_container);
        this.t = actionBarContainer;
        kc1 kc1Var = this.u;
        if (kc1Var == null || this.v == null || actionBarContainer == null) {
            throw new IllegalStateException(ge9.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((m) kc1Var).a.getContext();
        this.q = context;
        if ((((m) this.u).b & 4) != 0) {
            this.x = true;
        }
        Context context2 = w5.b(context).a;
        int i = context2.getApplicationInfo().targetSdkVersion;
        h0();
        u0(context2.getResources().getBoolean(zp6.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.q.obtainStyledAttributes(null, lu6.ActionBar, xp6.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(lu6.ActionBar_hideOnContentScroll, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.s;
            if (!actionBarOverlayLayout2.g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.L = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(lu6.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.t;
            WeakHashMap weakHashMap = q69.a;
            h69.l(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void t0(int i, int i2) {
        m mVar = (m) this.u;
        int i3 = mVar.b;
        if ((i2 & 4) != 0) {
            this.x = true;
        }
        mVar.c((i & i2) | ((~i2) & i3));
    }

    public final void u0(boolean z) {
        if (z) {
            this.t.setTabContainer(null);
            ((m) this.u).getClass();
        } else {
            ((m) this.u).getClass();
            this.t.setTabContainer(null);
        }
        this.u.getClass();
        ((m) this.u).a.setCollapsible(false);
        this.s.setHasNonEmbeddedTabs(false);
    }

    @Override // defpackage.zk8
    public final boolean v() {
        kc1 kc1Var = this.u;
        if (kc1Var == null || !((m) kc1Var).a.o()) {
            return false;
        }
        ((m) this.u).a.d();
        return true;
    }

    public final void v0(boolean z) {
        boolean z2 = this.F;
        boolean z3 = this.G;
        boolean z4 = this.H;
        int i = 6;
        xg5 xg5Var = this.O;
        View view = this.w;
        if (!z4 && (z2 || z3)) {
            if (this.I) {
                this.I = false;
                y89 y89Var = this.J;
                if (y89Var != null) {
                    y89Var.a();
                }
                int i2 = this.D;
                ee9 ee9Var = this.M;
                if (i2 != 0 || (!this.K && !z)) {
                    ee9Var.b(null);
                    return;
                }
                this.t.setAlpha(1.0f);
                this.t.setTransitioning(true);
                y89 y89Var2 = new y89();
                float f = -this.t.getHeight();
                if (z) {
                    this.t.getLocationInWindow(new int[]{0, 0});
                    f -= r13[1];
                }
                x89 x89VarB = q69.b(this.t);
                x89VarB.g(f);
                View view2 = (View) x89VarB.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(xg5Var != null ? new pj(xg5Var, view2, i) : null);
                }
                boolean z5 = y89Var2.e;
                ArrayList arrayList = y89Var2.a;
                if (!z5) {
                    arrayList.add(x89VarB);
                }
                if (this.E && view != null) {
                    x89 x89VarB2 = q69.b(view);
                    x89VarB2.g(f);
                    if (!y89Var2.e) {
                        arrayList.add(x89VarB2);
                    }
                }
                boolean z6 = y89Var2.e;
                if (!z6) {
                    y89Var2.c = P;
                }
                if (!z6) {
                    y89Var2.b = 250L;
                }
                if (!z6) {
                    y89Var2.d = ee9Var;
                }
                this.J = y89Var2;
                y89Var2.b();
                return;
            }
            return;
        }
        if (this.I) {
            return;
        }
        this.I = true;
        y89 y89Var3 = this.J;
        if (y89Var3 != null) {
            y89Var3.a();
        }
        this.t.setVisibility(0);
        int i3 = this.D;
        ee9 ee9Var2 = this.N;
        if (i3 == 0 && (this.K || z)) {
            this.t.setTranslationY(0.0f);
            float f2 = -this.t.getHeight();
            if (z) {
                this.t.getLocationInWindow(new int[]{0, 0});
                f2 -= r13[1];
            }
            this.t.setTranslationY(f2);
            y89 y89Var4 = new y89();
            x89 x89VarB3 = q69.b(this.t);
            x89VarB3.g(0.0f);
            View view3 = (View) x89VarB3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(xg5Var != null ? new pj(xg5Var, view3, i) : null);
            }
            boolean z7 = y89Var4.e;
            ArrayList arrayList2 = y89Var4.a;
            if (!z7) {
                arrayList2.add(x89VarB3);
            }
            if (this.E && view != null) {
                view.setTranslationY(f2);
                x89 x89VarB4 = q69.b(view);
                x89VarB4.g(0.0f);
                if (!y89Var4.e) {
                    arrayList2.add(x89VarB4);
                }
            }
            boolean z8 = y89Var4.e;
            if (!z8) {
                y89Var4.c = Q;
            }
            if (!z8) {
                y89Var4.b = 250L;
            }
            if (!z8) {
                y89Var4.d = ee9Var2;
            }
            this.J = y89Var4;
            y89Var4.b();
        } else {
            this.t.setAlpha(1.0f);
            this.t.setTranslationY(0.0f);
            if (this.E && view != null) {
                view.setTranslationY(0.0f);
            }
            ee9Var2.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.s;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = q69.a;
            f69.c(actionBarOverlayLayout);
        }
    }

    @Override // defpackage.zk8
    public final void y(boolean z) {
        if (z == this.B) {
            return;
        }
        this.B = z;
        ArrayList arrayList = this.C;
        if (arrayList.size() > 0) {
            throw rm7.l(0, arrayList);
        }
    }

    public ge9(Dialog dialog) {
        new ArrayList();
        this.C = new ArrayList();
        this.D = 0;
        this.E = true;
        this.I = true;
        this.M = new ee9(this, 0);
        this.N = new ee9(this, 1);
        this.O = new xg5(18, this);
        s0(dialog.getWindow().getDecorView());
    }
}
