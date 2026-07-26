package com.google.common.graph;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class GraphConstants$Presence {
    public static final /* synthetic */ GraphConstants$Presence[] a = {new GraphConstants$Presence("EDGE_EXISTS", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    GraphConstants$Presence EF5;

    public static GraphConstants$Presence valueOf(String str) {
        return (GraphConstants$Presence) Enum.valueOf(GraphConstants$Presence.class, str);
    }

    public static GraphConstants$Presence[] values() {
        return (GraphConstants$Presence[]) a.clone();
    }
}
