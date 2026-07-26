package com.microsoft.clarity.a;

import android.view.View;
import defpackage.bp2;
import defpackage.js3;
import defpackage.tx8;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends Lambda implements bp2 {
    public final /* synthetic */ View a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(View view) {
        super(0);
        this.a = view;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        tx8 tx8Var;
        Object obj = I.p;
        View view = this.a;
        synchronized (obj) {
            try {
                com.microsoft.clarity.i.t tVar = I.a;
                if (tVar != null) {
                    tVar.a(view);
                } else {
                    ArrayList arrayList = I.d;
                    if (!(arrayList != null) || !arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (js3.i(((WeakReference) it.next()).get(), view)) {
                                break;
                            }
                        }
                    }
                    I.d.add(new WeakReference(view));
                }
                tx8Var = tx8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tx8Var;
    }
}
