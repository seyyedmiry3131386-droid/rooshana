package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.motion.widget.b;
import io.sentry.android.core.t0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class az4 implements View.OnClickListener {
    public final bz4 a;
    public final int b;
    public final int c;

    public az4(Context context, bz4 bz4Var, XmlResourceParser xmlResourceParser) {
        this.b = -1;
        this.c = 17;
        this.a = bz4Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), eu6.OnClick);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == eu6.OnClick_targetId) {
                this.b = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
            } else if (index == eu6.OnClick_clickAction) {
                this.c = typedArrayObtainStyledAttributes.getInt(index, this.c);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(MotionLayout motionLayout, int i, bz4 bz4Var) {
        int i2 = this.b;
        View viewFindViewById = motionLayout;
        if (i2 != -1) {
            viewFindViewById = motionLayout.findViewById(i2);
        }
        if (viewFindViewById == null) {
            t0.d("MotionScene", "OnClick could not find id " + i2);
            return;
        }
        int i3 = bz4Var.d;
        int i4 = bz4Var.c;
        if (i3 == -1) {
            viewFindViewById.setOnClickListener(this);
            return;
        }
        int i5 = this.c;
        int i6 = i5 & 1;
        boolean z = false;
        boolean z2 = (i6 != 0 && i == i3) | (i6 != 0 && i == i3) | ((i5 & 256) != 0 && i == i3) | ((i5 & 16) != 0 && i == i4);
        if ((i5 & 4096) != 0 && i == i4) {
            z = true;
        }
        if (z2 || z) {
            viewFindViewById.setOnClickListener(this);
        }
    }

    public final void b(MotionLayout motionLayout) {
        int i = this.b;
        if (i == -1) {
            return;
        }
        View viewFindViewById = motionLayout.findViewById(i);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(null);
            return;
        }
        t0.d("MotionScene", " (*)  could not find id " + i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j58 j58Var;
        bz4 bz4Var = this.a;
        b bVar = bz4Var.j;
        MotionLayout motionLayout = bVar.a;
        if (motionLayout.z) {
            int i = 0;
            if (bz4Var.d != -1) {
                boolean z = true;
                bz4 bz4Var2 = bVar.c;
                int i2 = this.c;
                int i3 = i2 & 1;
                int i4 = (i3 == 0 && (i2 & 256) == 0) ? 0 : 1;
                int i5 = i2 & 16;
                if (i5 == 0 && (i2 & 4096) == 0) {
                    z = false;
                }
                if (i4 == 0 || !z) {
                    i = i4;
                } else {
                    if (bz4Var2 != bz4Var) {
                        motionLayout.setTransition(bz4Var);
                    }
                    if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                        z = false;
                        i = i4;
                    }
                }
                if (bz4Var != bz4Var2) {
                    int i6 = bz4Var.c;
                    int i7 = bz4Var.d;
                    if (i7 != -1) {
                        int i8 = motionLayout.v;
                        if (i8 != i7 && i8 != i6) {
                            return;
                        }
                    } else if (motionLayout.v == i6) {
                        return;
                    }
                }
                if (i != 0 && i3 != 0) {
                    motionLayout.setTransition(bz4Var);
                    motionLayout.u(1.0f);
                    motionLayout.S0 = null;
                    return;
                }
                if (z && i5 != 0) {
                    motionLayout.setTransition(bz4Var);
                    motionLayout.u(0.0f);
                    return;
                } else if (i != 0 && (i2 & 256) != 0) {
                    motionLayout.setTransition(bz4Var);
                    motionLayout.setProgress(1.0f);
                    return;
                } else {
                    if (!z || (i2 & 4096) == 0) {
                        return;
                    }
                    motionLayout.setTransition(bz4Var);
                    motionLayout.setProgress(0.0f);
                    return;
                }
            }
            int currentState = motionLayout.getCurrentState();
            if (currentState != -1) {
                bz4 bz4Var3 = new bz4(bVar, bz4Var);
                bz4Var3.d = currentState;
                bz4Var3.c = bz4Var.c;
                motionLayout.setTransition(bz4Var3);
                motionLayout.u(1.0f);
                motionLayout.S0 = null;
                return;
            }
            int i9 = bz4Var.c;
            if (!motionLayout.isAttachedToWindow()) {
                if (motionLayout.R0 == null) {
                    motionLayout.R0 = new a(motionLayout);
                }
                motionLayout.R0.d = i9;
                return;
            }
            uy4 uy4Var = motionLayout.W0;
            HashMap map = motionLayout.A;
            b bVar2 = motionLayout.q;
            if (bVar2 != null && (j58Var = bVar2.b) != null) {
                int i10 = motionLayout.v;
                float f = -1;
                h58 h58Var = (h58) j58Var.a.get(i9);
                if (h58Var == null) {
                    i10 = i9;
                } else {
                    ArrayList arrayList = h58Var.b;
                    int i11 = h58Var.c;
                    if (f != -1.0f && f != -1.0f) {
                        Iterator it = arrayList.iterator();
                        i58 i58Var = null;
                        while (true) {
                            if (it.hasNext()) {
                                i58 i58Var2 = (i58) it.next();
                                if (i58Var2.a(f, f)) {
                                    if (i10 == i58Var2.e) {
                                        break;
                                    } else {
                                        i58Var = i58Var2;
                                    }
                                }
                            } else if (i58Var != null) {
                                i10 = i58Var.e;
                            }
                        }
                        i10 = i11;
                    } else if (i11 != i10) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (i10 == ((i58) it2.next()).e) {
                                break;
                            }
                        }
                        i10 = i11;
                    }
                }
                if (i10 != -1) {
                    i9 = i10;
                }
            }
            int i12 = motionLayout.v;
            if (i12 == i9) {
                return;
            }
            if (motionLayout.u == i9) {
                motionLayout.u(0.0f);
                return;
            }
            if (motionLayout.w == i9) {
                motionLayout.u(1.0f);
                return;
            }
            motionLayout.w = i9;
            if (i12 != -1) {
                motionLayout.setTransition(i12, i9);
                motionLayout.u(1.0f);
                motionLayout.E = 0.0f;
                motionLayout.u(1.0f);
                motionLayout.S0 = null;
                return;
            }
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
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = motionLayout.getChildAt(i13);
                map.put(childAt, new ly4(childAt));
                sparseArray.put(childAt.getId(), (ly4) map.get(childAt));
            }
            motionLayout.I = true;
            uy4Var.e(null, motionLayout.q.b(i9));
            motionLayout.F();
            uy4Var.a();
            int childCount2 = motionLayout.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                View childAt2 = motionLayout.getChildAt(i14);
                ly4 ly4Var = (ly4) map.get(childAt2);
                if (ly4Var != null) {
                    wy4 wy4Var = ly4Var.f;
                    wy4Var.c = 0.0f;
                    wy4Var.d = 0.0f;
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
            }
            int width = motionLayout.getWidth();
            int height = motionLayout.getHeight();
            if (motionLayout.A0 != null) {
                for (int i15 = 0; i15 < childCount; i15++) {
                    ly4 ly4Var2 = (ly4) map.get(motionLayout.getChildAt(i15));
                    if (ly4Var2 != null) {
                        motionLayout.q.f(ly4Var2);
                    }
                }
                Iterator it3 = motionLayout.A0.iterator();
                while (it3.hasNext()) {
                    ((MotionHelper) it3.next()).r(motionLayout, map);
                }
                for (int i16 = 0; i16 < childCount; i16++) {
                    ly4 ly4Var3 = (ly4) map.get(motionLayout.getChildAt(i16));
                    if (ly4Var3 != null) {
                        ly4Var3.i(width, height, motionLayout.getNanoTime());
                    }
                }
            } else {
                for (int i17 = 0; i17 < childCount; i17++) {
                    ly4 ly4Var4 = (ly4) map.get(motionLayout.getChildAt(i17));
                    if (ly4Var4 != null) {
                        motionLayout.q.f(ly4Var4);
                        ly4Var4.i(width, height, motionLayout.getNanoTime());
                    }
                }
            }
            bz4 bz4Var4 = motionLayout.q.c;
            float f2 = bz4Var4 != null ? bz4Var4.i : 0.0f;
            if (f2 != 0.0f) {
                float fMin = Float.MAX_VALUE;
                float fMax = -3.4028235E38f;
                for (int i18 = 0; i18 < childCount; i18++) {
                    wy4 wy4Var2 = ((ly4) map.get(motionLayout.getChildAt(i18))).g;
                    float f3 = wy4Var2.f + wy4Var2.e;
                    fMin = Math.min(fMin, f3);
                    fMax = Math.max(fMax, f3);
                }
                while (i < childCount) {
                    ly4 ly4Var5 = (ly4) map.get(motionLayout.getChildAt(i));
                    wy4 wy4Var3 = ly4Var5.g;
                    float f4 = wy4Var3.e;
                    float f5 = wy4Var3.f;
                    ly4Var5.n = 1.0f / (1.0f - f2);
                    ly4Var5.m = f2 - ((((f4 + f5) - fMin) * f2) / (fMax - fMin));
                    i++;
                }
            }
            motionLayout.D = 0.0f;
            motionLayout.E = 0.0f;
            motionLayout.I = true;
            motionLayout.invalidate();
        }
    }
}
