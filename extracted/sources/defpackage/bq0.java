package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class bq0 {
    public final HashMap a = new HashMap();
    public final HashSet b = new HashSet();
    public ca7 c;
    public boolean d;
    public boolean e;

    public final boolean a(xj4 xj4Var) {
        int id = xj4Var.getId();
        Integer numValueOf = Integer.valueOf(id);
        HashSet hashSet = this.b;
        if (hashSet.contains(numValueOf)) {
            return false;
        }
        xj4 xj4Var2 = (xj4) this.a.get(Integer.valueOf(c()));
        if (xj4Var2 != null) {
            e(xj4Var2, false);
        }
        boolean zAdd = hashSet.add(Integer.valueOf(id));
        if (!xj4Var.isChecked()) {
            xj4Var.setChecked(true);
        }
        return zAdd;
    }

    public final ArrayList b(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(this.b);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof xj4) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public final int c() {
        if (!this.d) {
            return -1;
        }
        HashSet hashSet = this.b;
        if (hashSet.isEmpty()) {
            return -1;
        }
        return ((Integer) hashSet.iterator().next()).intValue();
    }

    public final void d() {
        ca7 ca7Var = this.c;
        if (ca7Var != null) {
            new HashSet(this.b);
            ChipGroup chipGroup = (ChipGroup) ca7Var.b;
            zq0 zq0Var = chipGroup.g;
            if (zq0Var != null) {
                chipGroup.h.b(chipGroup);
                ChipGroup chipGroup2 = (ChipGroup) ((pt2) zq0Var).b;
                if (chipGroup2.h.d) {
                    chipGroup2.getCheckedChipId();
                    throw null;
                }
            }
        }
    }

    public final boolean e(xj4 xj4Var, boolean z) {
        int id = xj4Var.getId();
        Integer numValueOf = Integer.valueOf(id);
        HashSet hashSet = this.b;
        if (!hashSet.contains(numValueOf)) {
            return false;
        }
        if (z && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            xj4Var.setChecked(true);
            return false;
        }
        boolean zRemove = hashSet.remove(Integer.valueOf(id));
        if (xj4Var.isChecked()) {
            xj4Var.setChecked(false);
        }
        return zRemove;
    }
}
