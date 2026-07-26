package androidx.compose.foundation.gestures;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class DragDetectionState$AwaitDown$AwaitTouchSlop {
    public static final DragDetectionState$AwaitDown$AwaitTouchSlop a;
    public static final DragDetectionState$AwaitDown$AwaitTouchSlop b;
    public static final DragDetectionState$AwaitDown$AwaitTouchSlop c;
    public static final /* synthetic */ DragDetectionState$AwaitDown$AwaitTouchSlop[] d;

    static {
        DragDetectionState$AwaitDown$AwaitTouchSlop dragDetectionState$AwaitDown$AwaitTouchSlop = new DragDetectionState$AwaitDown$AwaitTouchSlop("Yes", 0);
        a = dragDetectionState$AwaitDown$AwaitTouchSlop;
        DragDetectionState$AwaitDown$AwaitTouchSlop dragDetectionState$AwaitDown$AwaitTouchSlop2 = new DragDetectionState$AwaitDown$AwaitTouchSlop("No", 1);
        b = dragDetectionState$AwaitDown$AwaitTouchSlop2;
        DragDetectionState$AwaitDown$AwaitTouchSlop dragDetectionState$AwaitDown$AwaitTouchSlop3 = new DragDetectionState$AwaitDown$AwaitTouchSlop("NotInitialized", 2);
        c = dragDetectionState$AwaitDown$AwaitTouchSlop3;
        DragDetectionState$AwaitDown$AwaitTouchSlop[] dragDetectionState$AwaitDown$AwaitTouchSlopArr = {dragDetectionState$AwaitDown$AwaitTouchSlop, dragDetectionState$AwaitDown$AwaitTouchSlop2, dragDetectionState$AwaitDown$AwaitTouchSlop3};
        d = dragDetectionState$AwaitDown$AwaitTouchSlopArr;
        kotlin.enums.a.a(dragDetectionState$AwaitDown$AwaitTouchSlopArr);
    }

    public static DragDetectionState$AwaitDown$AwaitTouchSlop valueOf(String str) {
        return (DragDetectionState$AwaitDown$AwaitTouchSlop) Enum.valueOf(DragDetectionState$AwaitDown$AwaitTouchSlop.class, str);
    }

    public static DragDetectionState$AwaitDown$AwaitTouchSlop[] values() {
        return (DragDetectionState$AwaitDown$AwaitTouchSlop[]) d.clone();
    }
}
