package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.d;
import androidx.fragment.app.g;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.FragmentStrictMode$Flag;
import androidx.fragment.app.strictmode.Violation;
import java.util.Set;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class zm2 {
    public static final ym2 a = ym2.c;

    public static ym2 a(d dVar) {
        while (dVar != null) {
            if (dVar.Q()) {
                dVar.J();
            }
            dVar = dVar.y;
        }
        return a;
    }

    public static void b(ym2 ym2Var, Violation violation) {
        d dVar = violation.a;
        String name = dVar.getClass().getName();
        Set set = ym2Var.a;
        set.contains(FragmentStrictMode$Flag.a);
        if (set.contains(FragmentStrictMode$Flag.b)) {
            g7 g7Var = new g7(name, violation, 23);
            if (!dVar.Q()) {
                g7Var.run();
                throw null;
            }
            Handler handler = dVar.J().x.u;
            if (js3.i(handler.getLooper(), Looper.myLooper())) {
                g7Var.run();
                throw null;
            }
            handler.post(g7Var);
        }
    }

    public static void c(Violation violation) {
        if (g.N(3)) {
            violation.a.getClass();
        }
    }

    public static final void d(d dVar, String str) {
        js3.p(dVar, "fragment");
        js3.p(str, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(dVar, "Attempting to reuse fragment " + dVar + " with previous ID " + str);
        c(fragmentReuseViolation);
        ym2 ym2VarA = a(dVar);
        if (ym2VarA.a.contains(FragmentStrictMode$Flag.c) && e(ym2VarA, dVar.getClass(), FragmentReuseViolation.class)) {
            b(ym2VarA, fragmentReuseViolation);
        }
    }

    public static boolean e(ym2 ym2Var, Class cls, Class cls2) {
        Set set = (Set) ym2Var.b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (js3.i(cls2.getSuperclass(), Violation.class) || !a.h0(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
