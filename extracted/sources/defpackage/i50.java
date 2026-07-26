package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i50 {
    public CopyOnWriteArrayList a;

    public static void a(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw bl4.o(it);
        }
    }
}
