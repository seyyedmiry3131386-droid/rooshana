package defpackage;

import android.content.Intent;
import android.util.Log;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.fragments.base.BaseNavigationFragment;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class dr3 {
    public int a;
    public int b;
    public final Object c;
    public final Object d;
    public final Cloneable e;
    public Object f;

    public dr3(int i) {
        this.c = new nc2(5);
        this.d = new ig4(0);
        this.e = new HashMap();
        this.f = new HashMap();
        this.a = i;
    }

    public synchronized void a() {
        c(0);
    }

    public void b(int i, Class cls) {
        NavigableMap navigableMapG = g(cls);
        Integer num = (Integer) navigableMapG.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapG.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapG.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public void c(int i) {
        String str;
        while (this.b > i) {
            Object objC = ((nc2) this.c).C();
            ok4.o(objC);
            ti0 ti0VarE = e(objC.getClass());
            this.b -= ti0VarE.b() * ti0VarE.a(objC);
            b(ti0VarE.a(objC), objC.getClass());
            switch (ti0VarE.a) {
                case 0:
                    str = "ByteArrayPool";
                    break;
                default:
                    str = "IntegerArrayPool";
                    break;
            }
            if (Log.isLoggable(str, 2)) {
                ti0VarE.a(objC);
            }
        }
    }

    public synchronized Object d(int i, Class cls) {
        hg4 hg4Var;
        int i2;
        try {
            Integer num = (Integer) g(cls).ceilingKey(Integer.valueOf(i));
            if (num == null || ((i2 = this.b) != 0 && this.a / i2 < 2 && num.intValue() > i * 8)) {
                ig4 ig4Var = (ig4) this.d;
                uh6 uh6VarC = (uh6) ((ArrayDeque) ig4Var.b).poll();
                if (uh6VarC == null) {
                    uh6VarC = ig4Var.C();
                }
                hg4Var = (hg4) uh6VarC;
                hg4Var.b = i;
                hg4Var.c = cls;
            } else {
                ig4 ig4Var2 = (ig4) this.d;
                int iIntValue = num.intValue();
                uh6 uh6VarC2 = (uh6) ((ArrayDeque) ig4Var2.b).poll();
                if (uh6VarC2 == null) {
                    uh6VarC2 = ig4Var2.C();
                }
                hg4Var = (hg4) uh6VarC2;
                hg4Var.b = iIntValue;
                hg4Var.c = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f(hg4Var, cls);
    }

    public ti0 e(Class cls) {
        ti0 ti0Var;
        HashMap map = (HashMap) this.f;
        ti0 ti0Var2 = (ti0) map.get(cls);
        if (ti0Var2 != null) {
            return ti0Var2;
        }
        if (cls.equals(int[].class)) {
            ti0Var = new ti0(1);
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            ti0Var = new ti0(0);
        }
        map.put(cls, ti0Var);
        return ti0Var;
    }

    public Object f(hg4 hg4Var, Class cls) {
        ti0 ti0VarE = e(cls);
        Object objP = ((nc2) this.c).p(hg4Var);
        if (objP != null) {
            this.b -= ti0VarE.b() * ti0VarE.a(objP);
            b(ti0VarE.a(objP), cls);
        }
        if (objP != null) {
            return objP;
        }
        int i = hg4Var.b;
        switch (ti0VarE.a) {
            case 0:
                return new byte[i];
            default:
                return new int[i];
        }
    }

    public NavigableMap g(Class cls) {
        HashMap map = (HashMap) this.e;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    public boolean h(int i) {
        int i2 = 1 << i;
        return (this.a & i2) == i2;
    }

    public synchronized void i(Object obj) {
        Class<?> cls = obj.getClass();
        ti0 ti0VarE = e(cls);
        int iA = ti0VarE.a(obj);
        int iB = ti0VarE.b() * iA;
        if (iB <= this.a / 2) {
            ig4 ig4Var = (ig4) this.d;
            uh6 uh6VarC = (uh6) ((ArrayDeque) ig4Var.b).poll();
            if (uh6VarC == null) {
                uh6VarC = ig4Var.C();
            }
            hg4 hg4Var = (hg4) uh6VarC;
            hg4Var.b = iA;
            hg4Var.c = cls;
            ((nc2) this.c).z(hg4Var, obj);
            NavigableMap navigableMapG = g(cls);
            Integer num = (Integer) navigableMapG.get(Integer.valueOf(hg4Var.b));
            Integer numValueOf = Integer.valueOf(hg4Var.b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapG.put(numValueOf, Integer.valueOf(iIntValue));
            this.b += iB;
            c(this.a);
        }
    }

    public synchronized void j(int i) {
        try {
            if (i >= 40) {
                a();
            } else if (i >= 20 || i == 15) {
                c(this.a / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public dr3(NavIntentDirections navIntentDirections, int i, boolean z) {
        this.b = -1;
        this.c = navIntentDirections;
        this.a = 64;
        this.b = z ? -1 : i;
    }

    public dr3(NavIntentDirections navIntentDirections) {
        this.b = -1;
        this.c = navIntentDirections;
        this.a = 64;
    }

    public dr3(BaseNavigationFragment baseNavigationFragment) {
        this.b = -1;
        this.d = baseNavigationFragment;
        this.a = 16;
    }

    public dr3(Intent intent) {
        this.b = -1;
        this.e = intent;
        this.a = 4;
    }
}
