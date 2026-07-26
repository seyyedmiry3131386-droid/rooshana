package com.google.common.cache;

import defpackage.c27;
import defpackage.dc4;
import defpackage.ec4;
import defpackage.jc4;
import defpackage.zb4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
abstract class LocalCache$Strength {
    public static final AnonymousClass1 a;
    public static final AnonymousClass3 b;
    public static final /* synthetic */ LocalCache$Strength[] c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.cache.LocalCache$Strength$1] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.common.cache.LocalCache$Strength$3] */
    static {
        ?? r0 = new LocalCache$Strength() { // from class: com.google.common.cache.LocalCache$Strength.1
            @Override // com.google.common.cache.LocalCache$Strength
            public final com.google.common.base.a a() {
                return com.google.common.base.a.c();
            }

            @Override // com.google.common.cache.LocalCache$Strength
            public final ec4 b(LocalCache$Segment localCache$Segment, c27 c27Var, Object obj) {
                return new dc4(obj);
            }
        };
        a = r0;
        LocalCache$Strength localCache$Strength = new LocalCache$Strength() { // from class: com.google.common.cache.LocalCache$Strength.2
            @Override // com.google.common.cache.LocalCache$Strength
            public final com.google.common.base.a a() {
                return com.google.common.base.a.f();
            }

            @Override // com.google.common.cache.LocalCache$Strength
            public final ec4 b(LocalCache$Segment localCache$Segment, c27 c27Var, Object obj) {
                return new zb4(localCache$Segment.i, obj, c27Var);
            }
        };
        ?? r2 = new LocalCache$Strength() { // from class: com.google.common.cache.LocalCache$Strength.3
            @Override // com.google.common.cache.LocalCache$Strength
            public final com.google.common.base.a a() {
                return com.google.common.base.a.f();
            }

            @Override // com.google.common.cache.LocalCache$Strength
            public final ec4 b(LocalCache$Segment localCache$Segment, c27 c27Var, Object obj) {
                return new jc4(localCache$Segment.i, obj, c27Var);
            }
        };
        b = r2;
        c = new LocalCache$Strength[]{r0, localCache$Strength, r2};
    }

    public static LocalCache$Strength valueOf(String str) {
        return (LocalCache$Strength) Enum.valueOf(LocalCache$Strength.class, str);
    }

    public static LocalCache$Strength[] values() {
        return (LocalCache$Strength[]) c.clone();
    }

    public abstract com.google.common.base.a a();

    public abstract ec4 b(LocalCache$Segment localCache$Segment, c27 c27Var, Object obj);
}
