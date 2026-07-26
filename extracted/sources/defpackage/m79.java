package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class m79 {
    public final sl3 a = new sl3(26);
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashSet c = new LinkedHashSet();
    public volatile boolean d;

    public static void b(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                rm7.x(autoCloseable);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final void a(AutoCloseable autoCloseable) {
        if (this.d) {
            b(autoCloseable);
            return;
        }
        synchronized (this.a) {
            this.c.add(autoCloseable);
        }
    }
}
