package defpackage;

import android.transition.Transition;
import androidx.fragment.app.SpecialEffectsController$Operation$State;
import androidx.fragment.app.d;

/* JADX INFO: loaded from: classes.dex */
public final class jh1 extends tt9 {
    public final boolean c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh1(p28 p28Var, boolean z, boolean z2) {
        super(p28Var);
        d dVar = p28Var.c;
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State = p28Var.a;
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State2 = SpecialEffectsController$Operation$State.b;
        if (specialEffectsController$Operation$State == specialEffectsController$Operation$State2) {
            if (z) {
                qk2 qk2Var = dVar.M;
            } else {
                dVar.getClass();
            }
        } else if (z) {
            qk2 qk2Var2 = dVar.M;
        } else {
            dVar.getClass();
        }
        if (p28Var.a == specialEffectsController$Operation$State2) {
            if (z) {
                qk2 qk2Var3 = dVar.M;
            } else {
                qk2 qk2Var4 = dVar.M;
            }
        }
        this.c = true;
        Object obj = null;
        if (z2) {
            if (z) {
                qk2 qk2Var5 = dVar.M;
                if (qk2Var5 != null) {
                    Object obj2 = qk2Var5.l;
                    if (obj2 != d.z0) {
                        obj = obj2;
                    } else if (qk2Var5 != null) {
                        obj = qk2Var5.k;
                    }
                }
            } else {
                qk2 qk2Var6 = dVar.M;
                if (qk2Var6 != null) {
                    obj = qk2Var6.k;
                }
            }
        }
        this.d = obj;
    }

    public final kn2 C(Object obj) {
        if (obj == null) {
            return null;
        }
        in2 in2Var = dn2.a;
        if (obj instanceof Transition) {
            return in2Var;
        }
        kn2 kn2Var = dn2.b;
        if (kn2Var != null && kn2Var.g(obj)) {
            return kn2Var;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + ((p28) this.b).c + " is not a valid framework Transition or AndroidX Transition");
    }
}
