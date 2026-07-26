package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h0 implements c8 {
    public boolean a;
    public Object b;

    @Override // j$.util.stream.j5
    public /* synthetic */ void accept(double d) {
        t3.D();
        throw null;
    }

    @Override // j$.util.stream.j5, j$.util.stream.h5, java.util.function.IntConsumer
    public /* synthetic */ void accept(int i) {
        t3.K();
        throw null;
    }

    @Override // j$.util.stream.j5, java.util.function.LongConsumer
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
    public final /* synthetic */ void end() {
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void n(Object obj) {
        if (this.a) {
            return;
        }
        this.a = true;
        this.b = obj;
    }

    @Override // j$.util.stream.j5
    public final boolean e() {
        return this.a;
    }
}
