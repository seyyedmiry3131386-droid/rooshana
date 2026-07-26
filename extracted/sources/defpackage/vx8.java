package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class vx8 implements ax4 {
    public static final vx8 b = new vx8(0);
    public final /* synthetic */ int a;

    public /* synthetic */ vx8(int i) {
        this.a = i;
    }

    @Override // defpackage.ax4
    public final zw4 a(Object obj, int i, int i2, sv5 sv5Var) {
        switch (this.a) {
            case 0:
                return new zw4(new yq5(obj), new gj0(1, obj));
            case 1:
                File file = (File) obj;
                return new zw4(new yq5(file), new gj0(0, file));
            default:
                return null;
        }
    }

    @Override // defpackage.ax4
    public final boolean b(Object obj) {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }
}
