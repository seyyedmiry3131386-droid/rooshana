package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d42 implements Runnable, Comparable, bq1 {
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public d42(long j) {
        this.a = j;
    }

    @Override // defpackage.bq1
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                mu3 mu3Var = tv8.b;
                if (obj == mu3Var) {
                    return;
                }
                e42 e42Var = obj instanceof e42 ? (e42) obj : null;
                if (e42Var != null) {
                    e42Var.b(this);
                }
                this._heap = mu3Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final wk8 b() {
        Object obj = this._heap;
        if (obj instanceof wk8) {
            return (wk8) obj;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.a - ((d42) obj).a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final int d(long j, e42 e42Var, f42 f42Var) {
        synchronized (this) {
            if (this._heap == tv8.b) {
                return 2;
            }
            synchronized (e42Var) {
                try {
                    d42[] d42VarArr = e42Var.a;
                    d42 d42Var = d42VarArr != null ? d42VarArr[0] : null;
                    if (f42.i.get(f42Var) == 1) {
                        return 1;
                    }
                    if (d42Var == null) {
                        e42Var.c = j;
                    } else {
                        long j2 = d42Var.a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - e42Var.c > 0) {
                            e42Var.c = j;
                        }
                    }
                    long j3 = this.a;
                    long j4 = e42Var.c;
                    if (j3 - j4 < 0) {
                        this.a = j4;
                    }
                    e42Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void e(e42 e42Var) {
        if (this._heap == tv8.b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = e42Var;
    }

    public String toString() {
        return "Delayed[nanos=" + this.a + ']';
    }
}
