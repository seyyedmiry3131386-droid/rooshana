package defpackage;

import com.google.firebase.concurrent.UiExecutor;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class u32 implements da8, vn6 {
    public final HashMap a;
    public ArrayDeque b;
    public final UiExecutor c;

    public u32() {
        UiExecutor uiExecutor = UiExecutor.a;
        this.a = new HashMap();
        this.b = new ArrayDeque();
        this.c = uiExecutor;
    }

    public final synchronized void a(Executor executor, w32 w32Var) {
        try {
            executor.getClass();
            if (!this.a.containsKey(ja1.class)) {
                this.a.put(ja1.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.a.get(ja1.class)).put(w32Var, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
