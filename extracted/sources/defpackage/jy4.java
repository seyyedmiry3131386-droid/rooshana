package defpackage;

import android.graphics.Rect;
import androidx.constraintlayout.widget.c;
import androidx.constraintlayout.widget.d;
import io.sentry.android.core.t0;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class jy4 implements Comparable {
    public int c;
    public float a = 0.0f;
    public int b = 0;
    public final LinkedHashMap d = new LinkedHashMap();
    public float e = 1.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public float h = 0.0f;
    public float i = 1.0f;
    public float j = 1.0f;
    public float k = Float.NaN;
    public float l = Float.NaN;
    public float m = 0.0f;
    public float n = 0.0f;
    public float o = 0.0f;
    public float p = Float.NaN;
    public float q = Float.NaN;

    public static boolean b(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(HashMap map, int i) {
        for (String str : map.keySet()) {
            f99 f99Var = (f99) map.get(str);
            if (f99Var != null) {
                str.getClass();
                byte b = -1;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            b = 0;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            b = 1;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            b = 2;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            b = 3;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            b = 4;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            b = 5;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            b = 6;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            b = 7;
                        }
                        break;
                    case -760884510:
                        if (str.equals("transformPivotX")) {
                            b = 8;
                        }
                        break;
                    case -760884509:
                        if (str.equals("transformPivotY")) {
                            b = 9;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            b = 10;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            b = 11;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            b = 12;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            b = 13;
                        }
                        break;
                }
                switch (b) {
                    case 0:
                        f99Var.b(i, Float.isNaN(this.h) ? 0.0f : this.h);
                        break;
                    case 1:
                        f99Var.b(i, Float.isNaN(this.a) ? 0.0f : this.a);
                        break;
                    case 2:
                        f99Var.b(i, Float.isNaN(this.m) ? 0.0f : this.m);
                        break;
                    case 3:
                        f99Var.b(i, Float.isNaN(this.n) ? 0.0f : this.n);
                        break;
                    case 4:
                        f99Var.b(i, Float.isNaN(this.o) ? 0.0f : this.o);
                        break;
                    case 5:
                        f99Var.b(i, Float.isNaN(this.q) ? 0.0f : this.q);
                        break;
                    case 6:
                        f99Var.b(i, Float.isNaN(this.i) ? 1.0f : this.i);
                        break;
                    case 7:
                        f99Var.b(i, Float.isNaN(this.j) ? 1.0f : this.j);
                        break;
                    case 8:
                        f99Var.b(i, Float.isNaN(this.k) ? 0.0f : this.k);
                        break;
                    case 9:
                        f99Var.b(i, Float.isNaN(this.l) ? 0.0f : this.l);
                        break;
                    case 10:
                        f99Var.b(i, Float.isNaN(this.g) ? 0.0f : this.g);
                        break;
                    case 11:
                        f99Var.b(i, Float.isNaN(this.f) ? 0.0f : this.f);
                        break;
                    case 12:
                        f99Var.b(i, Float.isNaN(this.p) ? 0.0f : this.p);
                        break;
                    case 13:
                        f99Var.b(i, Float.isNaN(this.e) ? 1.0f : this.e);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            String str2 = str.split(",")[1];
                            LinkedHashMap linkedHashMap = this.d;
                            if (linkedHashMap.containsKey(str2)) {
                                w21 w21Var = (w21) linkedHashMap.get(str2);
                                if (f99Var instanceof c99) {
                                    ((c99) f99Var).f.append(i, w21Var);
                                } else {
                                    t0.d("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i + ", value" + w21Var.a() + f99Var);
                                }
                            }
                        } else {
                            t0.d("MotionPaths", "UNKNOWN spline ".concat(str));
                        }
                        break;
                }
            }
        }
    }

    public final void c(Rect rect, d dVar, int i, int i2) {
        rect.width();
        rect.height();
        c cVarK = dVar.k(i2);
        d31 d31Var = cVarK.c;
        c31 c31Var = cVarK.d;
        int i3 = d31Var.c;
        this.b = i3;
        int i4 = d31Var.b;
        this.c = i4;
        this.e = (i4 == 0 || i3 != 0) ? d31Var.d : 0.0f;
        e31 e31Var = cVarK.f;
        boolean z = e31Var.m;
        this.f = e31Var.n;
        this.g = e31Var.b;
        this.h = e31Var.c;
        this.a = e31Var.d;
        this.i = e31Var.e;
        this.j = e31Var.f;
        this.k = e31Var.g;
        this.l = e31Var.h;
        this.m = e31Var.j;
        this.n = e31Var.k;
        this.o = e31Var.l;
        yy1.c(c31Var.d);
        this.p = c31Var.h;
        this.q = cVarK.c.e;
        for (String str : cVarK.g.keySet()) {
            w21 w21Var = (w21) cVarK.g.get(str);
            int iOrdinal = w21Var.c.ordinal();
            if (iOrdinal != 4 && iOrdinal != 5 && iOrdinal != 7) {
                this.d.put(str, w21Var);
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f = this.g + 90.0f;
            this.g = f;
            if (f > 180.0f) {
                this.g = f - 360.0f;
                return;
            }
            return;
        }
        this.g -= 90.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((jy4) obj).getClass();
        return Float.compare(0.0f, 0.0f);
    }
}
