package androidx.compose.ui.platform;

import android.view.View;
import androidx.lifecycle.Lifecycle$Event;
import defpackage.b64;
import defpackage.bt2;
import defpackage.e51;
import defpackage.fg9;
import defpackage.g51;
import defpackage.g64;
import defpackage.ry;
import defpackage.tx8;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: classes.dex */
public final class r implements b64 {
    public final /* synthetic */ e51 a;
    public final /* synthetic */ androidx.compose.runtime.f b;
    public final /* synthetic */ androidx.compose.runtime.k c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ View e;

    public r(e51 e51Var, androidx.compose.runtime.f fVar, androidx.compose.runtime.k kVar, Ref$ObjectRef ref$ObjectRef, View view) {
        this.a = e51Var;
        this.b = fVar;
        this.c = kVar;
        this.d = ref$ObjectRef;
        this.e = view;
    }

    @Override // defpackage.b64
    public final void g(g64 g64Var, Lifecycle$Event lifecycle$Event) {
        switch (fg9.a[lifecycle$Event.ordinal()]) {
            case 1:
                bt2.G(this.a, null, CoroutineStart.d, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.d, this.c, g64Var, this, this.e, null), 1);
                return;
            case 2:
                androidx.compose.runtime.f fVar = this.b;
                if (fVar != null) {
                    ry ryVar = fVar.b;
                    synchronized (ryVar.c) {
                        try {
                            if (!ryVar.n()) {
                                ArrayList arrayList = (ArrayList) ryVar.d;
                                ryVar.d = (ArrayList) ryVar.e;
                                ryVar.e = arrayList;
                                ryVar.b = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((g51) arrayList.get(i)).resumeWith(tx8.a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                this.c.X();
                return;
            case 3:
                this.c.P();
                return;
            case 4:
                this.c.E();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
