package kotlin.enums;

import defpackage.js3;
import java.io.Serializable;
import java.lang.Enum;

/* JADX INFO: loaded from: classes3.dex */
public final class EnumEntriesSerializationProxy<E extends Enum<E>> implements Serializable {
    private static final long serialVersionUID = 0;
    public final Class a;

    public EnumEntriesSerializationProxy(Enum[] enumArr) {
        js3.p(enumArr, "entries");
        Class<?> componentType = enumArr.getClass().getComponentType();
        js3.m(componentType);
        this.a = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.a.getEnumConstants();
        js3.o(enumConstants, "getEnumConstants(...)");
        return a.a((Enum[]) enumConstants);
    }
}
