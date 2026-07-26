package defpackage;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.resource.bitmap.b;

/* JADX INFO: loaded from: classes.dex */
public final class bt4 implements ax4 {
    public final /* synthetic */ int a;
    public final Context b;

    public bt4(Context context, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = context.getApplicationContext();
                break;
            case 2:
                this.b = context.getApplicationContext();
                break;
            default:
                this.b = context;
                break;
        }
    }

    @Override // defpackage.ax4
    public final zw4 a(Object obj, int i, int i2, sv5 sv5Var) {
        Long l;
        switch (this.a) {
            case 0:
                Uri uri = (Uri) obj;
                return new zw4(new yq5(uri), new at4(this.b, uri, 0));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
                    return null;
                }
                yq5 yq5Var = new yq5(uri2);
                Context context = this.b;
                return new zw4(yq5Var, gb1.a(context, uri2, new nm5(1, context.getContentResolver())));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) sv5Var.c(b.d)) == null || l.longValue() != -1) {
                    return null;
                }
                yq5 yq5Var2 = new yq5(uri3);
                Context context2 = this.b;
                return new zw4(yq5Var2, gb1.a(context2, uri3, new qm5(1, context2.getContentResolver())));
        }
    }

    @Override // defpackage.ax4
    public final boolean b(Object obj) {
        switch (this.a) {
            case 0:
                return r3.g((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return r3.g(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return r3.g(uri2) && uri2.getPathSegments().contains("video");
        }
    }
}
