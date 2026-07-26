package defpackage;

import ir.myket.network.server.c;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class m87 extends el0 {
    public final c a;

    public m87(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.el0
    public final fl0 a(Type type, Annotation[] annotationArr, k87 k87Var) {
        js3.p(type, "returnType");
        js3.p(annotationArr, "annotations");
        int length = annotationArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (annotationArr[i] instanceof gq2) {
                int length2 = annotationArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        z = true;
                        break;
                    }
                    if (annotationArr[i2] instanceof sq1) {
                        break;
                    }
                    i2++;
                }
            } else {
                i++;
            }
        }
        return new wx7(k87Var.b(this, type, annotationArr), this.a, z);
    }
}
