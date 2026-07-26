package com.google.common.collect;

import defpackage.yp2;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
abstract class Maps$EntryFunction implements yp2 {
    public static final AnonymousClass1 a;
    public static final /* synthetic */ Maps$EntryFunction[] b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.collect.Maps$EntryFunction$1] */
    static {
        ?? r0 = new Maps$EntryFunction() { // from class: com.google.common.collect.Maps$EntryFunction.1
            @Override // defpackage.yp2
            public final Object apply(Object obj) {
                return ((Map.Entry) obj).getKey();
            }
        };
        a = r0;
        b = new Maps$EntryFunction[]{r0, new Maps$EntryFunction() { // from class: com.google.common.collect.Maps$EntryFunction.2
            @Override // defpackage.yp2
            public final Object apply(Object obj) {
                return ((Map.Entry) obj).getValue();
            }
        }};
    }

    public static Maps$EntryFunction valueOf(String str) {
        return (Maps$EntryFunction) Enum.valueOf(Maps$EntryFunction.class, str);
    }

    public static Maps$EntryFunction[] values() {
        return (Maps$EntryFunction[]) b.clone();
    }
}
