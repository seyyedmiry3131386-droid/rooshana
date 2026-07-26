package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class md7 implements pd7 {
    public final bn6 a;
    public boolean b;
    public Bundle c;
    public final c24 d;

    public md7(bn6 bn6Var, x79 x79Var) {
        js3.p(bn6Var, "savedStateRegistry");
        this.a = bn6Var;
        this.d = a.a(new o06(16, x79Var));
    }

    @Override // defpackage.pd7
    public final Bundle a() {
        b.I();
        Bundle bundleG = is3.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleG.putAll(bundle);
        }
        for (Map.Entry entry : ((nd7) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((yx0) ((jd7) entry.getValue()).b.f).a();
            if (!bundleA.isEmpty()) {
                h27.l(bundleG, str, bundleA);
            }
        }
        this.b = false;
        return bundleG;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleO = this.a.o("androidx.lifecycle.internal.SavedStateHandlesProvider");
        b.I();
        Bundle bundleG = is3.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleG.putAll(bundle);
        }
        if (bundleO != null) {
            bundleG.putAll(bundleO);
        }
        this.c = bundleG;
        this.b = true;
    }
}
