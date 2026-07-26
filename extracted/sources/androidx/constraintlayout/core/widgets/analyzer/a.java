package androidx.constraintlayout.core.widgets.analyzer;

import com.j256.ormlite.stmt.query.SimpleComparison;
import defpackage.wj1;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class a implements wj1 {
    public final f d;
    public int f;
    public int g;
    public f a = null;
    public boolean b = false;
    public boolean c = false;
    public DependencyNode$Type e = DependencyNode$Type.a;
    public int h = 1;
    public b i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public a(f fVar) {
        this.d = fVar;
    }

    @Override // defpackage.wj1
    public final void a(wj1 wj1Var) {
        ArrayList<a> arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((a) it.next()).j) {
                return;
            }
        }
        this.c = true;
        f fVar = this.a;
        if (fVar != null) {
            fVar.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        a aVar = null;
        int i = 0;
        for (a aVar2 : arrayList) {
            if (!(aVar2 instanceof b)) {
                i++;
                aVar = aVar2;
            }
        }
        if (aVar != null && i == 1 && aVar.j) {
            b bVar = this.i;
            if (bVar != null) {
                if (!bVar.j) {
                    return;
                } else {
                    this.f = this.h * bVar.g;
                }
            }
            d(aVar.g + this.f);
        }
        f fVar2 = this.a;
        if (fVar2 != null) {
            fVar2.a(this);
        }
    }

    public final void b(f fVar) {
        this.k.add(fVar);
        if (this.j) {
            fVar.a(fVar);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (wj1 wj1Var : this.k) {
            wj1Var.a(wj1Var);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.k0);
        sb.append(":");
        sb.append(this.e);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(SimpleComparison.GREATER_THAN_OPERATION);
        return sb.toString();
    }
}
