package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class po1 implements bx4 {
    public final /* synthetic */ int a;
    public final Context b;

    public /* synthetic */ po1(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.bx4
    public final ax4 a(vp7 vp7Var) {
        switch (this.a) {
            case 0:
                return new sw(this.b, this);
            case 1:
                return new sw(this.b, this);
            case 2:
                return new sw(this.b, this);
            case 3:
                return new bt4(this.b, 0);
            case 4:
                return new bt4(this.b, 1);
            case 5:
                return new bt4(this.b, 2);
            case 6:
                return new sw(this.b, vp7Var.t(Integer.class, AssetFileDescriptor.class));
            default:
                return new sw(this.b, vp7Var.t(Integer.class, InputStream.class));
        }
    }
}
