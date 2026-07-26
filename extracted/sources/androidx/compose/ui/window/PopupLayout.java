package androidx.compose.ui.window;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.a18;
import defpackage.bp2;
import defpackage.ck1;
import defpackage.d01;
import defpackage.d8;
import defpackage.do1;
import defpackage.dp2;
import defpackage.ei6;
import defpackage.fi6;
import defpackage.gi6;
import defpackage.hs9;
import defpackage.j27;
import defpackage.js3;
import defpackage.my6;
import defpackage.o27;
import defpackage.q3;
import defpackage.qj1;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.rl3;
import defpackage.s01;
import defpackage.s08;
import defpackage.ts5;
import defpackage.tx8;
import defpackage.ur6;
import defpackage.v04;
import defpackage.vq3;
import defpackage.wb5;
import defpackage.yl;
import defpackage.z27;
import defpackage.zq3;
import defpackage.zs6;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$LongRef;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public final class PopupLayout extends AbstractComposeView {
    public static final dp2 C = new dp2() { // from class: androidx.compose.ui.window.PopupLayout$Companion$onCommitAffectingPopupPosition$1
        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            PopupLayout popupLayout = (PopupLayout) obj;
            if (popupLayout.isAttachedToWindow()) {
                popupLayout.m();
            }
            return tx8.a;
        }
    };
    public boolean A;
    public final int[] B;
    public bp2 i;
    public gi6 j;
    public String k;
    public final View l;
    public final boolean m;
    public final rl3 n;
    public final WindowManager o;
    public final WindowManager.LayoutParams p;
    public fi6 q;
    public LayoutDirection r;
    public final wb5 s;
    public final wb5 t;
    public vq3 u;
    public final ck1 v;
    public final Rect w;
    public final a18 x;
    public yl y;
    public final wb5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupLayout(bp2 bp2Var, gi6 gi6Var, String str, View view, qj1 qj1Var, fi6 fi6Var, UUID uuid, boolean z) {
        super(view.getContext(), null, 6, 0);
        rl3 ei6Var = Build.VERSION.SDK_INT >= 29 ? new ei6() : new rl3();
        this.i = bp2Var;
        this.j = gi6Var;
        this.k = str;
        this.l = view;
        this.m = z;
        this.n = ei6Var;
        Object systemService = view.getContext().getSystemService("window");
        js3.n(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.o = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        gi6 gi6Var2 = this.j;
        boolean zB = d.b(view);
        boolean z2 = gi6Var2.b;
        int i = gi6Var2.a;
        if (z2 && zB) {
            i |= 8192;
        } else if (z2 && !zB) {
            i &= -8193;
        }
        layoutParams.flags = i;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(zs6.default_popup_window_title));
        this.p = layoutParams;
        this.q = fi6Var;
        this.r = LayoutDirection.a;
        this.s = androidx.compose.runtime.g.h(null);
        this.t = androidx.compose.runtime.g.h(null);
        this.v = androidx.compose.runtime.g.c(new bp2() { // from class: androidx.compose.ui.window.PopupLayout$canCalculatePosition$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                PopupLayout popupLayout = this.g;
                v04 parentLayoutCoordinates = popupLayout.getParentLayoutCoordinates();
                if (parentLayoutCoordinates == null || !parentLayoutCoordinates.h()) {
                    parentLayoutCoordinates = null;
                }
                return Boolean.valueOf((parentLayoutCoordinates == null || popupLayout.m8getPopupContentSizebOM6tXw() == null) ? false : true);
            }
        });
        this.w = new Rect();
        this.x = new a18(new dp2() { // from class: androidx.compose.ui.window.PopupLayout$snapshotStateObserver$1
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                bp2 bp2Var2 = (bp2) obj;
                PopupLayout popupLayout = this.g;
                Handler handler = popupLayout.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    bp2Var2.invoke();
                } else {
                    Handler handler2 = popupLayout.getHandler();
                    if (handler2 != null) {
                        handler2.post(new d8(5, bp2Var2));
                    }
                }
                return tx8.a;
            }
        });
        setId(R.id.content);
        j27.k(this, j27.d(view));
        z27.l(this, z27.g(view));
        o27.i(this, o27.e(view));
        setTag(ur6.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(qj1Var.S((float) 8));
        setOutlineProvider(new do1(2));
        this.z = androidx.compose.runtime.g.h(f.a);
        this.B = new int[2];
    }

    private final qp2 getContent() {
        return (qp2) ((s08) this.z).getValue();
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v04 getParentLayoutCoordinates() {
        return (v04) ((s08) this.t).getValue();
    }

    private final vq3 getVisibleDisplayBounds() {
        this.n.getClass();
        View view = this.l;
        Rect rect = this.w;
        view.getWindowVisibleDisplayFrame(rect);
        s01 s01Var = d.a;
        return new vq3(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(qp2 qp2Var) {
        ((s08) this.z).setValue(qp2Var);
    }

    private final void setParentLayoutCoordinates(v04 v04Var) {
        ((s08) this.t).setValue(v04Var);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(final int i, qz0 qz0Var) {
        qz0Var.c0(-857613600);
        int i2 = (qz0Var.h(this) ? 4 : 2) | i;
        if (qz0Var.R(i2 & 1, (i2 & 3) != 2)) {
            getContent().invoke(qz0Var, 0);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2(i) { // from class: androidx.compose.ui.window.PopupLayout$Content$4
                {
                    super(2);
                }

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iW = hs9.W(1);
                    this.g.a(iW, (qz0) obj);
                    return tx8.a;
                }
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.j.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                bp2 bp2Var = this.i;
                if (bp2Var != null) {
                    bp2Var.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void f(boolean z, int i, int i2, int i3, int i4) {
        super.f(z, i, i2, i3, i4);
        this.j.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.p;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.n.getClass();
        this.o.updateViewLayout(this, layoutParams);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void g(int i, int i2) {
        this.j.getClass();
        vq3 visibleDisplayBounds = getVisibleDisplayBounds();
        super.g(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.c(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.a(), Integer.MIN_VALUE));
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.v.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.p;
    }

    public final LayoutDirection getParentLayoutDirection() {
        return this.r;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final zq3 m8getPopupContentSizebOM6tXw() {
        return (zq3) ((s08) this.s).getValue();
    }

    public final fi6 getPositionProvider() {
        return this.q;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.A;
    }

    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.k;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void j(bp2 bp2Var, gi6 gi6Var, String str, LayoutDirection layoutDirection) {
        int i;
        this.i = bp2Var;
        this.k = str;
        if (!js3.i(this.j, gi6Var)) {
            gi6Var.getClass();
            this.j = gi6Var;
            boolean zB = d.b(this.l);
            boolean z = gi6Var.b;
            int i2 = gi6Var.a;
            if (z && zB) {
                i2 |= 8192;
            } else if (z && !zB) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.p;
            layoutParams.flags = i2;
            this.n.getClass();
            this.o.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = layoutDirection.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    public final void k() {
        v04 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.h()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jK = parentLayoutCoordinates.k();
            long jQ = parentLayoutCoordinates.q(0L);
            long jRound = (((long) Math.round(Float.intBitsToFloat((int) (jQ >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jQ & 4294967295L)))) & 4294967295L);
            int i = (int) (jRound >> 32);
            int i2 = (int) (jRound & 4294967295L);
            vq3 vq3Var = new vq3(i, i2, ((int) (jK >> 32)) + i, ((int) (jK & 4294967295L)) + i2);
            if (vq3Var.equals(this.u)) {
                return;
            }
            this.u = vq3Var;
            m();
        }
    }

    public final void l(v04 v04Var) {
        setParentLayoutCoordinates(v04Var);
        k();
    }

    public final void m() {
        zq3 zq3VarM8getPopupContentSizebOM6tXw;
        final vq3 vq3Var = this.u;
        if (vq3Var == null || (zq3VarM8getPopupContentSizebOM6tXw = m8getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        final long j = zq3VarM8getPopupContentSizebOM6tXw.a;
        vq3 visibleDisplayBounds = getVisibleDisplayBounds();
        final long jA = (((long) visibleDisplayBounds.a()) & 4294967295L) | (((long) visibleDisplayBounds.c()) << 32);
        final Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.a = 0L;
        this.x.d(this, C, new bp2() { // from class: androidx.compose.ui.window.PopupLayout$updatePosition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                PopupLayout popupLayout = this;
                ref$LongRef.a = popupLayout.getPositionProvider().a(vq3Var, jA, popupLayout.getParentLayoutDirection(), j);
                return tx8.a;
            }
        });
        int[] iArr = new int[2];
        this.l.getLocationOnScreen(iArr);
        boolean z = this.m;
        WindowManager.LayoutParams layoutParams = this.p;
        if (z) {
            long j2 = ref$LongRef.a;
            layoutParams.x = (int) (j2 >> 32);
            layoutParams.y = (int) (j2 & 4294967295L);
        } else {
            long j3 = ref$LongRef.a;
            layoutParams.x = ((int) (j3 >> 32)) - iArr[0];
            layoutParams.y = ((int) (j3 & 4294967295L)) - iArr[1];
        }
        boolean z2 = this.j.e;
        rl3 rl3Var = this.n;
        if (z2) {
            rl3Var.B(this, (int) (jA >> 32), (int) (jA & 4294967295L));
        }
        rl3Var.getClass();
        this.o.updateViewLayout(this, layoutParams);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.x.e();
        if (!this.j.c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.y == null) {
            this.y = new yl(0, this.i);
        }
        q3.o(this, this.y);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a18 a18Var = this.x;
        ts5 ts5Var = a18Var.h;
        if (ts5Var != null) {
            ts5Var.b();
        }
        a18Var.a();
        if (Build.VERSION.SDK_INT >= 33) {
            q3.p(this, this.y);
        }
        this.y = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.j.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            bp2 bp2Var = this.i;
            if (bp2Var != null) {
                bp2Var.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            bp2 bp2Var2 = this.i;
            if (bp2Var2 != null) {
                bp2Var2.invoke();
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }

    public final void setParentLayoutDirection(LayoutDirection layoutDirection) {
        this.r = layoutDirection;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m9setPopupContentSizefhxjrPA(zq3 zq3Var) {
        ((s08) this.s).setValue(zq3Var);
    }

    public final void setPositionProvider(fi6 fi6Var) {
        this.q = fi6Var;
    }

    public final void setTestTag(String str) {
        this.k = str;
    }

    public final void setContent(d01 d01Var, qp2 qp2Var) {
        setParentCompositionContext(d01Var);
        setContent(qp2Var);
        this.A = true;
    }
}
