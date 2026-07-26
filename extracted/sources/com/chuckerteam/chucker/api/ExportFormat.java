package com.chuckerteam.chucker.api;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ExportFormat {
    public static final /* synthetic */ ExportFormat[] a;

    static {
        ExportFormat[] exportFormatArr = {new ExportFormat("LOG", 0), new ExportFormat("HAR", 1)};
        a = exportFormatArr;
        a.a(exportFormatArr);
    }

    public static ExportFormat valueOf(String str) {
        return (ExportFormat) Enum.valueOf(ExportFormat.class, str);
    }

    public static ExportFormat[] values() {
        return (ExportFormat[]) a.clone();
    }
}
