package defpackage;

import androidx.fragment.app.d;
import androidx.fragment.app.g;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ul2 implements tl2 {
    public final String a;
    public final int b;
    public final /* synthetic */ g c;

    public ul2(g gVar, String str, int i) {
        this.c = gVar;
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.tl2
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        d dVar = this.c.A;
        if (dVar != null && this.b < 0 && this.a == null && dVar.G().W(-1, 0)) {
            return false;
        }
        return this.c.X(arrayList, arrayList2, this.a, this.b, 1);
    }
}
