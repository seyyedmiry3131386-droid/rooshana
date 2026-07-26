package com.google.common.graph;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class Graphs$NodeVisitState {
    public static final /* synthetic */ Graphs$NodeVisitState[] a = {new Graphs$NodeVisitState("PENDING", 0), new Graphs$NodeVisitState("COMPLETE", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    Graphs$NodeVisitState EF5;

    public static Graphs$NodeVisitState valueOf(String str) {
        return (Graphs$NodeVisitState) Enum.valueOf(Graphs$NodeVisitState.class, str);
    }

    public static Graphs$NodeVisitState[] values() {
        return (Graphs$NodeVisitState[]) a.clone();
    }
}
