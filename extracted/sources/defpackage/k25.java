package defpackage;

import android.net.Uri;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class k25 implements vs1 {
    public final f85 a;

    public k25(f85 f85Var) {
        js3.p(f85Var, "urlCaching");
        this.a = f85Var;
    }

    @Override // defpackage.vs1
    public final us1 a(bs1 bs1Var) {
        js3.p(bs1Var, "downloadInfo");
        es1 es1Var = (es1) bs1Var;
        String str = es1Var.d;
        js3.o(str, "getKey(...)");
        f85 f85Var = this.a;
        f85Var.getClass();
        LinkedHashMap linkedHashMap = f85Var.a;
        String strU0 = (String) linkedHashMap.get(str);
        if (strU0 == null) {
            String str2 = es1Var.b;
            strU0 = str2 != null ? f88.u0(str2, "/") : null;
        }
        String queryParameter = Uri.parse(strU0).getQueryParameter("tag");
        String queryParameter2 = Uri.parse(es1Var.b).getQueryParameter("tag");
        linkedHashMap.remove(str);
        String str3 = m88.T(queryParameter, queryParameter2, true) ? null : es1Var.c;
        us1 us1Var = new us1();
        us1Var.c = null;
        us1Var.a = strU0;
        us1Var.b = str3;
        return us1Var;
    }
}
