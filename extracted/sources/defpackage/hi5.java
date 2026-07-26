package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class hi5 {
    public final jx9 a;

    public hi5(ei5 ei5Var) {
        int i = ei5Var.b.b.a;
        jx9 jx9Var = new jx9();
        jx9Var.b = ei5Var.f;
        jx9Var.a = i;
        gi5 gi5Var = ei5Var.h;
        jx9Var.c = gi5Var.a();
        b.I();
        Bundle bundleG = is3.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
        jx9Var.d = bundleG;
        gi5Var.h.w(bundleG);
        this.a = jx9Var;
    }

    public hi5(Bundle bundle) {
        js3.p(bundle, "state");
        bundle.setClassLoader(hi5.class.getClassLoader());
        js3.p(bundle, "state");
        jx9 jx9Var = new jx9();
        String string = bundle.getString("nav-entry-state:id");
        if (string != null) {
            jx9Var.b = string;
            jx9Var.a = t17.b(bundle, "nav-entry-state:destination-id");
            jx9Var.c = t17.c(bundle, "nav-entry-state:args");
            jx9Var.d = t17.c(bundle, "nav-entry-state:saved-state");
            this.a = jx9Var;
            return;
        }
        z17.f("nav-entry-state:id");
        throw null;
    }
}
