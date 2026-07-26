package com.microsoft.clarity.q;

import defpackage.bp2;
import defpackage.js3;
import java.lang.reflect.Field;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends Lambda implements bp2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, String str2) {
        super(0);
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        Pair pair = new Pair(this.a, this.b);
        HashMap map = p.c;
        if (map.get(pair) == null) {
            Field declaredField = o.a(this.a).getDeclaredField(this.b);
            js3.o(declaredField, "getClass(cls).getDeclaredField(field)");
            map.put(pair, declaredField);
            Object obj = map.get(pair);
            js3.m(obj);
            ((Field) obj).setAccessible(true);
        }
        Object obj2 = map.get(pair);
        js3.m(obj2);
        return (Field) obj2;
    }
}
