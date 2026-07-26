package defpackage;

import android.view.View;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.lifecycle.Lifecycle$Event;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class lj implements yp1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lj(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.yp1
    public final void a() {
        i64 i64VarD;
        switch (this.a) {
            case 0:
                SnapshotStateList snapshotStateList = (SnapshotStateList) this.b;
                Object obj = this.c;
                snapshotStateList.remove(obj);
                ((oj) this.d).d.k(obj);
                break;
            case 1:
                ((g64) this.b).D().f((y54) this.c);
                b9 b9Var = (b9) ((Ref$ObjectRef) this.d).a;
                if (b9Var != null) {
                    b9Var.a();
                }
                break;
            case 2:
                ((g64) this.b).D().f((y54) this.c);
                a9 a9Var = (a9) ((Ref$ObjectRef) this.d).a;
                if (a9Var != null) {
                    a9Var.a();
                }
                break;
            case 3:
                g64 g64Var = (g64) this.b;
                if (g64Var != null && (i64VarD = g64Var.D()) != null) {
                    i64VarD.f((bm2) this.c);
                }
                bz0 bz0Var = (bz0) this.d;
                Lifecycle$Event lifecycle$Event = Lifecycle$Event.ON_DESTROY;
                bz0Var.getClass();
                bz0Var.b = lifecycle$Event.a();
                bz0Var.a();
                break;
            case 4:
                cd7 cd7Var = (cd7) this.b;
                rb5 rb5Var = cd7Var.b;
                Object obj2 = this.c;
                Object objK = rb5Var.k(obj2);
                id7 id7Var = (id7) this.d;
                if (objK == id7Var) {
                    Map map = cd7Var.a;
                    Map mapD = id7Var.d();
                    if (!mapD.isEmpty()) {
                        map.put(obj2, mapD);
                    } else {
                        map.remove(obj2);
                    }
                }
                break;
            default:
                ((e62) ((ExoPlayer) this.b)).O((wp4) this.c);
                ((View) this.d).setKeepScreenOn(false);
                break;
        }
    }
}
