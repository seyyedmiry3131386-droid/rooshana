package j$.time.format;

import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;
import j$.time.w;
import j$.util.b0;
import j$.util.c0;
import j$.util.function.Predicate$CC;
import j$.util.y;
import j$.util.z;
import java.util.LinkedHashSet;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements IntFunction, Supplier, BiConsumer, DoubleBinaryOperator, ObjDoubleConsumer, DoubleFunction, ToDoubleFunction, Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
        }
        return j$.com.android.tools.r8.a.b(this, biConsumer);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        return Double.valueOf(d);
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d, double d2) {
        switch (this.a) {
            case 16:
                return Math.min(d, d2);
            default:
                return Math.max(d, d2);
        }
    }

    public /* synthetic */ Predicate negate() {
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return ((c0) obj).a;
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 9:
                return new y();
            case 10:
                return new z();
            case 11:
                return new b0();
            case 12:
                return new LinkedHashSet();
            case 17:
                return new double[4];
            case 26:
                return new double[3];
            default:
                return new j$.util.stream.c0();
        }
    }

    @Override // java.util.function.ToDoubleFunction
    public double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d) {
        switch (this.a) {
            case 18:
                double[] dArr = (double[]) obj;
                dArr[2] = dArr[2] + 1.0d;
                j$.util.stream.i.a(dArr, d);
                dArr[3] = dArr[3] + d;
                break;
            case 19:
            default:
                double[] dArr2 = (double[]) obj;
                j$.util.stream.i.a(dArr2, d);
                dArr2[2] = dArr2[2] + d;
                break;
            case 20:
                ((y) obj).accept(d);
                break;
        }
    }

    public Object a(TemporalAccessor temporalAccessor) {
        switch (this.a) {
            case 0:
                w wVar = (w) temporalAccessor.l(j$.time.temporal.q.a);
                if (wVar == null || (wVar instanceof ZoneOffset)) {
                    return null;
                }
                return wVar;
            case 1:
                return (w) temporalAccessor.l(j$.time.temporal.q.a);
            case 2:
                return (j$.time.chrono.m) temporalAccessor.l(j$.time.temporal.q.b);
            case 3:
                return (j$.time.temporal.r) temporalAccessor.l(j$.time.temporal.q.c);
            case 4:
                j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
                if (temporalAccessor.e(aVar)) {
                    return ZoneOffset.I(temporalAccessor.i(aVar));
                }
                return null;
            case 5:
                w wVar2 = (w) temporalAccessor.l(j$.time.temporal.q.a);
                return wVar2 != null ? wVar2 : (w) temporalAccessor.l(j$.time.temporal.q.d);
            case 6:
                j$.time.temporal.a aVar2 = j$.time.temporal.a.EPOCH_DAY;
                if (temporalAccessor.e(aVar2)) {
                    return j$.time.g.L(temporalAccessor.w(aVar2));
                }
                return null;
            default:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_DAY;
                if (temporalAccessor.e(aVar3)) {
                    return j$.time.j.G(temporalAccessor.w(aVar3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "ZoneId";
            case 2:
                return "Chronology";
            case 3:
                return "Precision";
            case 4:
                return "ZoneOffset";
            case 5:
                return "Zone";
            case 6:
                return "LocalDate";
            case 7:
                return "LocalTime";
            default:
                return super.toString();
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 13:
                ((LinkedHashSet) obj).add(obj2);
                break;
            case 14:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
            case 15:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                j$.util.stream.i.a(dArr, dArr2[0]);
                j$.util.stream.i.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
            case 16:
            case 17:
            case 18:
            default:
                ((y) obj).a((y) obj2);
                break;
            case 19:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                j$.util.stream.i.a(dArr3, dArr4[0]);
                j$.util.stream.i.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                break;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 8:
                return new Object[i];
            default:
                return new Double[i];
        }
    }
}
