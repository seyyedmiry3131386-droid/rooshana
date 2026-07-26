package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.c;
import androidx.constraintlayout.widget.d;
import io.sentry.android.core.t0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class uy4 {
    public g31 a = new g31();
    public g31 b = new g31();
    public d c = null;
    public d d = null;
    public int e;
    public int f;
    public final /* synthetic */ MotionLayout g;

    public uy4(MotionLayout motionLayout) {
        this.g = motionLayout;
    }

    public static void c(g31 g31Var, g31 g31Var2) {
        ArrayList<f31> arrayList = g31Var.u0;
        HashMap map = new HashMap();
        map.put(g31Var, g31Var2);
        g31Var2.u0.clear();
        g31Var2.g(g31Var, map);
        for (f31 f31Var : arrayList) {
            f31 l50Var = f31Var instanceof l50 ? new l50() : f31Var instanceof aw2 ? new aw2() : f31Var instanceof ye2 ? new ye2() : f31Var instanceof d96 ? new d96() : f31Var instanceof oy2 ? new oy2() : new f31();
            g31Var2.u0.add(l50Var);
            f31 f31Var2 = l50Var.V;
            if (f31Var2 != null) {
                ((g31) f31Var2).u0.remove(l50Var);
                l50Var.D();
            }
            l50Var.V = g31Var2;
            map.put(f31Var, l50Var);
        }
        for (f31 f31Var3 : arrayList) {
            ((f31) map.get(f31Var3)).g(f31Var3, map);
        }
    }

    public static f31 d(g31 g31Var, View view) {
        if (g31Var.h0 == view) {
            return g31Var;
        }
        ArrayList arrayList = g31Var.u0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            f31 f31Var = (f31) arrayList.get(i);
            if (f31Var.h0 == view) {
                return f31Var;
            }
        }
        return null;
    }

    public final void a() {
        int i;
        HashMap map;
        SparseArray sparseArray;
        int[] iArr;
        int i2;
        Rect rect;
        Rect rect2;
        MotionLayout motionLayout = this.g;
        int childCount = motionLayout.getChildCount();
        HashMap map2 = motionLayout.A;
        map2.clear();
        SparseArray sparseArray2 = new SparseArray();
        int[] iArr2 = new int[childCount];
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = motionLayout.getChildAt(i3);
            ly4 ly4Var = new ly4(childAt);
            int id = childAt.getId();
            iArr2[i3] = id;
            sparseArray2.put(id, ly4Var);
            map2.put(childAt, ly4Var);
        }
        int i4 = 0;
        while (i4 < childCount) {
            View childAt2 = motionLayout.getChildAt(i4);
            ly4 ly4Var2 = (ly4) map2.get(childAt2);
            if (ly4Var2 == null) {
                i = childCount;
                map = map2;
                sparseArray = sparseArray2;
                iArr = iArr2;
                i2 = i4;
            } else {
                Rect rect3 = ly4Var2.a;
                wy4 wy4Var = ly4Var2.f;
                if (this.c != null) {
                    f31 f31VarD = d(this.a, childAt2);
                    if (f31VarD != null) {
                        Rect rectT = MotionLayout.t(motionLayout, f31VarD);
                        map = map2;
                        d dVar = this.c;
                        iArr = iArr2;
                        int width = motionLayout.getWidth();
                        i2 = i4;
                        int height = motionLayout.getHeight();
                        sparseArray = sparseArray2;
                        int i5 = dVar.d;
                        if (i5 != 0) {
                            ly4.h(rectT, rect3, i5, width, height);
                        }
                        wy4Var.c = 0.0f;
                        wy4Var.d = 0.0f;
                        ly4Var2.g(wy4Var);
                        i = childCount;
                        rect = rect3;
                        wy4Var.d(rectT.left, rectT.top, rectT.width(), rectT.height());
                        c cVarK = dVar.k(ly4Var2.c);
                        wy4Var.a(cVarK);
                        c31 c31Var = cVarK.d;
                        ly4Var2.l = c31Var.g;
                        ly4Var2.h.c(rectT, dVar, i5, ly4Var2.c);
                        ly4Var2.C = cVarK.f.i;
                        ly4Var2.E = c31Var.j;
                        ly4Var2.F = c31Var.i;
                        Context context = ly4Var2.b.getContext();
                        int i6 = c31Var.l;
                        ly4Var2.G = i6 != -2 ? i6 != -1 ? i6 != 0 ? i6 != 1 ? i6 != 2 ? i6 != 4 ? i6 != 5 ? null : new OvershootInterpolator() : new BounceInterpolator() : new DecelerateInterpolator() : new AccelerateInterpolator() : new AccelerateDecelerateInterpolator() : new ky4(yy1.c(c31Var.k), 0) : AnimationUtils.loadInterpolator(context, c31Var.m);
                    } else {
                        i = childCount;
                        map = map2;
                        sparseArray = sparseArray2;
                        iArr = iArr2;
                        i2 = i4;
                        rect = rect3;
                        if (motionLayout.K != 0) {
                            t0.d("MotionLayout", vy2.D() + "no widget for  " + vy2.F(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                } else {
                    i = childCount;
                    map = map2;
                    sparseArray = sparseArray2;
                    iArr = iArr2;
                    i2 = i4;
                    rect = rect3;
                }
                if (this.d != null) {
                    f31 f31VarD2 = d(this.b, childAt2);
                    if (f31VarD2 != null) {
                        Rect rectT2 = MotionLayout.t(motionLayout, f31VarD2);
                        d dVar2 = this.d;
                        int width2 = motionLayout.getWidth();
                        int height2 = motionLayout.getHeight();
                        wy4 wy4Var2 = ly4Var2.g;
                        int i7 = dVar2.d;
                        if (i7 != 0) {
                            Rect rect4 = rect;
                            ly4.h(rectT2, rect4, i7, width2, height2);
                            rect2 = rect4;
                        } else {
                            rect2 = rectT2;
                        }
                        wy4Var2.c = 1.0f;
                        wy4Var2.d = 1.0f;
                        ly4Var2.g(wy4Var2);
                        wy4Var2.d(rect2.left, rect2.top, rect2.width(), rect2.height());
                        wy4Var2.a(dVar2.k(ly4Var2.c));
                        ly4Var2.i.c(rect2, dVar2, i7, ly4Var2.c);
                    } else if (motionLayout.K != 0) {
                        t0.d("MotionLayout", vy2.D() + "no widget for  " + vy2.F(childAt2) + " (" + childAt2.getClass().getName() + ")");
                    }
                }
            }
            i4 = i2 + 1;
            map2 = map;
            iArr2 = iArr;
            sparseArray2 = sparseArray;
            childCount = i;
        }
        SparseArray sparseArray3 = sparseArray2;
        int[] iArr3 = iArr2;
        int i8 = childCount;
        int i9 = 0;
        while (i9 < i8) {
            SparseArray sparseArray4 = sparseArray3;
            ly4 ly4Var3 = (ly4) sparseArray4.get(iArr3[i9]);
            int i10 = ly4Var3.f.k;
            if (i10 != -1) {
                ly4 ly4Var4 = (ly4) sparseArray4.get(i10);
                ly4Var3.f.f(ly4Var4, ly4Var4.f);
                ly4Var3.g.f(ly4Var4, ly4Var4.g);
            }
            i9++;
            sparseArray3 = sparseArray4;
        }
    }

    public final void b(int i, int i2) {
        MotionLayout motionLayout = this.g;
        int optimizationLevel = motionLayout.getOptimizationLevel();
        if (motionLayout.v == motionLayout.getStartState()) {
            g31 g31Var = this.b;
            d dVar = this.d;
            motionLayout.r(g31Var, optimizationLevel, (dVar == null || dVar.d == 0) ? i : i2, (dVar == null || dVar.d == 0) ? i2 : i);
            d dVar2 = this.c;
            if (dVar2 != null) {
                g31 g31Var2 = this.a;
                int i3 = dVar2.d;
                int i4 = i3 == 0 ? i : i2;
                if (i3 == 0) {
                    i = i2;
                }
                motionLayout.r(g31Var2, optimizationLevel, i4, i);
                return;
            }
            return;
        }
        d dVar3 = this.c;
        if (dVar3 != null) {
            g31 g31Var3 = this.a;
            int i5 = dVar3.d;
            motionLayout.r(g31Var3, optimizationLevel, i5 == 0 ? i : i2, i5 == 0 ? i2 : i);
        }
        g31 g31Var4 = this.b;
        d dVar4 = this.d;
        int i6 = (dVar4 == null || dVar4.d == 0) ? i : i2;
        if (dVar4 == null || dVar4.d == 0) {
            i = i2;
        }
        motionLayout.r(g31Var4, optimizationLevel, i6, i);
    }

    public final void e(d dVar, d dVar2) {
        this.c = dVar;
        this.d = dVar2;
        this.a = new g31();
        g31 g31Var = new g31();
        this.b = g31Var;
        g31 g31Var2 = this.a;
        boolean z = MotionLayout.c1;
        MotionLayout motionLayout = this.g;
        g31 g31Var3 = motionLayout.c;
        fa0 fa0Var = g31Var3.y0;
        g31Var2.y0 = fa0Var;
        g31Var2.w0.h = fa0Var;
        fa0 fa0Var2 = g31Var3.y0;
        g31Var.y0 = fa0Var2;
        g31Var.w0.h = fa0Var2;
        g31Var2.u0.clear();
        this.b.u0.clear();
        c(g31Var3, this.a);
        c(g31Var3, this.b);
        if (motionLayout.E > 0.5d) {
            if (dVar != null) {
                g(this.a, dVar);
            }
            g(this.b, dVar2);
        } else {
            g(this.b, dVar2);
            if (dVar != null) {
                g(this.a, dVar);
            }
        }
        this.a.z0 = motionLayout.o();
        g31 g31Var4 = this.a;
        g31Var4.v0.T(g31Var4);
        this.b.z0 = motionLayout.o();
        g31 g31Var5 = this.b;
        g31Var5.v0.T(g31Var5);
        ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
        if (layoutParams != null) {
            int i = layoutParams.width;
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.b;
            if (i == -2) {
                this.a.N(constraintWidget$DimensionBehaviour);
                this.b.N(constraintWidget$DimensionBehaviour);
            }
            if (layoutParams.height == -2) {
                this.a.O(constraintWidget$DimensionBehaviour);
                this.b.O(constraintWidget$DimensionBehaviour);
            }
        }
    }

    public final void f() {
        g31 g31Var;
        boolean z;
        MotionLayout motionLayout = this.g;
        int i = motionLayout.x;
        int i2 = motionLayout.y;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        motionLayout.M0 = mode;
        motionLayout.N0 = mode2;
        b(i, i2);
        int i3 = 0;
        if (!(motionLayout.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
            b(i, i2);
            motionLayout.I0 = this.a.r();
            motionLayout.J0 = this.a.l();
            motionLayout.K0 = this.b.r();
            int iL = this.b.l();
            motionLayout.L0 = iL;
            motionLayout.H0 = (motionLayout.I0 == motionLayout.K0 && motionLayout.J0 == iL) ? false : true;
        }
        int i4 = motionLayout.I0;
        int i5 = motionLayout.J0;
        int i6 = motionLayout.M0;
        if (i6 == Integer.MIN_VALUE || i6 == 0) {
            i4 = (int) ((motionLayout.O0 * (motionLayout.K0 - i4)) + i4);
        }
        int i7 = motionLayout.N0;
        if (i7 == Integer.MIN_VALUE || i7 == 0) {
            i5 = (int) ((motionLayout.O0 * (motionLayout.L0 - i5)) + i5);
        }
        g31 g31Var2 = this.a;
        if (g31Var2.I0 || this.b.I0) {
            g31Var = g31Var2;
            z = true;
        } else {
            g31Var = g31Var2;
            z = false;
        }
        motionLayout.q(i, i2, i4, i5, z, g31Var.J0 || this.b.J0);
        HashMap map = motionLayout.A;
        int childCount = motionLayout.getChildCount();
        motionLayout.W0.a();
        motionLayout.I = true;
        SparseArray sparseArray = new SparseArray();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = motionLayout.getChildAt(i8);
            sparseArray.put(childAt.getId(), (ly4) map.get(childAt));
        }
        int width = motionLayout.getWidth();
        int height = motionLayout.getHeight();
        bz4 bz4Var = motionLayout.q.c;
        int i9 = bz4Var != null ? bz4Var.p : -1;
        if (i9 != -1) {
            for (int i10 = 0; i10 < childCount; i10++) {
                ly4 ly4Var = (ly4) map.get(motionLayout.getChildAt(i10));
                if (ly4Var != null) {
                    ly4Var.B = i9;
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[map.size()];
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            ly4 ly4Var2 = (ly4) map.get(motionLayout.getChildAt(i12));
            int i13 = ly4Var2.f.k;
            if (i13 != -1) {
                sparseBooleanArray.put(i13, true);
                iArr[i11] = ly4Var2.f.k;
                i11++;
            }
        }
        if (motionLayout.A0 != null) {
            for (int i14 = 0; i14 < i11; i14++) {
                ly4 ly4Var3 = (ly4) map.get(motionLayout.findViewById(iArr[i14]));
                if (ly4Var3 != null) {
                    motionLayout.q.f(ly4Var3);
                }
            }
            Iterator it = motionLayout.A0.iterator();
            while (it.hasNext()) {
                ((MotionHelper) it.next()).r(motionLayout, map);
            }
            for (int i15 = 0; i15 < i11; i15++) {
                ly4 ly4Var4 = (ly4) map.get(motionLayout.findViewById(iArr[i15]));
                if (ly4Var4 != null) {
                    ly4Var4.i(width, height, motionLayout.getNanoTime());
                }
            }
        } else {
            for (int i16 = 0; i16 < i11; i16++) {
                ly4 ly4Var5 = (ly4) map.get(motionLayout.findViewById(iArr[i16]));
                if (ly4Var5 != null) {
                    motionLayout.q.f(ly4Var5);
                    ly4Var5.i(width, height, motionLayout.getNanoTime());
                }
            }
        }
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt2 = motionLayout.getChildAt(i17);
            ly4 ly4Var6 = (ly4) map.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && ly4Var6 != null) {
                motionLayout.q.f(ly4Var6);
                ly4Var6.i(width, height, motionLayout.getNanoTime());
            }
        }
        bz4 bz4Var2 = motionLayout.q.c;
        float f = bz4Var2 != null ? bz4Var2.i : 0.0f;
        if (f != 0.0f) {
            boolean z2 = ((double) f) < 0.0d;
            float fAbs = Math.abs(f);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            float fMin2 = Float.MAX_VALUE;
            for (int i18 = 0; i18 < childCount; i18++) {
                ly4 ly4Var7 = (ly4) map.get(motionLayout.getChildAt(i18));
                if (!Float.isNaN(ly4Var7.l)) {
                    for (int i19 = 0; i19 < childCount; i19++) {
                        ly4 ly4Var8 = (ly4) map.get(motionLayout.getChildAt(i19));
                        if (!Float.isNaN(ly4Var8.l)) {
                            fMin = Math.min(fMin, ly4Var8.l);
                            fMax = Math.max(fMax, ly4Var8.l);
                        }
                    }
                    while (i3 < childCount) {
                        ly4 ly4Var9 = (ly4) map.get(motionLayout.getChildAt(i3));
                        if (!Float.isNaN(ly4Var9.l)) {
                            ly4Var9.n = 1.0f / (1.0f - fAbs);
                            if (z2) {
                                ly4Var9.m = fAbs - (((fMax - ly4Var9.l) / (fMax - fMin)) * fAbs);
                            } else {
                                ly4Var9.m = fAbs - (((ly4Var9.l - fMin) * fAbs) / (fMax - fMin));
                            }
                        }
                        i3++;
                    }
                    return;
                }
                wy4 wy4Var = ly4Var7.g;
                float f2 = wy4Var.e;
                float f3 = wy4Var.f;
                float f4 = z2 ? f3 - f2 : f3 + f2;
                fMin2 = Math.min(fMin2, f4);
                fMax2 = Math.max(fMax2, f4);
            }
            while (i3 < childCount) {
                ly4 ly4Var10 = (ly4) map.get(motionLayout.getChildAt(i3));
                wy4 wy4Var2 = ly4Var10.g;
                float f5 = wy4Var2.e;
                float f6 = wy4Var2.f;
                float f7 = z2 ? f6 - f5 : f6 + f5;
                ly4Var10.n = 1.0f / (1.0f - fAbs);
                ly4Var10.m = fAbs - (((f7 - fMin2) * fAbs) / (fMax2 - fMin2));
                i3++;
            }
        }
    }

    public final void g(g31 g31Var, d dVar) {
        c cVar;
        c cVar2;
        SparseArray sparseArray = new SparseArray();
        Constraints.LayoutParams layoutParams = new Constraints.LayoutParams();
        sparseArray.clear();
        sparseArray.put(0, g31Var);
        MotionLayout motionLayout = this.g;
        sparseArray.put(motionLayout.getId(), g31Var);
        if (dVar != null && dVar.d != 0) {
            g31 g31Var2 = this.b;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(motionLayout.getHeight(), 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(motionLayout.getWidth(), 1073741824);
            boolean z = MotionLayout.c1;
            motionLayout.r(g31Var2, optimizationLevel, iMakeMeasureSpec, iMakeMeasureSpec2);
        }
        for (f31 f31Var : g31Var.u0) {
            f31Var.j0 = true;
            sparseArray.put(f31Var.h0.getId(), f31Var);
        }
        for (f31 f31Var2 : g31Var.u0) {
            View view = f31Var2.h0;
            int id = view.getId();
            HashMap map = dVar.g;
            if (map.containsKey(Integer.valueOf(id)) && (cVar2 = (c) map.get(Integer.valueOf(id))) != null) {
                cVar2.a(layoutParams);
            }
            f31Var2.P(dVar.k(view.getId()).e.c);
            f31Var2.M(dVar.k(view.getId()).e.d);
            if (view instanceof ConstraintHelper) {
                ConstraintHelper constraintHelper = (ConstraintHelper) view;
                int id2 = constraintHelper.getId();
                HashMap map2 = dVar.g;
                if (map2.containsKey(Integer.valueOf(id2)) && (cVar = (c) map2.get(Integer.valueOf(id2))) != null && (f31Var2 instanceof oy2)) {
                    constraintHelper.l(cVar, (oy2) f31Var2, layoutParams, sparseArray);
                }
                if (view instanceof Barrier) {
                    ((Barrier) view).q();
                }
            }
            layoutParams.resolveLayoutDirection(motionLayout.getLayoutDirection());
            boolean z2 = MotionLayout.c1;
            motionLayout.a(false, view, f31Var2, layoutParams, sparseArray);
            if (dVar.k(view.getId()).c.c == 1) {
                f31Var2.i0 = view.getVisibility();
            } else {
                f31Var2.i0 = dVar.k(view.getId()).c.b;
            }
        }
        for (f31 f31Var3 : g31Var.u0) {
            if (f31Var3 instanceof sa9) {
                ConstraintHelper constraintHelper2 = (ConstraintHelper) f31Var3.h0;
                oy2 oy2Var = (oy2) f31Var3;
                constraintHelper2.p(oy2Var, sparseArray);
                sa9 sa9Var = (sa9) oy2Var;
                for (int i = 0; i < sa9Var.v0; i++) {
                    f31 f31Var4 = sa9Var.u0[i];
                    if (f31Var4 != null) {
                        f31Var4.G = true;
                    }
                }
            }
        }
    }
}
