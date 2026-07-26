package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class ux8 implements bx4 {
    public static final ux8 b = new ux8(0);
    public final /* synthetic */ int a;

    public /* synthetic */ ux8(int i) {
        this.a = i;
    }

    @Override // defpackage.bx4
    public final ax4 a(vp7 vp7Var) {
        switch (this.a) {
            case 0:
                return vx8.b;
            case 1:
                return new xi0(0, new av(4));
            case 2:
                return new xi0(0, new cv(4));
            case 3:
                return new vx8(1);
            case 4:
                return new x78(vp7Var.t(Uri.class, AssetFileDescriptor.class), 0);
            case 5:
                return new x78(vp7Var.t(Uri.class, ParcelFileDescriptor.class), 0);
            case 6:
                return new x78(vp7Var.t(Uri.class, InputStream.class), 0);
            case 7:
                return new x78(vp7Var.t(ot2.class, InputStream.class), 1);
            default:
                return new v09(vp7Var.t(ot2.class, InputStream.class));
        }
    }
}
