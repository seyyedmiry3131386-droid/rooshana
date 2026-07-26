package com.google.android.material.timepicker;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.content.ContextCompat;
import defpackage.mt6;
import defpackage.o37;
import defpackage.oq6;
import defpackage.ub1;
import defpackage.vp6;
import defpackage.yk;
import defpackage.yq2;
import defpackage.yt0;
import defpackage.yt6;
import defpackage.zt0;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {
    public static final /* synthetic */ int v = 0;
    public final int a;
    public final TimeInterpolator b;
    public final ValueAnimator c;
    public boolean d;
    public float e;
    public float f;
    public boolean g;
    public final int h;
    public boolean i;
    public final ArrayList j;
    public final int k;
    public final float l;
    public final Paint m;
    public final RectF n;
    public final int o;
    public float p;
    public boolean q;
    public g r;
    public double s;
    public int t;
    public int u;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.materialClockStyle);
    }

    public final int a(float f, float f2) {
        int degrees = (int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)));
        int i = degrees + 90;
        return i < 0 ? degrees + 450 : i;
    }

    public final int b(int i) {
        return i == 2 ? Math.round(this.t * 0.66f) : this.t;
    }

    public final void c(float f, boolean z) {
        ValueAnimator valueAnimator = this.c;
        valueAnimator.cancel();
        if (!z) {
            d(f, false);
            return;
        }
        float f2 = this.p;
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f2 < 180.0f && f > 180.0f) {
                f2 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f2), Float.valueOf(f));
        valueAnimator.setFloatValues(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
        valueAnimator.setDuration(this.a);
        valueAnimator.setInterpolator(this.b);
        valueAnimator.start();
    }

    public final void d(float f, boolean z) {
        float f2 = f % 360.0f;
        this.p = f2;
        this.s = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fB = b(this.u);
        float fCos = (((float) Math.cos(this.s)) * fB) + width;
        float fSin = (fB * ((float) Math.sin(this.s))) + height;
        float f3 = this.k;
        this.n.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((zt0) it.next()).b(f2, z);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float fB = b(this.u);
        float fCos = (((float) Math.cos(this.s)) * fB) + f;
        float f2 = height;
        float fSin = (fB * ((float) Math.sin(this.s))) + f2;
        Paint paint = this.m;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.k, paint);
        double dSin = Math.sin(this.s);
        paint.setStrokeWidth(this.o);
        canvas.drawLine(f, f2, width + ((int) (Math.cos(this.s) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f2, this.l, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.c.isRunning()) {
            return;
        }
        c(this.p, false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        g gVar;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i = (int) (x - this.e);
                int i2 = (int) (y - this.f);
                this.g = (i2 * i2) + (i * i) > this.h;
                z3 = this.q;
                z2 = actionMasked == 1;
                if (this.i) {
                    this.u = yq2.W((float) (getWidth() / 2), (float) (getHeight() / 2), x, y) > ((float) b(2)) + o37.i(getContext(), 12) ? 1 : 2;
                }
                z = false;
            } else {
                z2 = false;
                z = false;
                z3 = false;
            }
        } else {
            this.e = x;
            this.f = y;
            this.g = true;
            this.q = false;
            z = true;
            z2 = false;
            z3 = false;
        }
        boolean z5 = this.q;
        float fA = a(x, y);
        boolean z6 = this.p != fA;
        if (z && z6) {
            z4 = true;
        } else if (z6 || z3) {
            c(fA, z2 && this.d);
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z7 = z4 | z5;
        this.q = z7;
        if (z7 && z2 && (gVar = this.r) != null) {
            TimeModel timeModel = gVar.b;
            TimePickerView timePickerView = gVar.a;
            float fA2 = a(x, y);
            boolean z8 = this.g;
            gVar.e = true;
            int i3 = timeModel.e;
            int i4 = timeModel.d;
            if (timeModel.f == 10) {
                timePickerView.s.c(gVar.d, false);
                AccessibilityManager accessibilityManager = (AccessibilityManager) ContextCompat.getSystemService(timePickerView.getContext(), AccessibilityManager.class);
                if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                    gVar.d(12, true);
                }
            } else {
                int iRound = Math.round(fA2);
                if (!z8) {
                    timeModel.e = (((iRound + 15) / 30) * 5) % 60;
                    gVar.c = r12 * 6;
                }
                timePickerView.s.c(gVar.c, z8);
            }
            gVar.e = false;
            gVar.e();
            if (timeModel.e != i3 || timeModel.d != i4) {
                timePickerView.performHapticFeedback(4);
            }
        }
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.c = valueAnimator;
        this.j = new ArrayList();
        Paint paint = new Paint();
        this.m = paint;
        this.n = new RectF();
        this.u = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yt6.ClockHandView, i, mt6.Widget_MaterialComponents_TimePicker_Clock);
        this.a = ub1.G(context, vp6.motionDurationLong2, ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR);
        this.b = ub1.H(context, vp6.motionEasingEmphasizedInterpolator, yk.b);
        this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.ClockHandView_materialCircleRadius, 0);
        this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.ClockHandView_selectorSize, 0);
        this.o = getResources().getDimensionPixelSize(oq6.material_clock_hand_stroke_width);
        this.l = r8.getDimensionPixelSize(oq6.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(yt6.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        c(0.0f, false);
        this.h = ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i2 = ClockHandView.v;
                ClockHandView clockHandView = this.a;
                clockHandView.getClass();
                clockHandView.d(((Float) valueAnimator2.getAnimatedValue()).floatValue(), true);
            }
        });
        valueAnimator.addListener(new yt0());
    }
}
