package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class b27 extends tu0 {
    public final zw3 b;
    public final mv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b27(zw3 zw3Var, px3 px3Var) {
        super(px3Var);
        js3.p(px3Var, "eSerializer");
        this.b = zw3Var;
        no7 descriptor = px3Var.getDescriptor();
        js3.p(descriptor, "elementDesc");
        this.c = new mv(descriptor, 0);
    }

    @Override // defpackage.p
    public final Object a() {
        return new ArrayList();
    }

    @Override // defpackage.p
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        js3.p(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // defpackage.p
    public final Iterator c(Object obj) {
        Object[] objArr = (Object[]) obj;
        js3.p(objArr, "<this>");
        return c26.K(objArr);
    }

    @Override // defpackage.p
    public final int d(Object obj) {
        Object[] objArr = (Object[]) obj;
        js3.p(objArr, "<this>");
        return objArr.length;
    }

    @Override // defpackage.p
    public final Object g(Object obj) {
        js3.p(null, "<this>");
        ew.r0(null);
        throw null;
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return this.c;
    }

    @Override // defpackage.p
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        js3.p(arrayList, "<this>");
        zw3 zw3Var = this.b;
        js3.p(zw3Var, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) yh0.u(zw3Var), arrayList.size());
        js3.n(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        js3.o(array, "toArray(...)");
        return array;
    }

    @Override // defpackage.tu0
    public final void i(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        js3.p(arrayList, "<this>");
        arrayList.add(i, obj2);
    }
}
