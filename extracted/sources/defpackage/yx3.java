package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute$AttributeType;
import io.sentry.android.core.t0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class yx3 extends rx3 {
    public int e = 0;
    public int f = -1;
    public String g = null;
    public float h = Float.NaN;
    public float i = 0.0f;
    public float j = 0.0f;
    public float k = Float.NaN;
    public int l = -1;
    public float m = Float.NaN;
    public float n = Float.NaN;
    public float o = Float.NaN;
    public float p = Float.NaN;
    public float q = Float.NaN;
    public float r = Float.NaN;
    public float s = Float.NaN;
    public float t = Float.NaN;
    public float u = Float.NaN;
    public float v = Float.NaN;
    public float w = Float.NaN;

    public yx3() {
        this.d = new HashMap();
    }

    @Override // defpackage.rx3
    public final void a(HashMap map) {
        throw null;
    }

    @Override // defpackage.rx3
    /* JADX INFO: renamed from: b */
    public final rx3 clone() {
        yx3 yx3Var = new yx3();
        super.c(this);
        yx3Var.e = this.e;
        yx3Var.f = this.f;
        yx3Var.g = this.g;
        yx3Var.h = this.h;
        yx3Var.i = this.i;
        yx3Var.j = this.j;
        yx3Var.k = this.k;
        yx3Var.l = this.l;
        yx3Var.m = this.m;
        yx3Var.n = this.n;
        yx3Var.o = this.o;
        yx3Var.p = this.p;
        yx3Var.q = this.q;
        yx3Var.r = this.r;
        yx3Var.s = this.s;
        yx3Var.t = this.t;
        yx3Var.u = this.u;
        yx3Var.v = this.v;
        yx3Var.w = this.w;
        return yx3Var;
    }

    @Override // defpackage.rx3
    public final void d(HashSet hashSet) {
        if (!Float.isNaN(this.m)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.u)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.v)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.w)) {
            hashSet.add("translationZ");
        }
        if (this.d.size() > 0) {
            Iterator it = this.d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // defpackage.rx3
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eu6.KeyCycle);
        SparseIntArray sparseIntArray = xx3.a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = xx3.a;
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
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.e = typedArrayObtainStyledAttributes.getInteger(index, this.e);
                    break;
                case 5:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.g = typedArrayObtainStyledAttributes.getString(index);
                        this.f = 7;
                    } else {
                        this.f = typedArrayObtainStyledAttributes.getInt(index, this.f);
                    }
                    break;
                case 6:
                    this.h = typedArrayObtainStyledAttributes.getFloat(index, this.h);
                    break;
                case 7:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 5) {
                        this.i = typedArrayObtainStyledAttributes.getDimension(index, this.i);
                    } else {
                        this.i = typedArrayObtainStyledAttributes.getFloat(index, this.i);
                    }
                    break;
                case 8:
                    this.l = typedArrayObtainStyledAttributes.getInt(index, this.l);
                    break;
                case 9:
                    this.m = typedArrayObtainStyledAttributes.getFloat(index, this.m);
                    break;
                case 10:
                    this.n = typedArrayObtainStyledAttributes.getDimension(index, this.n);
                    break;
                case 11:
                    this.o = typedArrayObtainStyledAttributes.getFloat(index, this.o);
                    break;
                case 12:
                    this.q = typedArrayObtainStyledAttributes.getFloat(index, this.q);
                    break;
                case 13:
                    this.r = typedArrayObtainStyledAttributes.getFloat(index, this.r);
                    break;
                case 14:
                    this.p = typedArrayObtainStyledAttributes.getFloat(index, this.p);
                    break;
                case 15:
                    this.s = typedArrayObtainStyledAttributes.getFloat(index, this.s);
                    break;
                case 16:
                    this.t = typedArrayObtainStyledAttributes.getFloat(index, this.t);
                    break;
                case 17:
                    this.u = typedArrayObtainStyledAttributes.getDimension(index, this.u);
                    break;
                case 18:
                    this.v = typedArrayObtainStyledAttributes.getDimension(index, this.v);
                    break;
                case 19:
                    this.w = typedArrayObtainStyledAttributes.getDimension(index, this.w);
                    break;
                case 20:
                    this.k = typedArrayObtainStyledAttributes.getFloat(index, this.k);
                    break;
                case 21:
                    this.j = typedArrayObtainStyledAttributes.getFloat(index, this.j) / 360.0f;
                    break;
                default:
                    t0.d("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
    }

    public final void h(HashMap map) {
        e89 e89Var;
        float f;
        e89 e89Var2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                w21 w21Var = (w21) this.d.get(str.substring(7));
                if (w21Var != null && w21Var.c == ConstraintAttribute$AttributeType.b && (e89Var = (e89) map.get(str)) != null) {
                    int i = this.a;
                    int i2 = this.f;
                    String str2 = this.g;
                    int i3 = this.l;
                    e89Var.f.add(new zx3(this.h, this.i, this.j, w21Var.a(), i));
                    if (i3 != -1) {
                        e89Var.e = i3;
                    }
                    e89Var.c = i2;
                    e89Var.d(w21Var);
                    e89Var.d = str2;
                }
            } else {
                switch (str) {
                    case "rotationX":
                        f = this.q;
                        break;
                    case "rotationY":
                        f = this.r;
                        break;
                    case "translationX":
                        f = this.u;
                        break;
                    case "translationY":
                        f = this.v;
                        break;
                    case "translationZ":
                        f = this.w;
                        break;
                    case "progress":
                        f = this.k;
                        break;
                    case "scaleX":
                        f = this.s;
                        break;
                    case "scaleY":
                        f = this.t;
                        break;
                    case "rotation":
                        f = this.o;
                        break;
                    case "elevation":
                        f = this.n;
                        break;
                    case "transitionPathRotate":
                        f = this.p;
                        break;
                    case "alpha":
                        f = this.m;
                        break;
                    case "waveOffset":
                        f = this.i;
                        break;
                    case "wavePhase":
                        f = this.j;
                        break;
                    default:
                        str.startsWith("CUSTOM");
                        f = Float.NaN;
                        break;
                }
                float f2 = f;
                if (!Float.isNaN(f2) && (e89Var2 = (e89) map.get(str)) != null) {
                    int i4 = this.a;
                    int i5 = this.f;
                    String str3 = this.g;
                    int i6 = this.l;
                    e89Var2.f.add(new zx3(this.h, this.i, this.j, f2, i4));
                    if (i6 != -1) {
                        e89Var2.e = i6;
                    }
                    e89Var2.c = i5;
                    e89Var2.d = str3;
                }
            }
        }
    }
}
