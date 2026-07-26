package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class ra7 {
    public final List a;
    public final float b;
    public final float c;
    public final ListBuilder d;

    /* JADX WARN: Multi-variable type inference failed */
    public ra7(AbstractList abstractList, float f, float f2) {
        ArrayList arrayListE;
        ArrayList arrayListE2;
        char c;
        h81 h81Var;
        List list;
        js3.p(abstractList, "features");
        this.a = abstractList;
        this.b = f;
        this.c = f2;
        ListBuilder listBuilderS = br9.s();
        char c2 = 3;
        h81 h81Var2 = null;
        if (abstractList.size() <= 0 || ((e92) abstractList.get(0)).a.size() != 3) {
            arrayListE = null;
            arrayListE2 = null;
        } else {
            Pair pairD = ((h81) ((e92) abstractList.get(0)).a.get(1)).d(0.5f);
            h81 h81Var3 = (h81) pairD.a;
            h81 h81Var4 = (h81) pairD.b;
            arrayListE2 = br9.E(((e92) abstractList.get(0)).a.get(0), h81Var3);
            arrayListE = br9.E(h81Var4, ((e92) abstractList.get(0)).a.get(2));
        }
        int size = abstractList.size();
        if (size >= 0) {
            int i = 0;
            h81 h81Var5 = null;
            while (true) {
                if (i == 0 && arrayListE != null) {
                    list = arrayListE;
                } else if (i != this.a.size()) {
                    list = ((e92) this.a.get(i)).a;
                } else {
                    if (arrayListE2 == null) {
                        c = c2;
                        break;
                    }
                    list = arrayListE2;
                }
                int size2 = list.size();
                int i2 = 0;
                while (i2 < size2) {
                    h81 h81Var6 = (h81) list.get(i2);
                    char c3 = c2;
                    float[] fArr = h81Var6.a;
                    boolean z = false;
                    if (Math.abs(fArr[0] - h81Var6.a()) < 1.0E-4f && Math.abs(fArr[1] - h81Var6.b()) < 1.0E-4f) {
                        z = true;
                    }
                    if (!z) {
                        if (h81Var5 != null) {
                            listBuilderS.add(h81Var5);
                        }
                        if (h81Var2 == null) {
                            h81Var2 = h81Var6;
                            h81Var5 = h81Var2;
                        } else {
                            h81Var5 = h81Var6;
                        }
                    } else if (h81Var5 != null) {
                        float[] fArr2 = h81Var5.a;
                        fArr2[6] = h81Var6.a();
                        fArr2[7] = h81Var6.b();
                    }
                    i2++;
                    c2 = c3;
                }
                c = c2;
                if (i == size) {
                    break;
                }
                i++;
                c2 = c;
            }
            h81Var = h81Var2;
            h81Var2 = h81Var5;
        } else {
            c = 3;
            h81Var = null;
        }
        if (h81Var2 != null && h81Var != null) {
            float[] fArr3 = h81Var2.a;
            float f3 = fArr3[0];
            float f4 = fArr3[1];
            float f5 = fArr3[2];
            float f6 = fArr3[c];
            float f7 = fArr3[4];
            float f8 = fArr3[5];
            float[] fArr4 = h81Var.a;
            listBuilderS.add(rq4.a(f3, f4, f5, f6, f7, f8, fArr4[0], fArr4[1]));
        }
        ListBuilder listBuilderQ = br9.q(listBuilderS);
        this.d = listBuilderQ;
        Object obj = listBuilderQ.get(listBuilderQ.a() - 1);
        int iA = listBuilderQ.a();
        int i3 = 0;
        while (i3 < iA) {
            h81 h81Var7 = (h81) this.d.get(i3);
            h81 h81Var8 = (h81) obj;
            if (Math.abs(h81Var7.a[0] - h81Var8.a()) > 1.0E-4f || Math.abs(h81Var7.a[1] - h81Var8.b()) > 1.0E-4f) {
                throw new IllegalArgumentException("RoundedPolygon must be contiguous, with the anchor points of all curves matching the anchor points of the preceding and succeeding cubics");
            }
            i3++;
            obj = h81Var7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra7)) {
            return false;
        }
        return js3.i(this.a, ((ra7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "[RoundedPolygon. Cubics = " + a.t0(this.d, null, null, null, null, 63) + " || Features = " + a.t0(this.a, null, null, null, null, 63) + " || Center = (" + this.b + ", " + this.c + ")]";
    }
}
