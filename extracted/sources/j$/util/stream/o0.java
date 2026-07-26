package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o0 implements b8, c8 {
    public final boolean a;

    public /* synthetic */ void accept(double d) {
        t3.D();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        t3.K();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        t3.L();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void c(long j) {
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void end() {
    }

    public o0(boolean z) {
        this.a = z;
    }

    @Override // j$.util.stream.b8
    public final int w() {
        if (this.a) {
            return 0;
        }
        return v6.r;
    }

    public final void a(t3 t3Var, Spliterator spliterator) {
        if (this.a) {
            new p0(t3Var, spliterator, this).invoke();
        } else {
            new q0(t3Var, spliterator, t3Var.F0(this)).invoke();
        }
    }
}
