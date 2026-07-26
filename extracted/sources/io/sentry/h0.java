package io.sentry;

import io.sentry.util.AutoClosableReentrantLock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 {
    public static final HashMap i;
    public final HashMap a = new HashMap();
    public final ArrayList b = new ArrayList();
    public final AutoClosableReentrantLock c = new AutoClosableReentrantLock();
    public a d = null;
    public a e = null;
    public a f = null;
    public a g = null;
    public u3 h = null;

    static {
        HashMap map = new HashMap();
        i = map;
        map.put("boolean", Boolean.class);
        map.put("char", Character.class);
        map.put("byte", Byte.class);
        map.put("short", Short.class);
        map.put("int", Integer.class);
        map.put("long", Long.class);
        map.put("float", Float.class);
        map.put("double", Double.class);
    }

    public final void a() {
        r rVarA = this.c.a();
        try {
            Iterator it = this.a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getKey() == null || !((String) entry.getKey()).startsWith("sentry:")) {
                    it.remove();
                }
            }
            rVarA.close();
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final Object b(String str) {
        r rVarA = this.c.a();
        try {
            Object obj = this.a.get(str);
            rVarA.close();
            return obj;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final Object c(String str, Class cls) {
        r rVarA = this.c.a();
        try {
            Object obj = this.a.get(str);
            if (cls.isInstance(obj)) {
                rVarA.close();
                return obj;
            }
            Class cls2 = (Class) i.get(cls.getCanonicalName());
            if (obj != null && cls.isPrimitive() && cls2 != null) {
                if (cls2.isInstance(obj)) {
                    rVarA.close();
                    return obj;
                }
            }
            rVarA.close();
            return null;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void d(Object obj, String str) {
        r rVarA = this.c.a();
        try {
            this.a.put(str, obj);
            rVarA.close();
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
