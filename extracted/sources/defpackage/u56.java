package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class u56 extends s1 {
    public final /* synthetic */ int a;
    public final r1 b;

    public /* synthetic */ u56(r1 r1Var, int i) {
        this.a = i;
        this.b = r1Var;
    }

    @Override // defpackage.s1
    public final int a() {
        switch (this.a) {
            case 0:
                return ((n56) this.b).c();
            default:
                return ((i66) this.b).c();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.a) {
            case 0:
                ((n56) this.b).clear();
                break;
            default:
                ((i66) this.b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                return ((n56) this.b).containsKey(obj);
            default:
                return ((i66) this.b).d.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                n56 n56Var = (n56) this.b;
                js3.p(n56Var, "builder");
                qs8[] qs8VarArr = new qs8[8];
                for (int i = 0; i < 8; i++) {
                    qs8VarArr[i] = new rs8(1);
                }
                return new v56(n56Var, qs8VarArr);
            default:
                return new j66((i66) this.b, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                n56 n56Var = (n56) this.b;
                if (n56Var.containsKey(obj)) {
                    n56Var.remove(obj);
                }
                break;
            default:
                i66 i66Var = (i66) this.b;
                if (i66Var.d.containsKey(obj)) {
                    i66Var.remove(obj);
                }
                break;
        }
        return true;
    }
}
