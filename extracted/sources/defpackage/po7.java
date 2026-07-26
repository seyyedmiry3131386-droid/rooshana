package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes3.dex */
public final class po7 implements no7, yk0 {
    public final String a;
    public final o37 b;
    public final int c;
    public final List d;
    public final HashSet e;
    public final String[] f;
    public final no7[] g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;
    public final no7[] k;
    public final c24 l;

    public po7(String str, o37 o37Var, int i, List list, qs0 qs0Var) {
        js3.p(str, "serialName");
        js3.p(list, "typeParameters");
        this.a = str;
        this.b = o37Var;
        this.c = i;
        this.d = qs0Var.b;
        ArrayList arrayList = qs0Var.c;
        js3.p(arrayList, "<this>");
        HashSet hashSet = new HashSet(b.L(wu0.V(arrayList, 12)));
        a.M0(arrayList, hashSet);
        this.e = hashSet;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f = strArr;
        this.g = yq2.P(qs0Var.e);
        this.h = (List[]) qs0Var.f.toArray(new List[0]);
        this.i = a.L0(qs0Var.g);
        js3.p(strArr, "<this>");
        cw cwVar = new cw(2, new x2(8, strArr));
        ArrayList arrayList2 = new ArrayList(wu0.V(cwVar, 10));
        Iterator it = cwVar.iterator();
        while (true) {
            cx1 cx1Var = (cx1) it;
            if (!cx1Var.b.hasNext()) {
                this.j = b.S(arrayList2);
                this.k = yq2.P(list);
                this.l = kotlin.a.a(new o06(27, this));
                return;
            }
            pm3 pm3Var = (pm3) cx1Var.next();
            arrayList2.add(new Pair(pm3Var.b, Integer.valueOf(pm3Var.a)));
        }
    }

    @Override // defpackage.no7
    public final String a() {
        return this.a;
    }

    @Override // defpackage.yk0
    public final Set b() {
        return this.e;
    }

    @Override // defpackage.no7
    public final boolean c() {
        return false;
    }

    @Override // defpackage.no7
    public final int d(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        Integer num = (Integer) this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.no7
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof po7) {
            no7 no7Var = (no7) obj;
            if (js3.i(this.a, no7Var.a()) && Arrays.equals(this.k, ((po7) obj).k)) {
                int iE = no7Var.e();
                int i = this.c;
                if (i == iE) {
                    for (int i2 = 0; i2 < i; i2++) {
                        no7[] no7VarArr = this.g;
                        if (js3.i(no7VarArr[i2].a(), no7Var.h(i2).a()) && js3.i(no7VarArr[i2].getKind(), no7Var.h(i2).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.no7
    public final String f(int i) {
        return this.f[i];
    }

    @Override // defpackage.no7
    public final List g(int i) {
        return this.h[i];
    }

    @Override // defpackage.no7
    public final List getAnnotations() {
        return this.d;
    }

    @Override // defpackage.no7
    public final o37 getKind() {
        return this.b;
    }

    @Override // defpackage.no7
    public final no7 h(int i) {
        return this.g[i];
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // defpackage.no7
    public final boolean i(int i) {
        return this.i[i];
    }

    @Override // defpackage.no7
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return xq2.M(this);
    }
}
