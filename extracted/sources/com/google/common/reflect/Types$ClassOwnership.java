package com.google.common.reflect;

import defpackage.tv8;
import j$.util.Objects;
import java.lang.reflect.ParameterizedType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
abstract class Types$ClassOwnership {
    public static final Types$ClassOwnership a;
    public static final /* synthetic */ Types$ClassOwnership[] b = {new Types$ClassOwnership() { // from class: com.google.common.reflect.Types$ClassOwnership.1
        @Override // com.google.common.reflect.Types$ClassOwnership
        public final Class a(Class cls) {
            return cls.getEnclosingClass();
        }
    }, new Types$ClassOwnership() { // from class: com.google.common.reflect.Types$ClassOwnership.2
        @Override // com.google.common.reflect.Types$ClassOwnership
        public final Class a(Class cls) {
            if (cls.isLocalClass()) {
                return null;
            }
            return cls.getEnclosingClass();
        }
    }};

    /* JADX INFO: Fake field, exist only in values array */
    Types$ClassOwnership EF2;

    static {
        ParameterizedType parameterizedType = (ParameterizedType) tv8.class.getGenericSuperclass();
        Objects.requireNonNull(parameterizedType);
        for (Types$ClassOwnership types$ClassOwnership : values()) {
            if (types$ClassOwnership.a(tv8.class) == parameterizedType.getOwnerType()) {
                a = types$ClassOwnership;
                return;
            }
        }
        throw new AssertionError();
    }

    public static Types$ClassOwnership valueOf(String str) {
        return (Types$ClassOwnership) Enum.valueOf(Types$ClassOwnership.class, str);
    }

    public static Types$ClassOwnership[] values() {
        return (Types$ClassOwnership[]) b.clone();
    }

    public abstract Class a(Class cls);
}
