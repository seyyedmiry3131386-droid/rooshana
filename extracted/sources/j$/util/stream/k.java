package j$.util.stream;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends f5 {
    public final /* synthetic */ int b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(a aVar, j5 j5Var, int i) {
        super(j5Var);
        this.b = i;
        this.c = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(j5 j5Var) {
        super(j5Var);
        this.b = 0;
    }

    @Override // j$.util.stream.f5, j$.util.stream.j5
    public void end() {
        switch (this.b) {
            case 0:
                this.c = null;
                this.a.end();
                break;
            default:
                super.end();
                break;
        }
    }

    @Override // j$.util.stream.f5, j$.util.stream.j5
    public void c(long j) {
        switch (this.b) {
            case 0:
                this.c = new HashSet();
                this.a.c(-1L);
                break;
            case 1:
            default:
                super.c(j);
                break;
            case 2:
                this.a.c(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                if (!((Set) this.c).contains(obj)) {
                    ((Set) this.c).add(obj);
                    this.a.accept(obj);
                }
                break;
            case 1:
                ((Consumer) ((o) this.c).t).accept(obj);
                this.a.accept(obj);
                break;
            case 2:
                if (((Predicate) ((o) this.c).t).test(obj)) {
                    this.a.accept(obj);
                }
                break;
            case 3:
                this.a.accept(((Function) ((o) this.c).t).apply(obj));
                break;
            case 4:
                this.a.accept(((ToIntFunction) ((s0) this.c).t).applyAsInt(obj));
                break;
            case 5:
                this.a.accept(((ToLongFunction) ((c1) this.c).t).applyAsLong(obj));
                break;
            default:
                this.a.accept(((ToDoubleFunction) ((p) this.c).t).applyAsDouble(obj));
                break;
        }
    }
}
