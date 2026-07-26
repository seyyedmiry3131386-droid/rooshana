package j$.util.concurrent;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import j$.util.stream.b8;
import j$.util.stream.e7;
import j$.util.stream.l1;
import j$.util.stream.p1;
import j$.util.stream.q1;
import j$.util.stream.r1;
import j$.util.stream.t3;
import j$.util.stream.v6;
import j$.util.stream.w6;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t implements BiConsumer, BiFunction, Consumer, Supplier, b8 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ t(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ t(BiFunction biFunction, Function function) {
        this.a = 2;
        this.c = biFunction;
        this.b = function;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
        }
        return j$.com.android.tools.r8.a.b(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return j$.com.android.tools.r8.a.c(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Function) this.b).apply(((BiFunction) this.c).apply(obj, obj2));
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                java.util.concurrent.ConcurrentMap concurrentMap = (java.util.concurrent.ConcurrentMap) this.b;
                BiFunction biFunction = (BiFunction) this.c;
                while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
                }
                break;
            default:
                BiConsumer biConsumer = (BiConsumer) this.b;
                BiConsumer biConsumer2 = (BiConsumer) this.c;
                biConsumer.accept(obj, obj2);
                biConsumer2.accept(obj, obj2);
                break;
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new l1((q1) this.b, (Predicate) this.c);
    }

    public t(w6 w6Var, q1 q1Var, Supplier supplier) {
        this.a = 6;
        this.b = q1Var;
        this.c = supplier;
    }

    @Override // j$.util.stream.b8
    public int w() {
        return v6.u | v6.r;
    }

    @Override // j$.util.stream.b8
    public Object f(j$.util.stream.a aVar, Spliterator spliterator) {
        p1 p1Var = (p1) ((Supplier) this.c).get();
        aVar.E0(spliterator, p1Var);
        return Boolean.valueOf(p1Var.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.b8
    public Object j(t3 t3Var, Spliterator spliterator) {
        return (Boolean) new r1(this, (j$.util.stream.a) t3Var, spliterator).invoke();
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                Consumer consumer = (Consumer) this.b;
                Consumer consumer2 = (Consumer) this.c;
                consumer.accept(obj);
                consumer2.accept(obj);
                break;
            case 4:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
                if (obj != null) {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                } else {
                    atomicBoolean.set(true);
                }
                break;
            case 5:
            case 6:
            default:
                e7 e7Var = (e7) this.b;
                Consumer consumer3 = (Consumer) this.c;
                if (e7Var.b.putIfAbsent(obj != null ? obj : e7.d, Boolean.TRUE) == null) {
                    consumer3.accept(obj);
                }
                break;
            case 7:
                ((BiConsumer) this.b).accept(this.c, obj);
                break;
        }
    }
}
