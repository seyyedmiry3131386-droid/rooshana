package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class r67 implements bx4 {
    public final /* synthetic */ int a;
    public final Resources b;

    public /* synthetic */ r67(Resources resources, int i) {
        this.a = i;
        this.b = resources;
    }

    @Override // defpackage.bx4
    public final ax4 a(vp7 vp7Var) {
        switch (this.a) {
            case 0:
                return new sw(this.b, vp7Var.t(Uri.class, AssetFileDescriptor.class));
            case 1:
                return new sw(this.b, vp7Var.t(Uri.class, InputStream.class));
            default:
                return new sw(this.b, vx8.b);
        }
    }
}
