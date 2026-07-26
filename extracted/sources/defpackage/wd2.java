package defpackage;

import androidx.paging.i;
import androidx.paging.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class wd2 {
    public int a;
    public int b;
    public boolean c;
    public final List d;
    public final Object e;
    public Object f;

    public wd2() {
        this.d = new ov();
        this.e = new pa2(23);
    }

    public void a(az5 az5Var) {
        ov ovVar = (ov) this.d;
        pa2 pa2Var = (pa2) this.e;
        js3.p(az5Var, "event");
        this.c = true;
        if (!(az5Var instanceof i)) {
            if (az5Var instanceof yy5) {
                pa2Var.B(null, ia4.c);
                throw null;
            }
            if (az5Var instanceof zy5) {
                zy5 zy5Var = (zy5) az5Var;
                pa2Var.z(zy5Var.a);
                this.f = zy5Var.b;
                return;
            } else {
                if (!(az5Var instanceof j)) {
                    throw new NoWhenBranchMatchedException();
                }
                j jVar = (j) az5Var;
                na4 na4Var = jVar.b;
                if (na4Var != null) {
                    pa2Var.z(na4Var);
                }
                ovVar.clear();
                this.b = 0;
                this.a = 0;
                ovVar.addLast(new mq8(0, jVar.a));
                return;
            }
        }
        i iVar = (i) az5Var;
        na4 na4Var2 = iVar.e;
        int i = iVar.c;
        int i2 = iVar.d;
        List list = iVar.b;
        pa2Var.z(na4Var2);
        this.f = iVar.f;
        int iOrdinal = iVar.a.ordinal();
        if (iOrdinal == 0) {
            ovVar.clear();
            this.b = i2;
            this.a = i;
            ovVar.addAll(list);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.b = i2;
            ovVar.addAll(list);
            return;
        }
        this.a = i;
        int size = list.size() - 1;
        tq3 tq3Var = new tq3(size, wq2.K(size, 0, -1), -1);
        while (tq3Var.c) {
            ovVar.addFirst(list.get(tq3Var.nextInt()));
        }
    }

    public List b() {
        ov ovVar = (ov) this.d;
        if (!this.c) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        na4 na4VarD = ((pa2) this.e).D();
        if (ovVar.isEmpty()) {
            arrayList.add(new zy5(na4VarD, (na4) this.f));
            return arrayList;
        }
        i iVar = i.g;
        arrayList.add(ml9.d(a.P0(ovVar), this.a, this.b, na4VarD, (na4) this.f));
        return arrayList;
    }

    public wd2(mj6 mj6Var, List list) {
        this.f = mj6Var;
        this.d = list;
        this.e = new List[list.size()];
        if (list.isEmpty()) {
            un3.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
