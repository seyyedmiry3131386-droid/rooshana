package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import androidx.core.content.ContextCompat;
import defpackage.ba4;
import defpackage.dd8;
import defpackage.ed8;
import defpackage.fd8;
import defpackage.gd8;
import defpackage.h69;
import defpackage.hd8;
import defpackage.ir0;
import defpackage.jm5;
import defpackage.kb8;
import defpackage.km5;
import defpackage.lm5;
import defpackage.mm5;
import defpackage.q69;
import defpackage.tt6;
import defpackage.vr0;
import defpackage.wr0;
import io.sentry.android.core.t0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements mm5, lm5, jm5 {
    public static final int[] O = {R.attr.enabled};
    public int A;
    public final wr0 B;
    public ed8 C;
    public ed8 D;
    public fd8 E;
    public fd8 F;
    public ed8 G;
    public boolean H;
    public int I;
    public boolean J;
    public boolean K;
    public final dd8 L;
    public final ed8 M;
    public final ed8 N;
    public View a;
    public hd8 b;
    public boolean c;
    public final int d;
    public float e;
    public float f;
    public final ba4 g;
    public final km5 h;
    public final int[] i;
    public final int[] j;
    public final int[] k;
    public boolean l;
    public final int m;
    public int n;
    public float o;
    public float p;
    public boolean q;
    public int r;
    public boolean s;
    public final DecelerateInterpolator t;
    public final ir0 u;
    public int v;
    public int w;
    public float x;
    public int y;
    public int z;

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    private void setColorViewAlpha(int i) {
        this.u.getBackground().setAlpha(i);
        this.B.setAlpha(i);
    }

    public final boolean a() {
        View view = this.a;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    public final void b() {
        if (this.a == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.u)) {
                    this.a = childAt;
                    return;
                }
            }
        }
    }

    @Override // defpackage.lm5
    public final void c(int i, View view) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.mm5
    public final void d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 != 0) {
            return;
        }
        int i6 = iArr[1];
        if (i5 == 0) {
            this.h.d(i, i2, i3, i4, this.j, i5, iArr);
        }
        int i7 = i4 - (iArr[1] - i6);
        if ((i7 == 0 ? i4 + this.j[1] : i7) >= 0 || a()) {
            return;
        }
        float fAbs = this.f + Math.abs(r14);
        this.f = fAbs;
        j(fAbs);
        iArr[1] = iArr[1] + i7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 285) {
            return super.dispatchKeyEvent(keyEvent);
        }
        n(true, true);
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.h.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.h.b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.h.c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.h.d(i, i2, i3, i4, iArr, 0, null);
    }

    public final void e(float f) {
        if (f > this.e) {
            m(true, true);
            return;
        }
        this.c = false;
        wr0 wr0Var = this.B;
        vr0 vr0Var = wr0Var.a;
        vr0Var.e = 0.0f;
        vr0Var.f = 0.0f;
        wr0Var.invalidateSelf();
        boolean z = this.s;
        dd8 dd8Var = !z ? new dd8(this, 1) : null;
        int i = this.n;
        if (z) {
            this.w = i;
            this.x = this.u.getScaleX();
            ed8 ed8Var = new ed8(this, 4);
            this.G = ed8Var;
            ed8Var.setDuration(150L);
            if (dd8Var != null) {
                this.u.a = dd8Var;
            }
            this.u.clearAnimation();
            this.u.startAnimation(this.G);
        } else {
            this.w = i;
            ed8 ed8Var2 = this.N;
            ed8Var2.reset();
            ed8Var2.setDuration(200L);
            ed8Var2.setInterpolator(this.t);
            if (dd8Var != null) {
                this.u.a = dd8Var;
            }
            this.u.clearAnimation();
            this.u.startAnimation(ed8Var2);
        }
        wr0 wr0Var2 = this.B;
        vr0 vr0Var2 = wr0Var2.a;
        if (vr0Var2.n) {
            vr0Var2.n = false;
        }
        wr0Var2.invalidateSelf();
    }

    @Override // defpackage.lm5
    public final void f(View view, int i, int i2, int i3, int i4, int i5) {
        d(view, i, i2, i3, i4, i5, this.k);
    }

    @Override // defpackage.lm5
    public final boolean g(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.v;
        return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        ba4 ba4Var = this.g;
        return ba4Var.b | ba4Var.a;
    }

    public int getProgressCircleDiameter() {
        return this.I;
    }

    public int getProgressViewEndOffset() {
        return this.z;
    }

    public int getProgressViewStartOffset() {
        return this.y;
    }

    @Override // defpackage.lm5
    public final void h(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.h.f(0);
    }

    @Override // defpackage.lm5
    public final void i(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.h.d;
    }

    public final void j(float f) {
        fd8 fd8Var;
        fd8 fd8Var2;
        wr0 wr0Var = this.B;
        vr0 vr0Var = wr0Var.a;
        if (!vr0Var.n) {
            vr0Var.n = true;
        }
        wr0Var.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f / this.e));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - this.e;
        int i = this.A;
        if (i <= 0) {
            i = this.J ? this.z - this.y : this.z;
        }
        float f2 = i;
        double dMax = Math.max(0.0f, Math.min(fAbs, f2 * 2.0f) / f2) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i2 = this.y + ((int) ((f2 * fMin) + (f2 * fPow * 2.0f)));
        if (this.u.getVisibility() != 0) {
            this.u.setVisibility(0);
        }
        if (!this.s) {
            this.u.setScaleX(1.0f);
            this.u.setScaleY(1.0f);
        }
        if (this.s) {
            setAnimationProgress(Math.min(1.0f, f / this.e));
        }
        if (f < this.e) {
            if (this.B.a.t > 76 && ((fd8Var2 = this.E) == null || !fd8Var2.hasStarted() || fd8Var2.hasEnded())) {
                fd8 fd8Var3 = new fd8(this, this.B.a.t, 76);
                fd8Var3.setDuration(300L);
                ir0 ir0Var = this.u;
                ir0Var.a = null;
                ir0Var.clearAnimation();
                this.u.startAnimation(fd8Var3);
                this.E = fd8Var3;
            }
        } else if (this.B.a.t < 255 && ((fd8Var = this.F) == null || !fd8Var.hasStarted() || fd8Var.hasEnded())) {
            fd8 fd8Var4 = new fd8(this, this.B.a.t, 255);
            fd8Var4.setDuration(300L);
            ir0 ir0Var2 = this.u;
            ir0Var2.a = null;
            ir0Var2.clearAnimation();
            this.u.startAnimation(fd8Var4);
            this.F = fd8Var4;
        }
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        wr0 wr0Var2 = this.B;
        vr0 vr0Var2 = wr0Var2.a;
        vr0Var2.e = 0.0f;
        vr0Var2.f = fMin2;
        wr0Var2.invalidateSelf();
        float fMin3 = Math.min(1.0f, fMax);
        wr0 wr0Var3 = this.B;
        vr0 vr0Var3 = wr0Var3.a;
        if (fMin3 != vr0Var3.p) {
            vr0Var3.p = fMin3;
        }
        wr0Var3.invalidateSelf();
        wr0 wr0Var4 = this.B;
        wr0Var4.a.g = ((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f;
        wr0Var4.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.n);
    }

    public final void k(float f) {
        setTargetOffsetTopAndBottom((this.w + ((int) ((this.y - r0) * f))) - this.u.getTop());
    }

    public final void l() {
        this.u.clearAnimation();
        this.B.stop();
        this.u.setVisibility(8);
        setColorViewAlpha(255);
        if (this.s) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.y - this.n);
        }
        this.n = this.u.getTop();
    }

    public final void m(boolean z, boolean z2) {
        if (this.c != z) {
            this.H = z2;
            b();
            this.c = z;
            dd8 dd8Var = this.L;
            if (!z) {
                ed8 ed8Var = new ed8(this, 1);
                this.D = ed8Var;
                ed8Var.setDuration(150L);
                ir0 ir0Var = this.u;
                ir0Var.a = dd8Var;
                ir0Var.clearAnimation();
                this.u.startAnimation(this.D);
                return;
            }
            this.w = this.n;
            ed8 ed8Var2 = this.M;
            ed8Var2.reset();
            ed8Var2.setDuration(200L);
            ed8Var2.setInterpolator(this.t);
            if (dd8Var != null) {
                this.u.a = dd8Var;
            }
            this.u.clearAnimation();
            this.u.startAnimation(ed8Var2);
        }
    }

    public final void n(boolean z, boolean z2) {
        if (!z || this.c == z) {
            m(z, false);
            return;
        }
        this.c = z;
        setTargetOffsetTopAndBottom((!this.J ? this.z + this.y : this.z) - this.n);
        this.H = z2;
        this.u.setVisibility(0);
        this.B.setAlpha(255);
        ed8 ed8Var = new ed8(this, 0);
        this.C = ed8Var;
        ed8Var.setDuration(this.m);
        dd8 dd8Var = this.L;
        if (dd8Var != null) {
            this.u.a = dd8Var;
        }
        this.u.clearAnimation();
        this.u.startAnimation(this.C);
    }

    public final void o(float f) {
        float f2 = this.p;
        float f3 = f - f2;
        float f4 = this.d;
        if (f3 <= f4 || this.q) {
            return;
        }
        this.o = f2 + f4;
        this.q = true;
        this.B.setAlpha(76);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r5.b()
            int r0 = r6.getActionMasked()
            boolean r1 = r5.isEnabled()
            r2 = 0
            if (r1 == 0) goto L88
            boolean r1 = r5.a()
            if (r1 != 0) goto L88
            boolean r1 = r5.c
            if (r1 != 0) goto L88
            boolean r1 = r5.l
            if (r1 == 0) goto L1e
            goto L88
        L1e:
            if (r0 == 0) goto L64
            r1 = 1
            r3 = -1
            if (r0 == r1) goto L5f
            r4 = 2
            if (r0 == r4) goto L44
            r4 = 3
            if (r0 == r4) goto L5f
            r3 = 6
            if (r0 == r3) goto L2e
            goto L85
        L2e:
            int r0 = r6.getActionIndex()
            int r3 = r6.getPointerId(r0)
            int r4 = r5.r
            if (r3 != r4) goto L85
            if (r0 != 0) goto L3d
            r2 = r1
        L3d:
            int r6 = r6.getPointerId(r2)
            r5.r = r6
            goto L85
        L44:
            int r0 = r5.r
            if (r0 != r3) goto L50
            java.lang.String r6 = "SwipeRefreshLayout"
            java.lang.String r0 = "Got ACTION_MOVE event but don't have an active pointer id."
            io.sentry.android.core.t0.d(r6, r0)
            return r2
        L50:
            int r0 = r6.findPointerIndex(r0)
            if (r0 >= 0) goto L57
            goto L88
        L57:
            float r6 = r6.getY(r0)
            r5.o(r6)
            goto L85
        L5f:
            r5.q = r2
            r5.r = r3
            goto L85
        L64:
            int r0 = r5.y
            ir0 r1 = r5.u
            int r1 = r1.getTop()
            int r0 = r0 - r1
            r5.setTargetOffsetTopAndBottom(r0)
            int r0 = r6.getPointerId(r2)
            r5.r = r0
            r5.q = r2
            int r0 = r6.findPointerIndex(r0)
            if (r0 >= 0) goto L7f
            goto L88
        L7f:
            float r6 = r6.getY(r0)
            r5.p = r6
        L85:
            boolean r6 = r5.q
            return r6
        L88:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.a == null) {
            b();
        }
        View view = this.a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.u.getMeasuredWidth();
        int measuredHeight2 = this.u.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.n;
        this.u.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.a == null) {
            b();
        }
        View view = this.a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.u.measure(View.MeasureSpec.makeMeasureSpec(this.I, 1073741824), View.MeasureSpec.makeMeasureSpec(this.I, 1073741824));
        this.v = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.u) {
                this.v = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.h.a(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.h.b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = (int) f;
                    this.f = 0.0f;
                } else {
                    this.f = f - f2;
                    iArr[1] = i2;
                }
                j(this.f);
            }
        }
        if (this.J && i2 > 0 && this.f == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.u.setVisibility(8);
        }
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        int[] iArr2 = this.i;
        if (dispatchNestedPreScroll(i3, i4, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        d(view, i, i2, i3, i4, 0, this.k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.g.a = i;
        startNestedScroll(i & 2);
        this.f = 0.0f;
        this.l = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.c || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.g.a = 0;
        this.l = false;
        float f = this.f;
        if (f > 0.0f) {
            e(f);
            this.f = 0.0f;
        } else {
            post(new kb8(1, this));
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !a() && !this.c && !this.l) {
            if (actionMasked == 0) {
                this.r = motionEvent.getPointerId(0);
                this.q = false;
                return true;
            }
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.r);
                if (iFindPointerIndex < 0) {
                    t0.d("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.q) {
                    float y = (motionEvent.getY(iFindPointerIndex) - this.o) * 0.5f;
                    this.q = false;
                    e(y);
                }
                this.r = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.r);
                if (iFindPointerIndex2 < 0) {
                    t0.d("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(iFindPointerIndex2);
                o(y2);
                if (this.q) {
                    float f = (y2 - this.o) * 0.5f;
                    if (f > 0.0f) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        j(f);
                    }
                }
                return true;
            }
            if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.r) {
                            this.r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 < 0) {
                    t0.d("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.r = motionEvent.getPointerId(actionIndex2);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        View view;
        if (this.K && (view = this.a) != null) {
            WeakHashMap weakHashMap = q69.a;
            if (!h69.i(view)) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f) {
        this.u.setScaleX(f);
        this.u.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        b();
        wr0 wr0Var = this.B;
        vr0 vr0Var = wr0Var.a;
        vr0Var.i = iArr;
        vr0Var.a(0);
        vr0Var.a(0);
        wr0Var.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = ContextCompat.getColor(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.e = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        l();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.K = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        km5 km5Var = this.h;
        if (km5Var.d) {
            ViewGroup viewGroup = km5Var.c;
            WeakHashMap weakHashMap = q69.a;
            h69.p(viewGroup);
        }
        km5Var.d = z;
    }

    public void setOnRefreshListener(hd8 hd8Var) {
        this.b = hd8Var;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.u.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(ContextCompat.getColor(getContext(), i));
    }

    public void setProgressViewEndTarget(boolean z, int i) {
        this.z = i;
        this.s = z;
        this.u.invalidate();
    }

    public void setProgressViewOffset(boolean z, int i, int i2) {
        this.s = z;
        this.y = i;
        this.z = i2;
        this.J = true;
        l();
        this.c = false;
    }

    public void setRefreshing(boolean z) {
        n(z, false);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.I = (int) (displayMetrics.density * 56.0f);
            } else {
                this.I = (int) (displayMetrics.density * 40.0f);
            }
            this.u.setImageDrawable(null);
            this.B.c(i);
            this.u.setImageDrawable(this.B);
        }
    }

    public void setSlingshotDistance(int i) {
        this.A = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        ir0 ir0Var = this.u;
        ir0Var.bringToFront();
        WeakHashMap weakHashMap = q69.a;
        ir0Var.offsetTopAndBottom(i);
        this.n = ir0Var.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.h.g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.h.h(0);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final boolean a;

        public SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.a = z;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readByte() != 0;
        }
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = false;
        this.e = -1.0f;
        this.i = new int[2];
        this.j = new int[2];
        this.k = new int[2];
        this.r = -1;
        this.v = -1;
        this.L = new dd8(this, 0);
        this.M = new ed8(this, 2);
        this.N = new ed8(this, 3);
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.t = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.I = (int) (displayMetrics.density * 40.0f);
        ir0 ir0Var = new ir0(getContext());
        float f = ir0Var.getContext().getResources().getDisplayMetrics().density;
        TypedArray typedArrayObtainStyledAttributes = ir0Var.getContext().obtainStyledAttributes(tt6.SwipeRefreshLayout);
        ir0Var.b = typedArrayObtainStyledAttributes.getColor(tt6.SwipeRefreshLayout_swipeRefreshLayoutProgressSpinnerBackgroundColor, -328966);
        typedArrayObtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = q69.a;
        h69.l(ir0Var, f * 4.0f);
        shapeDrawable.getPaint().setColor(ir0Var.b);
        ir0Var.setBackground(shapeDrawable);
        this.u = ir0Var;
        wr0 wr0Var = new wr0(getContext());
        this.B = wr0Var;
        wr0Var.c(1);
        this.u.setImageDrawable(this.B);
        this.u.setVisibility(8);
        addView(this.u);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.z = i;
        this.e = i;
        this.g = new ba4();
        this.h = new km5(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.I;
        this.n = i2;
        this.y = i2;
        k(1.0f);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, O);
        setEnabled(typedArrayObtainStyledAttributes2.getBoolean(0, true));
        typedArrayObtainStyledAttributes2.recycle();
    }

    public void setOnChildScrollUpCallback(gd8 gd8Var) {
    }
}
