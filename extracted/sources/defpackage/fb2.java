package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class fb2 implements j67 {
    public final /* synthetic */ int a;

    public /* synthetic */ fb2(int i) {
        this.a = i;
    }

    @Override // defpackage.j67
    public final g67 a(Object obj, int i, int i2, sv5 sv5Var) {
        switch (this.a) {
            case 0:
                return new vj0((File) obj);
            case 1:
                return new vj0((Bitmap) obj);
            default:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new os2(drawable, 1);
                }
                return null;
        }
    }

    @Override // defpackage.j67
    public final /* bridge */ /* synthetic */ boolean b(Object obj, sv5 sv5Var) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }
}
