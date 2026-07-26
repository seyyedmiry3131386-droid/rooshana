package defpackage;

import java.util.List;
import java.util.ListIterator;
import kotlin.collections.a;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: loaded from: classes3.dex */
public final class s87 implements ListIterator, dx3 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final /* synthetic */ Object c;

    public s87(gj4 gj4Var, int i) {
        this.c = gj4Var;
        this.b = ((List) gj4Var.b).listIterator(a.a0(i, gj4Var));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.a) {
            case 0:
                ListIterator listIterator = (ListIterator) this.b;
                listIterator.add(obj);
                listIterator.previous();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            default:
                if (((Ref$IntRef) this.b).a < ((o98) this.c).d - 1) {
                }
                break;
        }
        return ((ListIterator) this.b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            default:
                if (((Ref$IntRef) this.b).a >= 0) {
                }
                break;
        }
        return ((ListIterator) this.b).hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return ((ListIterator) this.b).previous();
            case 1:
                return ((ListIterator) this.b).previous();
            default:
                Ref$IntRef ref$IntRef = (Ref$IntRef) this.b;
                int i = ref$IntRef.a + 1;
                o98 o98Var = (o98) this.c;
                hs9.p(i, o98Var.d);
                ref$IntRef.a = i;
                return o98Var.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.a) {
            case 0:
                t87 t87Var = (t87) this.c;
                return br9.y(t87Var) - ((ListIterator) this.b).previousIndex();
            case 1:
                gj4 gj4Var = (gj4) this.c;
                return br9.y(gj4Var) - ((ListIterator) this.b).previousIndex();
            default:
                return ((Ref$IntRef) this.b).a + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.a) {
            case 0:
                return ((ListIterator) this.b).next();
            case 1:
                return ((ListIterator) this.b).next();
            default:
                Ref$IntRef ref$IntRef = (Ref$IntRef) this.b;
                int i = ref$IntRef.a;
                o98 o98Var = (o98) this.c;
                hs9.p(i, o98Var.d);
                ref$IntRef.a = i - 1;
                return o98Var.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.a) {
            case 0:
                t87 t87Var = (t87) this.c;
                return br9.y(t87Var) - ((ListIterator) this.b).nextIndex();
            case 1:
                gj4 gj4Var = (gj4) this.c;
                return br9.y(gj4Var) - ((ListIterator) this.b).nextIndex();
            default:
                return ((Ref$IntRef) this.b).a;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                ((ListIterator) this.b).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.a) {
            case 0:
                ((ListIterator) this.b).set(obj);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public s87(t87 t87Var, int i) {
        this.c = t87Var;
        this.b = t87Var.a.listIterator(a.a0(i, t87Var));
    }

    public s87(Ref$IntRef ref$IntRef, o98 o98Var) {
        this.b = ref$IntRef;
        this.c = o98Var;
    }
}
