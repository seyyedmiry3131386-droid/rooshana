package androidx.constraintlayout.motion.widget;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import defpackage.bz4;
import defpackage.h58;
import defpackage.i58;
import defpackage.j58;
import defpackage.jy4;
import defpackage.ly4;
import defpackage.uy4;
import defpackage.wy4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public float a = Float.NaN;
    public float b = Float.NaN;
    public int c = -1;
    public int d = -1;
    public final /* synthetic */ MotionLayout e;

    public a(MotionLayout motionLayout) {
        this.e = motionLayout;
    }

    public final void a() {
        float f;
        j58 j58Var;
        int i = this.c;
        MotionLayout motionLayout = this.e;
        if (i != -1 || this.d != -1) {
            if (i == -1) {
                int i2 = this.d;
                if (motionLayout.isAttachedToWindow()) {
                    uy4 uy4Var = motionLayout.W0;
                    HashMap map = motionLayout.A;
                    b bVar = motionLayout.q;
                    if (bVar != null && (j58Var = bVar.b) != null) {
                        int i3 = motionLayout.v;
                        float f2 = -1;
                        h58 h58Var = (h58) j58Var.a.get(i2);
                        if (h58Var == null) {
                            i3 = i2;
                        } else {
                            ArrayList arrayList = h58Var.b;
                            int i4 = h58Var.c;
                            if (f2 != -1.0f && f2 != -1.0f) {
                                Iterator it = arrayList.iterator();
                                i58 i58Var = null;
                                while (true) {
                                    if (it.hasNext()) {
                                        i58 i58Var2 = (i58) it.next();
                                        if (i58Var2.a(f2, f2)) {
                                            if (i3 == i58Var2.e) {
                                                break;
                                            } else {
                                                i58Var = i58Var2;
                                            }
                                        }
                                    } else if (i58Var != null) {
                                        i3 = i58Var.e;
                                    }
                                }
                            } else if (i4 != i3) {
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    if (i3 == ((i58) it2.next()).e) {
                                        break;
                                    }
                                }
                                i3 = i4;
                            }
                        }
                        if (i3 != -1) {
                            i2 = i3;
                        }
                    }
                    int i5 = motionLayout.v;
                    if (i5 != i2) {
                        if (motionLayout.u == i2) {
                            motionLayout.u(0.0f);
                        } else {
                            float f3 = 1.0f;
                            if (motionLayout.w == i2) {
                                motionLayout.u(1.0f);
                            } else {
                                motionLayout.w = i2;
                                if (i5 != -1) {
                                    motionLayout.setTransition(i5, i2);
                                    motionLayout.u(1.0f);
                                    motionLayout.E = 0.0f;
                                    motionLayout.u(1.0f);
                                    motionLayout.S0 = null;
                                } else {
                                    motionLayout.M = false;
                                    motionLayout.G = 1.0f;
                                    motionLayout.D = 0.0f;
                                    motionLayout.E = 0.0f;
                                    motionLayout.F = motionLayout.getNanoTime();
                                    motionLayout.B = motionLayout.getNanoTime();
                                    motionLayout.H = false;
                                    motionLayout.r = null;
                                    motionLayout.C = motionLayout.q.c() / 1000.0f;
                                    motionLayout.u = -1;
                                    motionLayout.q.n(-1, motionLayout.w);
                                    SparseArray sparseArray = new SparseArray();
                                    int childCount = motionLayout.getChildCount();
                                    map.clear();
                                    for (int i6 = 0; i6 < childCount; i6++) {
                                        View childAt = motionLayout.getChildAt(i6);
                                        map.put(childAt, new ly4(childAt));
                                        sparseArray.put(childAt.getId(), (ly4) map.get(childAt));
                                    }
                                    motionLayout.I = true;
                                    uy4Var.e(null, motionLayout.q.b(i2));
                                    motionLayout.F();
                                    uy4Var.a();
                                    int childCount2 = motionLayout.getChildCount();
                                    int i7 = 0;
                                    while (i7 < childCount2) {
                                        View childAt2 = motionLayout.getChildAt(i7);
                                        ly4 ly4Var = (ly4) map.get(childAt2);
                                        if (ly4Var == null) {
                                            f = f3;
                                        } else {
                                            wy4 wy4Var = ly4Var.f;
                                            wy4Var.c = 0.0f;
                                            wy4Var.d = 0.0f;
                                            f = f3;
                                            wy4Var.d(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                                            jy4 jy4Var = ly4Var.h;
                                            jy4Var.getClass();
                                            childAt2.getX();
                                            childAt2.getY();
                                            childAt2.getWidth();
                                            childAt2.getHeight();
                                            jy4Var.c = childAt2.getVisibility();
                                            jy4Var.e = childAt2.getVisibility() != 0 ? 0.0f : childAt2.getAlpha();
                                            jy4Var.f = childAt2.getElevation();
                                            jy4Var.g = childAt2.getRotation();
                                            jy4Var.h = childAt2.getRotationX();
                                            jy4Var.a = childAt2.getRotationY();
                                            jy4Var.i = childAt2.getScaleX();
                                            jy4Var.j = childAt2.getScaleY();
                                            jy4Var.k = childAt2.getPivotX();
                                            jy4Var.l = childAt2.getPivotY();
                                            jy4Var.m = childAt2.getTranslationX();
                                            jy4Var.n = childAt2.getTranslationY();
                                            jy4Var.o = childAt2.getTranslationZ();
                                        }
                                        i7++;
                                        f3 = f;
                                    }
                                    float f4 = f3;
                                    int width = motionLayout.getWidth();
                                    int height = motionLayout.getHeight();
                                    if (motionLayout.A0 != null) {
                                        for (int i8 = 0; i8 < childCount; i8++) {
                                            ly4 ly4Var2 = (ly4) map.get(motionLayout.getChildAt(i8));
                                            if (ly4Var2 != null) {
                                                motionLayout.q.f(ly4Var2);
                                            }
                                        }
                                        Iterator it3 = motionLayout.A0.iterator();
                                        while (it3.hasNext()) {
                                            ((MotionHelper) it3.next()).r(motionLayout, map);
                                        }
                                        for (int i9 = 0; i9 < childCount; i9++) {
                                            ly4 ly4Var3 = (ly4) map.get(motionLayout.getChildAt(i9));
                                            if (ly4Var3 != null) {
                                                ly4Var3.i(width, height, motionLayout.getNanoTime());
                                            }
                                        }
                                    } else {
                                        for (int i10 = 0; i10 < childCount; i10++) {
                                            ly4 ly4Var4 = (ly4) map.get(motionLayout.getChildAt(i10));
                                            if (ly4Var4 != null) {
                                                motionLayout.q.f(ly4Var4);
                                                ly4Var4.i(width, height, motionLayout.getNanoTime());
                                            }
                                        }
                                    }
                                    bz4 bz4Var = motionLayout.q.c;
                                    float f5 = bz4Var != null ? bz4Var.i : 0.0f;
                                    if (f5 != 0.0f) {
                                        float fMin = Float.MAX_VALUE;
                                        float fMax = -3.4028235E38f;
                                        for (int i11 = 0; i11 < childCount; i11++) {
                                            wy4 wy4Var2 = ((ly4) map.get(motionLayout.getChildAt(i11))).g;
                                            float f6 = wy4Var2.f + wy4Var2.e;
                                            fMin = Math.min(fMin, f6);
                                            fMax = Math.max(fMax, f6);
                                        }
                                        for (int i12 = 0; i12 < childCount; i12++) {
                                            ly4 ly4Var5 = (ly4) map.get(motionLayout.getChildAt(i12));
                                            wy4 wy4Var3 = ly4Var5.g;
                                            float f7 = wy4Var3.e;
                                            float f8 = wy4Var3.f;
                                            ly4Var5.n = f4 / (f4 - f5);
                                            ly4Var5.m = f5 - ((((f7 + f8) - fMin) * f5) / (fMax - fMin));
                                        }
                                    }
                                    motionLayout.D = 0.0f;
                                    motionLayout.E = 0.0f;
                                    motionLayout.I = true;
                                    motionLayout.invalidate();
                                }
                            }
                        }
                    }
                } else {
                    if (motionLayout.R0 == null) {
                        motionLayout.R0 = new a(motionLayout);
                    }
                    motionLayout.R0.d = i2;
                }
            } else {
                int i13 = this.d;
                if (i13 == -1) {
                    motionLayout.setState(i, -1, -1);
                } else {
                    motionLayout.setTransition(i, i13);
                }
            }
            motionLayout.setState(MotionLayout.TransitionState.b);
        }
        if (Float.isNaN(this.b)) {
            if (Float.isNaN(this.a)) {
                return;
            }
            motionLayout.setProgress(this.a);
        } else {
            motionLayout.setProgress(this.a, this.b);
            this.a = Float.NaN;
            this.b = Float.NaN;
            this.c = -1;
            this.d = -1;
        }
    }
}
