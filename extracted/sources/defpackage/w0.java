package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public class w0 implements Iterator, dx3 {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public /* synthetic */ w0(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < ((z0) this.c).a()) {
                }
                break;
            case 1:
                if (this.b < ((Object[]) this.c).length) {
                }
                break;
            case 2:
                if (this.b > 0) {
                }
                break;
            case 3:
                if (this.b < ((m28) this.c).f()) {
                }
                break;
            case 4:
                if (this.b < ((byte[]) this.c).length) {
                }
                break;
            case 5:
                if (this.b < ((int[]) this.c).length) {
                }
                break;
            case 6:
                if (this.b < ((long[]) this.c).length) {
                }
                break;
            case 7:
                if (this.b < ((short[]) this.c).length) {
                }
                break;
            default:
                if (this.b < ((ViewGroup) this.c).getChildCount()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                z0 z0Var = (z0) this.c;
                int i = this.b;
                this.b = i + 1;
                return z0Var.get(i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.c;
                    int i2 = this.b;
                    this.b = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.b--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 2:
                q22 q22Var = (q22) this.c;
                int i3 = q22Var.c;
                int i4 = this.b;
                this.b = i4 - 1;
                return q22Var.e[i3 - i4];
            case 3:
                m28 m28Var = (m28) this.c;
                int i5 = this.b;
                this.b = i5 + 1;
                return m28Var.g(i5);
            case 4:
                int i6 = this.b;
                byte[] bArr = (byte[]) this.c;
                if (i6 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.b));
                }
                this.b = i6 + 1;
                return new gw8(bArr[i6]);
            case 5:
                int i7 = this.b;
                int[] iArr = (int[]) this.c;
                if (i7 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.b));
                }
                this.b = i7 + 1;
                return new ow8(iArr[i7]);
            case 6:
                int i8 = this.b;
                long[] jArr = (long[]) this.c;
                if (i8 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.b));
                }
                this.b = i8 + 1;
                return new tw8(jArr[i8]);
            case 7:
                int i9 = this.b;
                short[] sArr = (short[]) this.c;
                if (i9 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.b));
                }
                this.b = i9 + 1;
                return new yw8(sArr[i9]);
            default:
                ViewGroup viewGroup = (ViewGroup) this.c;
                int i10 = this.b;
                this.b = i10 + 1;
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 7:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.c;
                int i = this.b - 1;
                this.b = i;
                viewGroup.removeViewAt(i);
                return;
        }
    }

    public w0(Object[] objArr) {
        this.a = 1;
        js3.p(objArr, "array");
        this.c = objArr;
    }

    public w0(q22 q22Var) {
        this.a = 2;
        this.c = q22Var;
        this.b = q22Var.c;
    }
}
