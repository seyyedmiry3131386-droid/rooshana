package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.ScrollingView;
import androidx.customview.view.AbsSavedState;
import defpackage.a07;
import defpackage.aq3;
import defpackage.b07;
import defpackage.ba4;
import defpackage.br9;
import defpackage.c07;
import defpackage.c35;
import defpackage.ci6;
import defpackage.ck4;
import defpackage.d07;
import defpackage.e07;
import defpackage.e60;
import defpackage.f07;
import defpackage.f79;
import defpackage.fw7;
import defpackage.h69;
import defpackage.hl5;
import defpackage.jm5;
import defpackage.jo1;
import defpackage.jp8;
import defpackage.jq2;
import defpackage.k69;
import defpackage.km5;
import defpackage.kz6;
import defpackage.nq0;
import defpackage.nq6;
import defpackage.o40;
import defpackage.oz6;
import defpackage.pz6;
import defpackage.q69;
import defpackage.qz6;
import defpackage.rf1;
import defpackage.rn6;
import defpackage.sr0;
import defpackage.st6;
import defpackage.sz6;
import defpackage.t15;
import defpackage.t69;
import defpackage.tp6;
import defpackage.tz6;
import defpackage.ue4;
import defpackage.ut4;
import defpackage.uz6;
import defpackage.vo4;
import defpackage.w69;
import defpackage.wz6;
import defpackage.xb;
import defpackage.xz6;
import defpackage.y82;
import defpackage.yb;
import defpackage.yq2;
import defpackage.zh6;
import io.sentry.android.core.t0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, jm5 {
    public static boolean Z0 = false;
    public static boolean a1 = false;
    public static final int[] b1 = {R.attr.nestedScrollingEnabled};
    public static final float c1 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean d1 = true;
    public static final boolean e1 = true;
    public static final Class[] f1;
    public static final e60 g1;
    public static final c07 h1;
    public boolean A;
    public boolean A0;
    public final AccessibilityManager B;
    public final e07 B0;
    public ArrayList C;
    public jq2 C0;
    public boolean D;
    public final sr0 D0;
    public boolean E;
    public final b07 E0;
    public int F;
    public uz6 F0;
    public int G;
    public ArrayList G0;
    public pz6 H;
    public boolean H0;
    public EdgeEffect I;
    public boolean I0;
    public EdgeEffect J;
    public final c35 J0;
    public EdgeEffect K;
    public boolean K0;
    public EdgeEffect L;
    public f07 L0;
    public qz6 M;
    public final int[] M0;
    public int N;
    public km5 N0;
    public int O;
    public final int[] O0;
    public VelocityTracker P;
    public final int[] P0;
    public int Q;
    public final int[] Q0;
    public int R;
    public final ArrayList R0;
    public int S;
    public final kz6 S0;
    public int T;
    public boolean T0;
    public int U;
    public int U0;
    public tz6 V;
    public int V0;
    public final int W;
    public final boolean W0;
    public final vo4 X0;
    public final jo1 Y0;
    public final float a;
    public final m b;
    public final l c;
    public SavedState d;
    public final yb e;
    public final jp8 f;
    public final rn6 g;
    public boolean h;
    public final kz6 i;
    public final Rect j;
    public final Rect k;
    public final RectF l;
    public g m;
    public k n;
    public final ArrayList o;
    public final ArrayList p;
    public final ArrayList q;
    public y82 r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public boolean w;
    public boolean x;
    public final int x0;
    public boolean y;
    public final float y0;
    public int z;
    public final float z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new n();
        public Parcelable c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readParcelable(classLoader == null ? k.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.c, 0);
        }
    }

    static {
        Class cls = Integer.TYPE;
        f1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        g1 = new e60(1);
        h1 = new c07();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public static RecyclerView H(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewH = H(viewGroup.getChildAt(i));
            if (recyclerViewH != null) {
                return recyclerViewH;
            }
        }
        return null;
    }

    public static int M(View view) {
        o oVarO = O(view);
        if (oVarO != null) {
            return oVarO.b();
        }
        return -1;
    }

    public static o O(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).a;
    }

    private km5 getScrollingChildHelper() {
        if (this.N0 == null) {
            this.N0 = new km5(this);
        }
        return this.N0;
    }

    public static void l(o oVar) {
        WeakReference weakReference = oVar.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == oVar.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            oVar.b = null;
        }
    }

    public static int o(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && yq2.e0(edgeEffect) != 0.0f) {
            int iRound = Math.round(yq2.t0(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || yq2.e0(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(yq2.t0(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        Z0 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        a1 = z;
    }

    public final void A() {
        if (this.K != null) {
            return;
        }
        ((c07) this.H).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.K = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void B() {
        if (this.J != null) {
            return;
        }
        ((c07) this.H).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.J = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String C() {
        return " " + super.toString() + ", adapter:" + this.m + ", layout:" + this.n + ", context:" + getContext();
    }

    public final void D(b07 b07Var) {
        if (getScrollState() != 2) {
            b07Var.getClass();
            return;
        }
        OverScroller overScroller = this.B0.c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        b07Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View E(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean F(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.q
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            y82 r5 = (defpackage.y82) r5
            int r6 = r5.v
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.e(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.d(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L61
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L61
        L3c:
            if (r9 == 0) goto L49
            r5.w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.p = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.w = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.m = r6
        L55:
            r5.g(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L61
        L5b:
            r6 = 3
            if (r0 == r6) goto L61
            r11.r = r5
            return r7
        L61:
            int r4 = r4 + 1
            goto Lc
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.F(android.view.MotionEvent):boolean");
    }

    public final void G(int[] iArr) {
        int iJ = this.f.j();
        if (iJ == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iJ; i3++) {
            o oVarO = O(this.f.i(i3));
            if (!oVarO.p()) {
                int iC = oVarO.c();
                if (iC < i) {
                    i = iC;
                }
                if (iC > i2) {
                    i2 = iC;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final o I(int i) {
        o oVar = null;
        if (this.D) {
            return null;
        }
        int iO = this.f.o();
        for (int i2 = 0; i2 < iO; i2++) {
            o oVarO = O(this.f.n(i2));
            if (oVarO != null && !oVarO.i() && K(oVarO) == i) {
                if (!((ArrayList) this.f.e).contains(oVarO.a)) {
                    return oVarO;
                }
                oVar = oVarO;
            }
        }
        return oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean J(int r8, int r9, int r10, int r11) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.J(int, int, int, int):boolean");
    }

    public final int K(o oVar) {
        if ((oVar.j & 524) == 0 && oVar.f()) {
            int i = oVar.c;
            ArrayList arrayList = (ArrayList) this.e.c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                xb xbVar = (xb) arrayList.get(i2);
                int i3 = xbVar.a;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = xbVar.b;
                        if (i4 <= i) {
                            int i5 = xbVar.d;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = xbVar.b;
                        if (i6 == i) {
                            i = xbVar.d;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (xbVar.d <= i) {
                                i++;
                            }
                        }
                    }
                } else if (xbVar.b <= i) {
                    i += xbVar.d;
                }
            }
            return i;
        }
        return -1;
    }

    public final long L(o oVar) {
        return this.m.b ? oVar.e : oVar.c;
    }

    public final o N(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return O(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect P(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        boolean z = layoutParams.c;
        Rect rect = layoutParams.b;
        if (z) {
            b07 b07Var = this.E0;
            if (!b07Var.g || (!layoutParams.a.l() && !layoutParams.a.g())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.p;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Rect rect2 = this.j;
                    rect2.set(0, 0, 0, 0);
                    ((h) arrayList.get(i)).a(rect2, view, this, b07Var);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                layoutParams.c = false;
                return rect;
            }
        }
        return rect;
    }

    public final boolean Q() {
        return !this.u || this.D || this.e.m();
    }

    public final boolean R() {
        return this.F > 0;
    }

    public final void S(int i) {
        if (this.n == null) {
            return;
        }
        setScrollState(2);
        this.n.t0(i);
        awakenScrollBars();
    }

    public final void T() {
        int iO = this.f.o();
        for (int i = 0; i < iO; i++) {
            ((LayoutParams) this.f.n(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = this.c.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutParams layoutParams = (LayoutParams) ((o) arrayList.get(i2)).a.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.c = true;
            }
        }
    }

    public final void U(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iO = this.f.o();
        for (int i4 = 0; i4 < iO; i4++) {
            o oVarO = O(this.f.n(i4));
            if (oVarO != null && !oVarO.p()) {
                int i5 = oVarO.c;
                b07 b07Var = this.E0;
                if (i5 >= i3) {
                    if (a1) {
                        oVarO.toString();
                    }
                    oVarO.m(-i2, z);
                    b07Var.f = true;
                } else if (i5 >= i) {
                    if (a1) {
                        oVarO.toString();
                    }
                    oVarO.a(8);
                    oVarO.m(-i2, z);
                    oVarO.c = i - 1;
                    b07Var.f = true;
                }
            }
        }
        l lVar = this.c;
        ArrayList arrayList = lVar.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            o oVar = (o) arrayList.get(size);
            if (oVar != null) {
                int i6 = oVar.c;
                if (i6 >= i3) {
                    if (a1) {
                        oVar.toString();
                    }
                    oVar.m(-i2, z);
                } else if (i6 >= i) {
                    oVar.a(8);
                    lVar.h(size);
                }
            }
        }
        requestLayout();
    }

    public final void V() {
        this.F++;
    }

    public final void W(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.F - 1;
        this.F = i2;
        if (i2 < 1) {
            if (Z0 && i2 < 0) {
                throw new IllegalStateException(o40.w(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.F = 0;
            if (z) {
                int i3 = this.z;
                this.z = 0;
                if (i3 != 0 && (accessibilityManager = this.B) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.R0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    o oVar = (o) arrayList.get(size);
                    if (oVar.a.getParent() == this && !oVar.p() && (i = oVar.q) != -1) {
                        oVar.a.setImportantForAccessibility(i);
                        oVar.q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void X(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.O) {
            int i = actionIndex == 0 ? 1 : 0;
            this.O = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.S = x;
            this.Q = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.T = y;
            this.R = y;
        }
    }

    public final void Y() {
        if (this.K0 || !this.s) {
            return;
        }
        WeakHashMap weakHashMap = q69.a;
        postOnAnimation(this.S0);
        this.K0 = true;
    }

    public final void Z() {
        boolean z;
        boolean z2 = false;
        if (this.D) {
            yb ybVar = this.e;
            ybVar.t((ArrayList) ybVar.c);
            ybVar.t((ArrayList) ybVar.d);
            ybVar.a = 0;
            if (this.E) {
                this.n.a0();
            }
        }
        if (this.M == null || !this.n.F0()) {
            this.e.e();
        } else {
            this.e.s();
        }
        boolean z3 = this.H0 || this.I0;
        boolean z4 = this.u && this.M != null && ((z = this.D) || z3 || this.n.f) && (!z || this.m.b);
        b07 b07Var = this.E0;
        b07Var.j = z4;
        if (z4 && z3 && !this.D && this.M != null && this.n.F0()) {
            z2 = true;
        }
        b07Var.k = z2;
    }

    public final void a0(boolean z) {
        this.E = z | this.E;
        this.D = true;
        int iO = this.f.o();
        for (int i = 0; i < iO; i++) {
            o oVarO = O(this.f.n(i));
            if (oVarO != null && !oVarO.p()) {
                oVarO.a(6);
            }
        }
        T();
        l lVar = this.c;
        ArrayList arrayList = lVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            o oVar = (o) arrayList.get(i2);
            if (oVar != null) {
                oVar.a(6);
                oVar.a(1024);
            }
        }
        g gVar = lVar.h.m;
        if (gVar == null || !gVar.b) {
            lVar.g();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        k kVar = this.n;
        if (kVar != null) {
            kVar.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0(o oVar, ba4 ba4Var) {
        oVar.j &= -8193;
        boolean z = this.E0.h;
        rn6 rn6Var = this.g;
        if (z && oVar.l() && !oVar.i() && !oVar.p()) {
            ((ue4) rn6Var.c).i(L(oVar), oVar);
        }
        fw7 fw7Var = (fw7) rn6Var.b;
        f79 f79VarA = (f79) fw7Var.get(oVar);
        if (f79VarA == null) {
            f79VarA = f79.a();
            fw7Var.put(oVar, f79VarA);
        }
        f79VarA.b = ba4Var;
        f79VarA.a |= 4;
    }

    public final void c0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.I.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.J;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.K;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.L;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.L.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.n.g((LayoutParams) layoutParams);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollExtent() {
        k kVar = this.n;
        if (kVar != null && kVar.e()) {
            return this.n.k(this.E0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollOffset() {
        k kVar = this.n;
        if (kVar != null && kVar.e()) {
            return this.n.l(this.E0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollRange() {
        k kVar = this.n;
        if (kVar != null && kVar.e()) {
            return this.n.m(this.E0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollExtent() {
        k kVar = this.n;
        if (kVar != null && kVar.f()) {
            return this.n.n(this.E0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollOffset() {
        k kVar = this.n;
        if (kVar != null && kVar.f()) {
            return this.n.o(this.E0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollRange() {
        k kVar = this.n;
        if (kVar != null && kVar.f()) {
            return this.n.p(this.E0);
        }
        return 0;
    }

    public final int d0(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.I;
        float f2 = 0.0f;
        if (edgeEffect == null || yq2.e0(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.K;
            if (edgeEffect2 != null && yq2.e0(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.K.onRelease();
                } else {
                    float fT0 = yq2.t0(this.K, width, height);
                    if (yq2.e0(this.K) == 0.0f) {
                        this.K.onRelease();
                    }
                    f2 = fT0;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.I.onRelease();
            } else {
                float f3 = -yq2.t0(this.I, -width, 1.0f - height);
                if (yq2.e0(this.I) == 0.0f) {
                    this.I.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        k layoutManager = getLayoutManager();
        int iC = 0;
        if (layoutManager != null) {
            if (layoutManager.f()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        m0(0, measuredHeight, false);
                        return true;
                    }
                    m0(0, -measuredHeight, false);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean zM = layoutManager.M();
                    if (keyCode == 122) {
                        if (zM) {
                            iC = getAdapter().c();
                        }
                    } else if (!zM) {
                        iC = getAdapter().c();
                    }
                    n0(iC);
                    return true;
                }
            } else if (layoutManager.e()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        m0(measuredWidth, 0, false);
                        return true;
                    }
                    m0(-measuredWidth, 0, false);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean zM2 = layoutManager.M();
                    if (keyCode2 == 122) {
                        if (zM2) {
                            iC = getAdapter().c();
                        }
                    } else if (!zM2) {
                        iC = getAdapter().c();
                    }
                    n0(iC);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((h) arrayList.get(i)).c(canvas, this);
        }
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.I;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.J;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.K;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.K;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.L;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.h) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.L;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.M == null || arrayList.size() <= 0 || !this.M.g()) ? z : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final int e0(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.J;
        float f2 = 0.0f;
        if (edgeEffect == null || yq2.e0(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.L;
            if (edgeEffect2 != null && yq2.e0(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.L.onRelease();
                } else {
                    float fT0 = yq2.t0(this.L, height, 1.0f - width);
                    if (yq2.e0(this.L) == 0.0f) {
                        this.L.onRelease();
                    }
                    f2 = fT0;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.J.onRelease();
            } else {
                float f3 = -yq2.t0(this.J, -height, width);
                if (yq2.e0(this.J) == 0.0f) {
                    this.J.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    public final void f0(h hVar) {
        k kVar = this.n;
        if (kVar != null) {
            kVar.d("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.p;
        arrayList.remove(hVar);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        T();
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0197 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce A[ADDED_TO_REGION] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g0(uz6 uz6Var) {
        ArrayList arrayList = this.G0;
        if (arrayList != null) {
            arrayList.remove(uz6Var);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        k kVar = this.n;
        if (kVar != null) {
            return kVar.s();
        }
        throw new IllegalStateException(o40.w(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        k kVar = this.n;
        if (kVar != null) {
            return kVar.t(getContext(), attributeSet);
        }
        throw new IllegalStateException(o40.w(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g getAdapter() {
        return this.m;
    }

    @Override // android.view.View
    public int getBaseline() {
        k kVar = this.n;
        if (kVar == null) {
            return super.getBaseline();
        }
        kVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.h;
    }

    public f07 getCompatAccessibilityDelegate() {
        return this.L0;
    }

    public pz6 getEdgeEffectFactory() {
        return this.H;
    }

    public qz6 getItemAnimator() {
        return this.M;
    }

    public int getItemDecorationCount() {
        return this.p.size();
    }

    public k getLayoutManager() {
        return this.n;
    }

    public int getMaxFlingVelocity() {
        return this.x0;
    }

    public int getMinFlingVelocity() {
        return this.W;
    }

    public long getNanoTime() {
        if (e1) {
            return System.nanoTime();
        }
        return 0L;
    }

    public tz6 getOnFlingListener() {
        return this.V;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.A0;
    }

    public wz6 getRecycledViewPool() {
        return this.c.c();
    }

    public int getScrollState() {
        return this.N;
    }

    public final void h(o oVar) {
        View view = oVar.a;
        boolean z = view.getParent() == this;
        this.c.m(N(view));
        if (oVar.k()) {
            this.f.f(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            this.f.e(view, -1, true);
            return;
        }
        jp8 jp8Var = this.f;
        int iIndexOfChild = ((RecyclerView) ((hl5) jp8Var.c).b).indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ((nq0) jp8Var.d).B(iIndexOfChild);
            jp8Var.q(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void h0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.j;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.c) {
                Rect rect2 = layoutParams2.b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.n.q0(this, view, this.j, !this.u, view2 == null);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(h hVar) {
        k kVar = this.n;
        if (kVar != null) {
            kVar.d("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.p;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(hVar);
        T();
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i0(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.i0(int, int, android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.s;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.x;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(uz6 uz6Var) {
        if (this.G0 == null) {
            this.G0 = new ArrayList();
        }
        this.G0.add(uz6Var);
    }

    public final void j0(int i, int i2, int[] iArr) {
        o oVar;
        o0();
        V();
        Trace.beginSection("RV Scroll");
        b07 b07Var = this.E0;
        D(b07Var);
        l lVar = this.c;
        int iS0 = i != 0 ? this.n.s0(i, b07Var, lVar) : 0;
        int iU0 = i2 != 0 ? this.n.u0(i2, b07Var, lVar) : 0;
        Trace.endSection();
        int iJ = this.f.j();
        for (int i3 = 0; i3 < iJ; i3++) {
            View viewI = this.f.i(i3);
            o oVarN = N(viewI);
            if (oVarN != null && (oVar = oVarN.i) != null) {
                View view = oVar.a;
                int left = viewI.getLeft();
                int top = viewI.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        W(true);
        q0(false);
        if (iArr != null) {
            iArr[0] = iS0;
            iArr[1] = iU0;
        }
    }

    public final void k(String str) {
        if (R()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(o40.w(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.G > 0) {
            t0.n("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(o40.w(this, new StringBuilder(""))));
        }
    }

    public final void k0(int i) {
        if (this.x) {
            return;
        }
        s0();
        k kVar = this.n;
        if (kVar == null) {
            t0.d("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            kVar.t0(i);
            awakenScrollBars();
        }
    }

    public final boolean l0(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fE0 = yq2.e0(edgeEffect) * i2;
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.a * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = c1;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fE0;
    }

    public final void m() {
        int iO = this.f.o();
        for (int i = 0; i < iO; i++) {
            o oVarO = O(this.f.n(i));
            if (!oVarO.p()) {
                oVarO.d = -1;
                oVarO.g = -1;
            }
        }
        l lVar = this.c;
        ArrayList arrayList = lVar.a;
        ArrayList arrayList2 = lVar.c;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            o oVar = (o) arrayList2.get(i2);
            oVar.d = -1;
            oVar.g = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            o oVar2 = (o) arrayList.get(i3);
            oVar2.d = -1;
            oVar2.g = -1;
        }
        ArrayList arrayList3 = lVar.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                o oVar3 = (o) lVar.b.get(i4);
                oVar3.d = -1;
                oVar3.g = -1;
            }
        }
    }

    public final void m0(int i, int i2, boolean z) {
        k kVar = this.n;
        if (kVar == null) {
            t0.d("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.x) {
            return;
        }
        if (!kVar.e()) {
            i = 0;
        }
        if (!this.n.f()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().g(i3, 1);
        }
        this.B0.c(i, i2, Integer.MIN_VALUE, null);
    }

    public final void n(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.I.onRelease();
            zIsFinished = this.I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.K;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.K.onRelease();
            zIsFinished |= this.K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.J.onRelease();
            zIsFinished |= this.J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.L;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.L.onRelease();
            zIsFinished |= this.L.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final void n0(int i) {
        if (this.x) {
            return;
        }
        k kVar = this.n;
        if (kVar == null) {
            t0.d("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            kVar.D0(this, i);
        }
    }

    public final void o0() {
        int i = this.v + 1;
        this.v = i;
        if (i != 1 || this.x) {
            return;
        }
        this.w = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.F = r0
            r1 = 1
            r5.s = r1
            boolean r2 = r5.u
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.u = r2
            androidx.recyclerview.widget.l r2 = r5.c
            r2.e()
            androidx.recyclerview.widget.k r2 = r5.n
            if (r2 == 0) goto L26
            r2.g = r1
            r2.S(r5)
        L26:
            r5.K0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.e1
            if (r0 == 0) goto L80
            java.lang.ThreadLocal r0 = defpackage.jq2.e
            java.lang.Object r1 = r0.get()
            jq2 r1 = (defpackage.jq2) r1
            r5.C0 = r1
            if (r1 != 0) goto L66
            jq2 r1 = new jq2
            r1.<init>()
            r5.C0 = r1
            java.util.WeakHashMap r1 = defpackage.q69.a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L58
            if (r1 == 0) goto L58
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L58
            goto L5a
        L58:
            r1 = 1114636288(0x42700000, float:60.0)
        L5a:
            jq2 r2 = r5.C0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.c = r3
            r0.set(r2)
        L66:
            jq2 r0 = r5.C0
            java.util.ArrayList r0 = r0.a
            boolean r1 = androidx.recyclerview.widget.RecyclerView.Z0
            if (r1 == 0) goto L7d
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L75
            goto L7d
        L75:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "RecyclerView already present in worker list!"
            r0.<init>(r1)
            throw r0
        L7d:
            r0.add(r5)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        jq2 jq2Var;
        super.onDetachedFromWindow();
        qz6 qz6Var = this.M;
        if (qz6Var != null) {
            qz6Var.f();
        }
        s0();
        int i = 0;
        this.s = false;
        k kVar = this.n;
        if (kVar != null) {
            kVar.g = false;
            kVar.T(this);
        }
        this.R0.clear();
        removeCallbacks(this.S0);
        this.g.getClass();
        while (f79.d.e() != null) {
        }
        l lVar = this.c;
        ArrayList arrayList = lVar.c;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            zh6.a(((o) arrayList.get(i2)).a);
        }
        lVar.f(lVar.h.m, false);
        int i3 = zh6.a;
        while (i < getChildCount()) {
            int i4 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ArrayList arrayList2 = zh6.b(childAt).a;
            for (int iY = br9.y(arrayList2); -1 < iY; iY--) {
                ((t69) arrayList2.get(iY)).a.d();
            }
            i = i4;
        }
        if (!e1 || (jq2Var = this.C0) == null) {
            return;
        }
        boolean zRemove = jq2Var.a.remove(this);
        if (Z0 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.C0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((h) arrayList.get(i)).b(canvas, this);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i;
        boolean z;
        if (this.n != null && !this.x && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                float f = this.n.f() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.n.e() ? motionEvent.getAxisValue(10) : 0.0f;
                i = 0;
                z = false;
                f = f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.n.f()) {
                    float f2 = -axisValue;
                    axisValue = 0.0f;
                    f = f2;
                } else if (!this.n.e()) {
                    axisValue = 0.0f;
                }
                i = 26;
                z = this.W0;
            } else {
                axisValue = 0.0f;
                i = 0;
                z = false;
            }
            int i2 = (int) (f * this.z0);
            int i3 = (int) (axisValue * this.y0);
            if (z) {
                OverScroller overScroller = this.B0.c;
                m0((overScroller.getFinalX() - overScroller.getCurrX()) + i3, (overScroller.getFinalY() - overScroller.getCurrY()) + i2, true);
            } else {
                k kVar = this.n;
                if (kVar == null) {
                    t0.d("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.x) {
                    int[] iArr = this.Q0;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zE = kVar.e();
                    boolean zF = this.n.f();
                    int i4 = zF ? (zE ? 1 : 0) | 2 : zE ? 1 : 0;
                    float y = motionEvent.getY();
                    float x = motionEvent.getX();
                    int iD0 = i3 - d0(i3, y);
                    int iE0 = i2 - e0(i2, x);
                    getScrollingChildHelper().g(i4, 1);
                    if (v(zE ? iD0 : 0, zF ? iE0 : 0, 1, this.Q0, this.O0)) {
                        iD0 -= iArr[0];
                        iE0 -= iArr[1];
                    }
                    i0(zE ? iD0 : 0, zF ? iE0 : 0, motionEvent, 1);
                    jq2 jq2Var = this.C0;
                    if (jq2Var != null && (iD0 != 0 || iE0 != 0)) {
                        jq2Var.a(this, iD0, iE0);
                    }
                    r0(1);
                }
            }
            if (i != 0 && !z) {
                this.Y0.a(motionEvent, i);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.x) {
            this.r = null;
            if (F(motionEvent)) {
                VelocityTracker velocityTracker = this.P;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                r0(0);
                c0();
                setScrollState(0);
                return true;
            }
            k kVar = this.n;
            if (kVar != null) {
                boolean zE = kVar.e();
                boolean zF = this.n.f();
                if (this.P == null) {
                    this.P = VelocityTracker.obtain();
                }
                this.P.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.y) {
                        this.y = false;
                    }
                    this.O = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.S = x;
                    this.Q = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.T = y;
                    this.R = y;
                    EdgeEffect edgeEffect = this.I;
                    if (edgeEffect == null || yq2.e0(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        yq2.t0(this.I, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.K;
                    if (edgeEffect2 != null && yq2.e0(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        yq2.t0(this.K, 0.0f, motionEvent.getY() / getHeight());
                        z = true;
                    }
                    EdgeEffect edgeEffect3 = this.J;
                    if (edgeEffect3 != null && yq2.e0(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        yq2.t0(this.J, 0.0f, motionEvent.getX() / getWidth());
                        z = true;
                    }
                    EdgeEffect edgeEffect4 = this.L;
                    if (edgeEffect4 != null && yq2.e0(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        yq2.t0(this.L, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z = true;
                    }
                    if (z || this.N == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        r0(1);
                    }
                    int[] iArr = this.P0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    p0(0);
                } else if (actionMasked == 1) {
                    this.P.clear();
                    r0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.O);
                    if (iFindPointerIndex < 0) {
                        t0.d("RecyclerView", "Error processing scroll; pointer index for id " + this.O + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.N != 1) {
                        int i = x2 - this.Q;
                        int i2 = y2 - this.R;
                        if (!zE || Math.abs(i) <= this.U) {
                            z2 = false;
                        } else {
                            this.S = x2;
                            z2 = true;
                        }
                        if (zF && Math.abs(i2) > this.U) {
                            this.T = y2;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.P;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    r0(0);
                    c0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.O = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.S = x3;
                    this.Q = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.T = y3;
                    this.R = y3;
                } else if (actionMasked == 6) {
                    X(motionEvent);
                }
                if (this.N == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        s();
        Trace.endSection();
        this.u = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        k kVar = this.n;
        if (kVar == null) {
            q(i, i2);
            return;
        }
        boolean zL = kVar.L();
        boolean z = false;
        b07 b07Var = this.E0;
        if (zL) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.n.b.q(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.T0 = z;
            if (z || this.m == null) {
                return;
            }
            if (b07Var.d == 1) {
                t();
            }
            this.n.w0(i, i2);
            b07Var.i = true;
            u();
            this.n.y0(i, i2);
            if (this.n.B0()) {
                this.n.w0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                b07Var.i = true;
                u();
                this.n.y0(i, i2);
            }
            this.U0 = getMeasuredWidth();
            this.V0 = getMeasuredHeight();
            return;
        }
        if (this.t) {
            this.n.b.q(i, i2);
            return;
        }
        if (this.A) {
            o0();
            V();
            Z();
            W(true);
            if (b07Var.k) {
                b07Var.g = true;
            } else {
                this.e.e();
                b07Var.g = false;
            }
            this.A = false;
            q0(false);
        } else if (b07Var.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        g gVar = this.m;
        if (gVar != null) {
            b07Var.e = gVar.c();
        } else {
            b07Var.e = 0;
        }
        o0();
        this.n.b.q(i, i2);
        q0(false);
        b07Var.g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (R()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.d = savedState;
        super.onRestoreInstanceState(savedState.a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.d;
        if (savedState2 != null) {
            savedState.c = savedState2.c;
            return savedState;
        }
        k kVar = this.n;
        if (kVar != null) {
            savedState.c = kVar.h0();
            return savedState;
        }
        savedState.c = null;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.L = null;
        this.J = null;
        this.K = null;
        this.I = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x020b A[PHI: r1
      0x020b: PHI (r1v50 int) = (r1v34 int), (r1v54 int) binds: [B:95:0x01f4, B:99:0x0207] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0224  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instruction units count: 799
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (!this.u || this.D) {
            Trace.beginSection("RV FullInvalidate");
            s();
            Trace.endSection();
            return;
        }
        if (this.e.m()) {
            yb ybVar = this.e;
            int i = ybVar.a;
            if ((i & 4) == 0 || (i & 11) != 0) {
                if (ybVar.m()) {
                    Trace.beginSection("RV FullInvalidate");
                    s();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            o0();
            V();
            this.e.s();
            if (!this.w) {
                int iJ = this.f.j();
                int i2 = 0;
                while (true) {
                    if (i2 < iJ) {
                        o oVarO = O(this.f.i(i2));
                        if (oVarO != null && !oVarO.p() && oVarO.l()) {
                            s();
                            break;
                        }
                        i2++;
                    } else {
                        this.e.d();
                        break;
                    }
                }
            }
            q0(true);
            W(true);
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p0(int i) {
        boolean zE = this.n.e();
        int i2 = zE;
        if (this.n.f()) {
            i2 = (zE ? 1 : 0) | 2;
        }
        getScrollingChildHelper().g(i2, i);
    }

    public final void q(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = q69.a;
        setMeasuredDimension(k.h(i, paddingRight, getMinimumWidth()), k.h(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void q0(boolean z) {
        if (this.v < 1) {
            if (Z0) {
                throw new IllegalStateException(o40.w(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.v = 1;
        }
        if (!z && !this.x) {
            this.w = false;
        }
        if (this.v == 1) {
            if (z && this.w && !this.x && this.n != null && this.m != null) {
                s();
            }
            if (!this.x) {
                this.w = false;
            }
        }
        this.v--;
    }

    public final void r(View view) {
        o oVarO = O(view);
        g gVar = this.m;
        if (gVar != null && oVarO != null) {
            gVar.r(oVarO);
        }
        ArrayList arrayList = this.C;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((sz6) this.C.get(size)).getClass();
            }
        }
    }

    public final void r0(int i) {
        getScrollingChildHelper().h(i);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        o oVarO = O(view);
        if (oVarO != null) {
            if (oVarO.k()) {
                oVarO.j &= -257;
            } else if (!oVarO.p()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(oVarO);
                throw new IllegalArgumentException(o40.w(this, sb));
            }
        } else if (Z0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(o40.w(this, sb2));
        }
        view.clearAnimation();
        r(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        a07 a07Var = this.n.e;
        if ((a07Var == null || !a07Var.e) && !R() && view2 != null) {
            h0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.n.p0(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((y82) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.v != 0 || this.x) {
            this.w = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03f0  */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s() {
        /*
            Method dump skipped, instruction units count: 1110
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.s():void");
    }

    public final void s0() {
        a07 a07Var;
        setScrollState(0);
        e07 e07Var = this.B0;
        e07Var.g.removeCallbacks(e07Var);
        e07Var.c.abortAnimation();
        k kVar = this.n;
        if (kVar == null || (a07Var = kVar.e) == null) {
            return;
        }
        a07Var.d();
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        k kVar = this.n;
        if (kVar == null) {
            t0.d("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.x) {
            return;
        }
        boolean zE = kVar.e();
        boolean zF = this.n.f();
        if (zE || zF) {
            if (!zE) {
                i = 0;
            }
            if (!zF) {
                i2 = 0;
            }
            i0(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        t0.m("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!R()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.z |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(f07 f07Var) {
        this.L0 = f07Var;
        q69.q(this, f07Var);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        g gVar2 = this.m;
        m mVar = this.b;
        if (gVar2 != null) {
            gVar2.w(mVar);
            this.m.o(this);
        }
        qz6 qz6Var = this.M;
        if (qz6Var != null) {
            qz6Var.f();
        }
        k kVar = this.n;
        l lVar = this.c;
        if (kVar != null) {
            kVar.l0(lVar);
            this.n.m0(lVar);
        }
        lVar.a.clear();
        lVar.g();
        yb ybVar = this.e;
        ybVar.t((ArrayList) ybVar.c);
        ybVar.t((ArrayList) ybVar.d);
        ybVar.a = 0;
        g gVar3 = this.m;
        this.m = gVar;
        if (gVar != null) {
            gVar.t(mVar);
            gVar.k(this);
        }
        k kVar2 = this.n;
        if (kVar2 != null) {
            kVar2.R();
        }
        g gVar4 = this.m;
        lVar.a.clear();
        lVar.g();
        lVar.f(gVar3, true);
        wz6 wz6VarC = lVar.c();
        if (gVar3 != null) {
            wz6VarC.b--;
        }
        if (wz6VarC.b == 0) {
            wz6VarC.a();
        }
        if (gVar4 != null) {
            wz6VarC.b++;
        }
        lVar.e();
        this.E0.f = true;
        a0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(oz6 oz6Var) {
        if (oz6Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.h) {
            this.L = null;
            this.J = null;
            this.K = null;
            this.I = null;
        }
        this.h = z;
        super.setClipToPadding(z);
        if (this.u) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(pz6 pz6Var) {
        pz6Var.getClass();
        this.H = pz6Var;
        this.L = null;
        this.J = null;
        this.K = null;
        this.I = null;
    }

    public void setHasFixedSize(boolean z) {
        this.t = z;
    }

    public void setItemAnimator(qz6 qz6Var) {
        qz6 qz6Var2 = this.M;
        if (qz6Var2 != null) {
            qz6Var2.f();
            this.M.a = null;
        }
        this.M = qz6Var;
        if (qz6Var != null) {
            qz6Var.a = this.J0;
        }
    }

    public void setItemViewCacheSize(int i) {
        l lVar = this.c;
        lVar.e = i;
        lVar.n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(k kVar) {
        if (kVar == this.n) {
            return;
        }
        s0();
        k kVar2 = this.n;
        l lVar = this.c;
        if (kVar2 != null) {
            qz6 qz6Var = this.M;
            if (qz6Var != null) {
                qz6Var.f();
            }
            this.n.l0(lVar);
            this.n.m0(lVar);
            lVar.a.clear();
            lVar.g();
            if (this.s) {
                k kVar3 = this.n;
                kVar3.g = false;
                kVar3.T(this);
            }
            this.n.z0(null);
            this.n = null;
        } else {
            lVar.a.clear();
            lVar.g();
        }
        jp8 jp8Var = this.f;
        RecyclerView recyclerView = (RecyclerView) ((hl5) jp8Var.c).b;
        ((nq0) jp8Var.d).A();
        ArrayList arrayList = (ArrayList) jp8Var.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            o oVarO = O((View) arrayList.get(size));
            if (oVarO != null) {
                int i = oVarO.p;
                if (recyclerView.R()) {
                    oVarO.q = i;
                    recyclerView.R0.add(oVarO);
                } else {
                    oVarO.a.setImportantForAccessibility(i);
                }
                oVarO.p = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.n = kVar;
        if (kVar != null) {
            if (kVar.b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(kVar);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(o40.w(kVar.b, sb));
            }
            kVar.z0(this);
            if (this.s) {
                k kVar4 = this.n;
                kVar4.g = true;
                kVar4.S(this);
            }
        }
        lVar.n();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        km5 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap weakHashMap = q69.a;
            h69.p(viewGroup);
        }
        scrollingChildHelper.d = z;
    }

    public void setOnFlingListener(tz6 tz6Var) {
        this.V = tz6Var;
    }

    @Deprecated
    public void setOnScrollListener(uz6 uz6Var) {
        this.F0 = uz6Var;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.A0 = z;
    }

    public void setRecycledViewPool(wz6 wz6Var) {
        l lVar = this.c;
        RecyclerView recyclerView = lVar.h;
        lVar.f(recyclerView.m, false);
        if (lVar.g != null) {
            r2.b--;
        }
        lVar.g = wz6Var;
        if (wz6Var != null && recyclerView.getAdapter() != null) {
            lVar.g.b++;
        }
        lVar.e();
    }

    public void setScrollState(int i) {
        a07 a07Var;
        if (i == this.N) {
            return;
        }
        if (a1) {
            new Exception();
        }
        this.N = i;
        if (i != 2) {
            e07 e07Var = this.B0;
            e07Var.g.removeCallbacks(e07Var);
            e07Var.c.abortAnimation();
            k kVar = this.n;
            if (kVar != null && (a07Var = kVar.e) != null) {
                a07Var.d();
            }
        }
        k kVar2 = this.n;
        if (kVar2 != null) {
            kVar2.i0(i);
        }
        uz6 uz6Var = this.F0;
        if (uz6Var != null) {
            uz6Var.a(this, i);
        }
        ArrayList arrayList = this.G0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((uz6) this.G0.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.U = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            t0.m("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.U = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(d07 d07Var) {
        this.c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.x) {
            k("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.x = true;
                this.y = true;
                s0();
                return;
            }
            this.x = false;
            if (this.w && this.n != null && this.m != null) {
                requestLayout();
            }
            this.w = false;
        }
    }

    public final void t() {
        f79 f79Var;
        View viewE;
        b07 b07Var = this.E0;
        b07Var.a(1);
        D(b07Var);
        b07Var.i = false;
        o0();
        rn6 rn6Var = this.g;
        fw7 fw7Var = (fw7) rn6Var.b;
        fw7 fw7Var2 = (fw7) rn6Var.b;
        fw7Var.clear();
        ue4 ue4Var = (ue4) rn6Var.c;
        ue4Var.b();
        V();
        Z();
        o oVarN = null;
        View focusedChild = (this.A0 && hasFocus() && this.m != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewE = E(focusedChild)) != null) {
            oVarN = N(viewE);
        }
        if (oVarN == null) {
            b07Var.m = -1L;
            b07Var.l = -1;
            b07Var.n = -1;
        } else {
            b07Var.m = this.m.b ? oVarN.e : -1L;
            b07Var.l = this.D ? -1 : oVarN.i() ? oVarN.d : oVarN.b();
            View focusedChild2 = oVarN.a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            b07Var.n = id;
        }
        b07Var.h = b07Var.j && this.I0;
        this.I0 = false;
        this.H0 = false;
        b07Var.g = b07Var.k;
        b07Var.e = this.m.c();
        G(this.M0);
        if (b07Var.j) {
            int iJ = this.f.j();
            for (int i = 0; i < iJ; i++) {
                o oVarO = O(this.f.i(i));
                if (!oVarO.p() && (!oVarO.g() || this.m.b)) {
                    qz6 qz6Var = this.M;
                    qz6.a(oVarO);
                    oVarO.d();
                    qz6Var.getClass();
                    ba4 ba4Var = new ba4();
                    ba4Var.b(oVarO);
                    f79 f79VarA = (f79) fw7Var2.get(oVarO);
                    if (f79VarA == null) {
                        f79VarA = f79.a();
                        fw7Var2.put(oVarO, f79VarA);
                    }
                    f79VarA.b = ba4Var;
                    f79VarA.a |= 4;
                    if (b07Var.h && oVarO.l() && !oVarO.i() && !oVarO.p() && !oVarO.g()) {
                        ue4Var.i(L(oVarO), oVarO);
                    }
                }
            }
        }
        if (b07Var.k) {
            int iO = this.f.o();
            for (int i2 = 0; i2 < iO; i2++) {
                o oVarO2 = O(this.f.n(i2));
                if (Z0 && oVarO2.c == -1 && !oVarO2.i()) {
                    throw new IllegalStateException(o40.w(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!oVarO2.p() && oVarO2.d == -1) {
                    oVarO2.d = oVarO2.c;
                }
            }
            boolean z = b07Var.f;
            b07Var.f = false;
            this.n.e0(this.c, b07Var);
            b07Var.f = z;
            for (int i3 = 0; i3 < this.f.j(); i3++) {
                o oVarO3 = O(this.f.i(i3));
                if (!oVarO3.p() && ((f79Var = (f79) fw7Var2.get(oVarO3)) == null || (f79Var.a & 4) == 0)) {
                    qz6.a(oVarO3);
                    boolean z2 = (oVarO3.j & 8192) != 0;
                    qz6 qz6Var2 = this.M;
                    oVarO3.d();
                    qz6Var2.getClass();
                    ba4 ba4Var2 = new ba4();
                    ba4Var2.b(oVarO3);
                    if (z2) {
                        b0(oVarO3, ba4Var2);
                    } else {
                        f79 f79VarA2 = (f79) fw7Var2.get(oVarO3);
                        if (f79VarA2 == null) {
                            f79VarA2 = f79.a();
                            fw7Var2.put(oVarO3, f79VarA2);
                        }
                        f79VarA2.a |= 2;
                        f79VarA2.b = ba4Var2;
                    }
                }
            }
            m();
        } else {
            m();
        }
        W(true);
        q0(false);
        b07Var.d = 2;
    }

    public final void u() {
        o0();
        V();
        b07 b07Var = this.E0;
        b07Var.a(6);
        this.e.e();
        b07Var.e = this.m.c();
        b07Var.c = 0;
        if (this.d != null) {
            g gVar = this.m;
            int iOrdinal = gVar.c.ordinal();
            if (iOrdinal == 1 ? gVar.c() > 0 : iOrdinal != 2) {
                Parcelable parcelable = this.d.c;
                if (parcelable != null) {
                    this.n.g0(parcelable);
                }
                this.d = null;
            }
        }
        b07Var.g = false;
        this.n.e0(this.c, b07Var);
        b07Var.f = false;
        b07Var.j = b07Var.j && this.M != null;
        b07Var.d = 4;
        W(true);
        q0(false);
    }

    public final boolean v(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    public final void w(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void x(int i, int i2) {
        this.G++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        uz6 uz6Var = this.F0;
        if (uz6Var != null) {
            uz6Var.b(this, i, i2);
        }
        ArrayList arrayList = this.G0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((uz6) this.G0.get(size)).b(this, i, i2);
            }
        }
        this.G--;
    }

    public final void y() {
        if (this.L != null) {
            return;
        }
        ((c07) this.H).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.L = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void z() {
        if (this.I != null) {
            return;
        }
        ((c07) this.H).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.I = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, tp6.recyclerViewStyle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) throws NoSuchMethodException {
        float fA;
        float fA2;
        char c;
        TypedArray typedArray;
        ClassLoader classLoader;
        Object[] objArr;
        Constructor constructor;
        super(context, attributeSet, i);
        this.b = new m(this);
        this.c = new l(this);
        this.g = new rn6(13);
        this.i = new kz6(this, 0);
        this.j = new Rect();
        this.k = new Rect();
        this.l = new RectF();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.v = 0;
        this.D = false;
        this.E = false;
        this.F = 0;
        this.G = 0;
        this.H = h1;
        this.M = new rf1();
        this.N = 0;
        this.O = -1;
        this.y0 = Float.MIN_VALUE;
        this.z0 = Float.MIN_VALUE;
        int i2 = 1;
        this.A0 = true;
        this.B0 = new e07(this);
        this.D0 = e1 ? new sr0() : null;
        b07 b07Var = new b07();
        b07Var.a = -1;
        b07Var.b = 0;
        b07Var.c = 0;
        b07Var.d = 1;
        b07Var.e = 0;
        b07Var.f = false;
        b07Var.g = false;
        b07Var.h = false;
        b07Var.i = false;
        b07Var.j = false;
        b07Var.k = false;
        this.E0 = b07Var;
        this.H0 = false;
        this.I0 = false;
        int i3 = 8;
        c35 c35Var = new c35(i3, this);
        this.J0 = c35Var;
        this.K0 = false;
        this.M0 = new int[2];
        this.O0 = new int[2];
        this.P0 = new int[2];
        this.Q0 = new int[2];
        this.R0 = new ArrayList();
        this.S0 = new kz6(this, i2);
        this.U0 = 0;
        this.V0 = 0;
        int i4 = 6;
        this.X0 = new vo4(i4, this);
        this.Y0 = new jo1(getContext(), new ck4(12, this));
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.U = viewConfiguration.getScaledTouchSlop();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            Method method = w69.a;
            fA = aq3.k(viewConfiguration);
        } else {
            fA = w69.a(viewConfiguration, context);
        }
        this.y0 = fA;
        if (i5 >= 26) {
            fA2 = aq3.l(viewConfiguration);
        } else {
            fA2 = w69.a(viewConfiguration, context);
        }
        this.z0 = fA2;
        this.W = viewConfiguration.getScaledMinimumFlingVelocity();
        this.x0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.M.a = c35Var;
        t15 t15Var = new t15(i3, this);
        yb ybVar = new yb();
        ybVar.b = new ci6(30);
        ybVar.c = new ArrayList();
        ybVar.d = new ArrayList();
        ybVar.a = 0;
        ybVar.e = t15Var;
        ybVar.f = new ut4(4, ybVar);
        this.e = ybVar;
        this.f = new jp8(new hl5(i4, this));
        WeakHashMap weakHashMap = q69.a;
        if ((i5 >= 26 ? k69.a(this) : 0) == 0 && i5 >= 26) {
            k69.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.B = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new f07(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, st6.RecyclerView, i, 0);
        q69.p(this, context, st6.RecyclerView, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(st6.RecyclerView_layoutManager);
        if (typedArrayObtainStyledAttributes.getInt(st6.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.h = typedArrayObtainStyledAttributes.getBoolean(st6.RecyclerView_android_clipToPadding, true);
        if (typedArrayObtainStyledAttributes.getBoolean(st6.RecyclerView_fastScrollEnabled, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(st6.RecyclerView_fastScrollVerticalThumbDrawable);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(st6.RecyclerView_fastScrollVerticalTrackDrawable);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(st6.RecyclerView_fastScrollHorizontalThumbDrawable);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(st6.RecyclerView_fastScrollHorizontalTrackDrawable);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = getContext().getResources();
                c = 1;
                typedArray = typedArrayObtainStyledAttributes;
                new y82(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(nq6.fastscroll_default_thickness), resources.getDimensionPixelSize(nq6.fastscroll_minimum_range), resources.getDimensionPixelOffset(nq6.fastscroll_margin));
            } else {
                throw new IllegalArgumentException(o40.w(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
        } else {
            c = 1;
            typedArray = typedArrayObtainStyledAttributes;
        }
        typedArray.recycle();
        this.W0 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, classLoader).asSubclass(k.class);
                    try {
                        Constructor constructor2 = clsAsSubclass.getConstructor(f1);
                        Object[] objArr2 = new Object[4];
                        objArr2[0] = context;
                        objArr2[c] = attributeSet;
                        objArr2[2] = Integer.valueOf(i);
                        objArr2[3] = 0;
                        objArr = objArr2;
                        constructor = constructor2;
                    } catch (NoSuchMethodException e) {
                        try {
                            objArr = null;
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(c);
                    setLayoutManager((k) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e7);
                }
            }
        }
        int[] iArr = b1;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        q69.p(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
        setTag(zh6.b, Boolean.TRUE);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public o a;
        public final Rect b;
        public boolean c;
        public boolean d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        k kVar = this.n;
        if (kVar != null) {
            return kVar.u(layoutParams);
        }
        throw new IllegalStateException(o40.w(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Deprecated
    public void setRecyclerListener(xz6 xz6Var) {
    }
}
