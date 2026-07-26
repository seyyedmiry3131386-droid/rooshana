package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class s42 {
    public static final gv c = new gv(18);
    public static final LinkedHashMap d = new LinkedHashMap();
    public final ReentrantLock a;
    public final do3 b;

    public s42(String str, boolean z) {
        ReentrantLock reentrantLock;
        do3 do3Var;
        synchronized (c) {
            try {
                LinkedHashMap linkedHashMap = d;
                Object reentrantLock2 = linkedHashMap.get(str);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    linkedHashMap.put(str, reentrantLock2);
                }
                reentrantLock = (ReentrantLock) reentrantLock2;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = reentrantLock;
        if (z) {
            do3Var = new do3();
            do3Var.a = str.concat(".lck");
        } else {
            do3Var = null;
        }
        this.b = do3Var;
    }
}
