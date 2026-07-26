package defpackage;

import android.os.Looper;
import de.greenrobot.event.EventBusException;
import io.sentry.android.core.t0;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class t32 {
    public static volatile t32 p;
    public static final v32 q = new v32();
    public static final HashMap r = new HashMap();
    public final ga8 h;
    public final ExecutorService i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final mi d = new mi(3);
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final tw2 e = new tw2(this, Looper.getMainLooper());
    public final a50 f = new a50(this);
    public final g6 g = new g6(this);

    public t32(v32 v32Var) {
        v32Var.getClass();
        this.h = new ga8();
        this.k = true;
        this.l = true;
        this.m = true;
        this.n = v32Var.a;
        this.j = v32Var.b;
        this.o = true;
        this.i = v32Var.c;
    }

    public static void a(ArrayList arrayList, Class[] clsArr) {
        for (Class cls : clsArr) {
            if (!arrayList.contains(cls)) {
                arrayList.add(cls);
                a(arrayList, cls.getInterfaces());
            }
        }
    }

    public static t32 b() {
        if (p == null) {
            synchronized (t32.class) {
                try {
                    if (p == null) {
                        p = new t32(q);
                    }
                } finally {
                }
            }
        }
        return p;
    }

    public static List f(Class cls) {
        List list;
        HashMap map = r;
        synchronized (map) {
            try {
                List list2 = (List) map.get(cls);
                list = list2;
                if (list2 == null) {
                    ArrayList arrayList = new ArrayList();
                    for (Class superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                        arrayList.add(superclass);
                        a(arrayList, superclass.getInterfaces());
                    }
                    r.put(cls, arrayList);
                    list = arrayList;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return list;
    }

    public final boolean c() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        List listF = f(u86.class);
        int size = listF.size();
        for (int i = 0; i < size; i++) {
            Class cls = (Class) listF.get(i);
            synchronized (this) {
                copyOnWriteArrayList = (CopyOnWriteArrayList) this.a.get(cls);
            }
            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void d(p46 p46Var) {
        Object obj = p46Var.a;
        ha8 ha8Var = p46Var.b;
        p46Var.a = null;
        p46Var.b = null;
        p46Var.c = null;
        ArrayList arrayList = p46.d;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 10000) {
                    arrayList.add(p46Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (ha8Var.c) {
            e(ha8Var, obj);
        }
    }

    public final void e(ha8 ha8Var, Object obj) {
        try {
            ha8Var.b.a.invoke(ha8Var.a, obj);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unexpected exception", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            boolean z = obj instanceof ea8;
            boolean z2 = this.k;
            if (!z) {
                if (this.j) {
                    throw new EventBusException("Invoking subscriber failed", cause);
                }
                if (z2) {
                    t0.e("Event", "Could not dispatch event: " + obj.getClass() + " to subscribing class " + ha8Var.a.getClass(), cause);
                }
                if (this.m) {
                    g(new ea8(cause, obj, ha8Var.a));
                    return;
                }
                return;
            }
            if (z2) {
                t0.e("Event", "SubscriberExceptionEvent subscriber " + ha8Var.a.getClass() + " threw an exception", cause);
                ea8 ea8Var = (ea8) obj;
                t0.e("Event", "Initial event " + ea8Var.b + " caused exception in " + ea8Var.c, ea8Var.a);
            }
        }
    }

    public final void g(Object obj) {
        s32 s32Var = (s32) this.d.get();
        ArrayList arrayList = s32Var.a;
        arrayList.add(obj);
        if (s32Var.b) {
            return;
        }
        s32Var.c = Looper.getMainLooper() == Looper.myLooper();
        s32Var.b = true;
        while (!arrayList.isEmpty()) {
            try {
                h(arrayList.remove(0), s32Var);
            } finally {
                s32Var.b = false;
                s32Var.c = false;
            }
        }
    }

    public final void h(Object obj, s32 s32Var) {
        boolean zI;
        Class<?> cls = obj.getClass();
        if (this.o) {
            List listF = f(cls);
            int size = listF.size();
            zI = false;
            for (int i = 0; i < size; i++) {
                zI |= i(obj, s32Var, (Class) listF.get(i));
            }
        } else {
            zI = i(obj, s32Var, cls);
        }
        if (zI) {
            return;
        }
        if (this.l) {
            cls.toString();
        }
        if (!this.n || cls == zn5.class || cls == ea8.class) {
            return;
        }
        g(new zn5(obj));
    }

    public final boolean i(Object obj, s32 s32Var, Class cls) {
        CopyOnWriteArrayList<ha8> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = (CopyOnWriteArrayList) this.a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (ha8 ha8Var : copyOnWriteArrayList) {
            s32Var.d = obj;
            k(ha8Var, obj, s32Var.c);
        }
        return true;
    }

    public final void j(Object obj) {
        synchronized (this.c) {
            this.c.put(obj.getClass(), obj);
        }
        g(obj);
    }

    public final void k(ha8 ha8Var, Object obj, boolean z) {
        int iOrdinal = ha8Var.b.b.ordinal();
        if (iOrdinal == 0) {
            e(ha8Var, obj);
            return;
        }
        if (iOrdinal == 1) {
            if (z) {
                e(ha8Var, obj);
                return;
            } else {
                this.e.a(ha8Var, obj);
                return;
            }
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                throw new IllegalStateException("Unknown thread mode: " + ha8Var.b.b);
            }
            g6 g6Var = this.g;
            g6Var.getClass();
            ((nc2) g6Var.b).n(p46.a(ha8Var, obj));
            ((t32) g6Var.c).i.execute(g6Var);
            return;
        }
        if (!z) {
            e(ha8Var, obj);
            return;
        }
        a50 a50Var = this.f;
        a50Var.getClass();
        p46 p46VarA = p46.a(ha8Var, obj);
        synchronized (a50Var) {
            try {
                a50Var.a.n(p46VarA);
                if (!a50Var.c) {
                    a50Var.c = true;
                    a50Var.b.i.execute(a50Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void l(Object obj, boolean z) {
        Iterator it = this.h.b(obj.getClass()).iterator();
        while (it.hasNext()) {
            n(obj, (fa8) it.next(), z);
        }
    }

    public final void m(Object obj) {
        synchronized (this.c) {
            try {
                Class<?> cls = obj.getClass();
                if (obj.equals(this.c.get(cls))) {
                    this.c.remove(cls);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(Object obj, fa8 fa8Var, boolean z) {
        Object value;
        Class cls = fa8Var.c;
        HashMap map = this.a;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) map.get(cls);
        ha8 ha8Var = new ha8(obj, fa8Var);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            map.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(ha8Var)) {
            throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        int i = 0;
        while (true) {
            if (i > size) {
                break;
            }
            if (i == size) {
                copyOnWriteArrayList.add(i, ha8Var);
                break;
            } else {
                ((ha8) copyOnWriteArrayList.get(i)).getClass();
                i++;
            }
        }
        HashMap map2 = this.b;
        List arrayList = (List) map2.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map2.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (z) {
            boolean z2 = this.o;
            ConcurrentHashMap concurrentHashMap = this.c;
            if (!z2) {
                Object obj2 = concurrentHashMap.get(cls);
                if (obj2 != null) {
                    k(ha8Var, obj2, Looper.getMainLooper() == Looper.myLooper());
                    return;
                }
                return;
            }
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                if (cls.isAssignableFrom((Class) entry.getKey()) && (value = entry.getValue()) != null) {
                    k(ha8Var, value, Looper.getMainLooper() == Looper.myLooper());
                }
            }
        }
    }

    public final synchronized void o(Object obj) {
        try {
            List list = (List) this.b.get(obj);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    List list2 = (List) this.a.get((Class) it.next());
                    if (list2 != null) {
                        int size = list2.size();
                        int i = 0;
                        while (i < size) {
                            ha8 ha8Var = (ha8) list2.get(i);
                            if (ha8Var.a == obj) {
                                ha8Var.c = false;
                                list2.remove(i);
                                i--;
                                size--;
                            }
                            i++;
                        }
                    }
                }
                this.b.remove(obj);
            } else {
                t0.m("Event", "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
