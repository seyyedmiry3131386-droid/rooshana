package defpackage;

import android.view.View;
import androidx.fragment.app.d;

/* JADX INFO: loaded from: classes.dex */
public final class ok2 extends y40 {
    public final /* synthetic */ d s;

    public ok2(d dVar) {
        this.s = dVar;
    }

    @Override // defpackage.y40
    public final View A(int i) {
        d dVar = this.s;
        View view = dVar.J;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + dVar + " does not have a view");
    }

    @Override // defpackage.y40
    public final boolean B() {
        return this.s.J != null;
    }
}
