package defpackage;

import android.view.View;
import androidx.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class mn2 implements gr8 {
    public final /* synthetic */ View a;
    public final /* synthetic */ ArrayList b;

    public mn2(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    @Override // defpackage.gr8
    public final void b(Transition transition) {
        transition.C(this);
        transition.a(this);
    }

    @Override // defpackage.gr8
    public final void c(Transition transition) {
        b(transition);
    }

    @Override // defpackage.gr8
    public final void d(Transition transition) {
        transition.C(this);
        this.a.setVisibility(8);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // defpackage.gr8
    public final void e(Transition transition) {
        d(transition);
    }

    @Override // defpackage.gr8
    public final void a() {
    }

    @Override // defpackage.gr8
    public final void g() {
    }

    @Override // defpackage.gr8
    public final void f(Transition transition) {
    }
}
