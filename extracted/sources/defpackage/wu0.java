package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wu0 extends br9 {
    public static int V(Iterable iterable, int i) {
        js3.p(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static ArrayList W(List list) {
        js3.p(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a.b0((Iterable) it.next(), arrayList);
        }
        return arrayList;
    }
}
