package androidx.compose.material3.internal;

import ir.mservices.market.version2.webapi.responsedto.ApplicationStateDto;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class SwipeEdge {
    public static final /* synthetic */ SwipeEdge[] a;

    static {
        SwipeEdge[] swipeEdgeArr = {new SwipeEdge("Left", 0), new SwipeEdge("Right", 1), new SwipeEdge(ApplicationStateDto.STATE_NONE, 2)};
        a = swipeEdgeArr;
        kotlin.enums.a.a(swipeEdgeArr);
    }

    public static SwipeEdge valueOf(String str) {
        return (SwipeEdge) Enum.valueOf(SwipeEdge.class, str);
    }

    public static SwipeEdge[] values() {
        return (SwipeEdge[]) a.clone();
    }
}
