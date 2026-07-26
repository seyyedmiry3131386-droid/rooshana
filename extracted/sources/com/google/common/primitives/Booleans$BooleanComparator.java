package com.google.common.primitives;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
enum Booleans$BooleanComparator implements Comparator<Boolean> {
    /* JADX INFO: Fake field, exist only in values array */
    TRUE_FIRST(1, "Booleans.trueFirst()"),
    /* JADX INFO: Fake field, exist only in values array */
    FALSE_FIRST(-1, "Booleans.falseFirst()");

    public final int a;
    public final String b;

    Booleans$BooleanComparator(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // java.util.Comparator
    public final int compare(Boolean bool, Boolean bool2) {
        Boolean bool3 = bool2;
        boolean zBooleanValue = bool.booleanValue();
        int i = this.a;
        return (bool3.booleanValue() ? i : 0) - (zBooleanValue ? i : 0);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.b;
    }
}
