package com.google.common.collect;

import java.util.Comparator;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
abstract class SortedLists$KeyPresentBehavior {
    public static final AnonymousClass1 a;
    public static final AnonymousClass2 b;
    public static final AnonymousClass3 c;
    public static final AnonymousClass4 d;
    public static final /* synthetic */ SortedLists$KeyPresentBehavior[] e;

    /* JADX INFO: renamed from: com.google.common.collect.SortedLists$KeyPresentBehavior$2, reason: invalid class name */
    public enum AnonymousClass2 extends SortedLists$KeyPresentBehavior {
        public AnonymousClass2() {
            super("LAST_PRESENT", 1);
        }

        @Override // com.google.common.collect.SortedLists$KeyPresentBehavior
        public final int a(Comparator comparator, Object obj, List list, int i) {
            int size = list.size() - 1;
            while (i < size) {
                int i2 = ((i + size) + 1) >>> 1;
                if (comparator.compare(list.get(i2), obj) > 0) {
                    size = i2 - 1;
                } else {
                    i = i2;
                }
            }
            return i;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.SortedLists$KeyPresentBehavior$3, reason: invalid class name */
    public enum AnonymousClass3 extends SortedLists$KeyPresentBehavior {
        public AnonymousClass3() {
            super("FIRST_PRESENT", 2);
        }

        @Override // com.google.common.collect.SortedLists$KeyPresentBehavior
        public final int a(Comparator comparator, Object obj, List list, int i) {
            int i2 = 0;
            while (i2 < i) {
                int i3 = (i2 + i) >>> 1;
                if (comparator.compare(list.get(i3), obj) < 0) {
                    i2 = i3 + 1;
                } else {
                    i = i3;
                }
            }
            return i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.collect.SortedLists$KeyPresentBehavior$1] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.common.collect.SortedLists$KeyPresentBehavior$4] */
    static {
        ?? r0 = new SortedLists$KeyPresentBehavior() { // from class: com.google.common.collect.SortedLists$KeyPresentBehavior.1
            @Override // com.google.common.collect.SortedLists$KeyPresentBehavior
            public final int a(Comparator comparator, Object obj, List list, int i) {
                return i;
            }
        };
        a = r0;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        b = anonymousClass2;
        AnonymousClass3 anonymousClass3 = new AnonymousClass3();
        c = anonymousClass3;
        ?? r3 = new SortedLists$KeyPresentBehavior() { // from class: com.google.common.collect.SortedLists$KeyPresentBehavior.4
            @Override // com.google.common.collect.SortedLists$KeyPresentBehavior
            public final int a(Comparator comparator, Object obj, List list, int i) {
                return SortedLists$KeyPresentBehavior.b.a(comparator, obj, list, i) + 1;
            }
        };
        d = r3;
        e = new SortedLists$KeyPresentBehavior[]{r0, anonymousClass2, anonymousClass3, r3, new SortedLists$KeyPresentBehavior() { // from class: com.google.common.collect.SortedLists$KeyPresentBehavior.5
            @Override // com.google.common.collect.SortedLists$KeyPresentBehavior
            public final int a(Comparator comparator, Object obj, List list, int i) {
                return SortedLists$KeyPresentBehavior.c.a(comparator, obj, list, i) - 1;
            }
        }};
    }

    public static SortedLists$KeyPresentBehavior valueOf(String str) {
        return (SortedLists$KeyPresentBehavior) Enum.valueOf(SortedLists$KeyPresentBehavior.class, str);
    }

    public static SortedLists$KeyPresentBehavior[] values() {
        return (SortedLists$KeyPresentBehavior[]) e.clone();
    }

    public abstract int a(Comparator comparator, Object obj, List list, int i);
}
