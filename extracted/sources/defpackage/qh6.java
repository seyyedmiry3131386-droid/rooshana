package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class qh6 extends y1 {
    public final ps0 a;
    public final List b;
    public final Object c;

    public qh6(ps0 ps0Var) {
        this.a = ps0Var;
        this.b = EmptyList.a;
        this.c = a.b(LazyThreadSafetyMode.b, new o06(7, this));
    }

    @Override // defpackage.y1
    public final zw3 c() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return (no7) this.c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.a + ')';
    }

    public qh6(ps0 ps0Var, Annotation[] annotationArr) {
        this(ps0Var);
        this.b = ew.r0(annotationArr);
    }
}
