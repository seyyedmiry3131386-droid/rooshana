package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.js3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class SpecialEffectsController$Operation$State {
    public static final SpecialEffectsController$Operation$State a;
    public static final SpecialEffectsController$Operation$State b;
    public static final SpecialEffectsController$Operation$State c;
    public static final SpecialEffectsController$Operation$State d;
    public static final /* synthetic */ SpecialEffectsController$Operation$State[] e;

    static {
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State = new SpecialEffectsController$Operation$State("REMOVED", 0);
        a = specialEffectsController$Operation$State;
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State2 = new SpecialEffectsController$Operation$State("VISIBLE", 1);
        b = specialEffectsController$Operation$State2;
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State3 = new SpecialEffectsController$Operation$State("GONE", 2);
        c = specialEffectsController$Operation$State3;
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State4 = new SpecialEffectsController$Operation$State("INVISIBLE", 3);
        d = specialEffectsController$Operation$State4;
        e = new SpecialEffectsController$Operation$State[]{specialEffectsController$Operation$State, specialEffectsController$Operation$State2, specialEffectsController$Operation$State3, specialEffectsController$Operation$State4};
    }

    public static SpecialEffectsController$Operation$State valueOf(String str) {
        return (SpecialEffectsController$Operation$State) Enum.valueOf(SpecialEffectsController$Operation$State.class, str);
    }

    public static SpecialEffectsController$Operation$State[] values() {
        return (SpecialEffectsController$Operation$State[]) e.clone();
    }

    public final void a(View view, ViewGroup viewGroup) {
        js3.p(view, "view");
        js3.p(viewGroup, "container");
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (g.N(2)) {
                    view.toString();
                    viewGroup2.toString();
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            if (g.N(2)) {
                view.toString();
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (g.N(2)) {
                    view.toString();
                    viewGroup.toString();
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (iOrdinal == 2) {
            if (g.N(2)) {
                view.toString();
            }
            view.setVisibility(8);
        } else {
            if (iOrdinal != 3) {
                return;
            }
            if (g.N(2)) {
                view.toString();
            }
            view.setVisibility(4);
        }
    }
}
