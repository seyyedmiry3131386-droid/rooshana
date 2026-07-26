package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class c1 extends f1 {
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(a aVar, int i, Object obj, int i2) {
        super(aVar, i);
        this.s = i2;
        this.t = obj;
    }

    @Override // j$.util.stream.a
    public final j5 P0(int i, j5 j5Var) {
        switch (this.s) {
            case 0:
                return new b1(this, j5Var);
            case 1:
                return new z0(this, j5Var, 5);
            case 2:
                return new w4(this, j5Var);
            default:
                return new k(this, j5Var, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(g1 g1Var, LongConsumer longConsumer) {
        super(g1Var, 0);
        this.s = 1;
        this.t = longConsumer;
    }
}
