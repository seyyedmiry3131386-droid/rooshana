package ir.myket.player.viewmodel;

import androidx.media3.exoplayer.ExoPlayer;
import defpackage.ci1;
import defpackage.db8;
import defpackage.e62;
import defpackage.fi4;
import defpackage.g51;
import defpackage.ic6;
import defpackage.js3;
import defpackage.rp2;
import defpackage.rz2;
import defpackage.s08;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.uh1;
import defpackage.vh1;
import defpackage.xc6;
import java.util.ListIterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$subscribeSubtitleTrackSelector$1", f = "PlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$subscribeSubtitleTrackSelector$1 extends SuspendLambda implements rp2 {
    public /* synthetic */ ic6 a;
    public /* synthetic */ xc6 b;
    public final /* synthetic */ e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$subscribeSubtitleTrackSelector$1(g51 g51Var, e eVar) {
        super(3, g51Var);
        this.c = eVar;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        PlayerViewModel$subscribeSubtitleTrackSelector$1 playerViewModel$subscribeSubtitleTrackSelector$1 = new PlayerViewModel$subscribeSubtitleTrackSelector$1((g51) obj3, this.c);
        playerViewModel$subscribeSubtitleTrackSelector$1.a = (ic6) obj;
        playerViewModel$subscribeSubtitleTrackSelector$1.b = (xc6) obj2;
        return playerViewModel$subscribeSubtitleTrackSelector$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        ic6 ic6Var = this.a;
        xc6 xc6Var = this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        e eVar = this.c;
        ExoPlayer exoPlayer = eVar.d;
        db8 db8Var = ic6Var.a;
        js3.p(exoPlayer, "player");
        js3.p(xc6Var, "playerConfig");
        ListIterator listIterator = xc6Var.j.listIterator();
        while (true) {
            rz2 rz2Var = (rz2) listIterator;
            if (!rz2Var.hasNext()) {
                next = null;
                break;
            }
            next = rz2Var.next();
            if (((db8) next).a.equals(db8Var.a)) {
                break;
            }
        }
        db8 db8Var2 = (db8) next;
        e62 e62Var = (e62) exoPlayer;
        e62Var.c1();
        fi4 fi4Var = e62Var.i;
        if (fi4Var != null) {
            vh1 vh1VarE = ((ci1) fi4Var).e();
            vh1VarE.getClass();
            uh1 uh1Var = new uh1(vh1VarE);
            uh1Var.j(db8Var2 != null ? db8Var2.a : null);
            fi4Var.b(new vh1(uh1Var));
        }
        ((s08) ((xc6) eVar.B.a.getValue()).f).setValue(db8Var2);
        return db8Var2;
    }
}
