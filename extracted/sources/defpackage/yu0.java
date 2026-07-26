package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yu0 extends xu0 {
    public static void X(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void Y(List list, Comparator comparator) {
        js3.p(list, "<this>");
        js3.p(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
