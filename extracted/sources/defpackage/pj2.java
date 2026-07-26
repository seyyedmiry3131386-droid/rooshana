package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class pj2 extends b57 {
    public static final dt4 d;
    public final List b;
    public final List c;

    static {
        Regex regex = dt4.e;
        d = ok4.A("application/x-www-form-urlencoded");
    }

    public pj2(ArrayList arrayList, ArrayList arrayList2) {
        js3.p(arrayList, "encodedNames");
        js3.p(arrayList2, "encodedValues");
        this.b = ih9.j(arrayList);
        this.c = ih9.j(arrayList2);
    }

    @Override // defpackage.b57
    public final long a() {
        return e(null, true);
    }

    @Override // defpackage.b57
    public final dt4 b() {
        return d;
    }

    @Override // defpackage.b57
    public final void d(oh0 oh0Var) {
        e(oh0Var, false);
    }

    public final long e(oh0 oh0Var, boolean z) {
        gh0 gh0VarH;
        if (z) {
            gh0VarH = new gh0();
        } else {
            js3.m(oh0Var);
            gh0VarH = oh0Var.h();
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                gh0VarH.R0(38);
            }
            gh0VarH.h1((String) list.get(i));
            gh0VarH.R0(61);
            gh0VarH.h1((String) this.c.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = gh0VarH.b;
        gh0VarH.b();
        return j;
    }
}
