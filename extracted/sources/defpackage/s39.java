package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s39 extends u39 implements Iterable, dx3 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final List i;
    public final List j;

    public s39(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = list;
        this.j = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof s39)) {
            s39 s39Var = (s39) obj;
            return js3.i(this.a, s39Var.a) && this.b == s39Var.b && this.c == s39Var.c && this.d == s39Var.d && this.e == s39Var.e && this.f == s39Var.f && this.g == s39Var.g && this.h == s39Var.h && js3.i(this.i, s39Var.i) && js3.i(this.j, s39Var.j);
        }
        return false;
    }

    public final int hashCode() {
        return this.j.hashCode() + rm7.i(dw1.g(this.h, dw1.g(this.g, dw1.g(this.f, dw1.g(this.e, dw1.g(this.d, dw1.g(this.c, dw1.g(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.i);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new t56(this);
    }
}
