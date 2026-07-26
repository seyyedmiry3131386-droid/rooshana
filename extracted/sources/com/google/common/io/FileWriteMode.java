package com.google.common.io;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class FileWriteMode {
    public static final /* synthetic */ FileWriteMode[] a = {new FileWriteMode("APPEND", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    FileWriteMode EF5;

    public static FileWriteMode valueOf(String str) {
        return (FileWriteMode) Enum.valueOf(FileWriteMode.class, str);
    }

    public static FileWriteMode[] values() {
        return (FileWriteMode[]) a.clone();
    }
}
