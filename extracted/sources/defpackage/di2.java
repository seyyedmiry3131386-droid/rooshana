package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class di2 implements o31 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ di2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.o31
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ei2 ei2Var = (ei2) obj;
                if (ei2Var == null) {
                    ei2Var = new ei2(-3);
                }
                ((qq4) this.b).y(ei2Var);
                return;
            default:
                ei2 ei2Var2 = (ei2) obj;
                synchronized (fi2.c) {
                    try {
                        fw7 fw7Var = fi2.d;
                        ArrayList arrayList = (ArrayList) fw7Var.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        fw7Var.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((o31) arrayList.get(i)).accept(ei2Var2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
