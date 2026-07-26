package com.google.android.material.slider;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import androidx.core.content.ContextCompat;
import com.google.android.material.slider.BaseSlider;
import defpackage.as7;
import defpackage.at2;
import defpackage.bl4;
import defpackage.bo8;
import defpackage.dq6;
import defpackage.dw1;
import defpackage.fk4;
import defpackage.fz1;
import defpackage.ja1;
import defpackage.mk4;
import defpackage.mt6;
import defpackage.o37;
import defpackage.o40;
import defpackage.oq6;
import defpackage.q69;
import defpackage.sv0;
import defpackage.ub1;
import defpackage.vf8;
import defpackage.vj8;
import defpackage.vp6;
import defpackage.yh0;
import defpackage.yk;
import defpackage.yr7;
import defpackage.yt6;
import defpackage.zg8;
import io.sentry.android.core.t0;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L, T> extends View {
    public static final int r1 = mt6.Widget_MaterialComponents_Slider;
    public static final int s1 = vp6.motionDurationMedium4;
    public static final int t1 = vp6.motionDurationShort3;
    public static final int u1 = vp6.motionEasingEmphasizedInterpolator;
    public static final int v1 = vp6.motionEasingEmphasizedAccelerateInterpolator;
    public final int A;
    public final int A0;
    public int B;
    public final int B0;
    public int C;
    public float C0;
    public int D;
    public float D0;
    public int E;
    public MotionEvent E0;
    public int F;
    public boolean F0;
    public int G;
    public float G0;
    public int H;
    public float H0;
    public int I;
    public ArrayList I0;
    public int J;
    public int J0;
    public int K;
    public int K0;
    public int L;
    public float L0;
    public int M;
    public float[] M0;
    public int N;
    public int N0;
    public boolean O;
    public int O0;
    public Drawable P;
    public int P0;
    public boolean Q;
    public int Q0;
    public Drawable R;
    public boolean R0;
    public boolean S;
    public boolean S0;
    public ColorStateList T;
    public ColorStateList T0;
    public Drawable U;
    public ColorStateList U0;
    public boolean V;
    public ColorStateList V0;
    public Drawable W;
    public ColorStateList W0;
    public ColorStateList X0;
    public final Path Y0;
    public final RectF Z0;
    public final Paint a;
    public final RectF a1;
    public final Paint b;
    public final RectF b1;
    public final Paint c;
    public final RectF c1;
    public final Paint d;
    public final Rect d1;
    public final Paint e;
    public final RectF e1;
    public final Paint f;
    public final Rect f1;
    public final Paint g;
    public final Matrix g1;
    public final g h;
    public final fk4 h1;
    public final AccessibilityManager i;
    public Drawable i1;
    public f j;
    public List j1;
    public final int k;
    public float k1;
    public final ArrayList l;
    public int l1;
    public final ArrayList m;
    public final int m1;
    public final ArrayList n;
    public final b n1;
    public boolean o;
    public final c o1;
    public ValueAnimator p;
    public final d p1;
    public ValueAnimator q;
    public boolean q1;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public boolean x0;
    public final int y;
    public ColorStateList y0;
    public int z;
    public int z0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FullCornerDirection {
        public static final FullCornerDirection a;
        public static final FullCornerDirection b;
        public static final FullCornerDirection c;
        public static final /* synthetic */ FullCornerDirection[] d;

        /* JADX INFO: Fake field, exist only in values array */
        FullCornerDirection EF0;

        static {
            FullCornerDirection fullCornerDirection = new FullCornerDirection("BOTH", 0);
            FullCornerDirection fullCornerDirection2 = new FullCornerDirection("LEFT", 1);
            a = fullCornerDirection2;
            FullCornerDirection fullCornerDirection3 = new FullCornerDirection("RIGHT", 2);
            b = fullCornerDirection3;
            FullCornerDirection fullCornerDirection4 = new FullCornerDirection("NONE", 3);
            c = fullCornerDirection4;
            d = new FullCornerDirection[]{fullCornerDirection, fullCornerDirection2, fullCornerDirection3, fullCornerDirection4};
        }

        public static FullCornerDirection valueOf(String str) {
            return (FullCornerDirection) Enum.valueOf(FullCornerDirection.class, str);
        }

        public static FullCornerDirection[] values() {
            return (FullCornerDirection[]) d.clone();
        }
    }

    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new h();
        public float a;
        public float b;
        public ArrayList c;
        public float d;
        public boolean e;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.a);
            parcel.writeFloat(this.b);
            parcel.writeList(this.c);
            parcel.writeFloat(this.d);
            parcel.writeBooleanArray(new boolean[]{this.e});
        }
    }

    public BaseSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.sliderStyle);
    }

    public final void A(ArrayList arrayList) {
        ViewGroup viewGroupM;
        int resourceId;
        ViewGroup viewGroupM2;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.I0.size() == arrayList.size() && this.I0.equals(arrayList)) {
            return;
        }
        this.I0 = arrayList;
        this.S0 = true;
        this.K0 = 0;
        E();
        ArrayList arrayList2 = this.l;
        if (arrayList2.size() > this.I0.size()) {
            List<bo8> listSubList = arrayList2.subList(this.I0.size(), arrayList2.size());
            for (bo8 bo8Var : listSubList) {
                if (isAttachedToWindow() && (viewGroupM2 = o37.m(this)) != null) {
                    viewGroupM2.getOverlay().remove(bo8Var);
                    viewGroupM2.removeOnLayoutChangeListener(bo8Var.L);
                }
            }
            listSubList.clear();
        }
        while (true) {
            vf8 vf8Var = null;
            if (arrayList2.size() >= this.I0.size()) {
                break;
            }
            Context context = getContext();
            int i = this.k;
            bo8 bo8Var2 = new bo8(context, i);
            TypedArray typedArrayD = vj8.d(bo8Var2.I, null, yt6.Tooltip, 0, i, new int[0]);
            Context context2 = bo8Var2.I;
            bo8Var2.S = context2.getResources().getDimensionPixelSize(oq6.mtrl_tooltip_arrowSize);
            boolean z = typedArrayD.getBoolean(yt6.Tooltip_showMarker, true);
            bo8Var2.R = z;
            if (z) {
                yr7 yr7VarH = bo8Var2.b.a.h();
                yr7VarH.k = bo8Var2.F();
                bo8Var2.setShapeAppearanceModel(yr7VarH.a());
            } else {
                bo8Var2.S = 0;
            }
            CharSequence text = typedArrayD.getText(yt6.Tooltip_android_text);
            boolean zEquals = TextUtils.equals(bo8Var2.H, text);
            zg8 zg8Var = bo8Var2.K;
            if (!zEquals) {
                bo8Var2.H = text;
                zg8Var.e = true;
                bo8Var2.invalidateSelf();
            }
            int i2 = yt6.Tooltip_android_textAppearance;
            if (typedArrayD.hasValue(i2) && (resourceId = typedArrayD.getResourceId(i2, 0)) != 0) {
                vf8Var = new vf8(context2, resourceId);
            }
            if (vf8Var != null && typedArrayD.hasValue(yt6.Tooltip_android_textColor)) {
                vf8Var.k = ja1.r(context2, typedArrayD, yt6.Tooltip_android_textColor);
            }
            zg8Var.c(vf8Var, context2);
            TypedValue typedValueJ = yh0.J(vp6.colorOnBackground, context2, bo8.class.getCanonicalName());
            int i3 = typedValueJ.resourceId;
            int color = i3 != 0 ? ContextCompat.getColor(context2, i3) : typedValueJ.data;
            TypedValue typedValueJ2 = yh0.J(R.attr.colorBackground, context2, bo8.class.getCanonicalName());
            int i4 = typedValueJ2.resourceId;
            bo8Var2.s(ColorStateList.valueOf(typedArrayD.getColor(yt6.Tooltip_backgroundTint, sv0.c(sv0.e(color, 153), sv0.e(i4 != 0 ? ContextCompat.getColor(context2, i4) : typedValueJ2.data, 229)))));
            TypedValue typedValueJ3 = yh0.J(vp6.colorSurface, context2, bo8.class.getCanonicalName());
            int i5 = typedValueJ3.resourceId;
            bo8Var2.y(ColorStateList.valueOf(i5 != 0 ? ContextCompat.getColor(context2, i5) : typedValueJ3.data));
            bo8Var2.N = typedArrayD.getDimensionPixelSize(yt6.Tooltip_android_padding, 0);
            bo8Var2.O = typedArrayD.getDimensionPixelSize(yt6.Tooltip_android_minWidth, 0);
            bo8Var2.P = typedArrayD.getDimensionPixelSize(yt6.Tooltip_android_minHeight, 0);
            bo8Var2.Q = typedArrayD.getDimensionPixelSize(yt6.Tooltip_android_layout_margin, 0);
            typedArrayD.recycle();
            arrayList2.add(bo8Var2);
            if (isAttachedToWindow() && (viewGroupM = o37.m(this)) != null) {
                int[] iArr = new int[2];
                viewGroupM.getLocationOnScreen(iArr);
                bo8Var2.T = iArr[0];
                viewGroupM.getWindowVisibleDisplayFrame(bo8Var2.M);
                viewGroupM.addOnLayoutChangeListener(bo8Var2.L);
            }
        }
        int i6 = arrayList2.size() == 1 ? 0 : 1;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((bo8) it.next()).z(i6);
        }
        Iterator it2 = this.m.iterator();
        while (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            Iterator it3 = this.I0.iterator();
            if (it3.hasNext()) {
                ((Float) it3.next()).getClass();
                throw null;
            }
        }
        postInvalidate();
    }

    public final boolean B(int i, float f) {
        this.K0 = i;
        if (Math.abs(f - ((Float) this.I0.get(i)).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.l1 == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f2 = this.G0;
                minSeparation = dw1.f(f2, this.H0, (minSeparation - this.E) / this.Q0, f2);
            }
        }
        if (s() || t()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        int i3 = i - 1;
        this.I0.set(i, Float.valueOf(at2.R(f, i3 < 0 ? this.G0 : minSeparation + ((Float) this.I0.get(i3)).floatValue(), i2 >= this.I0.size() ? this.H0 : ((Float) this.I0.get(i2)).floatValue() - minSeparation)));
        Iterator it = this.m.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            ((Float) this.I0.get(i)).getClass();
            throw null;
        }
        AccessibilityManager accessibilityManager = this.i;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            f fVar = this.j;
            if (fVar == null) {
                this.j = new f(this);
            } else {
                removeCallbacks(fVar);
            }
            f fVar2 = this.j;
            fVar2.a = i;
            postDelayed(fVar2, 200L);
        }
        return true;
    }

    public final void C() {
        double dRound;
        float f = this.k1;
        float f2 = this.L0;
        if (f2 > 0.0f) {
            int i = (int) ((this.H0 - this.G0) / f2);
            dRound = ((double) Math.round(f * i)) / ((double) i);
        } else {
            dRound = f;
        }
        if (s() || t()) {
            dRound = 1.0d - dRound;
        }
        float f3 = this.H0;
        float f4 = this.G0;
        B(this.J0, (float) ((dRound * ((double) (f3 - f4))) + ((double) f4)));
    }

    public final void D(int i, Rect rect) {
        int iW = this.E + ((int) (w(getValues().get(i).floatValue()) * this.Q0));
        int iC = c();
        int iMax = Math.max(this.F / 2, this.y / 2);
        int iMax2 = Math.max(this.G / 2, this.y / 2);
        RectF rectF = new RectF(iW - iMax, iC - iMax2, iW + iMax, iC + iMax2);
        if (t()) {
            this.g1.mapRect(rectF);
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void E() {
        if (!(getBackground() instanceof RippleDrawable) || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            float fW = (w(((Float) this.I0.get(this.K0)).floatValue()) * this.Q0) + this.E;
            int iC = c();
            float f = this.H;
            float[] fArr = {fW - f, iC - r3, fW + f, iC + r3};
            if (t()) {
                this.g1.mapPoints(fArr);
            }
            background.setHotspotBounds((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F() {
        /*
            r5 = this;
            boolean r0 = r5.t()
            boolean r1 = r5.s()
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L14
            if (r1 == 0) goto L14
            r0 = -1102263091(0xffffffffbe4ccccd, float:-0.2)
            r1 = r2
            r2 = r0
            goto L1c
        L14:
            r1 = 1067030938(0x3f99999a, float:1.2)
            if (r0 == 0) goto L1c
            r4 = r2
            r2 = r1
            r1 = r4
        L1c:
            java.util.ArrayList r0 = r5.l
            java.util.Iterator r0 = r0.iterator()
        L22:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L36
            java.lang.Object r3 = r0.next()
            bo8 r3 = (defpackage.bo8) r3
            r3.W = r2
            r3.X = r1
            r3.invalidateSelf()
            goto L22
        L36:
            int r0 = r5.C
            if (r0 == 0) goto L90
            r1 = 1
            if (r0 == r1) goto L90
            r2 = 2
            if (r0 == r2) goto L8c
            r2 = 3
            if (r0 != r2) goto L76
            boolean r0 = r5.isEnabled()
            if (r0 == 0) goto L72
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.view.ViewGroup r2 = defpackage.o37.m(r5)
            r2.getHitRect(r0)
            boolean r0 = r5.getLocalVisibleRect(r0)
            if (r0 == 0) goto L6b
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r0 < r2) goto L64
            boolean r0 = r5.q1
            goto L68
        L64:
            boolean r0 = r5.isShown()
        L68:
            if (r0 == 0) goto L6b
            goto L6c
        L6b:
            r1 = 0
        L6c:
            if (r1 == 0) goto L72
            r5.j()
            return
        L72:
            r5.k()
            return
        L76:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected labelBehavior: "
            r1.<init>(r2)
            int r2 = r5.C
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L8c:
            r5.k()
            return
        L90:
            int r0 = r5.J0
            r1 = -1
            if (r0 == r1) goto L9f
            boolean r0 = r5.isEnabled()
            if (r0 == 0) goto L9f
            r5.j()
            return
        L9f:
            r5.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.F():void");
    }

    public final void G() {
        int i = this.I;
        if (i > 0) {
            int i2 = this.F;
            this.J = i2;
            this.K = i;
            int iRound = Math.round(i2 * 0.5f);
            int i3 = this.F - iRound;
            setThumbWidth(iRound);
            setThumbTrackGapSize(this.I - (i3 / 2));
        }
    }

    public final void H() {
        P();
        float f = this.L0;
        int iMin = 0;
        if (f <= 0.0f) {
            I(0);
            return;
        }
        int i = this.N0;
        if (i == 0) {
            iMin = Math.min((int) (((this.H0 - this.G0) / f) + 1.0f), (this.Q0 / this.x) + 1);
        } else if (i == 1) {
            int i2 = (int) (((this.H0 - this.G0) / f) + 1.0f);
            if (i2 <= (this.Q0 / this.x) + 1) {
                iMin = i2;
            }
        } else if (i != 2) {
            throw new IllegalStateException("Unexpected tickVisibilityMode: " + this.N0);
        }
        I(iMin);
    }

    public final void I(int i) {
        if (i == 0) {
            this.M0 = null;
            return;
        }
        float[] fArr = this.M0;
        if (fArr == null || fArr.length != i * 2) {
            this.M0 = new float[i * 2];
        }
        float f = this.Q0 / (i - 1);
        float fC = c();
        for (int i2 = 0; i2 < i * 2; i2 += 2) {
            float[] fArr2 = this.M0;
            fArr2[i2] = ((i2 / 2.0f) * f) + this.E;
            fArr2[i2 + 1] = fC;
        }
        if (t()) {
            this.g1.mapPoints(this.M0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(android.graphics.Canvas r18, android.graphics.Paint r19, android.graphics.RectF r20, float r21, com.google.android.material.slider.BaseSlider.FullCornerDirection r22) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.J(android.graphics.Canvas, android.graphics.Paint, android.graphics.RectF, float, com.google.android.material.slider.BaseSlider$FullCornerDirection):void");
    }

    public final void K() {
        Drawable drawable = this.R;
        if (drawable != null) {
            if (!this.S && this.T != null) {
                this.R = drawable.mutate();
                this.S = true;
            }
            if (this.S) {
                this.R.setTintList(this.T);
            }
        }
    }

    public final void L() {
        Drawable drawable = this.P;
        if (drawable != null) {
            if (!this.Q && this.T != null) {
                this.P = drawable.mutate();
                this.Q = true;
            }
            if (this.Q) {
                this.P.setTintList(this.T);
            }
        }
    }

    public final void M() {
        Drawable drawable = this.W;
        if (drawable != null) {
            if (!this.x0 && this.y0 != null) {
                this.W = drawable.mutate();
                this.x0 = true;
            }
            if (this.x0) {
                this.W.setTintList(this.y0);
            }
        }
    }

    public final void N() {
        Drawable drawable = this.U;
        if (drawable != null) {
            if (!this.V && this.y0 != null) {
                this.U = drawable.mutate();
                this.V = true;
            }
            if (this.V) {
                this.U.setTintList(this.y0);
            }
        }
    }

    public final void O(boolean z) {
        int paddingTop;
        int paddingBottom;
        boolean z2;
        if (t()) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i = paddingBottom + paddingTop;
        int iMax = Math.max(this.A, Math.max(this.D + i, this.G + i));
        boolean z3 = true;
        if (iMax == this.B) {
            z2 = false;
        } else {
            this.B = iMax;
            z2 = true;
        }
        int iMax2 = Math.max(Math.max(Math.max((this.F / 2) - this.t, 0), Math.max((this.D - this.u) / 2, 0)), Math.max(Math.max(this.O0 - this.v, 0), Math.max(this.P0 - this.w, 0))) + this.s;
        if (this.E == iMax2) {
            z3 = false;
        } else {
            this.E = iMax2;
            if (isLaidOut()) {
                this.Q0 = Math.max((t() ? getHeight() : getWidth()) - (this.E * 2), 0);
                H();
            }
        }
        if (t()) {
            float fC = c();
            Matrix matrix = this.g1;
            matrix.reset();
            matrix.setRotate(90.0f, fC, fC);
        }
        if (z2 || z) {
            requestLayout();
        } else if (z3) {
            postInvalidate();
        }
    }

    public final void P() {
        if (this.S0) {
            if (this.G0 >= this.H0) {
                throw new IllegalStateException("valueFrom(" + this.G0 + ") must be smaller than valueTo(" + this.H0 + ")");
            }
            for (Float f : this.I0) {
                if (f.floatValue() < this.G0 || f.floatValue() > this.H0) {
                    throw new IllegalStateException("Slider value(" + f + ") must be greater or equal to valueFrom(" + this.G0 + "), and lower or equal to valueTo(" + this.H0 + ")");
                }
                if (this.L0 > 0.0f && !Q(f.floatValue())) {
                    float f2 = this.G0;
                    float f3 = this.L0;
                    throw new IllegalStateException("Value(" + f + ") must be equal to valueFrom(" + f2 + ") plus a multiple of stepSize(" + f3 + ") when using stepSize(" + f3 + ")");
                }
            }
            if (this.L0 > 0.0f && !Q(this.H0)) {
                throw new IllegalStateException("The stepSize(" + this.L0 + ") must be 0, or a factor of the valueFrom(" + this.G0 + ")-valueTo(" + this.H0 + ") range");
            }
            float minSeparation = getMinSeparation();
            if (minSeparation < 0.0f) {
                throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
            }
            float f4 = this.L0;
            if (f4 > 0.0f && minSeparation > 0.0f) {
                if (this.l1 != 1) {
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") cannot be set as a dimension when using stepSize(" + this.L0 + ")");
                }
                if (minSeparation < f4 || !p(minSeparation)) {
                    float f5 = this.L0;
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal and a multiple of stepSize(" + f5 + ") when using stepSize(" + f5 + ")");
                }
            }
            float f6 = this.L0;
            if (f6 != 0.0f) {
                if (((int) f6) != f6) {
                    t0.m("BaseSlider", "Floating point value used for stepSize(" + f6 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f7 = this.G0;
                if (((int) f7) != f7) {
                    t0.m("BaseSlider", "Floating point value used for valueFrom(" + f7 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f8 = this.H0;
                if (((int) f8) != f8) {
                    t0.m("BaseSlider", "Floating point value used for valueTo(" + f8 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
            }
            this.S0 = false;
        }
    }

    public final boolean Q(float f) {
        return p(new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Float.toString(this.G0)), MathContext.DECIMAL64).doubleValue());
    }

    public final float R(float f) {
        return (w(f) * this.Q0) + this.E;
    }

    public final void a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.F, this.G);
        } else {
            float fMax = Math.max(this.F, this.G) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    public final void b(Canvas canvas, RectF rectF, Drawable drawable, boolean z) {
        if (drawable != null) {
            int i = this.z0;
            float f = rectF.right - rectF.left;
            int i2 = this.A0;
            float f2 = (i2 * 2) + i;
            RectF rectF2 = this.e1;
            if (f >= f2) {
                float f3 = z ^ (s() || t()) ? rectF.left + i2 : (rectF.right - i2) - i;
                float f4 = i;
                float fC = c() - (f4 / 2.0f);
                rectF2.set(f3, fC, f3 + f4, f4 + fC);
            } else {
                rectF2.setEmpty();
            }
            if (rectF2.isEmpty()) {
                return;
            }
            if (t()) {
                this.g1.mapRect(rectF2);
            }
            Rect rect = this.f1;
            rectF2.round(rect);
            drawable.setBounds(rect);
            drawable.draw(canvas);
        }
    }

    public final int c() {
        int i = this.B / 2;
        int i2 = this.C;
        return i + ((i2 == 1 || i2 == 3) ? ((bo8) this.l.get(0)).getIntrinsicHeight() : 0);
    }

    public final ValueAnimator d(boolean z) {
        int iG;
        TimeInterpolator timeInterpolatorH;
        float fFloatValue = z ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z ? this.q : this.p;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, z ? 1.0f : 0.0f);
        if (z) {
            iG = ub1.G(getContext(), s1, 83);
            timeInterpolatorH = ub1.H(getContext(), u1, yk.e);
        } else {
            iG = ub1.G(getContext(), t1, 117);
            timeInterpolatorH = ub1.H(getContext(), v1, yk.c);
        }
        valueAnimatorOfFloat.setDuration(iG);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorH);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.slider.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i = BaseSlider.r1;
                float fFloatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                BaseSlider baseSlider = this.a;
                for (bo8 bo8Var : baseSlider.l) {
                    bo8Var.U = fFloatValue2;
                    bo8Var.V = fFloatValue2;
                    bo8Var.Y = yk.b(0.0f, 1.0f, 0.19f, 1.0f, fFloatValue2);
                    bo8Var.invalidateSelf();
                }
                baseSlider.postInvalidateOnAnimation();
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.h.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.setColor(n(this.X0));
        this.b.setColor(n(this.W0));
        this.e.setColor(n(this.V0));
        this.f.setColor(n(this.U0));
        this.g.setColor(n(this.V0));
        for (bo8 bo8Var : this.l) {
            if (bo8Var.isStateful()) {
                bo8Var.setState(getDrawableState());
            }
        }
        fk4 fk4Var = this.h1;
        if (fk4Var.isStateful()) {
            fk4Var.setState(getDrawableState());
        }
        int iN = n(this.T0);
        Paint paint = this.d;
        paint.setColor(iN);
        paint.setAlpha(63);
    }

    public final void e(float f, float f2, float f3, float f4, Canvas canvas, RectF rectF, FullCornerDirection fullCornerDirection) {
        if (f2 - f > getTrackCornerSize() - this.I) {
            rectF.set(f, f3, f2, f4);
        } else {
            rectF.setEmpty();
        }
        J(canvas, this.a, rectF, getTrackCornerSize(), fullCornerDirection);
    }

    public final void f(Canvas canvas, float f, float f2) {
        Iterator it = this.I0.iterator();
        while (it.hasNext()) {
            float fR = R(((Float) it.next()).floatValue());
            float f3 = (this.F / 2.0f) + this.I;
            if (f >= fR - f3 && f <= fR + f3) {
                return;
            }
        }
        boolean zT = t();
        Paint paint = this.g;
        if (zT) {
            canvas.drawPoint(f2, f, paint);
        } else {
            canvas.drawPoint(f, f2, paint);
        }
    }

    public final void g(Canvas canvas, int i, int i2, float f, Drawable drawable) {
        canvas.save();
        if (t()) {
            canvas.concat(this.g1);
        }
        canvas.translate((this.E + ((int) (w(f) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.h.k;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public int getThumbRadius() {
        return this.F / 2;
    }

    public int getTrackCornerSize() {
        int i = this.M;
        return i == -1 ? this.D / 2 : i;
    }

    public float getValueFrom() {
        return this.G0;
    }

    public float getValueTo() {
        return this.H0;
    }

    public List<Float> getValues() {
        return new ArrayList(this.I0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r6, int r7, android.graphics.Canvas r8, android.graphics.Paint r9) {
        /*
            r5 = this;
        L0:
            if (r6 >= r7) goto L74
            boolean r0 = r5.t()
            if (r0 == 0) goto Lf
            float[] r0 = r5.M0
            int r1 = r6 + 1
            r0 = r0[r1]
            goto L13
        Lf:
            float[] r0 = r5.M0
            r0 = r0[r6]
        L13:
            int r1 = r5.I
            float r1 = (float) r1
            int r2 = r5.F
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r2 = r2 + r1
            java.util.ArrayList r1 = r5.I0
            java.util.Iterator r1 = r1.iterator()
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L43
            java.lang.Object r1 = r1.next()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            float r1 = r5.R(r1)
            float r4 = r1 - r2
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 < 0) goto L43
            float r1 = r1 + r2
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 > 0) goto L43
            goto L71
        L43:
            boolean r1 = r5.o()
            if (r1 == 0) goto L66
            int r1 = r5.I
            float r1 = (float) r1
            int r2 = r5.F
            float r2 = (float) r2
            float r2 = r2 / r3
            float r2 = r2 + r1
            int r1 = r5.Q0
            int r4 = r5.E
            int r4 = r4 * 2
            int r4 = r4 + r1
            float r1 = (float) r4
            float r1 = r1 / r3
            float r3 = r1 - r2
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 < 0) goto L66
            float r1 = r1 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L66
            goto L71
        L66:
            float[] r0 = r5.M0
            r1 = r0[r6]
            int r2 = r6 + 1
            r0 = r0[r2]
            r8.drawPoint(r1, r0, r9)
        L71:
            int r6 = r6 + 2
            goto L0
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.h(int, int, android.graphics.Canvas, android.graphics.Paint):void");
    }

    public final void i(Canvas canvas, RectF rectF, RectF rectF2) {
        if (this.P == null && this.R == null && this.U == null && this.W == null) {
            return;
        }
        if (this.I0.size() > 1) {
            t0.m("BaseSlider", "Track icons can only be used when only 1 thumb is present.");
        }
        b(canvas, rectF, this.P, true);
        b(canvas, rectF2, this.U, true);
        b(canvas, rectF, this.R, false);
        b(canvas, rectF2, this.W, false);
    }

    public final void j() {
        if (!this.o) {
            this.o = true;
            ValueAnimator valueAnimatorD = d(true);
            this.p = valueAnimatorD;
            this.q = null;
            valueAnimatorD.start();
        }
        ArrayList arrayList = this.l;
        Iterator it = arrayList.iterator();
        for (int i = 0; i < this.I0.size() && it.hasNext(); i++) {
            if (i != this.K0) {
                z((bo8) it.next(), ((Float) this.I0.get(i)).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.I0.size())));
        }
        z((bo8) it.next(), ((Float) this.I0.get(this.K0)).floatValue());
    }

    public final void k() {
        if (this.o) {
            this.o = false;
            ValueAnimator valueAnimatorD = d(false);
            this.q = valueAnimatorD;
            this.p = null;
            valueAnimatorD.addListener(new e(this));
            this.q.start();
        }
    }

    public final String l(float f) {
        return String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", Float.valueOf(f));
    }

    public final float[] m() {
        float fFloatValue = ((Float) this.I0.get(0)).floatValue();
        float fFloatValue2 = ((Float) o40.u(1, this.I0)).floatValue();
        if (this.I0.size() == 1) {
            fFloatValue = this.G0;
        }
        float fW = w(fFloatValue);
        float fW2 = w(fFloatValue2);
        if (o()) {
            float fMin = Math.min(0.5f, fW2);
            fW2 = Math.max(0.5f, fW2);
            fW = fMin;
        }
        return (o() || !(s() || t())) ? new float[]{fW, fW2} : new float[]{fW2, fW};
    }

    public final int n(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public boolean o() {
        return this.O;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q1 = isShown();
        getViewTreeObserver().addOnScrollChangedListener(this.n1);
        getViewTreeObserver().addOnGlobalLayoutListener(this.o1);
        for (bo8 bo8Var : this.l) {
            ViewGroup viewGroupM = o37.m(this);
            if (viewGroupM == null) {
                bo8Var.getClass();
            } else {
                bo8Var.getClass();
                int[] iArr = new int[2];
                viewGroupM.getLocationOnScreen(iArr);
                bo8Var.T = iArr[0];
                viewGroupM.getWindowVisibleDisplayFrame(bo8Var.M);
                viewGroupM.addOnLayoutChangeListener(bo8Var.L);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        f fVar = this.j;
        if (fVar != null) {
            removeCallbacks(fVar);
        }
        this.o = false;
        for (bo8 bo8Var : this.l) {
            ViewGroup viewGroupM = o37.m(this);
            if (viewGroupM != null) {
                viewGroupM.getOverlay().remove(bo8Var);
                viewGroupM.removeOnLayoutChangeListener(bo8Var.L);
            }
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.n1);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.o1);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0144  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instruction units count: 765
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        g gVar = this.h;
        if (!z) {
            this.J0 = -1;
            gVar.j(this.K0);
            return;
        }
        if (i == 1) {
            u(Integer.MAX_VALUE);
        } else if (i == 2) {
            u(Integer.MIN_VALUE);
        } else if (i == 17) {
            v(Integer.MAX_VALUE);
        } else if (i == 66) {
            v(Integer.MIN_VALUE);
        }
        gVar.w(this.K0);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.R0 = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.C;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.B + ((i3 == 1 || i3 == 3) ? ((bo8) this.l.get(0)).getIntrinsicHeight() : 0), 1073741824);
        if (t()) {
            super.onMeasure(iMakeMeasureSpec, i2);
        } else {
            super.onMeasure(i, iMakeMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.G0 = sliderState.a;
        this.H0 = sliderState.b;
        A(sliderState.c);
        this.L0 = sliderState.d;
        if (sliderState.e) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.a = this.G0;
        sliderState.b = this.H0;
        sliderState.c = new ArrayList(this.I0);
        sliderState.d = this.L0;
        sliderState.e = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (t()) {
            i = i2;
        }
        this.Q0 = Math.max(i - (this.E * 2), 0);
        H();
        E();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        this.q1 = z;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            ViewGroup viewGroupM = o37.m(this);
            ViewOverlay overlay = viewGroupM == null ? null : viewGroupM.getOverlay();
            if (overlay == null) {
                return;
            }
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                overlay.remove((bo8) it.next());
            }
        }
    }

    public final boolean p(double d) {
        double dDoubleValue = new BigDecimal(Double.toString(d)).divide(new BigDecimal(Float.toString(this.L0)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    public final boolean q(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollHorizontally(1) || viewGroup.canScrollHorizontally(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean r(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean s() {
        return getLayoutDirection() == 1;
    }

    public void setActiveThumbIndex(int i) {
        this.J0 = i;
    }

    public void setCentered(boolean z) {
        if (this.O == z) {
            return;
        }
        this.O = z;
        if (z) {
            setValues(Float.valueOf((this.G0 + this.H0) / 2.0f));
        } else {
            setValues(Float.valueOf(this.G0));
        }
        O(true);
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        a(drawableNewDrawable);
        this.i1 = drawableNewDrawable;
        this.j1.clear();
        postInvalidate();
    }

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.I0.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.K0 = i;
        this.h.w(i);
        postInvalidate();
    }

    public void setHaloRadius(int i) {
        if (i == this.H) {
            return;
        }
        this.H = i;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setRadius(this.H);
        } else {
            postInvalidate();
        }
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.T0)) {
            return;
        }
        this.T0 = colorStateList;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        int iN = n(colorStateList);
        Paint paint = this.d;
        paint.setColor(iN);
        paint.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i) {
        if (this.C != i) {
            this.C = i;
            O(true);
        }
    }

    public void setOrientation(int i) {
        if (this.z == i) {
            return;
        }
        this.z = i;
        O(true);
    }

    public void setSeparationUnit(int i) {
        this.l1 = i;
        this.S0 = true;
        postInvalidate();
    }

    public void setStepSize(float f) {
        if (f >= 0.0f) {
            if (this.L0 != f) {
                this.L0 = f;
                this.S0 = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The stepSize(" + f + ") must be 0, or a factor of the valueFrom(" + this.G0 + ")-valueTo(" + this.H0 + ") range");
    }

    public void setThumbElevation(float f) {
        this.h1.r(f);
    }

    public void setThumbHeight(int i) {
        if (i == this.G) {
            return;
        }
        this.G = i;
        this.h1.setBounds(0, 0, this.F, i);
        Drawable drawable = this.i1;
        if (drawable != null) {
            a(drawable);
        }
        Iterator it = this.j1.iterator();
        while (it.hasNext()) {
            a((Drawable) it.next());
        }
        O(false);
    }

    public void setThumbRadius(int i) {
        int i2 = i * 2;
        setThumbWidth(i2);
        setThumbHeight(i2);
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.h1.y(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeWidth(float f) {
        this.h1.z(f);
        postInvalidate();
    }

    public void setThumbTrackGapSize(int i) {
        if (this.I == i) {
            return;
        }
        this.I = i;
        invalidate();
    }

    public void setThumbWidth(int i) {
        if (i == this.F) {
            return;
        }
        this.F = i;
        fz1 fz1Var = new fz1(0);
        fz1 fz1Var2 = new fz1(0);
        fz1 fz1Var3 = new fz1(0);
        fz1 fz1Var4 = new fz1(0);
        float f = this.F / 2.0f;
        at2 at2VarQ = ub1.q(0);
        defpackage.i iVar = new defpackage.i(f);
        defpackage.i iVar2 = new defpackage.i(f);
        defpackage.i iVar3 = new defpackage.i(f);
        defpackage.i iVar4 = new defpackage.i(f);
        as7 as7Var = new as7();
        as7Var.a = at2VarQ;
        as7Var.b = at2VarQ;
        as7Var.c = at2VarQ;
        as7Var.d = at2VarQ;
        as7Var.e = iVar;
        as7Var.f = iVar2;
        as7Var.g = iVar3;
        as7Var.h = iVar4;
        as7Var.i = fz1Var;
        as7Var.j = fz1Var2;
        as7Var.k = fz1Var3;
        as7Var.l = fz1Var4;
        fk4 fk4Var = this.h1;
        fk4Var.setShapeAppearanceModel(as7Var);
        fk4Var.setBounds(0, 0, this.F, this.G);
        Drawable drawable = this.i1;
        if (drawable != null) {
            a(drawable);
        }
        Iterator it = this.j1.iterator();
        while (it.hasNext()) {
            a((Drawable) it.next());
        }
        O(false);
    }

    public void setTickActiveRadius(int i) {
        if (this.O0 != i) {
            this.O0 = i;
            this.f.setStrokeWidth(i * 2);
            O(false);
        }
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.U0)) {
            return;
        }
        this.U0 = colorStateList;
        this.f.setColor(n(colorStateList));
        invalidate();
    }

    public void setTickInactiveRadius(int i) {
        if (this.P0 != i) {
            this.P0 = i;
            this.e.setStrokeWidth(i * 2);
            O(false);
        }
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.V0)) {
            return;
        }
        this.V0 = colorStateList;
        this.e.setColor(n(colorStateList));
        invalidate();
    }

    public void setTickVisibilityMode(int i) {
        if (this.N0 != i) {
            this.N0 = i;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.W0)) {
            return;
        }
        this.W0 = colorStateList;
        this.b.setColor(n(colorStateList));
        invalidate();
    }

    public void setTrackCornerSize(int i) {
        if (this.M == i) {
            return;
        }
        this.M = i;
        invalidate();
    }

    public void setTrackHeight(int i) {
        if (this.D != i) {
            this.D = i;
            this.a.setStrokeWidth(i);
            this.b.setStrokeWidth(this.D);
            O(false);
        }
    }

    public void setTrackIconActiveColor(ColorStateList colorStateList) {
        if (colorStateList == this.T) {
            return;
        }
        this.T = colorStateList;
        L();
        K();
        invalidate();
    }

    public void setTrackIconActiveEnd(Drawable drawable) {
        if (drawable == this.R) {
            return;
        }
        this.R = drawable;
        this.S = false;
        K();
        invalidate();
    }

    public void setTrackIconActiveStart(Drawable drawable) {
        if (drawable == this.P) {
            return;
        }
        this.P = drawable;
        this.Q = false;
        L();
        invalidate();
    }

    public void setTrackIconInactiveColor(ColorStateList colorStateList) {
        if (colorStateList == this.y0) {
            return;
        }
        this.y0 = colorStateList;
        N();
        M();
        invalidate();
    }

    public void setTrackIconInactiveEnd(Drawable drawable) {
        if (drawable == this.W) {
            return;
        }
        this.W = drawable;
        this.x0 = false;
        M();
        invalidate();
    }

    public void setTrackIconInactiveStart(Drawable drawable) {
        if (drawable == this.U) {
            return;
        }
        this.U = drawable;
        this.V = false;
        N();
        invalidate();
    }

    public void setTrackIconSize(int i) {
        if (this.z0 == i) {
            return;
        }
        this.z0 = i;
        invalidate();
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.X0)) {
            return;
        }
        this.X0 = colorStateList;
        this.a.setColor(n(colorStateList));
        invalidate();
    }

    public void setTrackInsideCornerSize(int i) {
        if (this.N == i) {
            return;
        }
        this.N = i;
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i) {
        if (this.L == i) {
            return;
        }
        this.L = i;
        this.g.setStrokeWidth(i);
        invalidate();
    }

    public void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        A(arrayList);
    }

    public boolean t() {
        return this.z == 1;
    }

    public final boolean u(int i) {
        int i2 = this.K0;
        long j = ((long) i2) + ((long) i);
        long size = this.I0.size() - 1;
        if (j < 0) {
            j = 0;
        } else if (j > size) {
            j = size;
        }
        int i3 = (int) j;
        this.K0 = i3;
        if (i3 == i2) {
            return false;
        }
        if (this.J0 != -1) {
            this.J0 = i3;
        }
        E();
        postInvalidate();
        return true;
    }

    public final void v(int i) {
        if (s() || t()) {
            i = i == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i;
        }
        u(i);
    }

    public final float w(float f) {
        float f2 = this.G0;
        float f3 = (f - f2) / (this.H0 - f2);
        return (s() || t()) ? 1.0f - f3 : f3;
    }

    public final void x() {
        Iterator it = this.n.iterator();
        if (it.hasNext()) {
            throw bl4.o(it);
        }
    }

    public boolean y() {
        if (this.J0 == -1) {
            float f = this.k1;
            if (s() || t()) {
                f = 1.0f - f;
            }
            float f2 = this.H0;
            float f3 = this.G0;
            float f4 = dw1.f(f2, f3, f, f3);
            float fR = R(f4);
            this.J0 = 0;
            float fAbs = Math.abs(((Float) this.I0.get(0)).floatValue() - f4);
            for (int i = 1; i < this.I0.size(); i++) {
                float fAbs2 = Math.abs(((Float) this.I0.get(i)).floatValue() - f4);
                float fR2 = R(((Float) this.I0.get(i)).floatValue());
                if (Float.compare(fAbs2, fAbs) > 0) {
                    break;
                }
                boolean z = s() || t() ? fR2 - fR > 0.0f : fR2 - fR < 0.0f;
                if (Float.compare(fAbs2, fAbs) < 0) {
                    this.J0 = i;
                } else {
                    if (Float.compare(fAbs2, fAbs) != 0) {
                        continue;
                    } else {
                        if (Math.abs(fR2 - fR) < this.r) {
                            this.J0 = -1;
                            return false;
                        }
                        if (z) {
                            this.J0 = i;
                        }
                    }
                }
                fAbs = fAbs2;
            }
            if (this.J0 == -1) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(defpackage.bo8 r5, float r6) {
        /*
            r4 = this;
            java.lang.String r0 = r4.l(r6)
            java.lang.CharSequence r1 = r5.H
            boolean r1 = android.text.TextUtils.equals(r1, r0)
            if (r1 != 0) goto L16
            r5.H = r0
            zg8 r0 = r5.K
            r1 = 1
            r0.e = r1
            r5.invalidateSelf()
        L16:
            boolean r0 = r4.t()
            if (r0 == 0) goto L5f
            int r0 = r4.E
            float r6 = r4.w(r6)
            int r1 = r4.Q0
            float r1 = (float) r1
            float r6 = r6 * r1
            int r6 = (int) r6
            int r0 = r0 + r6
            int r6 = r5.getIntrinsicHeight()
            int r6 = r6 / 2
            int r0 = r0 - r6
            int r6 = r5.getIntrinsicHeight()
            int r6 = r6 + r0
            boolean r1 = r4.s()
            if (r1 == 0) goto L4d
            int r1 = r4.c()
            int r2 = r4.G
            int r2 = r2 / 2
            int r3 = r4.B0
            int r2 = r2 + r3
            int r1 = r1 - r2
            int r2 = r5.getIntrinsicWidth()
        L4a:
            int r2 = r1 - r2
            goto L88
        L4d:
            int r1 = r4.c()
            int r2 = r4.G
            int r2 = r2 / 2
            int r3 = r4.B0
            int r2 = r2 + r3
            int r2 = r2 + r1
            int r1 = r5.getIntrinsicWidth()
            int r1 = r1 + r2
            goto L88
        L5f:
            int r0 = r4.E
            float r6 = r4.w(r6)
            int r1 = r4.Q0
            float r1 = (float) r1
            float r6 = r6 * r1
            int r6 = (int) r6
            int r0 = r0 + r6
            int r6 = r5.getIntrinsicWidth()
            int r6 = r6 / 2
            int r0 = r0 - r6
            int r6 = r5.getIntrinsicWidth()
            int r6 = r6 + r0
            int r1 = r4.c()
            int r2 = r4.G
            int r2 = r2 / 2
            int r3 = r4.B0
            int r2 = r2 + r3
            int r1 = r1 - r2
            int r2 = r5.getIntrinsicHeight()
            goto L4a
        L88:
            android.graphics.Rect r3 = r4.d1
            r3.set(r0, r2, r6, r1)
            boolean r6 = r4.t()
            if (r6 == 0) goto La0
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r3)
            android.graphics.Matrix r0 = r4.g1
            r0.mapRect(r6)
            r6.round(r3)
        La0:
            android.view.ViewGroup r6 = defpackage.o37.m(r4)
            defpackage.dk1.c(r6, r4, r3)
            r5.setBounds(r3)
            android.view.ViewGroup r6 = defpackage.o37.m(r4)
            if (r6 != 0) goto Lb2
            r6 = 0
            goto Lb6
        Lb2:
            android.view.ViewOverlay r6 = r6.getOverlay()
        Lb6:
            if (r6 != 0) goto Lb9
            return
        Lb9:
            r6.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.z(bo8, float):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.google.android.material.slider.b] */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.google.android.material.slider.c] */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.google.android.material.slider.d] */
    public BaseSlider(Context context, AttributeSet attributeSet, int i) {
        int i2 = r1;
        super(mk4.a(context, attributeSet, i, i2), attributeSet, i);
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = false;
        this.J = -1;
        this.K = -1;
        this.O = false;
        this.Q = false;
        this.S = false;
        this.V = false;
        this.x0 = false;
        this.F0 = false;
        this.I0 = new ArrayList();
        this.J0 = -1;
        this.K0 = -1;
        this.L0 = 0.0f;
        this.R0 = false;
        this.Y0 = new Path();
        this.Z0 = new RectF();
        this.a1 = new RectF();
        this.b1 = new RectF();
        this.c1 = new RectF();
        this.d1 = new Rect();
        this.e1 = new RectF();
        this.f1 = new Rect();
        this.g1 = new Matrix();
        fk4 fk4Var = new fk4();
        this.h1 = fk4Var;
        this.j1 = Collections.EMPTY_LIST;
        this.l1 = 0;
        this.n1 = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.material.slider.b
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                int i3 = BaseSlider.r1;
                this.a.F();
            }
        };
        this.o1 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.slider.c
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                int i3 = BaseSlider.r1;
                this.a.F();
            }
        };
        this.p1 = new Runnable() { // from class: com.google.android.material.slider.d
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = BaseSlider.r1;
                BaseSlider baseSlider = this.a;
                baseSlider.setActiveThumbIndex(-1);
                baseSlider.invalidate();
            }
        };
        Context context2 = getContext();
        this.q1 = isShown();
        this.a = new Paint();
        this.b = new Paint();
        Paint paint = new Paint(1);
        this.c = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.e = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.g = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Resources resources = context2.getResources();
        this.A = resources.getDimensionPixelSize(oq6.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(oq6.mtrl_slider_track_side_padding);
        this.s = dimensionPixelOffset;
        this.E = dimensionPixelOffset;
        this.t = resources.getDimensionPixelSize(oq6.mtrl_slider_thumb_radius);
        this.u = resources.getDimensionPixelSize(oq6.mtrl_slider_track_height);
        this.v = resources.getDimensionPixelSize(oq6.mtrl_slider_tick_radius);
        this.w = resources.getDimensionPixelSize(oq6.mtrl_slider_tick_radius);
        this.x = resources.getDimensionPixelSize(oq6.mtrl_slider_tick_min_spacing);
        this.B0 = resources.getDimensionPixelSize(oq6.mtrl_slider_label_padding);
        this.A0 = resources.getDimensionPixelOffset(oq6.m3_slider_track_icon_padding);
        int[] iArr = yt6.Slider;
        vj8.a(context2, attributeSet, i, i2);
        vj8.b(context2, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i2);
        setOrientation(typedArrayObtainStyledAttributes.getInt(yt6.Slider_android_orientation, 0));
        this.k = typedArrayObtainStyledAttributes.getResourceId(yt6.Slider_labelStyle, mt6.Widget_MaterialComponents_Tooltip);
        this.G0 = typedArrayObtainStyledAttributes.getFloat(yt6.Slider_android_valueFrom, 0.0f);
        this.H0 = typedArrayObtainStyledAttributes.getFloat(yt6.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.G0));
        setCentered(typedArrayObtainStyledAttributes.getBoolean(yt6.Slider_centered, false));
        this.L0 = typedArrayObtainStyledAttributes.getFloat(yt6.Slider_android_stepSize, 0.0f);
        this.y = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(yt6.Slider_minTouchTargetSize, yh0.I(context2)));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(yt6.Slider_trackColor);
        int i3 = zHasValue ? yt6.Slider_trackColor : yt6.Slider_trackColorInactive;
        int i4 = zHasValue ? yt6.Slider_trackColor : yt6.Slider_trackColorActive;
        ColorStateList colorStateListR = ja1.r(context2, typedArrayObtainStyledAttributes, i3);
        setTrackInactiveTintList(colorStateListR == null ? ContextCompat.getColorStateList(context2, dq6.material_slider_inactive_track_color) : colorStateListR);
        ColorStateList colorStateListR2 = ja1.r(context2, typedArrayObtainStyledAttributes, i4);
        setTrackActiveTintList(colorStateListR2 == null ? ContextCompat.getColorStateList(context2, dq6.material_slider_active_track_color) : colorStateListR2);
        fk4Var.s(ja1.r(context2, typedArrayObtainStyledAttributes, yt6.Slider_thumbColor));
        if (typedArrayObtainStyledAttributes.hasValue(yt6.Slider_thumbStrokeColor)) {
            setThumbStrokeColor(ja1.r(context2, typedArrayObtainStyledAttributes, yt6.Slider_thumbStrokeColor));
        }
        setThumbStrokeWidth(typedArrayObtainStyledAttributes.getDimension(yt6.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList colorStateListR3 = ja1.r(context2, typedArrayObtainStyledAttributes, yt6.Slider_haloColor);
        setHaloTintList(colorStateListR3 == null ? ContextCompat.getColorStateList(context2, dq6.material_slider_halo_color) : colorStateListR3);
        this.N0 = typedArrayObtainStyledAttributes.hasValue(yt6.Slider_tickVisibilityMode) ? typedArrayObtainStyledAttributes.getInt(yt6.Slider_tickVisibilityMode, -1) : typedArrayObtainStyledAttributes.getBoolean(yt6.Slider_tickVisible, true) ? 0 : 2;
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(yt6.Slider_tickColor);
        int i5 = zHasValue2 ? yt6.Slider_tickColor : yt6.Slider_tickColorInactive;
        int i6 = zHasValue2 ? yt6.Slider_tickColor : yt6.Slider_tickColorActive;
        ColorStateList colorStateListR4 = ja1.r(context2, typedArrayObtainStyledAttributes, i5);
        setTickInactiveTintList(colorStateListR4 == null ? ContextCompat.getColorStateList(context2, dq6.material_slider_inactive_tick_marks_color) : colorStateListR4);
        ColorStateList colorStateListR5 = ja1.r(context2, typedArrayObtainStyledAttributes, i6);
        setTickActiveTintList(colorStateListR5 == null ? ContextCompat.getColorStateList(context2, dq6.material_slider_active_tick_marks_color) : colorStateListR5);
        setThumbTrackGapSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.Slider_thumbTrackGapSize, 0));
        setTrackStopIndicatorSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.Slider_trackStopIndicatorSize, 0));
        setTrackCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.Slider_trackCornerSize, -1));
        setTrackInsideCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.Slider_trackInsideCornerSize, 0));
        setTrackIconActiveStart(ja1.v(context2, typedArrayObtainStyledAttributes, yt6.Slider_trackIconActiveStart));
        setTrackIconActiveEnd(ja1.v(context2, typedArrayObtainStyledAttributes, yt6.Slider_trackIconActiveEnd));
        setTrackIconActiveColor(ja1.r(context2, typedArrayObtainStyledAttributes, yt6.Slider_trackIconActiveColor));
        setTrackIconInactiveStart(ja1.v(context2, typedArrayObtainStyledAttributes, yt6.Slider_trackIconInactiveStart));
        setTrackIconInactiveEnd(ja1.v(context2, typedArrayObtainStyledAttributes, yt6.Slider_trackIconInactiveEnd));
        setTrackIconInactiveColor(ja1.r(context2, typedArrayObtainStyledAttributes, yt6.Slider_trackIconInactiveColor));
        setTrackIconSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.Slider_trackIconSize, 0));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.Slider_thumbRadius, 0) * 2;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.Slider_thumbWidth, dimensionPixelSize);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.Slider_thumbHeight, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.Slider_haloRadius, 0));
        setThumbElevation(typedArrayObtainStyledAttributes.getDimension(yt6.Slider_thumbElevation, 0.0f));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.Slider_trackHeight, 0));
        setTickActiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.Slider_tickRadiusActive, this.L / 2));
        setTickInactiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.Slider_tickRadiusInactive, this.L / 2));
        setLabelBehavior(typedArrayObtainStyledAttributes.getInt(yt6.Slider_labelBehavior, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(yt6.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
        setClickable(true);
        fk4Var.w(2);
        this.r = ViewConfiguration.get(context2).getScaledTouchSlop();
        g gVar = new g(this);
        this.h = gVar;
        q69.q(this, gVar);
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.i = accessibilityManager;
        if (Build.VERSION.SDK_INT >= 29) {
            this.m1 = accessibilityManager.getRecommendedTimeoutMillis(10000, 6);
        } else {
            this.m1 = 120000;
        }
    }

    public void setValues(List<Float> list) {
        A(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.i1 = null;
        this.j1 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List list = this.j1;
            Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
            a(drawableNewDrawable);
            list.add(drawableNewDrawable);
        }
        postInvalidate();
    }
}
