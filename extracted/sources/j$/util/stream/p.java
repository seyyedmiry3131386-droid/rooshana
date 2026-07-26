package j$.util.stream;

import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends w {
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(a aVar, int i, Object obj, int i2) {
        super(aVar, i);
        this.s = i2;
        this.t = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(x xVar, DoubleConsumer doubleConsumer) {
        super(xVar, 0);
        this.s = 2;
        this.t = doubleConsumer;
    }

    @Override // j$.util.stream.a
    public final j5 P0(int i, j5 j5Var) {
        switch (this.s) {
            case 0:
                return new n(this, j5Var, 1);
            case 1:
                return new s(this, j5Var);
            case 2:
                return new n(this, j5Var, 5);
            case 3:
                return new k(this, j5Var, 6);
            default:
                return new w4(this, j5Var);
        }
    }
}
