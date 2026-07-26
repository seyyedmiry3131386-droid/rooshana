package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.fragment.app.Fragment$SavedState;
import androidx.fragment.app.d;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.k;
import defpackage.bl4;
import defpackage.bm0;
import defpackage.ig7;
import defpackage.jg7;
import defpackage.jz5;
import defpackage.k89;
import defpackage.kv2;
import defpackage.l89;
import defpackage.m89;
import defpackage.n89;
import defpackage.o77;
import defpackage.p82;
import defpackage.p89;
import defpackage.pt2;
import defpackage.q6;
import defpackage.q69;
import defpackage.q89;
import defpackage.qz6;
import defpackage.ue4;
import defpackage.ut4;
import defpackage.ut6;
import defpackage.vf1;
import defpackage.vo4;
import defpackage.xm2;
import defpackage.zz0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public final Rect a;
    public final Rect b;
    public final zz0 c;
    public int d;
    public boolean e;
    public final k89 f;
    public n89 g;
    public int h;
    public Parcelable i;
    public q89 j;
    public kv2 k;
    public jg7 l;
    public zz0 m;
    public p82 n;
    public jz5 o;
    public qz6 p;
    public boolean q;
    public boolean r;
    public int s;
    public o77 t;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int a;
        public int b;
        public Parcelable c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeParcelable(this.c, i);
        }
    }

    public ViewPager2(Context context) {
        super(context);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new zz0();
        this.e = false;
        this.f = new k89(0, this);
        this.h = -1;
        this.p = null;
        this.q = false;
        this.r = true;
        this.s = -1;
        b(context, null);
    }

    public final void a() {
        p82 p82Var = this.n;
        jg7 jg7Var = p82Var.b;
        boolean z = jg7Var.m;
        if (z) {
            if (jg7Var.f != 1 || z) {
                jg7Var.m = false;
                jg7Var.g();
                ig7 ig7Var = jg7Var.g;
                if (ig7Var.c == 0) {
                    int i = ig7Var.b;
                    if (i != jg7Var.h) {
                        jg7Var.c(i);
                    }
                    jg7Var.d(0);
                    jg7Var.e();
                } else {
                    jg7Var.d(2);
                }
            }
            VelocityTracker velocityTracker = p82Var.d;
            velocityTracker.computeCurrentVelocity(1000, p82Var.e);
            int xVelocity = (int) velocityTracker.getXVelocity();
            int yVelocity = (int) velocityTracker.getYVelocity();
            RecyclerView recyclerView = p82Var.c;
            if (recyclerView.J(xVelocity, yVelocity, recyclerView.W, recyclerView.x0)) {
                return;
            }
            ViewPager2 viewPager2 = p82Var.a;
            View viewD = viewPager2.k.d(viewPager2.g);
            if (viewD == null) {
                return;
            }
            int[] iArrB = viewPager2.k.b(viewPager2.g, viewD);
            int i2 = iArrB[0];
            if (i2 == 0 && iArrB[1] == 0) {
                return;
            }
            viewPager2.j.m0(i2, iArrB[1], false);
        }
    }

    public final void b(Context context, AttributeSet attributeSet) {
        o77 o77Var = new o77();
        o77Var.d = this;
        o77Var.a = new ut4(19, o77Var);
        o77Var.b = new vo4(18, o77Var);
        this.t = o77Var;
        q89 q89Var = new q89(this, context);
        this.j = q89Var;
        WeakHashMap weakHashMap = q69.a;
        q89Var.setId(View.generateViewId());
        this.j.setDescendantFocusability(131072);
        n89 n89Var = new n89(this);
        this.g = n89Var;
        this.j.setLayoutManager(n89Var);
        int i = 1;
        this.j.setScrollingTouchSlop(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ut6.ViewPager2);
        q69.p(this, context, ut6.ViewPager2, attributeSet, typedArrayObtainStyledAttributes, 0);
        try {
            int i2 = 0;
            setOrientation(typedArrayObtainStyledAttributes.getInt(ut6.ViewPager2_android_orientation, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            q89 q89Var2 = this.j;
            m89 m89Var = new m89();
            if (q89Var2.C == null) {
                q89Var2.C = new ArrayList();
            }
            q89Var2.C.add(m89Var);
            jg7 jg7Var = new jg7(this);
            this.l = jg7Var;
            this.n = new p82(this, jg7Var, this.j);
            kv2 kv2Var = new kv2(this);
            this.k = kv2Var;
            kv2Var.a(this.j);
            this.j.j(this.l);
            zz0 zz0Var = new zz0();
            this.m = zz0Var;
            this.l.a = zz0Var;
            l89 l89Var = new l89(this, i2);
            l89 l89Var2 = new l89(this, i);
            ((ArrayList) zz0Var.b).add(l89Var);
            ((ArrayList) this.m.b).add(l89Var2);
            o77 o77Var2 = this.t;
            q89 q89Var3 = this.j;
            o77Var2.getClass();
            q89Var3.setImportantForAccessibility(2);
            o77Var2.c = new k89(i, o77Var2);
            ViewPager2 viewPager2 = (ViewPager2) o77Var2.d;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            ((ArrayList) this.m.b).add(this.c);
            jz5 jz5Var = new jz5();
            this.o = jz5Var;
            ((ArrayList) this.m.b).add(jz5Var);
            q89 q89Var4 = this.j;
            attachViewToParent(q89Var4, 0, q89Var4.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c() {
        g adapter;
        if (this.h == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.i;
        if (parcelable != null) {
            if (adapter instanceof xm2) {
                xm2 xm2Var = (xm2) adapter;
                ue4 ue4Var = xm2Var.f;
                ue4 ue4Var2 = xm2Var.g;
                if (!ue4Var2.g() || !ue4Var.g()) {
                    throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
                }
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(xm2Var.getClass().getClassLoader());
                }
                for (String str : bundle.keySet()) {
                    if (str.startsWith("f#") && str.length() > 2) {
                        ue4Var.i(Long.parseLong(str.substring(2)), xm2Var.e.J(bundle, str));
                    } else {
                        if (!str.startsWith("s#") || str.length() <= 2) {
                            throw new IllegalArgumentException("Unexpected key in savedState: ".concat(str));
                        }
                        long j = Long.parseLong(str.substring(2));
                        Fragment$SavedState fragment$SavedState = (Fragment$SavedState) bundle.getParcelable(str);
                        if (xm2Var.y(j)) {
                            ue4Var2.i(j, fragment$SavedState);
                        }
                    }
                }
                if (!ue4Var.g()) {
                    xm2Var.l = true;
                    xm2Var.k = true;
                    xm2Var.A();
                    Handler handler = new Handler(Looper.getMainLooper());
                    q6 q6Var = new q6(15, xm2Var);
                    xm2Var.d.a(new vf1(handler, q6Var, 2));
                    handler.postDelayed(q6Var, 10000L);
                }
            }
            this.i = null;
        }
        int iMax = Math.max(0, Math.min(this.h, adapter.c() - 1));
        this.d = iMax;
        this.h = -1;
        this.j.k0(iMax);
        this.t.G();
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.j.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.j.canScrollVertically(i);
    }

    public final void d(int i, boolean z) {
        g adapter = getAdapter();
        if (adapter == null) {
            if (this.h != -1) {
                this.h = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.c() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), adapter.c() - 1);
        int i2 = this.d;
        if (iMin == i2 && this.l.f == 0) {
            return;
        }
        if (iMin == i2 && z) {
            return;
        }
        double d = i2;
        this.d = iMin;
        this.t.G();
        jg7 jg7Var = this.l;
        if (jg7Var.f != 0) {
            jg7Var.g();
            ig7 ig7Var = jg7Var.g;
            d = ((double) ig7Var.b) + ((double) ig7Var.a);
        }
        jg7 jg7Var2 = this.l;
        jg7Var2.getClass();
        jg7Var2.e = z ? 2 : 3;
        jg7Var2.m = false;
        boolean z2 = jg7Var2.i != iMin;
        jg7Var2.i = iMin;
        jg7Var2.d(2);
        if (z2) {
            jg7Var2.c(iMin);
        }
        if (!z) {
            this.j.k0(iMin);
            return;
        }
        double d2 = iMin;
        if (Math.abs(d2 - d) <= 3.0d) {
            this.j.n0(iMin);
            return;
        }
        this.j.k0(d2 > d ? iMin - 3 : iMin + 3);
        q89 q89Var = this.j;
        q89Var.post(new bm0(iMin, q89Var));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).a;
            sparseArray.put(this.j.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        c();
    }

    public final void e() {
        kv2 kv2Var = this.k;
        if (kv2Var == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewD = kv2Var.d(this.g);
        if (viewD == null) {
            return;
        }
        this.g.getClass();
        int iH = k.H(viewD);
        if (iH != this.d && getScrollState() == 0) {
            this.m.c(iH);
        }
        this.e = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.t.getClass();
        this.t.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public g getAdapter() {
        return this.j.getAdapter();
    }

    public int getCurrentItem() {
        return this.d;
    }

    public int getItemDecorationCount() {
        return this.j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.s;
    }

    public int getOrientation() {
        return this.g.p == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        q89 q89Var = this.j;
        if (getOrientation() == 0) {
            height = q89Var.getWidth() - q89Var.getPaddingLeft();
            paddingBottom = q89Var.getPaddingRight();
        } else {
            height = q89Var.getHeight() - q89Var.getPaddingTop();
            paddingBottom = q89Var.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.l.f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int iC;
        int iC2;
        int iC3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = (ViewPager2) this.t.d;
        if (viewPager2.getAdapter() == null) {
            iC = 0;
            iC2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            iC = viewPager2.getAdapter().c();
            iC2 = 1;
        } else {
            iC2 = viewPager2.getAdapter().c();
            iC = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) pt2.v(iC, iC2, 0).b);
        g adapter = viewPager2.getAdapter();
        if (adapter == null || (iC3 = adapter.c()) == 0 || !viewPager2.r) {
            return;
        }
        if (viewPager2.d > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.d < iC3 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.j.getMeasuredWidth();
        int measuredHeight = this.j.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.a;
        rect.left = paddingLeft;
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.j.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.e) {
            e();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.j, i, i2);
        int measuredWidth = this.j.getMeasuredWidth();
        int measuredHeight = this.j.getMeasuredHeight();
        int measuredState = this.j.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.h = savedState.b;
        this.i = savedState.c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.j.getId();
        int i = this.h;
        if (i == -1) {
            i = this.d;
        }
        savedState.b = i;
        Parcelable parcelable = this.i;
        if (parcelable != null) {
            savedState.c = parcelable;
            return savedState;
        }
        g adapter = this.j.getAdapter();
        if (adapter instanceof xm2) {
            xm2 xm2Var = (xm2) adapter;
            ue4 ue4Var = xm2Var.f;
            int iK = ue4Var.k();
            ue4 ue4Var2 = xm2Var.g;
            Bundle bundle = new Bundle(ue4Var2.k() + iK);
            for (int i2 = 0; i2 < ue4Var.k(); i2++) {
                long jH = ue4Var.h(i2);
                d dVar = (d) ue4Var.d(jH);
                if (dVar != null && dVar.Q()) {
                    xm2Var.e.Y(bundle, bl4.r(jH, "f#"), dVar);
                }
            }
            for (int i3 = 0; i3 < ue4Var2.k(); i3++) {
                long jH2 = ue4Var2.h(i3);
                if (xm2Var.y(jH2)) {
                    bundle.putParcelable(bl4.r(jH2, "s#"), (Parcelable) ue4Var2.d(jH2));
                }
            }
            savedState.c = bundle;
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        this.t.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        o77 o77Var = this.t;
        ViewPager2 viewPager2 = (ViewPager2) o77Var.d;
        if (i != 8192 && i != 4096) {
            throw new IllegalStateException();
        }
        int currentItem = i == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        ViewPager2 viewPager22 = (ViewPager2) o77Var.d;
        if (viewPager22.r) {
            viewPager22.d(currentItem, true);
        }
        return true;
    }

    public void setAdapter(g gVar) {
        g adapter = this.j.getAdapter();
        o77 o77Var = this.t;
        if (adapter != null) {
            adapter.w((k89) o77Var.c);
        } else {
            o77Var.getClass();
        }
        k89 k89Var = this.f;
        if (adapter != null) {
            adapter.w(k89Var);
        }
        this.j.setAdapter(gVar);
        this.d = 0;
        c();
        o77 o77Var2 = this.t;
        o77Var2.G();
        if (gVar != null) {
            gVar.t((k89) o77Var2.c);
        }
        if (gVar != null) {
            gVar.t(k89Var);
        }
    }

    public void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.t.G();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.s = i;
        this.j.requestLayout();
    }

    public void setOrientation(int i) {
        this.g.j1(i);
        this.t.G();
    }

    public void setPageTransformer(p89 p89Var) {
        if (p89Var != null) {
            if (!this.q) {
                this.p = this.j.getItemAnimator();
                this.q = true;
            }
            this.j.setItemAnimator(null);
        } else if (this.q) {
            this.j.setItemAnimator(this.p);
            this.p = null;
            this.q = false;
        }
        this.o.getClass();
        if (p89Var == null) {
            return;
        }
        this.o.getClass();
        this.o.getClass();
    }

    public void setUserInputEnabled(boolean z) {
        this.r = z;
        this.t.G();
    }

    public void setCurrentItem(int i, boolean z) {
        if (this.n.b.m) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        d(i, z);
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new zz0();
        this.e = false;
        this.f = new k89(0, this);
        this.h = -1;
        this.p = null;
        this.q = false;
        this.r = true;
        this.s = -1;
        b(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new zz0();
        this.e = false;
        this.f = new k89(0, this);
        this.h = -1;
        this.p = null;
        this.q = false;
        this.r = true;
        this.s = -1;
        b(context, attributeSet);
    }
}
