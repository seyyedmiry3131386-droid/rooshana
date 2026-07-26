package io.sentry;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Iterator {
    public int a;
    public int b = -1;
    public boolean c;
    public final /* synthetic */ CircularFifoQueue d;

    public g(CircularFifoQueue circularFifoQueue) {
        this.d = circularFifoQueue;
        this.a = circularFifoQueue.b;
        this.c = circularFifoQueue.d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c || this.a != this.d.c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.c = false;
        int i = this.a;
        this.b = i;
        int i2 = i + 1;
        CircularFifoQueue circularFifoQueue = this.d;
        this.a = i2 < circularFifoQueue.e ? i2 : 0;
        return circularFifoQueue.a[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        CircularFifoQueue circularFifoQueue = this.d;
        int i2 = circularFifoQueue.e;
        int i3 = this.b;
        if (i3 == -1) {
            throw new IllegalStateException();
        }
        int i4 = circularFifoQueue.b;
        if (i3 == i4) {
            circularFifoQueue.remove();
            this.b = -1;
            return;
        }
        int i5 = i3 + 1;
        if (i4 >= i3 || i5 >= (i = circularFifoQueue.c)) {
            while (i5 != circularFifoQueue.c) {
                if (i5 >= i2) {
                    Object[] objArr = circularFifoQueue.a;
                    objArr[i5 - 1] = objArr[0];
                } else {
                    Object[] objArr2 = circularFifoQueue.a;
                    int i6 = i5 - 1;
                    if (i6 < 0) {
                        i6 = i2 - 1;
                    }
                    objArr2[i6] = objArr2[i5];
                    i5++;
                    if (i5 >= i2) {
                    }
                }
                i5 = 0;
            }
        } else {
            Object[] objArr3 = circularFifoQueue.a;
            System.arraycopy(objArr3, i5, objArr3, i3, i - i5);
        }
        this.b = -1;
        int i7 = circularFifoQueue.c - 1;
        if (i7 < 0) {
            i7 = i2 - 1;
        }
        circularFifoQueue.c = i7;
        circularFifoQueue.a[i7] = null;
        circularFifoQueue.d = false;
        int i8 = this.a - 1;
        if (i8 < 0) {
            i8 = i2 - 1;
        }
        this.a = i8;
    }
}
