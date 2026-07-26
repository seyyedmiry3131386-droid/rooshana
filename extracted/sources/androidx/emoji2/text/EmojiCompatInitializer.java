package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.bi2;
import defpackage.fy0;
import defpackage.g64;
import defpackage.gu;
import defpackage.i64;
import defpackage.mn3;
import defpackage.wv8;
import defpackage.zz1;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements mn3 {
    @Override // defpackage.mn3
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.mn3
    public final Object b(Context context) {
        bi2 bi2Var = new bi2(new gu(context));
        bi2Var.a = 1;
        if (zz1.k == null) {
            synchronized (zz1.j) {
                try {
                    if (zz1.k == null) {
                        zz1.k = new zz1(bi2Var);
                    }
                } finally {
                }
            }
        }
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        Object objT;
        wv8 wv8VarY = wv8.y(context);
        wv8VarY.getClass();
        synchronized (wv8.f) {
            try {
                objT = ((HashMap) wv8VarY.b).get(ProcessLifecycleInitializer.class);
                if (objT == null) {
                    objT = wv8VarY.t(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        i64 i64VarD = ((g64) objT).D();
        i64VarD.a(new fy0(this, i64VarD));
    }
}
