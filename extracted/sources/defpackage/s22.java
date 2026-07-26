package defpackage;

import com.google.common.collect.EnumMultiset;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class s22 implements Iterator {
    public int a = 0;
    public int b = -1;
    public final /* synthetic */ EnumMultiset c;
    public final /* synthetic */ int d;
    public final /* synthetic */ EnumMultiset e;

    public s22(EnumMultiset enumMultiset, int i) {
        this.d = i;
        this.e = enumMultiset;
        this.c = enumMultiset;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.a;
            EnumMultiset enumMultiset = this.c;
            if (i >= enumMultiset.d.length) {
                return false;
            }
            if (enumMultiset.e[i] > 0) {
                return true;
            }
            this.a = i + 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object t22Var;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.a;
        switch (this.d) {
            case 0:
                t22Var = this.e.d[i];
                break;
            default:
                t22Var = new t22(this, i);
                break;
        }
        int i2 = this.a;
        this.b = i2;
        this.a = i2 + 1;
        return t22Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        vy2.q(this.b >= 0);
        EnumMultiset enumMultiset = this.c;
        int[] iArr = enumMultiset.e;
        int i = this.b;
        int i2 = iArr[i];
        if (i2 > 0) {
            enumMultiset.f--;
            enumMultiset.g -= (long) i2;
            iArr[i] = 0;
        }
        this.b = -1;
    }
}
