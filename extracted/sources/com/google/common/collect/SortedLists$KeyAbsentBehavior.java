package com.google.common.collect;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
abstract class SortedLists$KeyAbsentBehavior {
    public static final AnonymousClass1 a;
    public static final AnonymousClass2 b;
    public static final /* synthetic */ SortedLists$KeyAbsentBehavior[] c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.collect.SortedLists$KeyAbsentBehavior$1] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.common.collect.SortedLists$KeyAbsentBehavior$2] */
    static {
        ?? r0 = new SortedLists$KeyAbsentBehavior() { // from class: com.google.common.collect.SortedLists$KeyAbsentBehavior.1
            @Override // com.google.common.collect.SortedLists$KeyAbsentBehavior
            public final int a(int i) {
                return i - 1;
            }
        };
        a = r0;
        ?? r1 = new SortedLists$KeyAbsentBehavior() { // from class: com.google.common.collect.SortedLists$KeyAbsentBehavior.2
            @Override // com.google.common.collect.SortedLists$KeyAbsentBehavior
            public final int a(int i) {
                return i;
            }
        };
        b = r1;
        c = new SortedLists$KeyAbsentBehavior[]{r0, r1, new SortedLists$KeyAbsentBehavior() { // from class: com.google.common.collect.SortedLists$KeyAbsentBehavior.3
            @Override // com.google.common.collect.SortedLists$KeyAbsentBehavior
            public final int a(int i) {
                return ~i;
            }
        }};
    }

    public static SortedLists$KeyAbsentBehavior valueOf(String str) {
        return (SortedLists$KeyAbsentBehavior) Enum.valueOf(SortedLists$KeyAbsentBehavior.class, str);
    }

    public static SortedLists$KeyAbsentBehavior[] values() {
        return (SortedLists$KeyAbsentBehavior[]) c.clone();
    }

    public abstract int a(int i);
}
