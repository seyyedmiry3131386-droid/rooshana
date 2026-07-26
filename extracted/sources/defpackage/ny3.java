package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import io.sentry.android.core.t0;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ny3 extends rx3 {
    public int e = -1;
    public String f = null;
    public int g = -1;
    public int h = 0;
    public float i = Float.NaN;
    public float j = Float.NaN;
    public float k = Float.NaN;
    public float l = Float.NaN;
    public int m = 0;

    @Override // defpackage.rx3
    public final void a(HashMap map) {
        throw null;
    }

    @Override // defpackage.rx3
    /* JADX INFO: renamed from: b */
    public final rx3 clone() {
        ny3 ny3Var = new ny3();
        super.c(this);
        ny3Var.f = this.f;
        ny3Var.g = this.g;
        ny3Var.h = this.h;
        ny3Var.i = this.i;
        ny3Var.j = Float.NaN;
        ny3Var.k = this.k;
        ny3Var.l = this.l;
        return ny3Var;
    }

    @Override // defpackage.rx3
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eu6.KeyPosition);
        SparseIntArray sparseIntArray = my3.a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = my3.a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    if (MotionLayout.c1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
                        this.b = resourceId;
                        if (resourceId == -1) {
                            this.c = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.c = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.b = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
                    }
                    break;
                case 2:
                    this.a = typedArrayObtainStyledAttributes.getInt(index, this.a);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f = yy1.d[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.e = typedArrayObtainStyledAttributes.getInteger(index, this.e);
                    break;
                case 5:
                    this.h = typedArrayObtainStyledAttributes.getInt(index, this.h);
                    break;
                case 6:
                    this.k = typedArrayObtainStyledAttributes.getFloat(index, this.k);
                    break;
                case 7:
                    this.l = typedArrayObtainStyledAttributes.getFloat(index, this.l);
                    break;
                case 8:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, this.j);
                    this.i = f;
                    this.j = f;
                    break;
                case 9:
                    this.m = typedArrayObtainStyledAttributes.getInt(index, this.m);
                    break;
                case 10:
                    this.g = typedArrayObtainStyledAttributes.getInt(index, this.g);
                    break;
                case 11:
                    this.i = typedArrayObtainStyledAttributes.getFloat(index, this.i);
                    break;
                case 12:
                    this.j = typedArrayObtainStyledAttributes.getFloat(index, this.j);
                    break;
                default:
                    t0.d("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
        if (this.a == -1) {
            t0.d("KeyPosition", "no frame position");
        }
    }

    public final void h(Object obj, String str) {
        switch (str) {
            case "transitionEasing":
                this.f = obj.toString();
                break;
            case "percentWidth":
                this.i = rx3.g((Number) obj);
                break;
            case "percentHeight":
                this.j = rx3.g((Number) obj);
                break;
            case "drawPath":
                Number number = (Number) obj;
                this.h = number instanceof Integer ? ((Integer) number).intValue() : Integer.parseInt(number.toString());
                break;
            case "sizePercent":
                float fG = rx3.g((Number) obj);
                this.i = fG;
                this.j = fG;
                break;
            case "percentX":
                this.k = rx3.g((Number) obj);
                break;
            case "percentY":
                this.l = rx3.g((Number) obj);
                break;
        }
    }

    @Override // defpackage.rx3
    public final void d(HashSet hashSet) {
    }
}
