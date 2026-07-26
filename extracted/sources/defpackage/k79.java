package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class k79 {
    public final m79 a = new m79();

    public final void a(AutoCloseable autoCloseable, String str) {
        AutoCloseable autoCloseable2;
        m79 m79Var = this.a;
        if (m79Var != null) {
            if (m79Var.d) {
                m79.b(autoCloseable);
                return;
            }
            synchronized (m79Var.a) {
                autoCloseable2 = (AutoCloseable) m79Var.b.put(str, autoCloseable);
            }
            m79.b(autoCloseable2);
        }
    }

    public final void b() {
        m79 m79Var = this.a;
        if (m79Var != null && !m79Var.d) {
            m79Var.d = true;
            synchronized (m79Var.a) {
                try {
                    Iterator it = m79Var.b.values().iterator();
                    while (it.hasNext()) {
                        m79.b((AutoCloseable) it.next());
                    }
                    Iterator it2 = m79Var.c.iterator();
                    while (it2.hasNext()) {
                        m79.b((AutoCloseable) it2.next());
                    }
                    m79Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        m79 m79Var = this.a;
        if (m79Var == null) {
            return null;
        }
        synchronized (m79Var.a) {
            autoCloseable = (AutoCloseable) m79Var.b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
