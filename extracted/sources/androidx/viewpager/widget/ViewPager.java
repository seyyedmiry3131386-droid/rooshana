package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.content.ContextCompat;
import androidx.customview.view.AbsSavedState;
import androidx.fragment.app.Fragment$SavedState;
import androidx.fragment.app.d;
import androidx.fragment.app.g;
import defpackage.bn6;
import defpackage.dg7;
import defpackage.dw1;
import defpackage.e60;
import defpackage.ek6;
import defpackage.f89;
import defpackage.fp7;
import defpackage.g89;
import defpackage.h69;
import defpackage.h89;
import defpackage.i89;
import defpackage.j89;
import defpackage.js3;
import defpackage.kz5;
import defpackage.lw;
import defpackage.n90;
import defpackage.o40;
import defpackage.p40;
import defpackage.q69;
import defpackage.r81;
import defpackage.rm7;
import io.sentry.android.core.t0;
import ir.mservices.market.pika.common.model.ByteArrayResult;
import ir.mservices.market.screenshots.ScreenshotData;
import ir.mservices.market.screenshots.ScreenshotFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public static final int[] B0 = {R.attr.layout_gravity};
    public static final ek6 C0 = new ek6(12);
    public static final e60 D0 = new e60(3);
    public static final b E0 = new b();
    public int A;
    public int A0;
    public int B;
    public float C;
    public float D;
    public float E;
    public float F;
    public int G;
    public VelocityTracker H;
    public int I;
    public int J;
    public int K;
    public int L;
    public EdgeEffect M;
    public EdgeEffect N;
    public boolean O;
    public boolean P;
    public int Q;
    public ArrayList R;
    public i89 S;
    public i89 T;
    public ArrayList U;
    public j89 V;
    public int W;
    public int a;
    public final ArrayList b;
    public final g89 c;
    public final Rect d;
    public kz5 e;
    public int f;
    public int g;
    public Parcelable h;
    public ClassLoader i;
    public Scroller j;
    public boolean k;
    public r81 l;
    public int m;
    public Drawable n;
    public int o;
    public int p;
    public float q;
    public float r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public boolean x;
    public int x0;
    public boolean y;
    public ArrayList y0;
    public int z;
    public final fp7 z0;

    public static class LayoutParams extends ViewGroup.LayoutParams {
        public boolean a;
        public final int b;
        public float c;
        public boolean d;
        public int e;
        public int f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.B0);
            this.b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int c;
        public Parcelable d;
        public final ClassLoader e;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.c = parcel.readInt();
            this.d = parcel.readParcelable(classLoader);
            this.e = classLoader;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            return dw1.k(this.c, "}", sb);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeParcelable(this.d, i);
        }
    }

    public ViewPager(Context context) {
        super(context);
        this.b = new ArrayList();
        this.c = new g89();
        this.d = new Rect();
        this.g = -1;
        this.h = null;
        this.i = null;
        this.q = -3.4028235E38f;
        this.r = Float.MAX_VALUE;
        this.w = 1;
        this.G = -1;
        this.O = true;
        this.z0 = new fp7(10, this);
        this.A0 = 0;
        l();
    }

    public static boolean d(int i, int i2, int i3, View view, boolean z) {
        int i4;
        if (!(view instanceof ViewGroup)) {
            return z ? false : false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int scrollX = view.getScrollX();
        int scrollY = view.getScrollY();
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            int i5 = i2 + scrollX;
            if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && d(i, i5 - childAt.getLeft(), i4 - childAt.getTop(), childAt, true)) {
                break;
            }
        }
        if (z || !view.canScrollHorizontally(-i)) {
        }
        return true;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.u != z) {
            this.u = z;
        }
    }

    public final g89 a(int i, int i2) {
        d dVar;
        Fragment$SavedState fragment$SavedState;
        g89 g89Var = new g89();
        g89Var.b = i;
        dg7 dg7Var = (dg7) this.e;
        ArrayList arrayList = dg7Var.d;
        ArrayList arrayList2 = dg7Var.e;
        if (arrayList2.size() <= i || (dVar = (d) arrayList2.get(i)) == null) {
            if (dg7Var.c == null) {
                g gVar = dg7Var.b;
                gVar.getClass();
                dg7Var.c = new p40(gVar);
            }
            ArrayList arrayList3 = dg7Var.h;
            lw.f(null, null, i < arrayList3.size());
            new ScreenshotFragment();
            ScreenshotData screenshotData = (ScreenshotData) arrayList3.get(i);
            js3.p(screenshotData, "screenshotData");
            ScreenshotFragment screenshotFragment = new ScreenshotFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("screenshot_data", screenshotData);
            screenshotFragment.u0(bundle);
            if (arrayList.size() > i && (fragment$SavedState = (Fragment$SavedState) arrayList.get(i)) != null) {
                if (screenshotFragment.v != null) {
                    throw new IllegalStateException("Fragment already added");
                }
                Bundle bundle2 = fragment$SavedState.a;
                if (bundle2 == null) {
                    bundle2 = null;
                }
                screenshotFragment.b = bundle2;
            }
            while (arrayList2.size() <= i) {
                arrayList2.add(null);
            }
            screenshotFragment.v0(false);
            screenshotFragment.x0(false);
            arrayList2.set(i, screenshotFragment);
            dg7Var.c.h(getId(), screenshotFragment, null, 1);
            dVar = screenshotFragment;
        }
        g89Var.a = dVar;
        this.e.getClass();
        g89Var.d = 1.0f;
        ArrayList arrayList4 = this.b;
        if (i2 < 0 || i2 >= arrayList4.size()) {
            arrayList4.add(g89Var);
            return g89Var;
        }
        arrayList4.add(i2, g89Var);
        return g89Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        g89 g89VarI;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (g89VarI = i(childAt)) != null && g89VarI.b == this.f) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        g89 g89VarI;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (g89VarI = i(childAt)) != null && g89VarI.b == this.f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean z = layoutParams2.a | (view.getClass().getAnnotation(f89.class) != null);
        layoutParams2.a = z;
        if (!this.t) {
            super.addView(view, i, layoutParams);
        } else {
            if (z) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.d = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    public final void b(i89 i89Var) {
        if (this.R == null) {
            this.R = new ArrayList();
        }
        this.R.add(i89Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(int r8) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.c(int):boolean");
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.q)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.r));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.k = true;
        if (this.j.isFinished() || !this.j.computeScrollOffset()) {
            e(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.j.getCurrX();
        int currY = this.j.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!p(currX)) {
                this.j.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = q69.a;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L64
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L5f
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L48
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L5f
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.c(r4)
            goto L60
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L5f
            boolean r6 = r5.c(r1)
            goto L60
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r6 = r5.o()
            goto L60
        L41:
            r6 = 66
            boolean r6 = r5.c(r6)
            goto L60
        L48:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L58
            int r6 = r5.f
            if (r6 <= 0) goto L5f
            int r6 = r6 - r1
            r5.setCurrentItem(r6, r1)
            r6 = r1
            goto L60
        L58:
            r6 = 17
            boolean r6 = r5.c(r6)
            goto L60
        L5f:
            r6 = r2
        L60:
            if (r6 == 0) goto L63
            goto L64
        L63:
            return r2
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        g89 g89VarI;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (g89VarI = i(childAt)) != null && g89VarI.b == this.f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        kz5 kz5Var;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (kz5Var = this.e) != null && ((dg7) kz5Var).h.size() > 1)) {
            if (!this.M.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.q * width);
                this.M.setSize(height, width);
                zDraw = this.M.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.N.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.r + 1.0f)) * width2);
                this.N.setSize(height2, width2);
                zDraw |= this.N.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.M.finish();
            this.N.finish();
        }
        if (zDraw) {
            WeakHashMap weakHashMap = q69.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.n;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e(boolean z) {
        boolean z2 = this.A0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.j.isFinished()) {
                this.j.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.j.getCurrX();
                int currY = this.j.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        p(currX);
                    }
                }
            }
        }
        this.v = false;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                break;
            }
            g89 g89Var = (g89) arrayList.get(i);
            if (g89Var.c) {
                g89Var.c = false;
                z2 = true;
            }
            i++;
        }
        if (z2) {
            fp7 fp7Var = this.z0;
            if (!z) {
                fp7Var.run();
            } else {
                WeakHashMap weakHashMap = q69.a;
                postOnAnimation(fp7Var);
            }
        }
    }

    public final void f() {
        int size = ((dg7) this.e).h.size();
        this.a = size;
        ArrayList arrayList = this.b;
        boolean z = arrayList.size() < (this.w * 2) + 1 && arrayList.size() < size;
        int i = this.f;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            g89 g89Var = (g89) arrayList.get(i2);
            kz5 kz5Var = this.e;
            d dVar = g89Var.a;
            kz5Var.getClass();
        }
        Collections.sort(arrayList, C0);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                if (!layoutParams.a) {
                    layoutParams.c = 0.0f;
                }
            }
            w(i, 0, false, true);
            requestLayout();
        }
    }

    public final void g(int i) {
        i89 i89Var = this.S;
        if (i89Var != null) {
            i89Var.c(i);
        }
        ArrayList arrayList = this.R;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                i89 i89Var2 = (i89) this.R.get(i2);
                if (i89Var2 != null) {
                    i89Var2.c(i);
                }
            }
        }
        i89 i89Var3 = this.T;
        if (i89Var3 != null) {
            i89Var3.c(i);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.c = 0.0f;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public kz5 getAdapter() {
        return this.e;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        if (this.x0 == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) ((View) this.y0.get(i2)).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.f;
    }

    public int getOffscreenPageLimit() {
        return this.w;
    }

    public int getPageMargin() {
        return this.m;
    }

    public final Rect h(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final g89 i(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return null;
            }
            g89 g89Var = (g89) arrayList.get(i);
            kz5 kz5Var = this.e;
            d dVar = g89Var.a;
            ((dg7) kz5Var).getClass();
            if (dVar.J == view) {
                return g89Var;
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.g89 j() {
        /*
            r13 = this;
            int r0 = r13.getClientWidth()
            r1 = 0
            if (r0 <= 0) goto Lf
            int r2 = r13.getScrollX()
            float r2 = (float) r2
            float r3 = (float) r0
            float r2 = r2 / r3
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r0 <= 0) goto L18
            int r3 = r13.m
            float r3 = (float) r3
            float r0 = (float) r0
            float r3 = r3 / r0
            goto L19
        L18:
            r3 = r1
        L19:
            r0 = 0
            r4 = -1
            r5 = 1
            r6 = 0
            r8 = r0
            r9 = r5
            r7 = r6
            r6 = r4
            r4 = r1
        L22:
            java.util.ArrayList r10 = r13.b
            int r11 = r10.size()
            if (r8 >= r11) goto L72
            java.lang.Object r11 = r10.get(r8)
            g89 r11 = (defpackage.g89) r11
            if (r9 != 0) goto L4c
            int r12 = r11.b
            int r6 = r6 + r5
            if (r12 == r6) goto L4c
            float r1 = r1 + r4
            float r1 = r1 + r3
            g89 r4 = r13.c
            r4.e = r1
            r4.b = r6
            kz5 r1 = r13.e
            r1.getClass()
            r1 = 1065353216(0x3f800000, float:1.0)
            r4.d = r1
            int r8 = r8 + (-1)
            r6 = r4
            goto L4d
        L4c:
            r6 = r11
        L4d:
            float r1 = r6.e
            float r4 = r6.d
            float r4 = r4 + r1
            float r4 = r4 + r3
            if (r9 != 0) goto L59
            int r9 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r9 < 0) goto L72
        L59:
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L71
            int r4 = r10.size()
            int r4 = r4 - r5
            if (r8 != r4) goto L65
            goto L71
        L65:
            int r4 = r6.b
            float r7 = r6.d
            int r8 = r8 + 1
            r9 = r6
            r6 = r4
            r4 = r7
            r7 = r9
            r9 = r0
            goto L22
        L71:
            return r6
        L72:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.j():g89");
    }

    public final g89 k(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                return null;
            }
            g89 g89Var = (g89) arrayList.get(i2);
            if (g89Var.b == i) {
                return g89Var;
            }
            i2++;
        }
    }

    public final void l() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.j = new Scroller(context, D0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.B = viewConfiguration.getScaledPagingTouchSlop();
        this.I = (int) (400.0f * f);
        this.J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.M = new EdgeEffect(context);
        this.N = new EdgeEffect(context);
        this.K = (int) (25.0f * f);
        this.L = (int) (2.0f * f);
        this.z = (int) (f * 16.0f);
        q69.q(this, new n90(7, this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        h69.m(this, new bn6(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(int r12, float r13, int r14) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.m(int, float, int):void");
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.G) {
            int i = actionIndex == 0 ? 1 : 0;
            this.C = motionEvent.getX(i);
            this.G = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.H;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o() {
        kz5 kz5Var = this.e;
        if (kz5Var == null || this.f >= ((dg7) kz5Var).h.size() - 1) {
            return false;
        }
        setCurrentItem(this.f + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.z0);
        Scroller scroller = this.j;
        if (scroller != null && !scroller.isFinished()) {
            this.j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        ArrayList arrayList;
        int i2;
        super.onDraw(canvas);
        if (this.m <= 0 || this.n == null) {
            return;
        }
        ArrayList arrayList2 = this.b;
        if (arrayList2.size() <= 0 || this.e == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f2 = this.m / width;
        int i3 = 0;
        g89 g89Var = (g89) arrayList2.get(0);
        float f3 = g89Var.e;
        int size = arrayList2.size();
        int i4 = g89Var.b;
        int i5 = ((g89) arrayList2.get(size - 1)).b;
        while (i4 < i5) {
            while (true) {
                i = g89Var.b;
                if (i4 <= i || i3 >= size) {
                    break;
                }
                i3++;
                g89Var = (g89) arrayList2.get(i3);
            }
            if (i4 == i) {
                float f4 = g89Var.e;
                float f5 = g89Var.d;
                f = (f4 + f5) * width;
                f3 = f4 + f5 + f2;
            } else {
                this.e.getClass();
                f = (f3 + 1.0f) * width;
                f3 = 1.0f + f2 + f3;
            }
            if (this.m + f > scrollX) {
                arrayList = arrayList2;
                i2 = scrollX;
                this.n.setBounds(Math.round(f), this.o, Math.round(this.m + f), this.p);
                this.n.draw(canvas);
            } else {
                arrayList = arrayList2;
                i2 = scrollX;
            }
            if (f > i2 + r3) {
                return;
            }
            i4++;
            arrayList2 = arrayList;
            scrollX = i2;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            u();
            return false;
        }
        if (action != 0) {
            if (this.x) {
                return true;
            }
            if (this.y) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.E = x;
            this.C = x;
            float y = motionEvent.getY();
            this.F = y;
            this.D = y;
            this.G = motionEvent.getPointerId(0);
            this.y = false;
            this.k = true;
            this.j.computeScrollOffset();
            if (this.A0 != 2 || Math.abs(this.j.getFinalX() - this.j.getCurrX()) <= this.L) {
                e(false);
                this.x = false;
            } else {
                this.j.abortAnimation();
                this.v = false;
                r();
                this.x = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.G;
            if (i != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f = x2 - this.C;
                float fAbs = Math.abs(f);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.F);
                if (f != 0.0f) {
                    float f2 = this.C;
                    if ((f2 >= this.A || f <= 0.0f) && ((f2 <= getWidth() - this.A || f >= 0.0f) && d((int) f, (int) x2, (int) y2, this, false))) {
                        this.C = x2;
                        this.D = y2;
                        this.y = true;
                        return false;
                    }
                }
                float f3 = this.B;
                if (fAbs > f3 && fAbs * 0.5f > fAbs2) {
                    this.x = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f4 = this.E;
                    float f5 = this.B;
                    this.C = f > 0.0f ? f4 + f5 : f4 - f5;
                    this.D = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > f3) {
                    this.y = true;
                }
                if (this.x && q(x2)) {
                    WeakHashMap weakHashMap = q69.a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            n(motionEvent);
        }
        if (this.H == null) {
            this.H = VelocityTracker.obtain();
        }
        this.H.addMovement(motionEvent);
        return this.x;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.A = Math.min(measuredWidth / 10, this.z);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.a) {
                int i6 = layoutParams2.b;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z2 = i8 == 48 || i8 == 80;
                if (i7 != 3 && i7 != 5) {
                    z = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) layoutParams2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) layoutParams2).height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.s = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.t = true;
        r();
        this.t = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.c), 1073741824), this.s);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        g89 g89VarI;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (g89VarI = i(childAt)) != null && g89VarI.b == this.f && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        ClassLoader classLoader = savedState.e;
        super.onRestoreInstanceState(savedState.a);
        kz5 kz5Var = this.e;
        if (kz5Var != null) {
            kz5Var.c(savedState.d, classLoader);
            w(savedState.c, 0, false, true);
        } else {
            this.g = savedState.c;
            this.h = savedState.d;
            this.i = classLoader;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = this.f;
        kz5 kz5Var = this.e;
        if (kz5Var != null) {
            dg7 dg7Var = (dg7) kz5Var;
            ArrayList arrayList = dg7Var.e;
            ArrayList arrayList2 = dg7Var.d;
            if (arrayList2.size() > 0) {
                bundle = new Bundle();
                Fragment$SavedState[] fragment$SavedStateArr = new Fragment$SavedState[arrayList2.size()];
                arrayList2.toArray(fragment$SavedStateArr);
                bundle.putParcelableArray("states", fragment$SavedStateArr);
            } else {
                bundle = null;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                d dVar = (d) arrayList.get(i);
                if (dVar != null && dVar.Q()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    dg7Var.b.Y(bundle, rm7.n(i, ByteArrayResult.AppInfo.IS_SPLIT_SERIALISED_NAME), dVar);
                }
            }
            savedState.d = bundle;
        }
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.m;
            t(i, i3, i5, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00e2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(int i) {
        if (this.b.size() == 0) {
            if (!this.O) {
                this.P = false;
                m(0, 0.0f, 0);
                if (!this.P) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        g89 g89VarJ = j();
        int clientWidth = getClientWidth();
        int i2 = this.m;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = g89VarJ.b;
        float f2 = ((i / f) - g89VarJ.e) / (g89VarJ.d + (i2 / f));
        this.P = false;
        m(i4, f2, (int) (i3 * f2));
        if (this.P) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean q(float f) {
        boolean z;
        boolean z2;
        float f2 = this.C - f;
        this.C = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.q * clientWidth;
        float f4 = this.r * clientWidth;
        ArrayList arrayList = this.b;
        boolean z3 = false;
        g89 g89Var = (g89) arrayList.get(0);
        g89 g89Var2 = (g89) o40.u(1, arrayList);
        if (g89Var.b != 0) {
            f3 = g89Var.e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (g89Var2.b != ((dg7) this.e).h.size() - 1) {
            f4 = g89Var2.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.M.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.N.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.C = (scrollX - i) + this.C;
        scrollTo(i, getScrollY());
        p(i);
        return z3;
    }

    public final void r() {
        s(this.f);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.t) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d0 A[PHI: r7 r11 r16 r17
      0x00d0: PHI (r7v17 int) = (r7v16 int), (r7v5 int), (r7v19 int) binds: [B:63:0x00f5, B:60:0x00e0, B:52:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r11v34 int) = (r11v1 int), (r11v33 int), (r11v36 int) binds: [B:63:0x00f5, B:60:0x00e0, B:52:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r16v4 float) = (r16v2 float), (r16v3 float), (r16v1 float) binds: [B:63:0x00f5, B:60:0x00e0, B:52:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r17v3 float) = (r17v2 float), (r17v2 float), (r17v5 float) binds: [B:63:0x00f5, B:60:0x00e0, B:52:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0154 A[PHI: r3 r13
      0x0154: PHI (r3v22 float) = (r3v20 float), (r3v21 float), (r3v19 float) binds: [B:97:0x017b, B:94:0x0165, B:87:0x014b] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r13v23 int) = (r13v21 int), (r13v22 int), (r13v20 int) binds: [B:97:0x017b, B:94:0x0165, B:87:0x014b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(int r19) {
        /*
            Method dump skipped, instruction units count: 916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.s(int):void");
    }

    public void setAdapter(kz5 kz5Var) {
        ArrayList arrayList = this.b;
        kz5 kz5Var2 = this.e;
        if (kz5Var2 != null) {
            synchronized (kz5Var2) {
            }
            this.e.e(this);
            for (int i = 0; i < arrayList.size(); i++) {
                g89 g89Var = (g89) arrayList.get(i);
                this.e.a(g89Var.b, g89Var.a);
            }
            this.e.b();
            arrayList.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((LayoutParams) getChildAt(i2).getLayoutParams()).a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.f = 0;
            scrollTo(0, 0);
        }
        kz5 kz5Var3 = this.e;
        this.e = kz5Var;
        this.a = 0;
        if (kz5Var != null) {
            if (this.l == null) {
                this.l = new r81(3, this);
            }
            this.e.d();
            this.v = false;
            boolean z = this.O;
            this.O = true;
            this.a = ((dg7) this.e).h.size();
            if (this.g >= 0) {
                this.e.c(this.h, this.i);
                w(this.g, 0, false, true);
                this.g = -1;
                this.h = null;
                this.i = null;
            } else if (z) {
                requestLayout();
            } else {
                r();
            }
        }
        ArrayList arrayList2 = this.U;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.U.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((h89) this.U.get(i3)).a(this, kz5Var3, kz5Var);
        }
    }

    public void setCurrentItem(int i) {
        this.v = false;
        w(i, 0, !this.O, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            t0.m("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.w) {
            this.w = i;
            r();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(i89 i89Var) {
        this.S = i89Var;
    }

    public void setPageMargin(int i) {
        int i2 = this.m;
        this.m = i;
        int width = getWidth();
        t(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.n = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z, j89 j89Var) {
        setPageTransformer(z, j89Var, 2);
    }

    public void setScrollState(int i) {
        if (this.A0 == i) {
            return;
        }
        this.A0 = i;
        if (this.V != null) {
            boolean z = i != 0;
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).setLayerType(z ? this.W : 0, null);
            }
        }
        i89 i89Var = this.S;
        if (i89Var != null) {
            i89Var.b(i);
        }
        ArrayList arrayList = this.R;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                i89 i89Var2 = (i89) this.R.get(i3);
                if (i89Var2 != null) {
                    i89Var2.b(i);
                }
            }
        }
        i89 i89Var3 = this.T;
        if (i89Var3 != null) {
            i89Var3.b(i);
        }
    }

    public final void t(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.b.isEmpty()) {
            if (!this.j.isFinished()) {
                this.j.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        g89 g89VarK = k(this.f);
        int iMin = (int) ((g89VarK != null ? Math.min(g89VarK.e, this.r) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            e(false);
            scrollTo(iMin, getScrollY());
        }
    }

    public final boolean u() {
        this.G = -1;
        this.x = false;
        this.y = false;
        VelocityTracker velocityTracker = this.H;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.H = null;
        }
        this.M.onRelease();
        this.N.onRelease();
        return this.M.isFinished() || this.N.isFinished();
    }

    public final void v(int i, int i2, boolean z, boolean z2) {
        int iMax;
        g89 g89VarK = k(i);
        if (g89VarK != null) {
            iMax = (int) (Math.max(this.q, Math.min(g89VarK.e, this.r)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (z) {
            x(iMax, i2);
            if (z2) {
                g(i);
                return;
            }
            return;
        }
        if (z2) {
            g(i);
        }
        e(false);
        scrollTo(iMax, 0);
        p(iMax);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.n;
    }

    public final void w(int i, int i2, boolean z, boolean z2) {
        kz5 kz5Var = this.e;
        if (kz5Var == null || ((dg7) kz5Var).h.size() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList arrayList = this.b;
        if (!z2 && this.f == i && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= ((dg7) this.e).h.size()) {
            i = ((dg7) this.e).h.size() - 1;
        }
        int i3 = this.w;
        int i4 = this.f;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((g89) arrayList.get(i5)).c = true;
            }
        }
        boolean z3 = this.f != i;
        if (!this.O) {
            s(i);
            v(i, i2, z, z3);
        } else {
            this.f = i;
            if (z3) {
                g(i);
            }
            requestLayout();
        }
    }

    public void x(int i, int i2) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.j;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.k ? this.j.getCurrX() : this.j.getStartX();
            this.j.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i3 = scrollX;
        int scrollY = getScrollY();
        int i4 = i - i3;
        int i5 = 0 - scrollY;
        if (i4 == 0 && i5 == 0) {
            e(false);
            r();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i6 = clientWidth / 2;
        float f = clientWidth;
        float f2 = i6;
        float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i4) * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
        int iAbs2 = Math.abs(i2);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
        } else {
            this.e.getClass();
            iAbs = (int) (((Math.abs(i4) / ((f * 1.0f) + this.m)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.k = false;
        this.j.startScroll(i3, scrollY, i4, i5, iMin);
        WeakHashMap weakHashMap = q69.a;
        postInvalidateOnAnimation();
    }

    public final void y() {
        if (this.x0 != 0) {
            ArrayList arrayList = this.y0;
            if (arrayList == null) {
                this.y0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.y0.add(getChildAt(i));
            }
            Collections.sort(this.y0, E0);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setPageTransformer(boolean z, j89 j89Var, int i) {
        boolean z2 = j89Var != null;
        boolean z3 = z2 != (this.V != null);
        this.V = j89Var;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.x0 = z ? 2 : 1;
            this.W = i;
        } else {
            this.x0 = 0;
        }
        if (z3) {
            r();
        }
    }

    public void setCurrentItem(int i, boolean z) {
        this.v = false;
        w(i, 0, z, false);
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(ContextCompat.getDrawable(getContext(), i));
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new ArrayList();
        this.c = new g89();
        this.d = new Rect();
        this.g = -1;
        this.h = null;
        this.i = null;
        this.q = -3.4028235E38f;
        this.r = Float.MAX_VALUE;
        this.w = 1;
        this.G = -1;
        this.O = true;
        this.z0 = new fp7(10, this);
        this.A0 = 0;
        l();
    }
}
