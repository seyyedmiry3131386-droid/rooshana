package defpackage;

import androidx.media3.session.MediaSessionService;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tp4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ tp4(Object obj, Object obj2, Object obj3, Object obj4, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xp4 xp4Var = (xp4) this.c;
                jq4 jq4Var = (jq4) this.d;
                ImmutableList immutableList = (ImmutableList) this.e;
                y52 y52Var = (y52) this.f;
                dc0 dc0VarA = ((dg1) xp4Var.h).a(jq4Var, immutableList, xp4Var.b, y52Var);
                xp4Var.e.execute(new z52(xp4Var, jq4Var, dc0VarA, this.b, 1));
                return;
            default:
                pr4 pr4Var = (pr4) this.c;
                qf3 qf3Var = (qf3) this.d;
                jr4 jr4Var = (jr4) this.e;
                v11 v11Var = (v11) this.f;
                boolean z = this.b;
                pr4Var.p.remove(qf3Var);
                try {
                    try {
                        MediaSessionService mediaSessionService = (MediaSessionService) pr4Var.n.get();
                        if (mediaSessionService != null) {
                            int i = v11Var.a;
                            int i2 = v11Var.b;
                            hq4 hq4Var = new hq4(jr4Var, i, i2, z, new es4(qf3Var, i2), v11Var.e);
                            jq4 jq4VarE = mediaSessionService.e(hq4Var);
                            if (jq4VarE != null) {
                                mediaSessionService.a(jq4VarE);
                                jq4VarE.a.g.L(qf3Var, hq4Var);
                                return;
                            }
                        }
                    } catch (Exception e) {
                        wn5.l0("MSessionService", "Failed to add a session to session service", e);
                        break;
                    }
                    return;
                } finally {
                    z67.f(qf3Var);
                }
        }
    }
}
