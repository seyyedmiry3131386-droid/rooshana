package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class gp8 {
    public int e;
    public int f;
    public int g;
    public int h;
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public int j = Integer.MAX_VALUE;
    public boolean k = true;
    public boolean l = true;
    public ImmutableList m = ImmutableList.q();
    public ImmutableList n = ImmutableList.q();
    public int o = 0;
    public ImmutableList p = ImmutableList.q();
    public int q = 0;
    public int r = Integer.MAX_VALUE;
    public int s = Integer.MAX_VALUE;
    public ImmutableList t = ImmutableList.q();
    public fp8 u = fp8.d;
    public ImmutableList v = ImmutableList.q();
    public int w = 0;
    public boolean x = true;
    public int y = 0;
    public boolean z = false;
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;
    public HashMap D = new HashMap();
    public HashSet E = new HashSet();

    public static ImmutableList f(String[] strArr) {
        lj3 lj3VarM = ImmutableList.m();
        for (String str : strArr) {
            str.getClass();
            lj3VarM.O(j29.W(str));
        }
        return lj3VarM.S();
    }

    public void a(ep8 ep8Var) {
        this.D.put(ep8Var.a, ep8Var);
    }

    public hp8 b() {
        return new hp8(this);
    }

    public gp8 c() {
        this.D.clear();
        return this;
    }

    public gp8 d(int i) {
        Iterator it = this.D.values().iterator();
        while (it.hasNext()) {
            if (((ep8) it.next()).a.c == i) {
                it.remove();
            }
        }
        return this;
    }

    public final void e(hp8 hp8Var) {
        this.a = hp8Var.a;
        this.b = hp8Var.b;
        this.c = hp8Var.c;
        this.d = hp8Var.d;
        this.e = hp8Var.e;
        this.f = hp8Var.f;
        this.g = hp8Var.g;
        this.h = hp8Var.h;
        this.i = hp8Var.i;
        this.j = hp8Var.j;
        this.k = hp8Var.k;
        this.l = hp8Var.l;
        this.m = hp8Var.m;
        this.n = hp8Var.n;
        this.o = hp8Var.o;
        this.p = hp8Var.p;
        this.q = hp8Var.q;
        this.r = hp8Var.r;
        this.s = hp8Var.s;
        this.t = hp8Var.t;
        this.u = hp8Var.u;
        this.v = hp8Var.v;
        this.w = hp8Var.w;
        this.x = hp8Var.x;
        this.y = hp8Var.y;
        this.z = hp8Var.z;
        this.A = hp8Var.A;
        this.B = hp8Var.B;
        this.C = hp8Var.C;
        this.E = new HashSet(hp8Var.E);
        this.D = new HashMap(hp8Var.D);
    }

    public gp8 g() {
        this.y = -3;
        return this;
    }

    public gp8 h(ep8 ep8Var) {
        yo8 yo8Var = ep8Var.a;
        d(yo8Var.c);
        this.D.put(yo8Var, ep8Var);
        return this;
    }

    public gp8 i(String... strArr) {
        this.p = f(strArr);
        return this;
    }

    public gp8 j(String str) {
        return str == null ? k(new String[0]) : k(str);
    }

    public gp8 k(String... strArr) {
        this.v = f(strArr);
        this.x = false;
        return this;
    }

    public gp8 l() {
        this.w = 0;
        this.x = false;
        return this;
    }

    public gp8 m(int i, boolean z) {
        if (z) {
            this.E.add(Integer.valueOf(i));
            return this;
        }
        this.E.remove(Integer.valueOf(i));
        return this;
    }
}
