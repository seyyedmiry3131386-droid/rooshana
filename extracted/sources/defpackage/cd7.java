package defpackage;

import androidx.compose.runtime.internal.a;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class cd7 implements bd7 {
    public static final bn6 e = new bn6(new g66(24), new v27(3), 5);
    public final Map a;
    public final rb5 b;
    public fd7 c;
    public final a67 d;

    public cd7(Map map) {
        this.a = map;
        long[] jArr = ce7.a;
        this.b = new rb5();
        this.d = new a67(2, this);
    }

    @Override // defpackage.bd7
    public final void c(Object obj, a aVar, qz0 qz0Var, int i) {
        int i2;
        qz0Var.c0(533563200);
        if ((i & 6) == 0) {
            i2 = (qz0Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qz0Var.h(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qz0Var.h(this) ? 256 : 128;
        }
        if (qz0Var.R(i2 & 1, (i2 & 147) != 146)) {
            qz0Var.d0(obj);
            Object objM = qz0Var.M();
            av avVar = jz0.a;
            if (objM == avVar) {
                a67 a67Var = this.d;
                if (!((Boolean) a67Var.invoke(obj)).booleanValue()) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                Map map = (Map) this.a.get(obj);
                u58 u58Var = hd7.a;
                id7 id7Var = new id7(new gd7(map, a67Var));
                qz0Var.l0(id7Var);
                objM = id7Var;
            }
            id7 id7Var2 = (id7) objM;
            zk8.c(new um[]{hd7.a.a(id7Var2), sc4.a.a(id7Var2)}, aVar, qz0Var, (i2 & 112) | 8);
            boolean zH = qz0Var.h(this) | qz0Var.h(obj) | qz0Var.h(id7Var2);
            Object objM2 = qz0Var.M();
            if (zH || objM2 == avVar) {
                objM2 = new vt(this, obj, id7Var2, 19);
                qz0Var.l0(objM2);
            }
            zk8.d(tx8.a, (dp2) objM2, qz0Var);
            if (qz0Var.y && qz0Var.G.i == qz0Var.z) {
                qz0Var.z = -1;
                qz0Var.y = false;
            }
            qz0Var.q(false);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ca(i, 15, this, obj, aVar);
        }
    }

    @Override // defpackage.bd7
    public final void f(Object obj) {
        if (this.b.k(obj) == null) {
            this.a.remove(obj);
        }
    }
}
