package defpackage;

import android.view.MenuItem;
import android.view.SubMenu;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xj5 {
    public final ot4 a;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public final ArrayList b = new ArrayList();

    public xj5(ot4 ot4Var) {
        this.a = ot4Var;
        b();
    }

    public final MenuItem a(int i) {
        return (MenuItem) this.b.get(i);
    }

    public final void b() {
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.c = 0;
        this.d = 0;
        this.e = 0;
        int i = 0;
        while (true) {
            ot4 ot4Var = this.a;
            if (i >= ot4Var.f.size()) {
                break;
            }
            MenuItem item = ot4Var.getItem(i);
            if (item.hasSubMenu()) {
                if (!arrayList.isEmpty() && !(o40.u(1, arrayList) instanceof mq1) && item.isVisible()) {
                    arrayList.add(new mq1());
                }
                arrayList.add(item);
                SubMenu subMenu = item.getSubMenu();
                for (int i2 = 0; i2 < subMenu.size(); i2++) {
                    MenuItem item2 = subMenu.getItem(i2);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    arrayList.add(item2);
                    this.c++;
                    if (item2.isVisible()) {
                        this.d++;
                    }
                }
                arrayList.add(new mq1());
            } else {
                arrayList.add(item);
                this.c++;
                if (item.isVisible()) {
                    this.d++;
                    this.e++;
                }
            }
            i++;
        }
        if (arrayList.isEmpty() || !(o40.u(1, arrayList) instanceof mq1)) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }
}
