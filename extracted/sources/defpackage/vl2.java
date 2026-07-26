package defpackage;

import androidx.fragment.app.d;
import androidx.fragment.app.g;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class vl2 implements tl2 {
    public final /* synthetic */ g a;

    public vl2(g gVar) {
        this.a = gVar;
    }

    @Override // defpackage.tl2
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean zX;
        g gVar = this.a;
        ArrayList<fm2> arrayList5 = gVar.o;
        if (g.N(2)) {
            Objects.toString(gVar.a);
        }
        if (gVar.d.isEmpty()) {
            zX = false;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
        } else {
            p40 p40Var = (p40) o40.u(1, gVar.d);
            gVar.h = p40Var;
            Iterator it = p40Var.a.iterator();
            while (it.hasNext()) {
                d dVar = ((cn2) it.next()).b;
                if (dVar != null) {
                    dVar.n = true;
                }
            }
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            zX = gVar.X(arrayList3, arrayList4, null, -1, 0);
        }
        if (!arrayList5.isEmpty() && arrayList3.size() > 0) {
            boolean zBooleanValue = ((Boolean) arrayList4.get(arrayList3.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(g.I((p40) it2.next()));
            }
            for (fm2 fm2Var : arrayList5) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    fm2Var.b((d) it3.next(), zBooleanValue);
                }
            }
        }
        return zX;
    }
}
