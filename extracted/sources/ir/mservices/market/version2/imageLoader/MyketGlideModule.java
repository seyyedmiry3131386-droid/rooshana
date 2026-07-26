package ir.mservices.market.version2.imageLoader;

import android.content.Context;
import com.bumptech.glide.a;
import defpackage.et2;
import defpackage.fb9;
import defpackage.kt4;
import defpackage.ng4;
import defpackage.pj9;
import defpackage.rz5;
import defpackage.w57;
import defpackage.w91;
import defpackage.x57;
import defpackage.y27;
import defpackage.za9;
import defpackage.zo1;
import ir.mservices.market.version2.ApplicationLauncher;

/* JADX INFO: loaded from: classes3.dex */
public class MyketGlideModule extends za9 {
    @Override // defpackage.xq2
    public final void E(Context context, a aVar, y27 y27Var) {
        y27Var.l(new fb9(((x57) ((w91) ApplicationLauncher.o.b()).G.get()).b));
    }

    @Override // defpackage.za9
    public final void O(Context context, et2 et2Var) {
        kt4 kt4Var = new kt4(context);
        kt4Var.e = 0.125f;
        kt4Var.f = 0.1f;
        rz5 rz5Var = new rz5(kt4Var);
        et2Var.i = null;
        et2Var.f = new ng4(rz5Var.b);
        et2Var.m = new pj9((w57) ((w57) new w57().n()).g(zo1.b));
    }
}
