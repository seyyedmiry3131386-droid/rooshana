package defpackage;

import com.google.common.collect.o1;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class cy implements Iterator {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Iterable c;

    public cy(dy dyVar) {
        this.a = 0;
        this.c = dyVar;
        this.b = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b < ((dy) this.c).a;
            default:
                o1 o1Var = (o1) this.c;
                if (this.b != 0) {
                    return false;
                }
                o1Var.b.getClass();
                Object obj = o1Var.a;
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                dy dyVar = (dy) this.c;
                String[] strArr = dyVar.c;
                int i = this.b;
                String str = strArr[i];
                String str2 = dyVar.b[i];
                if (str == null) {
                    str = "";
                }
                ay ayVar = new ay();
                if (str2 == null) {
                    throw new IllegalArgumentException("Object must not be null");
                }
                ayVar.a = str2.trim();
                if (str2.length() == 0) {
                    throw new IllegalArgumentException("String must not be empty");
                }
                ayVar.b = str;
                ayVar.c = dyVar;
                this.b++;
                return ayVar;
            default:
                hasNext();
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                dy dyVar = (dy) this.c;
                int i = this.b;
                int i2 = i - 1;
                this.b = i2;
                int i3 = dyVar.a;
                if (i2 >= i3) {
                    throw new IllegalArgumentException("Must be false");
                }
                int i4 = (i3 - i2) - 1;
                if (i4 > 0) {
                    String[] strArr = dyVar.b;
                    System.arraycopy(strArr, i, strArr, i2, i4);
                    String[] strArr2 = dyVar.c;
                    System.arraycopy(strArr2, i, strArr2, i2, i4);
                }
                int i5 = dyVar.a - 1;
                dyVar.a = i5;
                dyVar.b[i5] = null;
                dyVar.c[i5] = null;
                return;
            default:
                vy2.q(this.b == 1);
                this.b = -1;
                throw null;
        }
    }

    public cy(o1 o1Var) {
        this.a = 1;
        this.c = o1Var;
    }
}
