package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import ir.mservices.market.myMarket.MyMarketRecyclerListFragment;
import java.io.File;
import java.io.IOException;
import kotlin.Result;
import kotlin.b;

/* JADX INFO: loaded from: classes3.dex */
public final class nd5 extends mx {
    public static final /* synthetic */ int j = 0;
    public final /* synthetic */ MyMarketRecyclerListFragment i;

    public nd5(MyMarketRecyclerListFragment myMarketRecyclerListFragment) {
        this.i = myMarketRecyclerListFragment;
    }

    @Override // defpackage.mx
    public final Object a(Object[] objArr) {
        Object objA;
        Context contextH;
        Drawable drawable;
        js3.p((Void[]) objArr, "params");
        MyMarketRecyclerListFragment myMarketRecyclerListFragment = this.i;
        k68 k68Var = myMarketRecyclerListFragment.k1;
        if (k68Var == null) {
            js3.V("storageUtils");
            throw null;
        }
        try {
            zb2.g(new File(k68Var.j()));
        } catch (IOException unused) {
        }
        try {
            contextH = myMarketRecyclerListFragment.H();
            Resources resourcesK = myMarketRecyclerListFragment.K();
            js3.o(resourcesK, "getResources(...)");
            int i = yq6.myket_share_image;
            ThreadLocal threadLocal = b77.a;
            drawable = resourcesK.getDrawable(i, null);
        } catch (Throwable th) {
            objA = b.a(th);
        }
        if (drawable == null) {
            throw new Resources.NotFoundException();
        }
        k68 k68Var2 = myMarketRecyclerListFragment.k1;
        if (k68Var2 == null) {
            js3.V("storageUtils");
            throw null;
        }
        String strJ = k68Var2.j();
        String strL = myMarketRecyclerListFragment.L(rs6.share_description);
        js3.o(strL, "getString(...)");
        au7.d(contextH, drawable, strJ, strL, new i25(8));
        objA = tx8.a;
        Throwable thA = Result.a(objA);
        if (thA != null) {
            thA.toString();
        }
        return null;
    }
}
