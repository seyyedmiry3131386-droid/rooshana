package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.d;

/* JADX INFO: loaded from: classes.dex */
public final class c31 {
    public static final SparseIntArray n;
    public boolean a;
    public int b;
    public int c;
    public String d;
    public int e;
    public int f;
    public float g;
    public float h;
    public float i;
    public int j;
    public String k;
    public int l;
    public int m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        n = sparseIntArray;
        sparseIntArray.append(eu6.Motion_motionPathRotate, 1);
        sparseIntArray.append(eu6.Motion_pathMotionArc, 2);
        sparseIntArray.append(eu6.Motion_transitionEasing, 3);
        sparseIntArray.append(eu6.Motion_drawPath, 4);
        sparseIntArray.append(eu6.Motion_animateRelativeTo, 5);
        sparseIntArray.append(eu6.Motion_animateCircleAngleTo, 6);
        sparseIntArray.append(eu6.Motion_motionStagger, 7);
        sparseIntArray.append(eu6.Motion_quantizeMotionSteps, 8);
        sparseIntArray.append(eu6.Motion_quantizeMotionPhase, 9);
        sparseIntArray.append(eu6.Motion_quantizeMotionInterpolator, 10);
    }

    public final void a(c31 c31Var) {
        this.a = c31Var.a;
        this.b = c31Var.b;
        this.d = c31Var.d;
        this.e = c31Var.e;
        this.f = c31Var.f;
        this.h = c31Var.h;
        this.g = c31Var.g;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eu6.Motion);
        this.a = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (n.get(index)) {
                case 1:
                    this.h = typedArrayObtainStyledAttributes.getFloat(index, this.h);
                    break;
                case 2:
                    this.e = typedArrayObtainStyledAttributes.getInt(index, this.e);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.d = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.d = yy1.d[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.f = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.b = d.o(typedArrayObtainStyledAttributes, index, this.b);
                    break;
                case 6:
                    this.c = typedArrayObtainStyledAttributes.getInteger(index, this.c);
                    break;
                case 7:
                    this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                    break;
                case 8:
                    this.j = typedArrayObtainStyledAttributes.getInteger(index, this.j);
                    break;
                case 9:
                    this.i = typedArrayObtainStyledAttributes.getFloat(index, this.i);
                    break;
                case 10:
                    int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.m = resourceId;
                        if (resourceId != -1) {
                            this.l = -2;
                        }
                    } else if (i2 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.k = string;
                        if (string.indexOf("/") > 0) {
                            this.m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.l = -2;
                        } else {
                            this.l = -1;
                        }
                    } else {
                        this.l = typedArrayObtainStyledAttributes.getInteger(index, this.m);
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
