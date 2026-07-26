package defpackage;

import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;

/* JADX INFO: loaded from: classes.dex */
public final class h64 {
    public Lifecycle$State a;
    public b64 b;

    public final void a(g64 g64Var, Lifecycle$Event lifecycle$Event) {
        Lifecycle$State lifecycle$StateA = lifecycle$Event.a();
        Lifecycle$State lifecycle$State = this.a;
        js3.p(lifecycle$State, "state1");
        if (lifecycle$StateA.compareTo(lifecycle$State) < 0) {
            lifecycle$State = lifecycle$StateA;
        }
        this.a = lifecycle$State;
        this.b.g(g64Var, lifecycle$Event);
        this.a = lifecycle$StateA;
    }
}
