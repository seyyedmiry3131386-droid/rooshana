package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: loaded from: classes3.dex */
public final class ay2 {
    public final ArrayList a;

    public ay2(ra7 ra7Var, ra7 ra7Var2) {
        Pair pairA;
        Pair pairA2;
        js3.p(ra7Var, "start");
        js3.p(ra7Var2, "end");
        hl4 hl4VarV = dt2.v(new yi(ra7Var.b, ra7Var.c), ra7Var);
        hl4 hl4VarV2 = dt2.v(new yi(ra7Var2.b, ra7Var2.c), ra7Var2);
        List list = hl4VarV.c;
        List list2 = hl4VarV2.c;
        js3.p(list, "features1");
        js3.p(list2, "features2");
        ListBuilder listBuilderS = br9.s();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((lm6) list.get(i)).b instanceof c92) {
                listBuilderS.add(list.get(i));
            }
        }
        ListBuilder listBuilderQ = br9.q(listBuilderS);
        ListBuilder listBuilderS2 = br9.s();
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((lm6) list2.get(i2)).b instanceof c92) {
                listBuilderS2.add(list2.get(i2));
            }
        }
        ListBuilder listBuilderQ2 = br9.q(listBuilderS2);
        Pair pair = listBuilderQ.a() > listBuilderQ2.a() ? new Pair(rf0.r(listBuilderQ2, listBuilderQ), listBuilderQ2) : new Pair(listBuilderQ, rf0.r(listBuilderQ, listBuilderQ2));
        List list3 = (List) pair.a;
        List list4 = (List) pair.b;
        ListBuilder listBuilderS3 = br9.s();
        int size3 = list3.size();
        for (int i3 = 0; i3 < size3 && i3 != list4.size(); i3++) {
            listBuilderS3.add(new Pair(Float.valueOf(((lm6) list3.get(i3)).a), Float.valueOf(((lm6) list4.get(i3)).a)));
        }
        Pair[] pairArr = (Pair[]) br9.q(listBuilderS3).toArray(new Pair[0]);
        gr1 gr1Var = new gr1((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        va5 va5Var = gr1Var.a;
        va5 va5Var2 = gr1Var.b;
        float fU = dt2.u(va5Var, va5Var2, 0.0f);
        ArrayList arrayList = hl4VarV2.b;
        if (0.0f > fU || fU > 1.0f) {
            throw new IllegalArgumentException("Cutting point is expected to be between 0 and 1");
        }
        if (fU >= 1.0E-4f) {
            Iterator it = arrayList.iterator();
            int i4 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i4 = -1;
                    break;
                }
                gl4 gl4Var = (gl4) it.next();
                float f = gl4Var.c;
                if (fU <= gl4Var.d && f <= fU) {
                    break;
                } else {
                    i4++;
                }
            }
            Pair pairA3 = ((gl4) arrayList.get(i4)).a(fU);
            gl4 gl4Var2 = (gl4) pairA3.a;
            ArrayList arrayListE = br9.E(((gl4) pairA3.b).a);
            int size4 = arrayList.size();
            for (int i5 = 1; i5 < size4; i5++) {
                arrayListE.add(((gl4) arrayList.get((i5 + i4) % arrayList.size())).a);
            }
            arrayListE.add(gl4Var2.a);
            va5 va5Var3 = new va5(arrayList.size() + 2);
            int size5 = arrayList.size() + 2;
            int i6 = 0;
            while (i6 < size5) {
                va5Var3.a(i6 == 0 ? 0.0f : i6 == arrayList.size() + 1 ? 1.0f : p29.d(((gl4) arrayList.get(((i4 + i6) - 1) % arrayList.size())).d - fU, 1.0f));
                i6++;
            }
            ListBuilder listBuilderS4 = br9.s();
            int size6 = list2.size();
            for (int i7 = 0; i7 < size6; i7++) {
                listBuilderS4.add(new lm6(p29.d(((lm6) list2.get(i7)).a - fU, 1.0f), ((lm6) list2.get(i7)).b));
            }
            hl4VarV2 = new hl4(hl4VarV2.a, br9.q(listBuilderS4), arrayListE, va5Var3);
        }
        ArrayList arrayList2 = new ArrayList();
        gl4 gl4Var3 = (gl4) a.q0(0, hl4VarV);
        gl4 gl4Var4 = (gl4) a.q0(0, hl4VarV2);
        int i8 = 1;
        int i9 = 1;
        while (gl4Var3 != null && gl4Var4 != null) {
            float f2 = i9 == hl4VarV.b.size() ? 1.0f : gl4Var3.d;
            float fU2 = i8 == hl4VarV2.b.size() ? 1.0f : dt2.u(va5Var2, va5Var, p29.d(gl4Var4.d + fU, 1.0f));
            float fMin = Math.min(f2, fU2);
            float f3 = 1.0E-6f + fMin;
            if (f2 > f3) {
                pairA = gl4Var3.a(fMin);
            } else {
                Pair pair2 = new Pair(gl4Var3, a.q0(i9, hl4VarV));
                i9++;
                pairA = pair2;
            }
            gl4 gl4Var5 = (gl4) pairA.a;
            gl4Var3 = (gl4) pairA.b;
            if (fU2 > f3) {
                pairA2 = gl4Var4.a(p29.d(dt2.u(va5Var, va5Var2, fMin) - fU, 1.0f));
            } else {
                Pair pair3 = new Pair(gl4Var4, a.q0(i8, hl4VarV2));
                i8++;
                pairA2 = pair3;
            }
            gl4 gl4Var6 = (gl4) pairA2.a;
            gl4Var4 = (gl4) pairA2.b;
            arrayList2.add(new Pair(gl4Var5.a, gl4Var6.a));
        }
        if (gl4Var3 != null || gl4Var4 != null) {
            throw new IllegalArgumentException("Expected both Polygon's Cubic to be fully matched");
        }
        this.a = arrayList2;
    }

    public void a(String str, String str2) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        js3.p(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        ry7.l(str);
        ry7.m(str2, str);
        ry7.j(this, str, str2);
    }

    public void b(String str) {
        int iK0 = f88.k0(':', 1, 4, str);
        if (iK0 != -1) {
            String strSubstring = str.substring(0, iK0);
            js3.o(strSubstring, "substring(...)");
            String strSubstring2 = str.substring(iK0 + 1);
            js3.o(strSubstring2, "substring(...)");
            c(strSubstring, strSubstring2);
            return;
        }
        if (str.charAt(0) != ':') {
            c("", str);
            return;
        }
        String strSubstring3 = str.substring(1);
        js3.o(strSubstring3, "substring(...)");
        c("", strSubstring3);
    }

    public void c(String str, String str2) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        js3.p(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        ry7.j(this, str, str2);
    }

    public void d(String str, String str2) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        js3.p(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        ry7.l(str);
        c(str, str2);
    }

    public by2 e() {
        return new by2((String[]) this.a.toArray(new String[0]));
    }

    public synchronized w67 f(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return th0.w;
        }
        for (eq8 eq8Var : this.a) {
            if (eq8Var.a.isAssignableFrom(cls) && cls2.isAssignableFrom(eq8Var.b)) {
                return eq8Var.c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public String g(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 2;
        int iK = wq2.K(size, 0, -2);
        if (iK > size) {
            return null;
        }
        while (!str.equalsIgnoreCase((String) arrayList.get(size))) {
            if (size == iK) {
                return null;
            }
            size -= 2;
        }
        return (String) arrayList.get(size + 1);
    }

    public synchronized ArrayList h(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (eq8 eq8Var : this.a) {
            if ((eq8Var.a.isAssignableFrom(cls) && cls2.isAssignableFrom(eq8Var.b)) && !arrayList.contains(eq8Var.b)) {
                arrayList.add(eq8Var.b);
            }
        }
        return arrayList;
    }

    public void i(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public void j(String str, String str2) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        js3.p(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        ry7.l(str);
        ry7.m(str2, str);
        i(str);
        ry7.j(this, str, str2);
    }

    public ay2(int i) {
        switch (i) {
            case 2:
                this.a = new ArrayList();
                break;
            default:
                this.a = new ArrayList(20);
                break;
        }
    }
}
