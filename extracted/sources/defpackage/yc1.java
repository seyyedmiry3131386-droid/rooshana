package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.search.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yc1 implements q94, ms5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yc1(int i, int i2, Object obj) {
        this.c = obj;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.q94
    public void invoke(Object obj) {
        ((ce) obj).n((be) this.c, this.a, this.b);
    }

    @Override // defpackage.ms5
    public lf9 q(View view, lf9 lf9Var) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.c;
        int i = SearchView.E;
        no3 no3VarG = lf9Var.a.g(647);
        marginLayoutParams.leftMargin = this.a + no3VarG.a;
        marginLayoutParams.rightMargin = this.b + no3VarG.c;
        return lf9Var;
    }
}
