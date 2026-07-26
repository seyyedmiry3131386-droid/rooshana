package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import io.sentry.android.core.t0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class py3 extends rx3 {
    public int e = -1;
    public float f = Float.NaN;
    public float g = Float.NaN;
    public float h = Float.NaN;
    public float i = Float.NaN;
    public float j = Float.NaN;
    public float k = Float.NaN;
    public float l = Float.NaN;
    public float m = Float.NaN;
    public float n = Float.NaN;
    public float o = Float.NaN;
    public float p = Float.NaN;
    public float q = Float.NaN;
    public int r = 0;
    public float s = Float.NaN;
    public float t = 0.0f;

    public py3() {
        this.d = new HashMap();
    }

    @Override // defpackage.rx3
    public final void a(HashMap map) {
        throw null;
    }

    @Override // defpackage.rx3
    /* JADX INFO: renamed from: b */
    public final rx3 clone() {
        py3 py3Var = new py3();
        super.c(this);
        py3Var.e = this.e;
        py3Var.r = this.r;
        py3Var.s = this.s;
        py3Var.t = this.t;
        py3Var.q = this.q;
        py3Var.f = this.f;
        py3Var.g = this.g;
        py3Var.h = this.h;
        py3Var.k = this.k;
        py3Var.i = this.i;
        py3Var.j = this.j;
        py3Var.l = this.l;
        py3Var.m = this.m;
        py3Var.n = this.n;
        py3Var.o = this.o;
        py3Var.p = this.p;
        return py3Var;
    }

    @Override // defpackage.rx3
    public final void d(HashSet hashSet) {
        if (!Float.isNaN(this.f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("progress");
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eu6.KeyTimeCycle);
        SparseIntArray sparseIntArray = oy3.a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = oy3.a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                    break;
                case 2:
                    this.g = typedArrayObtainStyledAttributes.getDimension(index, this.g);
                    break;
                case 3:
                case 11:
                default:
                    t0.d("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.h = typedArrayObtainStyledAttributes.getFloat(index, this.h);
                    break;
                case 5:
                    this.i = typedArrayObtainStyledAttributes.getFloat(index, this.i);
                    break;
                case 6:
                    this.j = typedArrayObtainStyledAttributes.getFloat(index, this.j);
                    break;
                case 7:
                    this.l = typedArrayObtainStyledAttributes.getFloat(index, this.l);
                    break;
                case 8:
                    this.k = typedArrayObtainStyledAttributes.getFloat(index, this.k);
                    break;
                case 9:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 10:
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
                case 12:
                    this.a = typedArrayObtainStyledAttributes.getInt(index, this.a);
                    break;
                case 13:
                    this.e = typedArrayObtainStyledAttributes.getInteger(index, this.e);
                    break;
                case 14:
                    this.m = typedArrayObtainStyledAttributes.getFloat(index, this.m);
                    break;
                case 15:
                    this.n = typedArrayObtainStyledAttributes.getDimension(index, this.n);
                    break;
                case 16:
                    this.o = typedArrayObtainStyledAttributes.getDimension(index, this.o);
                    break;
                case 17:
                    this.p = typedArrayObtainStyledAttributes.getDimension(index, this.p);
                    break;
                case 18:
                    this.q = typedArrayObtainStyledAttributes.getFloat(index, this.q);
                    break;
                case 19:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        this.r = 7;
                    } else {
                        this.r = typedArrayObtainStyledAttributes.getInt(index, this.r);
                    }
                    break;
                case 20:
                    this.s = typedArrayObtainStyledAttributes.getFloat(index, this.s);
                    break;
                case 21:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 5) {
                        this.t = typedArrayObtainStyledAttributes.getDimension(index, this.t);
                    } else {
                        this.t = typedArrayObtainStyledAttributes.getFloat(index, this.t);
                    }
                    break;
            }
        }
    }

    @Override // defpackage.rx3
    public final void f(HashMap map) {
        if (this.e == -1) {
            return;
        }
        if (!Float.isNaN(this.f)) {
            map.put("alpha", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.g)) {
            map.put("elevation", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.h)) {
            map.put("rotation", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.i)) {
            map.put("rotationX", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.j)) {
            map.put("rotationY", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.n)) {
            map.put("translationX", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.o)) {
            map.put("translationY", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.p)) {
            map.put("translationZ", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.k)) {
            map.put("transitionPathRotate", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.l)) {
            map.put("scaleX", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.l)) {
            map.put("scaleY", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.q)) {
            map.put("progress", Integer.valueOf(this.e));
        }
        if (this.d.size() > 0) {
            Iterator it = this.d.keySet().iterator();
            while (it.hasNext()) {
                map.put(dw1.n("CUSTOM,", (String) it.next()), Integer.valueOf(this.e));
            }
        }
    }

    public final void h(HashMap map) {
        for (String str : map.keySet()) {
            u99 u99Var = (u99) map.get(str);
            if (u99Var != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.i)) {
                                break;
                            } else {
                                u99Var.c(this.i, this.s, this.t, this.a, this.r);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.j)) {
                                break;
                            } else {
                                u99Var.c(this.j, this.s, this.t, this.a, this.r);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.n)) {
                                break;
                            } else {
                                u99Var.c(this.n, this.s, this.t, this.a, this.r);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.o)) {
                                break;
                            } else {
                                u99Var.c(this.o, this.s, this.t, this.a, this.r);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.p)) {
                                break;
                            } else {
                                u99Var.c(this.p, this.s, this.t, this.a, this.r);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.q)) {
                                break;
                            } else {
                                u99Var.c(this.q, this.s, this.t, this.a, this.r);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.l)) {
                                break;
                            } else {
                                u99Var.c(this.l, this.s, this.t, this.a, this.r);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.m)) {
                                break;
                            } else {
                                u99Var.c(this.m, this.s, this.t, this.a, this.r);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.h)) {
                                break;
                            } else {
                                u99Var.c(this.h, this.s, this.t, this.a, this.r);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.g)) {
                                break;
                            } else {
                                u99Var.c(this.g, this.s, this.t, this.a, this.r);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.k)) {
                                break;
                            } else {
                                u99Var.c(this.k, this.s, this.t, this.a, this.r);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f)) {
                                break;
                            } else {
                                u99Var.c(this.f, this.s, this.t, this.a, this.r);
                                break;
                            }
                            break;
                        default:
                            t0.d("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            break;
                    }
                } else {
                    w21 w21Var = (w21) this.d.get(str.substring(7));
                    if (w21Var != null) {
                        r99 r99Var = (r99) u99Var;
                        int i = this.a;
                        float f = this.s;
                        int i2 = this.r;
                        float f2 = this.t;
                        r99Var.l.append(i, w21Var);
                        r99Var.m.append(i, new float[]{f, f2});
                        r99Var.b = Math.max(r99Var.b, i2);
                    }
                }
            }
        }
    }
}
