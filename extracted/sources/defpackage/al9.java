package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class al9 implements Iterator {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ Object c;

    public /* synthetic */ al9(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < ((cl9) this.c).a.length()) {
                }
                break;
            case 1:
                if (this.b < ((cl9) this.c).a.length()) {
                }
                break;
            default:
                if (this.b < ((gk9) this.c).o()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.a) {
            case 0:
                String str = ((cl9) this.c).a;
                int i = this.b;
                if (i >= str.length()) {
                    throw new NoSuchElementException();
                }
                this.b = i + 1;
                return new cl9(String.valueOf(i));
            case 1:
                cl9 cl9Var = (cl9) this.c;
                String str2 = cl9Var.a;
                int i2 = this.b;
                if (i2 >= str2.length()) {
                    throw new NoSuchElementException();
                }
                this.b = i2 + 1;
                return new cl9(String.valueOf(cl9Var.a.charAt(i2)));
            default:
                gk9 gk9Var = (gk9) this.c;
                if (this.b >= gk9Var.o()) {
                    int i3 = this.b;
                    throw new NoSuchElementException(rm7.o(i3, "Out of bounds index: ", new StringBuilder(String.valueOf(i3).length() + 21)));
                }
                int i4 = this.b;
                this.b = i4 + 1;
                return gk9Var.p(i4);
        }
    }
}
