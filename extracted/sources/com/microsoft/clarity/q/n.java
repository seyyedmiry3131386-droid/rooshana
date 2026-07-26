package com.microsoft.clarity.q;

import defpackage.bp2;
import defpackage.js3;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends Lambda implements bp2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Class[] c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, String str2, Class[] clsArr) {
        super(0);
        this.a = str;
        this.b = str2;
        this.c = clsArr;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        Pair pair = new Pair(this.a, this.b);
        HashMap map = p.b;
        if (map.get(pair) == null) {
            Class clsA = o.a(this.a);
            String str = this.b;
            Class[] clsArr = this.c;
            Method declaredMethod = clsA.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            js3.o(declaredMethod, "getClass(cls).getDeclare…(method, *parameterTypes)");
            map.put(pair, declaredMethod);
            Object obj = map.get(pair);
            js3.m(obj);
            ((Method) obj).setAccessible(true);
        }
        Object obj2 = map.get(pair);
        js3.m(obj2);
        return (Method) obj2;
    }
}
