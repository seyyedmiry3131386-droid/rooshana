package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i40 {
    public final ai0 a;
    public final ws5 b;

    public i40(ai0 ai0Var, ws5 ws5Var) {
        this.a = ai0Var;
        this.b = ws5Var;
        if ((ai0Var == null ? ws5Var : ai0Var) == null) {
            throw new IllegalArgumentException("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        }
    }
}
