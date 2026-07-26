package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class wd1 extends el0 {
    public final Executor a;

    public wd1(Executor executor) {
        this.a = executor;
    }

    @Override // defpackage.el0
    public final fl0 a(Type type, Annotation[] annotationArr, k87 k87Var) {
        if (rq4.B(type) != dl0.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new do3(rq4.A(0, (ParameterizedType) type), rq4.G(annotationArr, oy7.class) ? null : this.a, false);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
