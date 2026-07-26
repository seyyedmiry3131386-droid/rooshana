package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class uq8 implements Iterator, dx3 {
    public final /* synthetic */ int a;
    public Iterator b;
    public final Object c;

    public uq8(w0 w0Var) {
        this.a = 1;
        this.c = new ArrayList();
        this.b = w0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return ((vq8) this.c).b.invoke(this.b.next());
            default:
                Object next = this.b.next();
                ArrayList arrayList = (ArrayList) this.c;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                w0 w0Var = viewGroup != null ? new w0(8, viewGroup) : null;
                if (w0Var == null || !w0Var.hasNext()) {
                    while (!this.b.hasNext() && !arrayList.isEmpty()) {
                        this.b = (Iterator) a.u0(arrayList);
                        a.F0(arrayList);
                    }
                } else {
                    arrayList.add(this.b);
                    this.b = w0Var;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public uq8(vq8 vq8Var) {
        this.a = 0;
        this.c = vq8Var;
        this.b = vq8Var.a.iterator();
    }
}
