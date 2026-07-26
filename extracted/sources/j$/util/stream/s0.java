package j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 extends x0 {
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(a aVar, int i, Object obj, int i2) {
        super(aVar, i);
        this.s = i2;
        this.t = obj;
    }

    @Override // j$.util.stream.a
    public final j5 P0(int i, j5 j5Var) {
        switch (this.s) {
            case 0:
                return new r0(this, j5Var, 1);
            case 1:
                return new u0(this, j5Var);
            case 2:
                return new k(this, j5Var, 4);
            default:
                return new w4(this, j5Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(y0 y0Var, IntConsumer intConsumer) {
        super(y0Var, 0);
        this.s = 0;
        this.t = intConsumer;
    }
}
