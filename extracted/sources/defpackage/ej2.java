package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class ej2 {
    public final ArrayList a;

    public ej2(dj2... dj2VarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (dj2VarArr.length > 0) {
            dj2 dj2Var = dj2VarArr[0];
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() != 1) {
                throw new IllegalArgumentException(bl4.y(t61.n("'", str, "' must be unique. Actual [ ["), a.t0(list, null, null, null, null, 63), ']').toString());
            }
            a.b0(list, arrayList);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.a = arrayList2;
        if (arrayList2.size() > 0) {
            throw rm7.l(0, arrayList2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ej2) {
            return js3.i(this.a, ((ej2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
