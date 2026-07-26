package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionHelper;
import defpackage.eu6;

/* JADX INFO: loaded from: classes.dex */
public class MotionEffect extends MotionHelper {
    public float n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public int t;
    public int u;

    public MotionEffect(Context context) {
        super(context);
        this.n = 0.1f;
        this.o = 49;
        this.p = 50;
        this.q = 0;
        this.r = 0;
        this.s = true;
        this.t = -1;
        this.u = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x016b, code lost:
    
        if (r15 == 0.0f) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0186, code lost:
    
        if (r15 == 0.0f) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d9  */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(androidx.constraintlayout.motion.widget.MotionLayout r24, java.util.HashMap r25) {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.MotionEffect.r(androidx.constraintlayout.motion.widget.MotionLayout, java.util.HashMap):void");
    }

    public final void s(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eu6.MotionEffect);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == eu6.MotionEffect_motionEffect_start) {
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, this.o);
                    this.o = i2;
                    this.o = Math.max(Math.min(i2, 99), 0);
                } else if (index == eu6.MotionEffect_motionEffect_end) {
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, this.p);
                    this.p = i3;
                    this.p = Math.max(Math.min(i3, 99), 0);
                } else if (index == eu6.MotionEffect_motionEffect_translationX) {
                    this.q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.q);
                } else if (index == eu6.MotionEffect_motionEffect_translationY) {
                    this.r = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.r);
                } else if (index == eu6.MotionEffect_motionEffect_alpha) {
                    this.n = typedArrayObtainStyledAttributes.getFloat(index, this.n);
                } else if (index == eu6.MotionEffect_motionEffect_move) {
                    this.u = typedArrayObtainStyledAttributes.getInt(index, this.u);
                } else if (index == eu6.MotionEffect_motionEffect_strict) {
                    this.s = typedArrayObtainStyledAttributes.getBoolean(index, this.s);
                } else if (index == eu6.MotionEffect_motionEffect_viewTransition) {
                    this.t = typedArrayObtainStyledAttributes.getResourceId(index, this.t);
                }
            }
            int i4 = this.o;
            int i5 = this.p;
            if (i4 == i5) {
                if (i4 > 0) {
                    this.o = i4 - 1;
                } else {
                    this.p = i5 + 1;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public MotionEffect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = 0.1f;
        this.o = 49;
        this.p = 50;
        this.q = 0;
        this.r = 0;
        this.s = true;
        this.t = -1;
        this.u = -1;
        s(context, attributeSet);
    }

    public MotionEffect(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = 0.1f;
        this.o = 49;
        this.p = 50;
        this.q = 0;
        this.r = 0;
        this.s = true;
        this.t = -1;
        this.u = -1;
        s(context, attributeSet);
    }
}
