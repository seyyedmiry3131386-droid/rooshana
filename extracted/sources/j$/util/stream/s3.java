package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: loaded from: classes2.dex */
public class s3 extends CountedCompleter {
    public final d2 a;
    public final int b;
    public final /* synthetic */ int c;
    public final Object d;

    public s3(d2 d2Var, Object obj, int i) {
        this.c = i;
        this.a = d2Var;
        this.b = 0;
        this.d = obj;
    }

    public s3(s3 s3Var, d2 d2Var, int i, byte b) {
        super(s3Var);
        this.a = d2Var;
        this.b = i;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        s3 s3VarA = this;
        while (s3VarA.a.o() != 0) {
            s3VarA.setPendingCount(s3VarA.a.o() - 1);
            int i = 0;
            int iCount = 0;
            while (i < s3VarA.a.o() - 1) {
                s3 s3VarA2 = s3VarA.a(i, s3VarA.b + iCount);
                iCount = (int) (s3VarA2.a.count() + ((long) iCount));
                s3VarA2.fork();
                i++;
            }
            s3VarA = s3VarA.a(i, s3VarA.b + iCount);
        }
        switch (s3VarA.c) {
            case 0:
                ((c2) s3VarA.a).f(s3VarA.b, s3VarA.d);
                break;
            default:
                s3VarA.a.k((Object[]) s3VarA.d, s3VarA.b);
                break;
        }
        s3VarA.propagateCompletion();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s3(s3 s3Var, d2 d2Var, int i) {
        this(s3Var, d2Var, i, (byte) 0);
        this.c = 1;
        this.d = (Object[]) s3Var.d;
    }

    public final s3 a(int i, int i2) {
        switch (this.c) {
            case 0:
                return new s3(this, ((c2) this.a).a(i), i2);
            default:
                return new s3(this, this.a.a(i), i2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s3(s3 s3Var, c2 c2Var, int i) {
        this(s3Var, c2Var, i, (byte) 0);
        this.c = 0;
        this.d = s3Var.d;
    }
}
