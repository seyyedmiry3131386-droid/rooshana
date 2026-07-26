package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ez3 {
    public static ez3 h;
    public float a;
    public float b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public ez3(LayoutDirection layoutDirection, gj8 gj8Var, tj1 tj1Var, oh2 oh2Var) {
        this.c = layoutDirection;
        this.d = gj8Var;
        this.e = tj1Var;
        this.f = oh2Var;
        this.g = sy7.l(gj8Var, layoutDirection);
        this.a = Float.NaN;
        this.b = Float.NaN;
    }

    public static float[] e(float f, ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        float[] fArr = new float[size];
        int i = 1;
        while (i < size) {
            int i2 = i - 1;
            dz3 dz3Var = (dz3) arrayList.get(i2);
            dz3 dz3Var2 = (dz3) arrayList.get(i);
            fArr[i] = i == size + (-1) ? 1.0f : fArr[i2] + ((z ? dz3Var2.b().a - dz3Var.b().a : dz3Var.d().a - dz3Var2.d().a) / f);
            i++;
        }
        return fArr;
    }

    public static dz3 f(dz3 dz3Var, int i, int i2, float f, int i3, int i4, int i5) {
        ArrayList arrayList = new ArrayList(dz3Var.c);
        arrayList.add(i2, (cz3) arrayList.remove(i));
        bz3 bz3Var = new bz3(i5, dz3Var.a);
        float f2 = f;
        int i6 = 0;
        while (i6 < arrayList.size()) {
            cz3 cz3Var = (cz3) arrayList.get(i6);
            float f3 = cz3Var.d;
            bz3Var.b((f3 / 2.0f) + f2, cz3Var.c, f3, i6 >= i3 && i6 <= i4, cz3Var.e, cz3Var.f, 0.0f, 0.0f);
            f2 += cz3Var.d;
            i6++;
        }
        return bz3Var.d();
    }

    public static dz3 g(dz3 dz3Var, float f, int i, boolean z, float f2) {
        int i2;
        List list = dz3Var.c;
        ArrayList arrayList = new ArrayList(list);
        float f3 = dz3Var.a;
        bz3 bz3Var = new bz3(i, f3);
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            if (((cz3) it.next()).e) {
                i3++;
            }
        }
        float size = f / (list.size() - i3);
        float f4 = z ? f : 0.0f;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            cz3 cz3Var = (cz3) arrayList.get(i4);
            if (cz3Var.e) {
                i2 = i4;
                bz3Var.b(cz3Var.b, cz3Var.c, cz3Var.d, false, true, cz3Var.f, 0.0f, 0.0f);
            } else {
                i2 = i4;
                boolean z2 = i2 >= dz3Var.d && i2 <= dz3Var.e;
                float f5 = cz3Var.d - size;
                float fA = kn0.a(f5, f3, f2);
                float f6 = (f5 / 2.0f) + f4;
                float fAbs = Math.abs(f6 - cz3Var.b);
                float f7 = cz3Var.f;
                float f8 = fAbs;
                if (!z) {
                    fAbs = 0.0f;
                }
                if (z) {
                    f8 = 0.0f;
                }
                bz3Var.b(f6, fA, f5, z2, false, f7, fAbs, f8);
                f4 += f5;
            }
            i4 = i2 + 1;
        }
        return bz3Var.d();
    }

    public long a(int i, long j) {
        int i2;
        tj1 tj1Var = (tj1) this.e;
        float f = this.b;
        float fB = this.a;
        if (Float.isNaN(f) || Float.isNaN(fB)) {
            float fB2 = yh0.g(vv4.a, (gj8) this.g, j31.b(0, 0, 15), tj1Var, (oh2) this.f, null, 1, 96).b();
            fB = yh0.g(vv4.b, (gj8) this.g, j31.b(0, 0, 15), tj1Var, (oh2) this.f, null, 2, 96).b() - fB2;
            this.b = fB2;
            this.a = fB;
            f = fB2;
        }
        if (i != 1) {
            int iRound = Math.round((fB * (i - 1)) + f);
            i2 = iRound >= 0 ? iRound : 0;
            int iG = h31.g(j);
            if (i2 > iG) {
                i2 = iG;
            }
        } else {
            i2 = h31.i(j);
        }
        return j31.a(h31.j(j), h31.h(j), i2, h31.g(j));
    }

    public dz3 b() {
        return (dz3) ((List) this.e).get(r0.size() - 1);
    }

    public dz3 c(float f, float f2, float f3) {
        float fB;
        List list;
        float[] fArr;
        float[] fArr2;
        float f4 = this.a;
        float f5 = f2 + f4;
        float f6 = this.b;
        float f7 = f3 - f6;
        float f8 = d().a().g;
        float f9 = b().a().h;
        if (f4 == f8) {
            f5 += f8;
        }
        if (f6 == f9) {
            f7 -= f9;
        }
        if (f < f5) {
            fB = yk.b(1.0f, 0.0f, f2, f5, f);
            list = (List) this.d;
            fArr = (float[]) this.f;
        } else {
            if (f <= f7) {
                return (dz3) this.c;
            }
            fB = yk.b(0.0f, 1.0f, f7, f3, f);
            list = (List) this.e;
            fArr = (float[]) this.g;
        }
        int size = list.size();
        float f10 = fArr[0];
        int i = 1;
        while (true) {
            if (i >= size) {
                fArr2 = new float[]{0.0f, 0.0f, 0.0f};
                break;
            }
            float f11 = fArr[i];
            if (fB <= f11) {
                fArr2 = new float[]{yk.b(0.0f, 1.0f, f10, f11, fB), i - 1, i};
                break;
            }
            i++;
            f10 = f11;
        }
        dz3 dz3Var = (dz3) list.get((int) fArr2[1]);
        dz3 dz3Var2 = (dz3) list.get((int) fArr2[2]);
        float f12 = fArr2[0];
        float f13 = dz3Var.a;
        List list2 = dz3Var.c;
        if (f13 != dz3Var2.a) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List list3 = dz3Var2.c;
        if (list2.size() != list3.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list2.size(); i2++) {
            cz3 cz3Var = (cz3) list2.get(i2);
            cz3 cz3Var2 = (cz3) list3.get(i2);
            arrayList.add(new cz3(yk.a(cz3Var.a, cz3Var2.a, f12), yk.a(cz3Var.b, cz3Var2.b, f12), yk.a(cz3Var.c, cz3Var2.c, f12), yk.a(cz3Var.d, cz3Var2.d, f12), false, 0.0f, 0.0f, 0.0f));
        }
        return new dz3(dz3Var.a, arrayList, yk.c(f12, dz3Var.d, dz3Var2.d), yk.c(f12, dz3Var.e, dz3Var2.e), dz3Var.f);
    }

    public dz3 d() {
        return (dz3) ((List) this.d).get(r0.size() - 1);
    }

    public ez3(dz3 dz3Var, ArrayList arrayList, ArrayList arrayList2) {
        this.c = dz3Var;
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.e = DesugarCollections.unmodifiableList(arrayList2);
        float f = ((dz3) o40.u(1, arrayList)).b().a - dz3Var.b().a;
        this.a = f;
        float f2 = dz3Var.d().a - ((dz3) o40.u(1, arrayList2)).d().a;
        this.b = f2;
        this.f = e(f, arrayList, true);
        this.g = e(f2, arrayList2, false);
    }
}
