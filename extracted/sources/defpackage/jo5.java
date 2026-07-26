package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class jo5 {
    public final zb5 a = new zb5(0, new do5[16]);
    public final mb5 b = new mb5(10);

    public boolean a(ue4 ue4Var, v04 v04Var, ir9 ir9Var, boolean z) {
        zb5 zb5Var = this.a;
        Object[] objArr = zb5Var.a;
        int i = zb5Var.c;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((do5) objArr[i2]).a(ue4Var, v04Var, ir9Var, z) || z2;
        }
        return z2;
    }

    public void b(ir9 ir9Var) {
        zb5 zb5Var = this.a;
        int i = zb5Var.c;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((do5) zb5Var.a[i]).d.b == 0) {
                zb5Var.l(i);
            }
        }
    }
}
