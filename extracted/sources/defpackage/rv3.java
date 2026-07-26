package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class rv3 extends k51 {
    public final dt4 a;
    public final nm5 b;

    public rv3(dt4 dt4Var, nm5 nm5Var) {
        this.a = dt4Var;
        this.b = nm5Var;
    }

    @Override // defpackage.k51
    public final l51 a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, k87 k87Var) {
        js3.p(type, "type");
        js3.p(annotationArr2, "methodAnnotations");
        nm5 nm5Var = this.b;
        return new sk6(this.a, b67.f(((tv3) nm5Var.b).b, type), nm5Var, 8);
    }

    @Override // defpackage.k51
    public final l51 b(Type type, Annotation[] annotationArr, k87 k87Var) {
        js3.p(annotationArr, "annotations");
        nm5 nm5Var = this.b;
        return new qq4(b67.f(((tv3) nm5Var.b).b, type), nm5Var);
    }
}
