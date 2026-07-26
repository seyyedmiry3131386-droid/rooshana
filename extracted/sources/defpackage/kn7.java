package defpackage;

import androidx.compose.ui.semantics.c;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kn7 {
    public final en7 a;
    public final za5 b;

    public kn7(c cVar, pq3 pq3Var) {
        this.a = cVar.d;
        this.b = new za5(c.j(4, cVar).size());
        List listJ = c.j(4, cVar);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            c cVar2 = (c) listJ.get(i);
            if (pq3Var.a(cVar2.g)) {
                this.b.a(cVar2.g);
            }
        }
    }
}
