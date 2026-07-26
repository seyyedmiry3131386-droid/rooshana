package org.koin.core.option;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class KoinOption {
    public static final KoinOption a;
    public static final /* synthetic */ KoinOption[] b;

    static {
        KoinOption koinOption = new KoinOption("VIEWMODEL_SCOPE_FACTORY", 0);
        a = koinOption;
        KoinOption[] koinOptionArr = {koinOption};
        b = koinOptionArr;
        a.a(koinOptionArr);
    }

    public static KoinOption valueOf(String str) {
        return (KoinOption) Enum.valueOf(KoinOption.class, str);
    }

    public static KoinOption[] values() {
        return (KoinOption[]) b.clone();
    }
}
