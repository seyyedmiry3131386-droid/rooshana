package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ri4 extends rf0 {
    public final Map l;

    public ri4(Map map) {
        this.l = map;
    }

    @Override // defpackage.rf0
    public final void I(vp7 vp7Var, qi4 qi4Var) {
        re8 re8VarM;
        re8 re8VarM2;
        ArrayList arrayList = qi4Var.u;
        if (arrayList.size() > 0) {
            for (ld3 ld3Var : DesugarCollections.unmodifiableList(arrayList)) {
                if (ld3Var.m() && (re8VarM2 = M((String) ld3Var.c)) != null) {
                    re8VarM2.a(vp7Var, this, ld3Var);
                }
            }
            arrayList.clear();
        } else {
            for (ld3 ld3Var2 : Collections.EMPTY_LIST) {
                if (ld3Var2.m() && (re8VarM = M((String) ld3Var2.c)) != null) {
                    re8VarM.a(vp7Var, this, ld3Var2);
                }
            }
        }
        nc2 nc2Var = new nc2(16, this, vp7Var, false);
        kd3 kd3Var = qi4Var.v;
        while (true) {
            kd3 kd3Var2 = kd3Var.e;
            if (kd3Var2 == null) {
                break;
            } else {
                kd3Var = kd3Var2;
            }
        }
        ArrayList arrayList2 = kd3Var.f;
        List listUnmodifiableList = arrayList2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList2);
        if (listUnmodifiableList.size() > 0) {
            nc2Var.i(listUnmodifiableList);
        } else {
            nc2Var.i(Collections.EMPTY_LIST);
        }
        Map map = Collections.EMPTY_MAP;
        qi4Var.v = new kd3("", 0, map, null);
        qi4Var.u.clear();
        qi4Var.v = new kd3("", 0, map, null);
    }

    @Override // defpackage.rf0
    public final re8 M(String str) {
        return (re8) this.l.get(str);
    }
}
