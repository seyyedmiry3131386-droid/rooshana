package j$.util;

import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import j$.util.stream.g7;
import j$.util.stream.i7;
import j$.util.stream.j5;
import j$.util.stream.k7;
import j$.util.stream.z7;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p implements Consumer, Predicate, Supplier, DoubleFunction, Function, LongFunction, BooleanSupplier {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ p(int i) {
        this.a = i;
    }

    public /* synthetic */ p(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 0:
                break;
            case 7:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ Predicate negate() {
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((Predicate) this.b).test(obj);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object objApply = ((Function) this.b).apply(obj);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof Stream) {
            return Stream.Wrapper.convert((Stream) objApply);
        }
        if (objApply instanceof java.util.stream.Stream) {
            return Stream.VivifiedWrapper.convert((java.util.stream.Stream) objApply);
        }
        if (objApply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) objApply);
        }
        if (objApply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) objApply);
        }
        if (objApply instanceof j$.util.stream.a0) {
            return j$.util.stream.z.f((j$.util.stream.a0) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return j$.util.stream.y.f((DoubleStream) objApply);
        }
        if (objApply instanceof j$.util.stream.j1) {
            return j$.util.stream.i1.f((j$.util.stream.j1) objApply);
        }
        if (objApply instanceof LongStream) {
            return j$.util.stream.h1.f((LongStream) objApply);
        }
        f.a(objApply.getClass(), "java.util.stream.*Stream");
        throw null;
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        Object objApply = ((DoubleFunction) this.b).apply(d);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof j$.util.stream.a0) {
            return j$.util.stream.z.f((j$.util.stream.a0) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return j$.util.stream.y.f((DoubleStream) objApply);
        }
        f.a(objApply.getClass(), "java.util.stream.DoubleStream");
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        Object objApply = ((LongFunction) this.b).apply(j);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof j$.util.stream.j1) {
            return j$.util.stream.i1.f((j$.util.stream.j1) objApply);
        }
        if (objApply instanceof LongStream) {
            return j$.util.stream.h1.f((LongStream) objApply);
        }
        f.a(objApply.getClass(), "java.util.stream.LongStream");
        throw null;
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.a) {
            case 9:
                g7 g7Var = (g7) this.b;
                return g7Var.d.tryAdvance(g7Var.e);
            case 10:
                i7 i7Var = (i7) this.b;
                return i7Var.d.tryAdvance(i7Var.e);
            case 11:
                k7 k7Var = (k7) this.b;
                return k7Var.d.tryAdvance(k7Var.e);
            default:
                z7 z7Var = (z7) this.b;
                return z7Var.d.tryAdvance(z7Var.e);
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 2:
                return ((j$.util.stream.a) this.b).Q0(0);
            default:
                return (Spliterator) this.b;
        }
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((Consumer) this.b).accept(new q((Map.Entry) obj));
                break;
            case 7:
                ((j5) this.b).accept(obj);
                break;
            default:
                ((java.util.List) this.b).add(obj);
                break;
        }
    }
}
