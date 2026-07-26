package androidx.slidingpanelayout.widget;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.customview.view.AbsSavedState;
import defpackage.ae9;
import defpackage.aw7;
import defpackage.b79;
import defpackage.bg9;
import defpackage.bt2;
import defpackage.dh2;
import defpackage.ex2;
import defpackage.gw1;
import defpackage.i69;
import defpackage.j49;
import defpackage.je9;
import defpackage.js3;
import defpackage.ke9;
import defpackage.le9;
import defpackage.lf9;
import defpackage.li1;
import defpackage.no3;
import defpackage.q69;
import defpackage.rm7;
import defpackage.t72;
import defpackage.tv8;
import defpackage.ut4;
import defpackage.vs8;
import defpackage.xv7;
import defpackage.xy7;
import defpackage.yv7;
import defpackage.yy7;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class SlidingPaneLayout extends ViewGroup {
    public static final boolean y;
    public int a;
    public int b;
    public Drawable c;
    public Drawable d;
    public boolean e;
    public View f;
    public float g;
    public float h;
    public int i;
    public boolean j;
    public int k;
    public float l;
    public float m;
    public final CopyOnWriteArrayList n;
    public xy7 o;
    public final b79 p;
    public boolean q;
    public boolean r;
    public final Rect s;
    public final ArrayList t;
    public int u;
    public ex2 v;
    public final ut4 w;
    public dh2 x;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public static final int[] d = {R.attr.layout_weight};
        public float a;
        public boolean b;
        public boolean c;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d);
            this.a = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new b();
        public boolean c;
        public int d;

        public SavedState(Parcel parcel) {
            super(parcel, null);
            this.c = parcel.readInt() != 0;
            this.d = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeInt(this.d);
        }
    }

    static {
        y = Build.VERSION.SDK_INT >= 29;
    }

    public SlidingPaneLayout(Context context) {
        this(context, null);
    }

    private no3 getSystemGestureInsets() {
        if (!y) {
            return null;
        }
        WeakHashMap weakHashMap = q69.a;
        lf9 lf9VarA = i69.a(this);
        if (lf9VarA != null) {
            return lf9VarA.a.k();
        }
        return null;
    }

    private void setFoldingFeatureObserver(dh2 dh2Var) {
        this.x = dh2Var;
        dh2Var.getClass();
        ut4 ut4Var = this.w;
        js3.p(ut4Var, "onFoldingFeatureChangeListener");
        dh2Var.d = ut4Var;
    }

    public final boolean a() {
        if (!this.e) {
            this.q = false;
        }
        if (!this.r && !f(1.0f)) {
            return false;
        }
        this.q = false;
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() != 1) {
            super.addView(view, i, layoutParams);
            return;
        }
        yy7 yy7Var = new yy7(view.getContext());
        yy7Var.addView(view);
        super.addView(yy7Var, i, layoutParams);
    }

    public final boolean b(View view) {
        if (view == null) {
            return false;
        }
        return this.e && ((LayoutParams) view.getLayoutParams()).c && this.g > 0.0f;
    }

    public final boolean c() {
        WeakHashMap weakHashMap = q69.a;
        return getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        b79 b79Var = this.p;
        if (b79Var.h()) {
            if (!this.e) {
                b79Var.a();
            } else {
                WeakHashMap weakHashMap = q69.a;
                postInvalidateOnAnimation();
            }
        }
    }

    public final boolean d() {
        return !this.e || this.g == 0.0f;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int right;
        super.draw(canvas);
        Drawable drawable = c() ? this.d : this.c;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (c()) {
            right = childAt.getRight();
            i = intrinsicWidth + right;
        } else {
            int left = childAt.getLeft();
            int i2 = left - intrinsicWidth;
            i = left;
            right = i2;
        }
        drawable.setBounds(right, top, i, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean zC = c() ^ d();
        b79 b79Var = this.p;
        if (zC) {
            b79Var.q = 1;
            no3 systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                b79Var.o = Math.max(b79Var.p, systemGestureInsets.a);
            }
        } else {
            b79Var.q = 2;
            no3 systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                b79Var.o = Math.max(b79Var.p, systemGestureInsets2.c);
            }
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.e && !layoutParams.b && this.f != null) {
            Rect rect = this.s;
            canvas.getClipBounds(rect);
            if (c()) {
                rect.left = Math.max(rect.left, this.f.getRight());
            } else {
                rect.right = Math.min(rect.right, this.f.getLeft());
            }
            canvas.clipRect(rect);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    public final void e(float f) {
        boolean zC = c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != this.f) {
                float f2 = 1.0f - this.h;
                int i2 = this.k;
                this.h = f;
                int i3 = ((int) (f2 * i2)) - ((int) ((1.0f - f) * i2));
                if (zC) {
                    i3 = -i3;
                }
                childAt.offsetLeftAndRight(i3);
            }
        }
    }

    public final boolean f(float f) {
        int paddingLeft;
        if (this.e) {
            boolean zC = c();
            LayoutParams layoutParams = (LayoutParams) this.f.getLayoutParams();
            if (zC) {
                int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                paddingLeft = (int) (getWidth() - (((f * this.i) + paddingRight) + this.f.getWidth()));
            } else {
                paddingLeft = (int) ((f * this.i) + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
            }
            View view = this.f;
            if (this.p.u(view, paddingLeft, view.getTop())) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (childAt.getVisibility() == 4) {
                        childAt.setVisibility(0);
                    }
                }
                WeakHashMap weakHashMap = q69.a;
                postInvalidateOnAnimation();
                return true;
            }
        }
        return false;
    }

    public final void g(View view) {
        int left;
        int right;
        int top;
        int bottom;
        View childAt;
        boolean z;
        View view2 = view;
        boolean zC = c();
        int width = zC ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zC ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !view2.isOpaque()) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view2.getLeft();
            right = view2.getRight();
            top = view2.getTop();
            bottom = view2.getBottom();
        }
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount && (childAt = getChildAt(i)) != view2) {
            if (childAt.getVisibility() == 8) {
                z = zC;
            } else {
                z = zC;
                childAt.setVisibility((Math.max(zC ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zC ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i++;
            view2 = view;
            zC = z;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.a = 0.0f;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams2 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams2.a = 0.0f;
            return layoutParams2;
        }
        LayoutParams layoutParams3 = new LayoutParams(layoutParams);
        layoutParams3.a = 0.0f;
        return layoutParams3;
    }

    @Deprecated
    public int getCoveredFadeColor() {
        return this.b;
    }

    public final int getLockMode() {
        return this.u;
    }

    public int getParallaxDistance() {
        return this.k;
    }

    @Deprecated
    public int getSliderFadeColor() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Activity activity2;
        super.onAttachedToWindow();
        this.r = true;
        if (this.x != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity2 = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity2 = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity2 != null) {
                dh2 dh2Var = this.x;
                dh2Var.getClass();
                li1 li1Var = dh2Var.c;
                if (li1Var != null) {
                    li1Var.g(null);
                }
                dh2Var.c = bt2.G(js3.a(tv8.o(dh2Var.b)), null, null, new FoldingFeatureObserver$registerLayoutStateChangeCallback$1(dh2Var, activity2, null), 3);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        li1 li1Var;
        super.onDetachedFromWindow();
        this.r = true;
        dh2 dh2Var = this.x;
        if (dh2Var != null && (li1Var = dh2Var.c) != null) {
            li1Var.g(null);
        }
        ArrayList arrayList = this.t;
        if (arrayList.size() > 0) {
            throw rm7.l(0, arrayList);
        }
        arrayList.clear();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = this.e;
        b79 b79Var = this.p;
        if (!z2 && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            b79Var.getClass();
            this.q = b79.l(childAt, x, y2);
        }
        if (!this.e || (this.j && actionMasked != 0)) {
            b79Var.b();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            b79Var.b();
            return false;
        }
        if (actionMasked == 0) {
            this.j = false;
            float x2 = motionEvent.getX();
            float y3 = motionEvent.getY();
            this.l = x2;
            this.m = y3;
            b79Var.getClass();
            if (b79.l(this.f, (int) x2, (int) y3) && b(this.f)) {
                z = true;
            }
            return !b79Var.t(motionEvent) || z;
        }
        if (actionMasked == 2) {
            float x3 = motionEvent.getX();
            float y4 = motionEvent.getY();
            float fAbs = Math.abs(x3 - this.l);
            float fAbs2 = Math.abs(y4 - this.m);
            if (fAbs > b79Var.b && fAbs2 > fAbs) {
                b79Var.b();
                this.j = true;
                return false;
            }
        }
        z = false;
        if (b79Var.t(motionEvent)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0089 A[PHI: r17
      0x0089: PHI (r17v3 float) = (r17v1 float), (r17v4 float) binds: [B:19:0x007f, B:21:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b6  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v30 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 815
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        if (savedState.c) {
            if (!this.e) {
                this.q = true;
            }
            if (this.r || f(0.0f)) {
                this.q = true;
            }
        } else {
            a();
        }
        this.q = savedState.c;
        setLockMode(savedState.d);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = this.e ? d() : this.q;
        savedState.d = this.u;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.r = true;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.e) {
            return super.onTouchEvent(motionEvent);
        }
        b79 b79Var = this.p;
        b79Var.m(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.l = x;
            this.m = y2;
            return true;
        }
        if (actionMasked == 1 && b(this.f)) {
            float x2 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float f = x2 - this.l;
            float f2 = y3 - this.m;
            int i = b79Var.b;
            if ((f2 * f2) + (f * f) < i * i && b79.l(this.f, (int) x2, (int) y3)) {
                a();
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (view.getParent() instanceof yy7) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.e) {
            return;
        }
        this.q = view == this.f;
    }

    @Deprecated
    public void setCoveredFadeColor(int i) {
        this.b = i;
    }

    public final void setLockMode(int i) {
        this.u = i;
    }

    @Deprecated
    public void setPanelSlideListener(xy7 xy7Var) {
        xy7 xy7Var2 = this.o;
        CopyOnWriteArrayList copyOnWriteArrayList = this.n;
        if (xy7Var2 != null) {
            copyOnWriteArrayList.remove(xy7Var2);
        }
        if (xy7Var != null) {
            copyOnWriteArrayList.add(xy7Var);
        }
        this.o = xy7Var;
    }

    public void setParallaxDistance(int i) {
        this.k = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.c = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.d = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        setShadowDrawableLeft(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(ContextCompat.getDrawable(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(ContextCompat.getDrawable(getContext(), i));
    }

    @Deprecated
    public void setSliderFadeColor(int i) {
        this.a = i;
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 0;
        this.g = 1.0f;
        this.n = new CopyOnWriteArrayList();
        this.r = true;
        this.s = new Rect();
        this.t = new ArrayList();
        this.w = new ut4(12, this);
        float f = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        q69.q(this, new gw1(this));
        setImportantForAccessibility(1);
        b79 b79Var = new b79(getContext(), this, new a(this));
        b79Var.b = (int) (2.0f * b79Var.b);
        this.p = b79Var;
        b79Var.n = f * 400.0f;
        int i2 = je9.a;
        le9.a.getClass();
        ae9 ae9Var = (ae9) ke9.b.getValue();
        if (ae9Var == null) {
            aw7 aw7Var = aw7.c;
            if (aw7.c == null) {
                ReentrantLock reentrantLock = aw7.d;
                reentrantLock.lock();
                try {
                    if (aw7.c == null) {
                        yv7 yv7Var = null;
                        try {
                            j49 j49VarB = xv7.b();
                            if (j49VarB != null) {
                                j49 j49Var = j49.f;
                                js3.p(j49Var, "other");
                                Object value = j49VarB.e.getValue();
                                js3.o(value, "getValue(...)");
                                Object value2 = j49Var.e.getValue();
                                js3.o(value2, "getValue(...)");
                                if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                    yv7 yv7Var2 = new yv7(context);
                                    if (yv7Var2.e()) {
                                        yv7Var = yv7Var2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        aw7.c = new aw7(yv7Var);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            ae9Var = aw7.c;
            js3.m(ae9Var);
        }
        bg9 bg9Var = new bg9();
        vs8 vs8Var = new vs8();
        t72.a();
        androidx.window.layout.a aVar = new androidx.window.layout.a(bg9Var, ae9Var, vs8Var);
        ke9.c.getClass();
        setFoldingFeatureObserver(new dh2(aVar, ContextCompat.getMainExecutor(context)));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
