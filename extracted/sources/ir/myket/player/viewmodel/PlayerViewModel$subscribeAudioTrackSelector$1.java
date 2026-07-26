package ir.myket.player.viewmodel;

import androidx.media3.exoplayer.ExoPlayer;
import defpackage.ci1;
import defpackage.e62;
import defpackage.fc6;
import defpackage.fi4;
import defpackage.g51;
import defpackage.js3;
import defpackage.rp2;
import defpackage.rz2;
import defpackage.s00;
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
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$subscribeAudioTrackSelector$1", f = "PlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$subscribeAudioTrackSelector$1 extends SuspendLambda implements rp2 {
    public /* synthetic */ fc6 a;
    public /* synthetic */ xc6 b;
    public final /* synthetic */ e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$subscribeAudioTrackSelector$1(g51 g51Var, e eVar) {
        super(3, g51Var);
        this.c = eVar;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        PlayerViewModel$subscribeAudioTrackSelector$1 playerViewModel$subscribeAudioTrackSelector$1 = new PlayerViewModel$subscribeAudioTrackSelector$1((g51) obj3, this.c);
        playerViewModel$subscribeAudioTrackSelector$1.a = (fc6) obj;
        playerViewModel$subscribeAudioTrackSelector$1.b = (xc6) obj2;
        return playerViewModel$subscribeAudioTrackSelector$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        fc6 fc6Var = this.a;
        xc6 xc6Var = this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        e eVar = this.c;
        ExoPlayer exoPlayer = eVar.d;
        s00 s00Var = fc6Var.a;
        js3.p(exoPlayer, "player");
        js3.p(xc6Var, "playerConfig");
        ListIterator listIterator = xc6Var.k.listIterator();
        while (true) {
            rz2 rz2Var = (rz2) listIterator;
            if (!rz2Var.hasNext()) {
                next = null;
                break;
            }
            next = rz2Var.next();
            if (((s00) next).a.equals(s00Var.a)) {
                break;
            }
        }
        s00 s00Var2 = (s00) next;
        e62 e62Var = (e62) exoPlayer;
        e62Var.c1();
        fi4 fi4Var = e62Var.i;
        if (fi4Var != null) {
            vh1 vh1VarE = ((ci1) fi4Var).e();
            vh1VarE.getClass();
            uh1 uh1Var = new uh1(vh1VarE);
            String str = s00Var2 != null ? s00Var2.a : null;
            if (str == null) {
                uh1Var.i(new String[0]);
            } else {
                uh1Var.i(new String[]{str});
            }
            fi4Var.b(new vh1(uh1Var));
        }
        ((s08) ((xc6) eVar.B.a.getValue()).g).setValue(s00Var2);
        return s00Var2;
    }
}
