package defpackage;

import android.view.View;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.search.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yj7 implements z99, ms5 {
    public final /* synthetic */ SearchView a;

    public /* synthetic */ yj7(SearchView searchView) {
        this.a = searchView;
    }

    @Override // defpackage.ms5
    public lf9 q(View view, lf9 lf9Var) {
        SearchView.e(this.a, lf9Var);
        return lf9Var;
    }

    @Override // defpackage.z99
    public lf9 t(View view, lf9 lf9Var, aa9 aa9Var) {
        MaterialToolbar materialToolbar = this.a.g;
        boolean zO = o37.o(materialToolbar);
        int i = zO ? aa9Var.c : aa9Var.a;
        int i2 = zO ? aa9Var.a : aa9Var.c;
        no3 no3VarG = lf9Var.a.g(647);
        materialToolbar.setPadding(i + no3VarG.a, aa9Var.b, i2 + no3VarG.c, aa9Var.d);
        return lf9Var;
    }
}
