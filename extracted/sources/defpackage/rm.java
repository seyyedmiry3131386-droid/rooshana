package defpackage;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class rm implements pd7 {
    public final /* synthetic */ int a;
    public final Object b;

    public rm(bn6 bn6Var) {
        this.a = 1;
        this.b = new LinkedHashSet();
        bn6Var.u("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.pd7
    public final Bundle a() {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                ((AppCompatActivity) this.b).O().getClass();
                return bundle;
            default:
                b.I();
                Bundle bundleG = is3.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
                h27.n(bundleG, "classes_to_restore", a.P0((LinkedHashSet) this.b));
                return bundleG;
        }
    }

    public rm(AppCompatActivity appCompatActivity) {
        this.a = 0;
        this.b = appCompatActivity;
    }
}
