package defpackage;

import j$.util.Optional;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public final class uh0 extends k51 {
    public final /* synthetic */ int a;

    public /* synthetic */ uh0(int i) {
        this.a = i;
    }

    @Override // defpackage.k51
    public l51 a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, k87 k87Var) {
        switch (this.a) {
            case 0:
                if (b57.class.isAssignableFrom(rq4.B(type))) {
                    return eq.s;
                }
                return null;
            default:
                return super.a(type, annotationArr, annotationArr2, k87Var);
        }
    }

    @Override // defpackage.k51
    public final l51 b(Type type, Annotation[] annotationArr, k87 k87Var) {
        switch (this.a) {
            case 0:
                if (type == j77.class) {
                    return rq4.G(annotationArr, m78.class) ? th0.e : hy2.c;
                }
                if (type == Void.class) {
                    return hy2.d;
                }
                if (rq4.f && type == tx8.class) {
                    return fz1.d;
                }
                return null;
            default:
                if (rq4.B(type) != Optional.class) {
                    return null;
                }
                return new ck4(8, k87Var.d(rq4.A(0, (ParameterizedType) type), annotationArr));
        }
    }
}
