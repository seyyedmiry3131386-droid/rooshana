package ir.mservices.market.version2.ui.recycler.filter;

import defpackage.wu0;
import ir.mservices.market.version2.ui.recycler.filter.FilterCondition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static GeneralFilter a(List list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList(wu0.V(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new FilterCondition.SimpleCondition((String) it.next()));
            }
        } else {
            arrayList = null;
        }
        return b(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ir.mservices.market.version2.ui.recycler.filter.GeneralFilter b(java.util.List r4) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.version2.ui.recycler.filter.a.b(java.util.List):ir.mservices.market.version2.ui.recycler.filter.GeneralFilter");
    }
}
