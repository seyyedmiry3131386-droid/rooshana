package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class xi0 implements ax4 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ xi0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ax4
    public final zw4 a(Object obj, int i, int i2, sv5 sv5Var) {
        switch (this.a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new zw4(new yq5(bArr), new at4(bArr, (wi0) this.b, 1));
            case 1:
                return new zw4(new yq5(obj), new gb1(obj.toString(), (av) this.b, 0));
            case 2:
                File file = (File) obj;
                return new zw4(new yq5(file), new gb1(file, (mb2) this.b, 1));
            default:
                ot2 ot2Var = (ot2) obj;
                return new zw4(ot2Var, new eb9((l37) this.b, ot2Var));
        }
    }

    @Override // defpackage.ax4
    public final boolean b(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return true;
    }
}
