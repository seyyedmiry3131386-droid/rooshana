package kotlin.enums;

import defpackage.js3;
import defpackage.r22;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final r22 a(Enum[] enumArr) {
        js3.p(enumArr, "entries");
        return new EnumEntriesList(enumArr);
    }
}
