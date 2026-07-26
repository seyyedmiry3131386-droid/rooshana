package com.google.android.material.bottomsheet;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.c;
import defpackage.af0;
import defpackage.as7;
import defpackage.b79;
import defpackage.bf0;
import defpackage.cf0;
import defpackage.dc0;
import defpackage.dw1;
import defpackage.f40;
import defpackage.fk4;
import defpackage.fo;
import defpackage.ft6;
import defpackage.g3;
import defpackage.h3;
import defpackage.h69;
import defpackage.ja1;
import defpackage.lj4;
import defpackage.mt6;
import defpackage.o3;
import defpackage.o37;
import defpackage.oo3;
import defpackage.oq6;
import defpackage.pj4;
import defpackage.q69;
import defpackage.rm7;
import defpackage.s5;
import defpackage.vp6;
import defpackage.w82;
import defpackage.xe1;
import defpackage.yk;
import defpackage.yt6;
import defpackage.ze0;
import io.sentry.android.core.t0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements lj4 {
    public static final int G0 = mt6.Widget_Design_BottomSheet_Modal;
    public final cf0 A;
    public int A0;
    public final ValueAnimator B;
    public int B0;
    public final int C;
    public boolean C0;
    public int D;
    public HashMap D0;
    public int E;
    public final SparseIntArray E0;
    public final float F;
    public final af0 F0;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public boolean K;
    public final boolean L;
    public boolean M;
    public int N;
    public b79 O;
    public boolean P;
    public int Q;
    public boolean R;
    public final float S;
    public int T;
    public int U;
    public int V;
    public WeakReference W;
    public WeakReference X;
    public WeakReference Y;
    public WeakReference Z;
    public final int a;
    public boolean b;
    public final float c;
    public final int d;
    public int e;
    public boolean f;
    public int g;
    public final int h;
    public final fk4 i;
    public final ColorStateList j;
    public final int k;
    public final int l;
    public int m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public int v;
    public int w;
    public final boolean x;
    public final ArrayList x0;
    public final as7 y;
    public VelocityTracker y0;
    public boolean z;
    public pj4 z0;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        int i2 = 0;
        this.a = 0;
        this.b = true;
        this.k = -1;
        this.l = -1;
        this.A = new cf0(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.x0 = new ArrayList();
        this.B0 = -1;
        this.E0 = new SparseIntArray();
        this.F0 = new af0(this, i2);
        this.h = context.getResources().getDimensionPixelSize(oq6.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yt6.BottomSheetBehavior_Layout);
        if (typedArrayObtainStyledAttributes.hasValue(yt6.BottomSheetBehavior_Layout_backgroundTint)) {
            this.j = ja1.r(context, typedArrayObtainStyledAttributes, yt6.BottomSheetBehavior_Layout_backgroundTint);
        }
        if (typedArrayObtainStyledAttributes.hasValue(yt6.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.y = as7.d(context, attributeSet, vp6.bottomSheetStyle, G0).a();
        }
        as7 as7Var = this.y;
        if (as7Var != null) {
            fk4 fk4Var = new fk4(as7Var);
            this.i = fk4Var;
            fk4Var.o(context);
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                this.i.s(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(A(), 1.0f);
        this.B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.B.addUpdateListener(new ze0(i2, this));
        this.H = typedArrayObtainStyledAttributes.getDimension(yt6.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(yt6.BottomSheetBehavior_Layout_android_maxWidth)) {
            this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.BottomSheetBehavior_Layout_android_maxWidth, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(yt6.BottomSheetBehavior_Layout_android_maxHeight)) {
            this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.BottomSheetBehavior_Layout_android_maxHeight, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(yt6.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) {
            N(typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        } else {
            N(i);
        }
        M(typedArrayObtainStyledAttributes.getBoolean(yt6.BottomSheetBehavior_Layout_behavior_hideable, false));
        this.n = typedArrayObtainStyledAttributes.getBoolean(yt6.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false);
        L(typedArrayObtainStyledAttributes.getBoolean(yt6.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        this.J = typedArrayObtainStyledAttributes.getBoolean(yt6.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        this.K = typedArrayObtainStyledAttributes.getBoolean(yt6.BottomSheetBehavior_Layout_behavior_draggable, true);
        this.L = typedArrayObtainStyledAttributes.getBoolean(yt6.BottomSheetBehavior_Layout_behavior_draggableOnNestedScroll, true);
        this.a = typedArrayObtainStyledAttributes.getInt(yt6.BottomSheetBehavior_Layout_behavior_saveFlags, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(yt6.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.F = f;
        if (this.W != null) {
            this.E = (int) ((1.0f - f) * this.V);
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(yt6.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(yt6.BottomSheetBehavior_Layout_behavior_expandedOffset, 0);
            if (dimensionPixelOffset < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
            this.C = dimensionPixelOffset;
            U(this.N, true);
        } else {
            int i3 = typedValuePeekValue2.data;
            if (i3 < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
            this.C = i3;
            U(this.N, true);
        }
        this.d = typedArrayObtainStyledAttributes.getInt(yt6.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500);
        this.o = typedArrayObtainStyledAttributes.getBoolean(yt6.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.p = typedArrayObtainStyledAttributes.getBoolean(yt6.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.q = typedArrayObtainStyledAttributes.getBoolean(yt6.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.r = typedArrayObtainStyledAttributes.getBoolean(yt6.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.s = typedArrayObtainStyledAttributes.getBoolean(yt6.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.t = typedArrayObtainStyledAttributes.getBoolean(yt6.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.u = typedArrayObtainStyledAttributes.getBoolean(yt6.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.x = typedArrayObtainStyledAttributes.getBoolean(yt6.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        typedArrayObtainStyledAttributes.recycle();
        this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static View E(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewE = E(viewGroup.getChildAt(i));
            if (viewE != null) {
                return viewE;
            }
        }
        return null;
    }

    public static BottomSheetBehavior F(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((c) layoutParams).a;
        if (behavior instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) behavior;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public static int G(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float A() {
        /*
            r5 = this;
            fk4 r0 = r5.i
            r1 = 0
            if (r0 == 0) goto L67
            java.lang.ref.WeakReference r0 = r5.W
            if (r0 == 0) goto L67
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L67
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L67
            java.lang.ref.WeakReference r0 = r5.W
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.J()
            if (r2 == 0) goto L67
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L67
            fk4 r2 = r5.i
            float r2 = r2.l()
            r3 = 0
            android.view.RoundedCorner r3 = r0.getRoundedCorner(r3)
            if (r3 == 0) goto L45
            int r3 = r3.getRadius()
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L45
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L45
            float r3 = r3 / r2
            goto L46
        L45:
            r3 = r1
        L46:
            fk4 r2 = r5.i
            float r2 = r2.m()
            r4 = 1
            android.view.RoundedCorner r0 = r0.getRoundedCorner(r4)
            if (r0 == 0) goto L62
            int r0 = r0.getRadius()
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L62
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L62
            float r1 = r0 / r2
        L62:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A():float");
    }

    public final int B() {
        int i;
        return this.f ? Math.min(Math.max(this.g, this.V - ((this.U * 9) / 16)), this.T) + this.v : (this.n || this.o || (i = this.m) <= 0) ? this.e + this.v : Math.max(this.e, i + this.h);
    }

    public final void C(int i, View view) {
        if (view == null) {
            return;
        }
        q69.n(524288, view);
        q69.j(0, view);
        q69.n(262144, view);
        q69.j(0, view);
        q69.n(1048576, view);
        q69.j(0, view);
        SparseIntArray sparseIntArray = this.E0;
        int i2 = sparseIntArray.get(i, -1);
        if (i2 != -1) {
            q69.n(i2, view);
            q69.j(0, view);
            sparseIntArray.delete(i);
        }
    }

    public final void D(int i) {
        View view = (View) this.W.get();
        if (view != null) {
            ArrayList arrayList = this.x0;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.G;
            if (i <= i2 && i2 != H()) {
                H();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((bf0) arrayList.get(i3)).b(view);
            }
        }
    }

    public final int H() {
        if (this.b) {
            return this.D;
        }
        return Math.max(this.C, this.r ? 0 : this.w);
    }

    public final int I(int i) {
        if (i == 3) {
            return H();
        }
        if (i == 4) {
            return this.G;
        }
        if (i == 5) {
            return this.V;
        }
        if (i == 6) {
            return this.E;
        }
        throw new IllegalArgumentException(rm7.n(i, "Invalid state to get top offset: "));
    }

    public final boolean J() {
        WeakReference weakReference = this.W;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.W.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void K(BottomSheetDragHandleView bottomSheetDragHandleView) {
        WeakReference weakReference;
        if (bottomSheetDragHandleView != null || (weakReference = this.X) == null) {
            this.X = new WeakReference(bottomSheetDragHandleView);
            T(1, bottomSheetDragHandleView);
        } else {
            C(1, (View) weakReference.get());
            this.X = null;
        }
    }

    public final void L(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        if (this.W != null) {
            z();
        }
        P((this.b && this.N == 6) ? 3 : this.N);
        U(this.N, true);
        S();
    }

    public final void M(boolean z) {
        if (this.I != z) {
            this.I = z;
            if (!z && this.N == 5) {
                O(4);
            }
            S();
        }
    }

    public final void N(int i) {
        if (i == -1) {
            if (this.f) {
                return;
            } else {
                this.f = true;
            }
        } else {
            if (!this.f && this.e == i) {
                return;
            }
            this.f = false;
            this.e = Math.max(0, i);
        }
        W();
    }

    public final void O(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(dw1.s(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.I && i == 5) {
            t0.m("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.b && I(i) <= this.D) ? 3 : i;
        WeakReference weakReference = this.W;
        if (weakReference == null || weakReference.get() == null) {
            P(i);
            return;
        }
        View view = (View) this.W.get();
        fo foVar = new fo(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(foVar);
        } else {
            foVar.run();
        }
    }

    public final void P(int i) {
        View view;
        if (this.N == i) {
            return;
        }
        this.N = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.I;
        }
        WeakReference weakReference = this.W;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            V(true);
        } else if (i == 6 || i == 5 || i == 4) {
            V(false);
        }
        U(i, true);
        while (true) {
            ArrayList arrayList = this.x0;
            if (i2 >= arrayList.size()) {
                S();
                return;
            } else {
                ((bf0) arrayList.get(i2)).c(i, view);
                i2++;
            }
        }
    }

    public final boolean Q(View view, float f) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f * this.S) + ((float) view.getTop())) - ((float) this.G)) / ((float) B()) > 0.5f;
    }

    public final void R(View view, int i, boolean z) {
        int I = I(i);
        b79 b79Var = this.O;
        if (b79Var == null || (!z ? b79Var.u(view, view.getLeft(), I) : b79Var.s(view.getLeft(), I))) {
            P(i);
            return;
        }
        P(2);
        U(i, true);
        this.A.c(i);
    }

    public final void S() {
        WeakReference weakReference = this.W;
        if (weakReference != null) {
            T(0, (View) weakReference.get());
        }
        WeakReference weakReference2 = this.X;
        if (weakReference2 != null) {
            T(1, (View) weakReference2.get());
        }
    }

    public final void T(int i, View view) {
        int iA;
        int i2;
        if (view == null) {
            return;
        }
        C(i, view);
        if (!this.b && this.N != 6) {
            String string = view.getResources().getString(ft6.bottomsheet_action_expand_halfway);
            dc0 dc0Var = new dc0(6, 2, this);
            ArrayList arrayListG = q69.g(view);
            int i3 = 0;
            while (true) {
                if (i3 >= arrayListG.size()) {
                    int i4 = 0;
                    int i5 = -1;
                    while (true) {
                        int[] iArr = q69.d;
                        if (i4 >= 32 || i5 != -1) {
                            break;
                        }
                        int i6 = iArr[i4];
                        boolean z = true;
                        for (int i7 = 0; i7 < arrayListG.size(); i7++) {
                            z &= ((o3) arrayListG.get(i7)).a() != i6;
                        }
                        if (z) {
                            i5 = i6;
                        }
                        i4++;
                    }
                    iA = i5;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((o3) arrayListG.get(i3)).a).getLabel())) {
                        iA = ((o3) arrayListG.get(i3)).a();
                        break;
                    }
                    i3++;
                }
            }
            if (iA != -1) {
                i2 = iA;
                o3 o3Var = new o3(null, i2, string, dc0Var, null);
                View.AccessibilityDelegate accessibilityDelegateE = q69.e(view);
                h3 h3Var = accessibilityDelegateE == null ? null : accessibilityDelegateE instanceof g3 ? ((g3) accessibilityDelegateE).a : new h3(accessibilityDelegateE);
                if (h3Var == null) {
                    h3Var = new h3();
                }
                q69.q(view, h3Var);
                q69.n(o3Var.a(), view);
                q69.g(view).add(o3Var);
                q69.j(0, view);
            } else {
                i2 = iA;
            }
            this.E0.put(i, i2);
        }
        if (this.I && this.N != 5) {
            q69.o(view, o3.n, null, new dc0(5, 2, this));
        }
        int i8 = this.N;
        if (i8 == 3) {
            q69.o(view, o3.m, null, new dc0(this.b ? 4 : 6, 2, this));
            return;
        }
        if (i8 == 4) {
            q69.o(view, o3.l, null, new dc0(this.b ? 3 : 6, 2, this));
        } else {
            if (i8 != 6) {
                return;
            }
            q69.o(view, o3.m, null, new dc0(4, 2, this));
            q69.o(view, o3.l, null, new dc0(3, 2, this));
        }
    }

    public final void U(int i, boolean z) {
        fk4 fk4Var;
        if (i == 2) {
            return;
        }
        boolean z2 = this.N == 3 && (this.x || J());
        if (this.z == z2 || (fk4Var = this.i) == null) {
            return;
        }
        this.z = z2;
        ValueAnimator valueAnimator = this.B;
        if (!z || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            fk4Var.t(this.z ? A() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(fk4Var.b.j, z2 ? A() : 1.0f);
            valueAnimator.start();
        }
    }

    public final void V(boolean z) {
        WeakReference weakReference = this.W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.D0 != null) {
                    return;
                } else {
                    this.D0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.W.get() && z) {
                    this.D0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.D0 = null;
        }
    }

    public final void W() {
        View view;
        if (this.W != null) {
            z();
            if (this.N != 4 || (view = (View) this.W.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // defpackage.lj4
    public final void a() {
        pj4 pj4Var = this.z0;
        if (pj4Var == null) {
            return;
        }
        int i = pj4Var.d;
        int i2 = pj4Var.c;
        f40 f40Var = pj4Var.f;
        pj4Var.f = null;
        if (f40Var != null) {
            float f = f40Var.c;
            if (Build.VERSION.SDK_INT >= 34) {
                if (!this.I) {
                    AnimatorSet animatorSetB = pj4Var.b();
                    animatorSetB.setDuration(yk.c(f, i2, i));
                    animatorSetB.start();
                    O(4);
                    return;
                }
                s5 s5Var = new s5(2, this);
                View view = pj4Var.b;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
                objectAnimatorOfFloat.setInterpolator(new w82(1));
                objectAnimatorOfFloat.setDuration(yk.c(f, i2, i));
                objectAnimatorOfFloat.addListener(new s5(10, pj4Var));
                objectAnimatorOfFloat.addListener(s5Var);
                objectAnimatorOfFloat.start();
                return;
            }
        }
        O(this.I ? 5 : 4);
    }

    @Override // defpackage.lj4
    public final void b(f40 f40Var) {
        pj4 pj4Var = this.z0;
        if (pj4Var == null) {
            return;
        }
        if (pj4Var.f == null) {
            t0.m("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        f40 f40Var2 = pj4Var.f;
        pj4Var.f = f40Var;
        if (f40Var2 == null) {
            return;
        }
        pj4Var.c(f40Var.c);
    }

    @Override // defpackage.lj4
    public final void c(f40 f40Var) {
        pj4 pj4Var = this.z0;
        if (pj4Var == null) {
            return;
        }
        pj4Var.f = f40Var;
    }

    @Override // defpackage.lj4
    public final void d() {
        pj4 pj4Var = this.z0;
        if (pj4Var == null || pj4Var.a() == null) {
            return;
        }
        AnimatorSet animatorSetB = pj4Var.b();
        animatorSetB.setDuration(pj4Var.e);
        animatorSetB.start();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void g(c cVar) {
        this.W = null;
        this.O = null;
        this.z0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void j() {
        this.W = null;
        this.O = null;
        this.z0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        b79 b79Var;
        if (!view.isShown() || !this.K) {
            this.P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A0 = -1;
            this.B0 = -1;
            VelocityTracker velocityTracker = this.y0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.y0 = null;
            }
        }
        if (this.y0 == null) {
            this.y0 = VelocityTracker.obtain();
        }
        this.y0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            this.B0 = y;
            if (this.N != 2) {
                WeakReference weakReference = this.Z;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.t(view2, x, y)) {
                    this.A0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    int i2 = this.B0;
                    WeakReference weakReference2 = this.Y;
                    View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
                    if (view3 == null || !coordinatorLayout.t(view3, x, i2)) {
                        this.C0 = true;
                    }
                }
            }
            this.P = this.A0 == -1 && !coordinatorLayout.t(view, x, this.B0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.C0 = false;
            this.A0 = -1;
            if (this.P) {
                this.P = false;
                return false;
            }
        }
        if (this.P || (b79Var = this.O) == null || !b79Var.t(motionEvent)) {
            WeakReference weakReference3 = this.Z;
            View view4 = weakReference3 != null ? (View) weakReference3.get() : null;
            if (actionMasked != 2 || view4 == null || this.P || this.N == 1 || coordinatorLayout.t(view4, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || (i = this.B0) == -1 || Math.abs(i - motionEvent.getY()) <= this.O.b) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i2 = 0;
        if (this.W == null) {
            this.g = coordinatorLayout.getResources().getDimensionPixelSize(oq6.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.n || this.f) ? false : true;
            if (this.o || this.p || this.q || this.s || this.t || this.u || z) {
                xe1 xe1Var = new xe1();
                xe1Var.b = this;
                xe1Var.a = z;
                o37.h(view, xe1Var);
            }
            q69.t(view, new oo3(view));
            this.W = new WeakReference(view);
            this.z0 = new pj4(view);
            fk4 fk4Var = this.i;
            if (fk4Var != null) {
                view.setBackground(fk4Var);
                float elevation = this.H;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                fk4Var.r(elevation);
            } else {
                ColorStateList colorStateList = this.j;
                if (colorStateList != null) {
                    h69.j(view, colorStateList);
                }
            }
            S();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.O == null) {
            this.O = new b79(coordinatorLayout.getContext(), coordinatorLayout, this.F0);
        }
        int top = view.getTop();
        coordinatorLayout.v(i, view);
        this.U = coordinatorLayout.getWidth();
        this.V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.T = height;
        int iMin = this.V;
        int i3 = iMin - height;
        int i4 = this.w;
        if (i3 < i4) {
            boolean z2 = this.r;
            int i5 = this.l;
            if (z2) {
                if (i5 != -1) {
                    iMin = Math.min(iMin, i5);
                }
                this.T = iMin;
            } else {
                int iMin2 = iMin - i4;
                if (i5 != -1) {
                    iMin2 = Math.min(iMin2, i5);
                }
                this.T = iMin2;
            }
        }
        this.D = Math.max(0, this.V - this.T);
        this.E = (int) ((1.0f - this.F) * this.V);
        z();
        int i6 = this.N;
        if (i6 == 3) {
            int iH = H();
            WeakHashMap weakHashMap = q69.a;
            view.offsetTopAndBottom(iH);
        } else if (i6 == 6) {
            int i7 = this.E;
            WeakHashMap weakHashMap2 = q69.a;
            view.offsetTopAndBottom(i7);
        } else if (this.I && i6 == 5) {
            int i8 = this.V;
            WeakHashMap weakHashMap3 = q69.a;
            view.offsetTopAndBottom(i8);
        } else if (i6 == 4) {
            int i9 = this.G;
            WeakHashMap weakHashMap4 = q69.a;
            view.offsetTopAndBottom(i9);
        } else if (i6 == 1 || i6 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap5 = q69.a;
            view.offsetTopAndBottom(top2);
        }
        U(this.N, false);
        this.Z = new WeakReference(E(view));
        while (true) {
            ArrayList arrayList = this.x0;
            if (i2 >= arrayList.size()) {
                return true;
            }
            ((bf0) arrayList.get(i2)).a(view);
            i2++;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(G(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.k, marginLayoutParams.width), G(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.l, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean n(View view) {
        WeakReference weakReference = this.Z;
        return (weakReference == null || view != weakReference.get() || this.N == 3 || this.M) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.Z;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        boolean z = this.L;
        if (i2 > 0) {
            if (!this.R && !z && view2 == view3 && view2.canScrollVertically(1)) {
                this.M = true;
                return;
            }
            if (i4 < H()) {
                int iH = top - H();
                iArr[1] = iH;
                WeakHashMap weakHashMap = q69.a;
                view.offsetTopAndBottom(-iH);
                P(3);
            } else {
                if (!this.K) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = q69.a;
                view.offsetTopAndBottom(-i2);
                P(1);
            }
        } else if (i2 < 0) {
            boolean zCanScrollVertically = view2.canScrollVertically(-1);
            if (!this.R && !z && view2 == view3 && zCanScrollVertically) {
                this.M = true;
                return;
            }
            if (!zCanScrollVertically) {
                int i5 = this.G;
                if (i4 > i5 && !this.I) {
                    int i6 = top - i5;
                    iArr[1] = i6;
                    WeakHashMap weakHashMap3 = q69.a;
                    view.offsetTopAndBottom(-i6);
                    P(4);
                } else {
                    if (!this.K) {
                        return;
                    }
                    iArr[1] = i2;
                    WeakHashMap weakHashMap4 = q69.a;
                    view.offsetTopAndBottom(-i2);
                    P(1);
                }
            }
        }
        D(view.getTop());
        this.Q = i2;
        this.R = true;
        this.M = false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void s(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i = this.a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.e = savedState.d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.b = savedState.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.I = savedState.f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.J = savedState.g;
            }
        }
        int i2 = savedState.c;
        if (i2 == 1 || i2 == 2) {
            this.N = 4;
        } else {
            this.N = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final Parcelable t(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.Q = 0;
        this.R = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.H()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.P(r0)
            return
        Lf:
            java.lang.ref.WeakReference r3 = r2.Z
            if (r3 == 0) goto Lb5
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb5
            boolean r3 = r2.R
            if (r3 != 0) goto L1f
            goto Lb5
        L1f:
            int r3 = r2.Q
            r5 = 6
            if (r3 <= 0) goto L34
            boolean r3 = r2.b
            if (r3 == 0) goto L2a
            goto Laf
        L2a:
            int r3 = r4.getTop()
            int r6 = r2.E
            if (r3 <= r6) goto Laf
            goto Lae
        L34:
            boolean r3 = r2.I
            if (r3 == 0) goto L55
            android.view.VelocityTracker r3 = r2.y0
            if (r3 != 0) goto L3e
            r3 = 0
            goto L4d
        L3e:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.c
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.y0
            int r6 = r2.A0
            float r3 = r3.getYVelocity(r6)
        L4d:
            boolean r3 = r2.Q(r4, r3)
            if (r3 == 0) goto L55
            r0 = 5
            goto Laf
        L55:
            int r3 = r2.Q
            r6 = 4
            if (r3 != 0) goto L93
            int r3 = r4.getTop()
            boolean r1 = r2.b
            if (r1 == 0) goto L74
            int r5 = r2.D
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L97
            goto Laf
        L74:
            int r1 = r2.E
            if (r3 >= r1) goto L83
            int r6 = r2.G
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto Lae
            goto Laf
        L83:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
            goto Lae
        L93:
            boolean r3 = r2.b
            if (r3 == 0) goto L99
        L97:
            r0 = r6
            goto Laf
        L99:
            int r3 = r4.getTop()
            int r0 = r2.E
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
        Lae:
            r0 = r5
        Laf:
            r3 = 0
            r2.R(r4, r0, r3)
            r2.R = r3
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.w(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean x(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.N;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        b79 b79Var = this.O;
        if (b79Var != null && (this.K || i == 1)) {
            b79Var.m(motionEvent);
        }
        if (actionMasked == 0) {
            this.A0 = -1;
            this.B0 = -1;
            VelocityTracker velocityTracker = this.y0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.y0 = null;
            }
        }
        if (this.y0 == null) {
            this.y0 = VelocityTracker.obtain();
        }
        this.y0.addMovement(motionEvent);
        if (this.O != null && ((this.K || this.N == 1) && actionMasked == 2 && !this.P)) {
            float fAbs = Math.abs(this.B0 - motionEvent.getY());
            b79 b79Var2 = this.O;
            if (fAbs > b79Var2.b) {
                b79Var2.c(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.P;
    }

    public final void y(bf0 bf0Var) {
        ArrayList arrayList = this.x0;
        if (arrayList.contains(bf0Var)) {
            return;
        }
        arrayList.add(bf0Var);
    }

    public final void z() {
        int iB = B();
        if (this.b) {
            this.G = Math.max(this.V - iB, this.D);
        } else {
            this.G = this.V - iB;
        }
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final int c;
        public final int d;
        public final boolean e;
        public final boolean f;
        public final boolean g;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            this.e = parcel.readInt() == 1;
            this.f = parcel.readInt() == 1;
            this.g = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
        }

        public SavedState(BottomSheetBehavior bottomSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.c = bottomSheetBehavior.N;
            this.d = bottomSheetBehavior.e;
            this.e = bottomSheetBehavior.b;
            this.f = bottomSheetBehavior.I;
            this.g = bottomSheetBehavior.J;
        }
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.k = -1;
        this.l = -1;
        this.A = new cf0(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.x0 = new ArrayList();
        this.B0 = -1;
        this.E0 = new SparseIntArray();
        this.F0 = new af0(this, 0);
    }
}
