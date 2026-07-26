package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class kx0 extends el0 {
    @Override // defpackage.el0
    public final fl0 a(Type type, Annotation[] annotationArr, k87 k87Var) {
        if (rq4.B(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeA = rq4.A(0, (ParameterizedType) type);
        if (rq4.B(typeA) != h77.class) {
            return new ql4(12, typeA);
        }
        if (!(typeA instanceof ParameterizedType)) {
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        return new nm5(12, rq4.A(0, (ParameterizedType) typeA));
    }
}
