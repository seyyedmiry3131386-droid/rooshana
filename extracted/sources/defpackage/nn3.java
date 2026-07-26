package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class nn3 extends ug6 {
    public final boolean l;

    public nn3(String str, on3 on3Var) {
        super(str, on3Var, 1);
        this.l = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [c24, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [c24, java.lang.Object] */
    @Override // defpackage.ug6
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nn3) {
            no7 no7Var = (no7) obj;
            if (this.a.equals(no7Var.a())) {
                nn3 nn3Var = (nn3) obj;
                if (nn3Var.l && Arrays.equals((no7[]) this.j.getValue(), (no7[]) nn3Var.j.getValue())) {
                    int iE = no7Var.e();
                    int i = this.c;
                    if (i == iE) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (js3.i(h(i2).a(), no7Var.h(i2).a()) && js3.i(h(i2).getKind(), no7Var.h(i2).getKind())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.ug6
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // defpackage.ug6, defpackage.no7
    public final boolean isInline() {
        return this.l;
    }
}
