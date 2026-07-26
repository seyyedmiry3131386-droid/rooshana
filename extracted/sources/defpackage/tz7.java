package defpackage;

import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class tz7 implements Iterator {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public Iterator d;
    public final /* synthetic */ AbstractMap e;

    public /* synthetic */ tz7(AbstractMap abstractMap, int i) {
        this.a = i;
        this.e = abstractMap;
        this.b = -1;
    }

    public Iterator a() {
        switch (this.a) {
            case 0:
                if (this.d == null) {
                    this.d = ((nz7) this.e).c.entrySet().iterator();
                }
                break;
            default:
                if (this.d == null) {
                    this.d = ((oz7) this.e).b.entrySet().iterator();
                }
                break;
        }
        return this.d;
    }

    public Iterator b() {
        if (this.d == null) {
            this.d = ((nt9) this.e).c.entrySet().iterator();
        }
        return this.d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                int i = this.b + 1;
                nz7 nz7Var = (nz7) this.e;
                if (i >= nz7Var.b.size()) {
                    return !nz7Var.c.isEmpty() && a().hasNext();
                }
                return true;
            case 1:
                int i2 = this.b + 1;
                oz7 oz7Var = (oz7) this.e;
                if (i2 >= oz7Var.a.size()) {
                    return !oz7Var.b.isEmpty() && a().hasNext();
                }
                return true;
            default:
                int i3 = this.b + 1;
                nt9 nt9Var = (nt9) this.e;
                if (i3 >= nt9Var.b) {
                    return !nt9Var.c.isEmpty() && b().hasNext();
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                this.c = true;
                int i = this.b + 1;
                this.b = i;
                nz7 nz7Var = (nz7) this.e;
                return i < nz7Var.b.size() ? (Map.Entry) nz7Var.b.get(this.b) : (Map.Entry) a().next();
            case 1:
                this.c = true;
                int i2 = this.b + 1;
                this.b = i2;
                oz7 oz7Var = (oz7) this.e;
                return i2 < oz7Var.a.size() ? (Map.Entry) oz7Var.a.get(this.b) : (Map.Entry) a().next();
            default:
                this.c = true;
                int i3 = this.b + 1;
                this.b = i3;
                nt9 nt9Var = (nt9) this.e;
                return i3 < nt9Var.b ? (ot9) nt9Var.a[i3] : (Map.Entry) b().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        AbstractMap abstractMap = this.e;
        switch (i) {
            case 0:
                nz7 nz7Var = (nz7) abstractMap;
                if (!this.c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.c = false;
                int i2 = nz7.g;
                nz7Var.b();
                if (this.b >= nz7Var.b.size()) {
                    a().remove();
                    return;
                }
                int i3 = this.b;
                this.b = i3 - 1;
                nz7Var.g(i3);
                return;
            case 1:
                oz7 oz7Var = (oz7) abstractMap;
                if (!this.c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.c = false;
                int i4 = oz7.f;
                oz7Var.b();
                if (this.b >= oz7Var.a.size()) {
                    a().remove();
                    return;
                }
                int i5 = this.b;
                this.b = i5 - 1;
                oz7Var.h(i5);
                return;
            default:
                if (!this.c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.c = false;
                nt9 nt9Var = (nt9) abstractMap;
                nt9Var.f();
                int i6 = this.b;
                if (i6 >= nt9Var.b) {
                    b().remove();
                    return;
                } else {
                    this.b = i6 - 1;
                    nt9Var.d(i6);
                    return;
                }
        }
    }

    public /* synthetic */ tz7(nt9 nt9Var) {
        this.a = 2;
        Objects.requireNonNull(nt9Var);
        this.e = nt9Var;
        this.b = -1;
    }
}
