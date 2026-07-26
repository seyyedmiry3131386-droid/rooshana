package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Recomposer$State;
import androidx.compose.ui.node.Owner;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.c24;
import defpackage.d01;
import defpackage.dg9;
import defpackage.e51;
import defpackage.eg9;
import defpackage.eq;
import defpackage.g64;
import defpackage.h27;
import defpackage.i64;
import defpackage.j27;
import defpackage.jl2;
import defpackage.js3;
import defpackage.ln2;
import defpackage.mg;
import defpackage.my4;
import defpackage.ny4;
import defpackage.q10;
import defpackage.qp2;
import defpackage.qx4;
import defpackage.qz0;
import defpackage.rn3;
import defpackage.rw2;
import defpackage.ry;
import defpackage.t69;
import defpackage.th0;
import defpackage.tt2;
import defpackage.tx8;
import defpackage.u69;
import defpackage.ur6;
import defpackage.w61;
import defpackage.zh6;
import java.lang.ref.WeakReference;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComposeView extends ViewGroup {
    public WeakReference a;
    public IBinder b;
    public t c;
    public d01 d;
    public bp2 e;
    public boolean f;
    public boolean g;
    public boolean h;

    public AbstractComposeView(Context context) {
        this(context, null, 6, 0);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(d01 d01Var) {
        if (this.d != d01Var) {
            this.d = d01Var;
            if (d01Var != null) {
                this.a = null;
            }
            t tVar = this.c;
            if (tVar != null) {
                tVar.a();
                this.c = null;
                if (isAttachedToWindow()) {
                    e();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.b != iBinder) {
            this.b = iBinder;
            this.a = null;
        }
    }

    public abstract void a(int i, qz0 qz0Var);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        if (this.g) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        if (this.d == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        e();
    }

    public final void d() {
        t tVar = this.c;
        if (tVar != null) {
            tVar.a();
        }
        this.c = null;
        requestLayout();
    }

    public final void e() {
        if (this.c == null) {
            try {
                this.g = true;
                this.c = u.a(this, h(), new androidx.compose.runtime.internal.a(-656146368, new qp2() { // from class: androidx.compose.ui.platform.AbstractComposeView$ensureCompositionCreated$1
                    {
                        super(2);
                    }

                    @Override // defpackage.qp2
                    public final Object invoke(Object obj, Object obj2) {
                        qz0 qz0Var = (qz0) obj;
                        int iIntValue = ((Number) obj2).intValue();
                        if (qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                            this.g.a(0, qz0Var);
                        } else {
                            qz0Var.U();
                        }
                        return tx8.a;
                    }
                }, true));
            } finally {
                this.g = false;
            }
        }
    }

    public void f(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void g(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m1getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(ur6.auto_clear_focus_behavior_tag);
        q10 q10Var = tag instanceof q10 ? (q10) tag : null;
        if (q10Var != null) {
            return q10Var.a;
        }
        return 1;
    }

    public final boolean getHasComposition() {
        return this.c != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f;
    }

    public final d01 h() {
        androidx.compose.runtime.k kVar;
        w61 w61Var;
        androidx.compose.runtime.f fVar;
        d01 d01VarB = this.d;
        if (d01VarB == null) {
            d01VarB = s.b(this);
            if (d01VarB == null) {
                Object parent = getParent();
                while (d01VarB == null && (parent instanceof View)) {
                    View view = (View) parent;
                    d01VarB = s.b(view);
                    parent = h27.j(view);
                }
            }
            if (d01VarB != null) {
                d01 d01Var = (!(d01VarB instanceof androidx.compose.runtime.k) || ((Recomposer$State) ((androidx.compose.runtime.k) d01VarB).v.getValue()).compareTo(Recomposer$State.b) > 0) ? d01VarB : null;
                if (d01Var != null) {
                    this.a = new WeakReference(d01Var);
                }
            } else {
                d01VarB = null;
            }
            if (d01VarB == null) {
                WeakReference weakReference = this.a;
                if (weakReference == null || (d01VarB = (d01) weakReference.get()) == null || ((d01VarB instanceof androidx.compose.runtime.k) && ((Recomposer$State) ((androidx.compose.runtime.k) d01VarB).v.getValue()).compareTo(Recomposer$State.b) <= 0)) {
                    d01VarB = null;
                }
                if (d01VarB == null) {
                    if (!isAttachedToWindow()) {
                        rn3.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object parent2 = getParent();
                    View view2 = this;
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    d01 d01VarB2 = s.b(view2);
                    if (d01VarB2 == null) {
                        ((dg9) eg9.a.get()).getClass();
                        w61 w61Var2 = EmptyCoroutineContext.a;
                        w61Var2.getClass();
                        c24 c24Var = h.m;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            w61Var = (w61) h.m.getValue();
                        } else {
                            w61Var = (w61) h.n.get();
                            if (w61Var == null) {
                                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                            }
                        }
                        w61 w61VarL0 = w61Var.l0(w61Var2);
                        qx4 qx4Var = (qx4) w61VarL0.r0(eq.D);
                        if (qx4Var != null) {
                            fVar = new androidx.compose.runtime.f(qx4Var);
                            ry ryVar = fVar.b;
                            synchronized (ryVar.c) {
                                ryVar.b = false;
                            }
                        } else {
                            fVar = null;
                        }
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        w61 ny4Var = (my4) w61VarL0.r0(th0.o);
                        if (ny4Var == null) {
                            ny4Var = new ny4();
                            ref$ObjectRef.a = ny4Var;
                        }
                        if (fVar != null) {
                            w61Var2 = fVar;
                        }
                        w61 w61VarL02 = w61VarL0.l0(w61Var2).l0(ny4Var);
                        kVar = new androidx.compose.runtime.k(w61VarL02);
                        kVar.P();
                        e51 e51VarA = js3.a(w61VarL02);
                        g64 g64VarD = j27.d(view2);
                        i64 i64VarD = g64VarD != null ? g64VarD.D() : null;
                        if (i64VarD == null) {
                            rn3.c("ViewTreeLifecycleOwner not found from " + view2);
                            throw new KotlinNothingValueException();
                        }
                        view2.addOnAttachStateChangeListener(new jl2(view2, kVar));
                        i64VarD.a(new r(e51VarA, fVar, kVar, ref$ObjectRef, view2));
                        view2.setTag(ur6.androidx_compose_ui_view_composition_context, kVar);
                        tt2 tt2Var = tt2.a;
                        Handler handler = view2.getHandler();
                        int i = rw2.a;
                        view2.addOnAttachStateChangeListener(new mg(9, bt2.G(tt2Var, new kotlinx.coroutines.android.a(handler, "windowRecomposer cleanup", false).f, null, new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(kVar, view2, null), 2)));
                    } else {
                        if (!(d01VarB2 instanceof androidx.compose.runtime.k)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        kVar = (androidx.compose.runtime.k) d01VarB2;
                    }
                    androidx.compose.runtime.k kVar2 = ((Recomposer$State) kVar.v.getValue()).compareTo(Recomposer$State.b) > 0 ? kVar : null;
                    if (kVar2 != null) {
                        this.a = new WeakReference(kVar2);
                    }
                    return kVar;
                }
            }
        }
        return d01VarB;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.h || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        f(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        e();
        g(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m2setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(ur6.auto_clear_focus_behavior_tag, new q10(i));
    }

    public final void setParentCompositionContext(d01 d01Var) {
        setParentContext(d01Var);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.f = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((Owner) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.h = true;
    }

    public final void setViewCompositionStrategy(u69 u69Var) {
        bp2 bp2Var = this.e;
        if (bp2Var != null) {
            ((ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1) bp2Var).invoke();
        }
        ((ln2) u69Var).getClass();
        mg mgVar = new mg(8, this);
        addOnAttachStateChangeListener(mgVar);
        t69 t69Var = new t69(this);
        zh6.b(this).a.add(t69Var);
        this.e = new ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1(this, mgVar, t69Var);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        mg mgVar = new mg(8, this);
        addOnAttachStateChangeListener(mgVar);
        t69 t69Var = new t69(this);
        zh6.b(this).a.add(t69Var);
        this.e = new ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1(this, mgVar, t69Var);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        b();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        b();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        b();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i, layoutParams);
    }

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
