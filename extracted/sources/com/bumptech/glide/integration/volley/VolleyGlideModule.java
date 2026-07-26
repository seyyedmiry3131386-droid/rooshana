package com.bumptech.glide.integration.volley;

import android.content.Context;
import com.bumptech.glide.a;
import defpackage.at2;
import defpackage.bn6;
import defpackage.do3;
import defpackage.fb9;
import defpackage.l37;
import defpackage.nv;
import defpackage.y27;
import defpackage.ze3;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class VolleyGlideModule {
    public final void a(Context context, a aVar, y27 y27Var) {
        if (fb9.c == null) {
            synchronized (fb9.class) {
                try {
                    if (fb9.c == null) {
                        l37 l37Var = new l37(new nv(new bn6(context.getApplicationContext(), 17)), new do3((at2) new ze3()));
                        l37Var.j();
                        fb9.c = l37Var;
                    }
                } finally {
                }
            }
        }
        y27Var.l(new fb9(fb9.c));
    }
}
