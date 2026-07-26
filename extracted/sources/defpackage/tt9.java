package defpackage;

import android.content.res.TypedArray;
import android.view.View;
import androidx.compose.runtime.g;
import androidx.fragment.app.SpecialEffectsController$Operation$State;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class tt9 implements jj {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ tt9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static void q(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    public abstract double A(long j, Object obj);

    public abstract void B(Object obj, long j, double d);

    @Override // defpackage.jj
    public List b() {
        return (List) this.b;
    }

    @Override // defpackage.jj
    public boolean c() {
        List list = (List) this.b;
        return list.isEmpty() || (list.size() == 1 && ((uy3) list.get(0)).c());
    }

    public boolean d(int i, qv2 qv2Var, Object obj) {
        ArrayList arrayList = qv2Var.a;
        if (arrayList == null) {
            e(i, qv2Var, null);
            return true;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = arrayList.get(i2);
            if (obj2 instanceof ge) {
                if (obj2.equals(obj)) {
                    e(0, qv2Var, obj2);
                    return true;
                }
            } else {
                if (!(obj2 instanceof qv2)) {
                    throw new IllegalStateException(("Unexpected child source info " + obj2).toString());
                }
                if (d(i, (qv2) obj2, obj)) {
                    e(0, qv2Var, obj2);
                    return true;
                }
            }
        }
        return false;
    }

    public void e(int i, qv2 qv2Var, Object obj) {
        ((ArrayList) this.b).add(new gz0(i, null, null));
    }

    public abstract void f(vp7 vp7Var);

    public bv7 g() {
        bv7 bv7Var = (bv7) this.b;
        int[] iArr = bv7Var.b;
        int i = bv7Var.f;
        if (i != 1) {
            int i2 = bv7Var.e;
            iArr[0] = i2;
            int i3 = bv7Var.d;
            iArr[1] = i3;
            iArr[2] = i3;
            iArr[3] = i2;
        } else {
            int i4 = bv7Var.d;
            iArr[0] = i4;
            iArr[1] = i4;
            int i5 = bv7Var.e;
            iArr[2] = i5;
            iArr[3] = i5;
        }
        float[] fArr = bv7Var.a;
        if (i != 1) {
            fArr[0] = Math.max(((1.0f - bv7Var.k) - bv7Var.l) / 2.0f, 0.0f);
            fArr[1] = Math.max(((1.0f - bv7Var.k) - 0.001f) / 2.0f, 0.0f);
            fArr[2] = Math.min(((bv7Var.k + 1.0f) + 0.001f) / 2.0f, 1.0f);
            fArr[3] = Math.min(((bv7Var.k + 1.0f) + bv7Var.l) / 2.0f, 1.0f);
            return bv7Var;
        }
        fArr[0] = 0.0f;
        fArr[1] = Math.min(bv7Var.k, 1.0f);
        fArr[2] = Math.min(bv7Var.k + bv7Var.l, 1.0f);
        fArr[3] = 1.0f;
        return bv7Var;
    }

    public tt9 h(TypedArray typedArray) {
        bv7 bv7Var = (bv7) this.b;
        if (typedArray.hasValue(wt6.ShimmerFrameLayout_shimmer_clip_to_children)) {
            bv7Var.n = typedArray.getBoolean(wt6.ShimmerFrameLayout_shimmer_clip_to_children, bv7Var.n);
        }
        if (typedArray.hasValue(wt6.ShimmerFrameLayout_shimmer_auto_start)) {
            bv7Var.o = typedArray.getBoolean(wt6.ShimmerFrameLayout_shimmer_auto_start, bv7Var.o);
        }
        if (typedArray.hasValue(wt6.ShimmerFrameLayout_shimmer_base_alpha)) {
            bv7Var.e = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(wt6.ShimmerFrameLayout_shimmer_base_alpha, 0.3f))) * 255.0f)) << 24) | (bv7Var.e & 16777215);
        }
        if (typedArray.hasValue(wt6.ShimmerFrameLayout_shimmer_highlight_alpha)) {
            bv7Var.d = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(wt6.ShimmerFrameLayout_shimmer_highlight_alpha, 1.0f))) * 255.0f)) << 24) | (16777215 & bv7Var.d);
        }
        if (typedArray.hasValue(wt6.ShimmerFrameLayout_shimmer_duration)) {
            long j = typedArray.getInt(wt6.ShimmerFrameLayout_shimmer_duration, (int) bv7Var.s);
            if (j < 0) {
                throw new IllegalArgumentException(bl4.r(j, "Given a negative duration: "));
            }
            bv7Var.s = j;
        }
        if (typedArray.hasValue(wt6.ShimmerFrameLayout_shimmer_repeat_count)) {
            bv7Var.q = typedArray.getInt(wt6.ShimmerFrameLayout_shimmer_repeat_count, bv7Var.q);
        }
        if (typedArray.hasValue(wt6.ShimmerFrameLayout_shimmer_repeat_delay)) {
            long j2 = typedArray.getInt(wt6.ShimmerFrameLayout_shimmer_repeat_delay, (int) bv7Var.t);
            if (j2 < 0) {
                throw new IllegalArgumentException(bl4.r(j2, "Given a negative repeat delay: "));
            }
            bv7Var.t = j2;
        }
        if (typedArray.hasValue(wt6.ShimmerFrameLayout_shimmer_repeat_mode)) {
            bv7Var.r = typedArray.getInt(wt6.ShimmerFrameLayout_shimmer_repeat_mode, bv7Var.r);
        }
        if (typedArray.hasValue(wt6.ShimmerFrameLayout_shimmer_direction)) {
            int i = typedArray.getInt(wt6.ShimmerFrameLayout_shimmer_direction, bv7Var.c);
            if (i == 1) {
                bv7Var.c = 1;
            } else if (i == 2) {
                bv7Var.c = 2;
            } else if (i != 3) {
                bv7Var.c = 0;
            } else {
                bv7Var.c = 3;
            }
        }
        if (typedArray.hasValue(wt6.ShimmerFrameLayout_shimmer_shape)) {
            if (typedArray.getInt(wt6.ShimmerFrameLayout_shimmer_shape, bv7Var.f) != 1) {
                bv7Var.f = 0;
            } else {
                bv7Var.f = 1;
            }
        }
        if (typedArray.hasValue(wt6.ShimmerFrameLayout_shimmer_dropoff)) {
            float f = typedArray.getFloat(wt6.ShimmerFrameLayout_shimmer_dropoff, bv7Var.l);
            if (f < 0.0f) {
                throw new IllegalArgumentException("Given invalid dropoff value: " + f);
            }
            bv7Var.l = f;
        }
        if (typedArray.hasValue(wt6.ShimmerFrameLayout_shimmer_fixed_width)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(wt6.ShimmerFrameLayout_shimmer_fixed_width, bv7Var.g);
            if (dimensionPixelSize < 0) {
                throw new IllegalArgumentException(rm7.n(dimensionPixelSize, "Given invalid width: "));
            }
            bv7Var.g = dimensionPixelSize;
        }
        if (typedArray.hasValue(wt6.ShimmerFrameLayout_shimmer_fixed_height)) {
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(wt6.ShimmerFrameLayout_shimmer_fixed_height, bv7Var.h);
            if (dimensionPixelSize2 < 0) {
                throw new IllegalArgumentException(rm7.n(dimensionPixelSize2, "Given invalid height: "));
            }
            bv7Var.h = dimensionPixelSize2;
        }
        if (typedArray.hasValue(wt6.ShimmerFrameLayout_shimmer_intensity)) {
            float f2 = typedArray.getFloat(wt6.ShimmerFrameLayout_shimmer_intensity, bv7Var.k);
            if (f2 < 0.0f) {
                throw new IllegalArgumentException("Given invalid intensity value: " + f2);
            }
            bv7Var.k = f2;
        }
        if (typedArray.hasValue(wt6.ShimmerFrameLayout_shimmer_width_ratio)) {
            float f3 = typedArray.getFloat(wt6.ShimmerFrameLayout_shimmer_width_ratio, bv7Var.i);
            if (f3 < 0.0f) {
                throw new IllegalArgumentException("Given invalid width ratio: " + f3);
            }
            bv7Var.i = f3;
        }
        if (typedArray.hasValue(wt6.ShimmerFrameLayout_shimmer_height_ratio)) {
            float f4 = typedArray.getFloat(wt6.ShimmerFrameLayout_shimmer_height_ratio, bv7Var.j);
            if (f4 < 0.0f) {
                throw new IllegalArgumentException("Given invalid height ratio: " + f4);
            }
            bv7Var.j = f4;
        }
        if (typedArray.hasValue(wt6.ShimmerFrameLayout_shimmer_tilt)) {
            bv7Var.m = typedArray.getFloat(wt6.ShimmerFrameLayout_shimmer_tilt, bv7Var.m);
        }
        return l();
    }

    public String i() {
        return null;
    }

    public abstract Object j();

    public abstract Object k();

    public abstract tt9 l();

    public boolean m() {
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State;
        p28 p28Var = (p28) this.b;
        View view = p28Var.c.J;
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State2 = SpecialEffectsController$Operation$State.b;
        if (view != null) {
            float alpha = view.getAlpha();
            specialEffectsController$Operation$State = SpecialEffectsController$Operation$State.d;
            if (alpha != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    specialEffectsController$Operation$State = specialEffectsController$Operation$State2;
                } else if (visibility != 4) {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(rm7.n(visibility, "Unknown visibility "));
                    }
                    specialEffectsController$Operation$State = SpecialEffectsController$Operation$State.c;
                }
            }
        } else {
            specialEffectsController$Operation$State = null;
        }
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State3 = p28Var.a;
        if (specialEffectsController$Operation$State != specialEffectsController$Operation$State3) {
            return (specialEffectsController$Operation$State == specialEffectsController$Operation$State2 || specialEffectsController$Operation$State3 == specialEffectsController$Operation$State2) ? false : true;
        }
        return true;
    }

    public void n(uh6 uh6Var) {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(uh6Var);
        }
    }

    public void o(int i, Object obj, qv2 qv2Var, Object obj2) {
        if (js3.i(obj, jz0.a)) {
            e(i, qv2Var, null);
        }
    }

    public abstract tt9 p();

    public void r(fp5 fp5Var) {
        if (((fp5) this.b) != fp5Var) {
            this.b = fp5Var;
            fp5Var.g(this);
        }
    }

    public abstract void s(Object obj);

    public abstract void t(jr8 jr8Var);

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                List list = (List) this.b;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public abstract void u();

    public abstract void v(Object obj, long j, byte b);

    public abstract boolean w(long j, Object obj);

    public abstract void x(Object obj, long j, boolean z);

    public abstract float y(long j, Object obj);

    public abstract void z(Object obj, long j, float f);

    public /* synthetic */ tt9(int i, boolean z) {
        this.a = i;
    }

    public tt9(int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = new ArrayList();
                break;
            case 7:
                this.b = new bv7();
                break;
            case 10:
                this.b = g.h(Boolean.FALSE);
                break;
            default:
                char[] cArr = i29.a;
                this.b = new ArrayDeque(20);
                break;
        }
    }

    public tt9(p28 p28Var) {
        this.a = 4;
        js3.p(p28Var, "operation");
        this.b = p28Var;
    }
}
