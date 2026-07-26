package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class rf implements ComponentCallbacks2 {
    public final /* synthetic */ Configuration a;
    public final /* synthetic */ zi3 b;

    public rf(Configuration configuration, zi3 zi3Var) {
        this.a = configuration;
        this.b = zi3Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.a;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.b.a.entrySet().iterator();
        while (it.hasNext()) {
            xi3 xi3Var = (xi3) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (xi3Var == null || Configuration.needNewResources(iUpdateFrom, xi3Var.b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.b.a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.b.a.clear();
    }
}
