package defpackage;

import com.google.android.gms.internal.auth.zzef;
import com.google.android.gms.internal.measurement.zzlh;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class go9 implements Iterator {
    public final /* synthetic */ int a = 0;
    public int b = 0;
    public final int c;
    public final /* synthetic */ Object d;

    public go9(zzef zzefVar) {
        this.d = zzefVar;
        this.c = zzefVar.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < this.c) {
                }
                break;
            default:
                if (this.b < this.c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                int i = this.b;
                if (i >= this.c) {
                    throw new NoSuchElementException();
                }
                this.b = i + 1;
                return Byte.valueOf(((zzef) this.d).c(i));
            default:
                int i2 = this.b;
                if (i2 >= this.c) {
                    throw new NoSuchElementException();
                }
                this.b = i2 + 1;
                return Byte.valueOf(((zzlh) this.d).c(i2));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public go9(zzlh zzlhVar) {
        this.d = zzlhVar;
        this.c = zzlhVar.e();
    }
}
