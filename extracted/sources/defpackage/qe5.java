package defpackage;

import android.content.Context;
import ir.myket.persistent.datasource.a;
import ir.myket.persistent.datasource.b;
import ir.myket.theme.common.colors.models.UiMode;
import j$.util.DesugarCollections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Pair;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class qe5 implements hr3 {
    public final Context a;
    public final by2 b;
    public final a c;
    public final qu2 d;
    public final vo e;

    public qe5(Context context, by2 by2Var, a aVar, qu2 qu2Var, vo voVar) {
        this.a = context;
        this.b = by2Var;
        this.c = aVar;
        this.d = qu2Var;
        this.e = voVar;
    }

    @Override // defpackage.hr3
    public final g77 a(cw6 cw6Var) {
        w47 w47Var = cw6Var.e;
        se3 se3Var = w47Var.a;
        Regex regex = te3.a;
        js3.p(se3Var, "<this>");
        if (!te3.a.f(se3Var.d)) {
            return cw6Var.b(w47Var);
        }
        ir.myket.common.utils.a.a.getClass();
        String lowerCase = ir.myket.common.utils.a.a(this.a).name().toLowerCase(Locale.ROOT);
        js3.o(lowerCase, "toLowerCase(...)");
        a aVar = this.c;
        xj8 xj8VarE = t17.e(aVar);
        ay2 ay2VarD = w47Var.c.d();
        b bVar = aVar.e;
        ox3[] ox3VarArr = a.n;
        char c = 3;
        String str = (String) bVar.a(aVar, ox3VarArr[3]);
        String lowerCase2 = null;
        if (str != null) {
            if (f88.n0(str)) {
                str = null;
            }
            if (str != null) {
                ay2VarD.j("Myket-SessionId", str);
            }
        }
        Boolean bool = (Boolean) aVar.k.a(aVar, ox3VarArr[10]);
        if (bool != null) {
            ay2VarD.j("X-Child-Mode", bool.booleanValue() ? "on" : "off");
        }
        String strC = this.d.c();
        if (f88.n0(strC)) {
            strC = null;
        }
        if (strC != null) {
            ay2VarD.j("X-Google-Ad-Id", strC);
        }
        by2 by2VarE = ay2VarD.e();
        rb4 rb4VarB = w47Var.b();
        ay2 ay2VarD2 = by2VarE.d();
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        js3.o(comparator, "CASE_INSENSITIVE_ORDER");
        TreeSet treeSet = new TreeSet(comparator);
        by2 by2Var = this.b;
        int size = by2Var.size();
        int i = 0;
        while (i < size) {
            treeSet.add(by2Var.c(i));
            i++;
            c = c;
        }
        char c2 = c;
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(treeSet);
        js3.o(setUnmodifiableSet, "unmodifiableSet(...)");
        Iterator it = setUnmodifiableSet.iterator();
        while (it.hasNext()) {
            ay2VarD2.i((String) it.next());
        }
        int size2 = by2Var.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ry7.j(ay2VarD2, by2Var.c(i2), by2Var.f(i2));
        }
        rb4VarB.C(ay2VarD2.e());
        rb4VarB.F(w47Var.b, w47Var.d);
        String str2 = se3Var.i;
        Pair pair = new Pair(this.e.b.equalsIgnoreCase("tv") ? "myketTvVersion" : "myketVersion", String.valueOf(1028));
        Pair pair2 = new Pair("lang", lowerCase);
        UiMode uiMode = xj8VarE.b;
        uiMode.getClass();
        Pair pair3 = new Pair("theme", ex8.a[uiMode.ordinal()] == 1 ? "night" : "default");
        String strD = g27.a(xj8VarE.a.getClass()).d();
        if (strD != null) {
            lowerCase2 = strD.toLowerCase(Locale.ROOT);
            js3.o(lowerCase2, "toLowerCase(...)");
        }
        if (lowerCase2 == null) {
            lowerCase2 = "";
        }
        Pair pair4 = new Pair("style", lowerCase2);
        Pair[] pairArr = new Pair[4];
        pairArr[0] = pair;
        pairArr[1] = pair2;
        pairArr[2] = pair3;
        pairArr[c2] = pair4;
        rb4VarB.P(js8.k(kotlin.collections.b.N(pairArr), str2));
        return cw6Var.b(new w47(rb4VarB));
    }
}
