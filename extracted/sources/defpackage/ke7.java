package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ke7 {
    public final ArrayList a;
    public final ArrayList b;
    public final ee7 c;
    public final ArrayList d;

    public ke7(ArrayList arrayList, ArrayList arrayList2, ee7 ee7Var, ArrayList arrayList3) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = ee7Var;
        this.d = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ke7.class != obj.getClass()) {
            return false;
        }
        ke7 ke7Var = (ke7) obj;
        return this.a.equals(ke7Var.a) && this.b.equals(ke7Var.b) && js3.i(this.c, ke7Var.c) && this.d.equals(ke7Var.d);
    }

    public final int hashCode() {
        return (this.d.hashCode() * 31) + (this.c.hashCode() * 31) + (this.b.hashCode() * 31) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SceneState(entries=" + this.a + ", overlayScenes=" + this.b + ", currentScene=" + this.c + ", previousScenes=" + this.d + ')';
    }
}
