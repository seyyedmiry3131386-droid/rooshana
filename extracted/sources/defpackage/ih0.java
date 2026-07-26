package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class ih0 extends c1 {
    public final /* synthetic */ int d = 1;
    public final Object e;

    public ih0(Object[] objArr, int i, int i2) {
        super(i, i2, 0);
        this.e = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.e;
                int i = this.b;
                this.b = i + 1;
                return objArr[i];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.b++;
                return this.e;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.d) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.e;
                int i = this.b - 1;
                this.b = i;
                return objArr[i];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.b--;
                return this.e;
        }
    }

    public ih0(int i, Object obj) {
        super(i, 1, 0);
        this.e = obj;
    }
}
