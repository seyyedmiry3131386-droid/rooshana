package androidx.fragment.app;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class SpecialEffectsController$Operation$LifecycleImpact {
    public static final SpecialEffectsController$Operation$LifecycleImpact a;
    public static final SpecialEffectsController$Operation$LifecycleImpact b;
    public static final SpecialEffectsController$Operation$LifecycleImpact c;
    public static final /* synthetic */ SpecialEffectsController$Operation$LifecycleImpact[] d;

    static {
        SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact = new SpecialEffectsController$Operation$LifecycleImpact("NONE", 0);
        a = specialEffectsController$Operation$LifecycleImpact;
        SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact2 = new SpecialEffectsController$Operation$LifecycleImpact("ADDING", 1);
        b = specialEffectsController$Operation$LifecycleImpact2;
        SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact3 = new SpecialEffectsController$Operation$LifecycleImpact("REMOVING", 2);
        c = specialEffectsController$Operation$LifecycleImpact3;
        d = new SpecialEffectsController$Operation$LifecycleImpact[]{specialEffectsController$Operation$LifecycleImpact, specialEffectsController$Operation$LifecycleImpact2, specialEffectsController$Operation$LifecycleImpact3};
    }

    public static SpecialEffectsController$Operation$LifecycleImpact valueOf(String str) {
        return (SpecialEffectsController$Operation$LifecycleImpact) Enum.valueOf(SpecialEffectsController$Operation$LifecycleImpact.class, str);
    }

    public static SpecialEffectsController$Operation$LifecycleImpact[] values() {
        return (SpecialEffectsController$Operation$LifecycleImpact[]) d.clone();
    }
}
