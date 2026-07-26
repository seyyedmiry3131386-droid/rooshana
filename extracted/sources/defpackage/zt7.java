package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.io.IOException;
import kotlin.Result;
import kotlin.b;

/* JADX INFO: loaded from: classes3.dex */
public final class zt7 extends mx {
    public static final /* synthetic */ int k = 0;
    public final /* synthetic */ bu7 i;
    public final /* synthetic */ Context j;

    public zt7(bu7 bu7Var, Context context) {
        this.i = bu7Var;
        this.j = context;
    }

    @Override // defpackage.mx
    public final Object a(Object[] objArr) {
        Object objA;
        Drawable drawable;
        js3.p((Void[]) objArr, "params");
        bu7 bu7Var = this.i;
        k68 k68Var = bu7Var.a;
        k68Var.getClass();
        try {
            zb2.g(new File(k68Var.j()));
        } catch (IOException unused) {
        }
        Context context = this.j;
        try {
            Resources resources = context.getResources();
            js3.o(resources, "getResources(...)");
            int i = yq6.myket_share_image;
            ThreadLocal threadLocal = b77.a;
            drawable = resources.getDrawable(i, null);
        } catch (Throwable th) {
            objA = b.a(th);
        }
        if (drawable == null) {
            throw new Resources.NotFoundException();
        }
        String strJ = bu7Var.a.j();
        String string = context.getResources().getString(rs6.share_description);
        js3.o(string, "getString(...)");
        au7.d(context, drawable, strJ, string, new vd7(26));
        objA = tx8.a;
        Throwable thA = Result.a(objA);
        if (thA != null) {
            thA.toString();
        }
        return null;
    }
}
