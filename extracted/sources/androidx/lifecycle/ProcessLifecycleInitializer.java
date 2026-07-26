package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.js3;
import defpackage.lk6;
import defpackage.mn3;
import defpackage.w54;
import defpackage.wv8;
import defpackage.x54;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements mn3 {
    @Override // defpackage.mn3
    public final List a() {
        return EmptyList.a;
    }

    @Override // defpackage.mn3
    public final Object b(Context context) {
        js3.p(context, "context");
        wv8 wv8VarY = wv8.y(context);
        js3.o(wv8VarY, "getInstance(...)");
        if (!((HashSet) wv8VarY.c).contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!x54.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            js3.n(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new w54());
        }
        ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.i;
        processLifecycleOwner.getClass();
        processLifecycleOwner.e = new Handler();
        processLifecycleOwner.f.d(Lifecycle$Event.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        js3.n(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new lk6(processLifecycleOwner));
        return processLifecycleOwner;
    }
}
