package androidx.lifecycle;

import defpackage.r22;
import defpackage.r54;
import defpackage.s54;
import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Lifecycle$Event {
    private static final /* synthetic */ r22 $ENTRIES;
    private static final /* synthetic */ Lifecycle$Event[] $VALUES;
    public static final r54 Companion;
    public static final Lifecycle$Event ON_ANY;
    public static final Lifecycle$Event ON_CREATE;
    public static final Lifecycle$Event ON_DESTROY;
    public static final Lifecycle$Event ON_PAUSE;
    public static final Lifecycle$Event ON_RESUME;
    public static final Lifecycle$Event ON_START;
    public static final Lifecycle$Event ON_STOP;

    static {
        Lifecycle$Event lifecycle$Event = new Lifecycle$Event("ON_CREATE", 0);
        ON_CREATE = lifecycle$Event;
        Lifecycle$Event lifecycle$Event2 = new Lifecycle$Event("ON_START", 1);
        ON_START = lifecycle$Event2;
        Lifecycle$Event lifecycle$Event3 = new Lifecycle$Event("ON_RESUME", 2);
        ON_RESUME = lifecycle$Event3;
        Lifecycle$Event lifecycle$Event4 = new Lifecycle$Event("ON_PAUSE", 3);
        ON_PAUSE = lifecycle$Event4;
        Lifecycle$Event lifecycle$Event5 = new Lifecycle$Event("ON_STOP", 4);
        ON_STOP = lifecycle$Event5;
        Lifecycle$Event lifecycle$Event6 = new Lifecycle$Event("ON_DESTROY", 5);
        ON_DESTROY = lifecycle$Event6;
        Lifecycle$Event lifecycle$Event7 = new Lifecycle$Event("ON_ANY", 6);
        ON_ANY = lifecycle$Event7;
        Lifecycle$Event[] lifecycle$EventArr = {lifecycle$Event, lifecycle$Event2, lifecycle$Event3, lifecycle$Event4, lifecycle$Event5, lifecycle$Event6, lifecycle$Event7};
        $VALUES = lifecycle$EventArr;
        $ENTRIES = kotlin.enums.a.a(lifecycle$EventArr);
        Companion = new r54();
    }

    public static Lifecycle$Event valueOf(String str) {
        return (Lifecycle$Event) Enum.valueOf(Lifecycle$Event.class, str);
    }

    public static Lifecycle$Event[] values() {
        return (Lifecycle$Event[]) $VALUES.clone();
    }

    public final Lifecycle$State a() {
        switch (s54.a[ordinal()]) {
            case 1:
            case 2:
                return Lifecycle$State.c;
            case 3:
            case 4:
                return Lifecycle$State.d;
            case 5:
                return Lifecycle$State.e;
            case 6:
                return Lifecycle$State.a;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
