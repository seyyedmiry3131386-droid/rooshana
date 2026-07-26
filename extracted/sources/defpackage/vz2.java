package defpackage;

import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class vz2 implements mm4 {
    public final long a;
    public long b = -1;
    public final List c;
    public final long d;

    public vz2(long j, List list) {
        this.a = list.size() - 1;
        this.d = j;
        this.c = list;
    }

    @Override // defpackage.mm4
    public final long b() {
        long j = this.b;
        if (j < 0 || j > this.a) {
            throw new NoSuchElementException();
        }
        return this.d + ((h03) this.c.get((int) j)).e;
    }

    @Override // defpackage.mm4
    public final long c() {
        long j = this.b;
        if (j < 0 || j > this.a) {
            throw new NoSuchElementException();
        }
        h03 h03Var = (h03) this.c.get((int) j);
        return this.d + h03Var.e + h03Var.c;
    }

    @Override // defpackage.mm4
    public final boolean next() {
        long j = this.b + 1;
        this.b = j;
        return !(j > this.a);
    }
}
