package defpackage;

import io.sentry.android.core.t0;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class qd4 {
    public static final od4 a = new od4();

    public static void a() {
        a.getClass();
    }

    public static void b(String str) {
        a.getClass();
        HashSet hashSet = od4.a;
        if (hashSet.contains(str)) {
            return;
        }
        t0.n("LOTTIE", str, null);
        hashSet.add(str);
    }

    public static void c(String str, Throwable th) {
        a.getClass();
        HashSet hashSet = od4.a;
        if (hashSet.contains(str)) {
            return;
        }
        t0.n("LOTTIE", str, th);
        hashSet.add(str);
    }
}
