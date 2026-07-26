package defpackage;

import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;

/* JADX INFO: loaded from: classes.dex */
public final class r54 {
    public static Lifecycle$Event a(Lifecycle$State lifecycle$State) {
        js3.p(lifecycle$State, "state");
        int iOrdinal = lifecycle$State.ordinal();
        if (iOrdinal == 2) {
            return Lifecycle$Event.ON_DESTROY;
        }
        if (iOrdinal == 3) {
            return Lifecycle$Event.ON_STOP;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return Lifecycle$Event.ON_PAUSE;
    }
}
