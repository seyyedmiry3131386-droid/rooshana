package org.junit.runners.parameterized;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
final class BlockJUnit4ClassRunnerWithParameters$InjectionType {
    public static final /* synthetic */ BlockJUnit4ClassRunnerWithParameters$InjectionType[] a = {new BlockJUnit4ClassRunnerWithParameters$InjectionType("CONSTRUCTOR", 0), new BlockJUnit4ClassRunnerWithParameters$InjectionType("FIELD", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    BlockJUnit4ClassRunnerWithParameters$InjectionType EF5;

    public static BlockJUnit4ClassRunnerWithParameters$InjectionType valueOf(String str) {
        return (BlockJUnit4ClassRunnerWithParameters$InjectionType) Enum.valueOf(BlockJUnit4ClassRunnerWithParameters$InjectionType.class, str);
    }

    public static BlockJUnit4ClassRunnerWithParameters$InjectionType[] values() {
        return (BlockJUnit4ClassRunnerWithParameters$InjectionType[]) a.clone();
    }
}
