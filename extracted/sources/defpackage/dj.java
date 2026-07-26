package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class dj implements jj {
    public ArrayList a;

    public dj(int i) {
        switch (i) {
            case 2:
                this.a = new ArrayList();
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    @Override // defpackage.jj
    public s70 a() {
        ArrayList arrayList = this.a;
        return ((uy3) arrayList.get(0)).c() ? new su2(arrayList, 1) : new y26(arrayList);
    }

    @Override // defpackage.jj
    public List b() {
        return this.a;
    }

    @Override // defpackage.jj
    public boolean c() {
        ArrayList arrayList = this.a;
        return arrayList.size() == 1 && ((uy3) arrayList.get(0)).c();
    }

    public boolean d(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((bm7) it.next()).c == i) {
                return true;
            }
        }
        return false;
    }

    public void e() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            int i = ((bm7) it.next()).c;
            Pattern pattern = xl7.v;
            if (i == 100 || i == 200) {
                return;
            }
        }
    }

    public bm7 f(int i) {
        return (bm7) this.a.get(i - 1);
    }
}
