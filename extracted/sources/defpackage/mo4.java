package defpackage;

import androidx.media3.session.a;
import androidx.media3.session.legacy.MediaSessionCompat$Token;

/* JADX INFO: loaded from: classes.dex */
public final class mo4 extends y {
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo4(a aVar) {
        super(6, false);
        this.c = aVar;
    }

    @Override // defpackage.y
    public final void t() {
        a aVar = this.c;
        ql4 ql4Var = aVar.j;
        if (ql4Var != null) {
            ml4 ml4Var = (ml4) ql4Var.b;
            if (ml4Var.h == null) {
                ml4Var.h = new MediaSessionCompat$Token(ml4Var.b.getSessionToken(), null, null);
            }
            MediaSessionCompat$Token mediaSessionCompat$Token = ml4Var.h;
            gn4 gn4Var = aVar.b;
            gn4Var.j0(new g7(aVar, mediaSessionCompat$Token, 29));
            gn4Var.e.postDelayed(new jo4(aVar, 0), 500L);
        }
    }

    @Override // defpackage.y
    public final void u() {
        this.c.b.a();
    }

    @Override // defpackage.y
    public final void v() {
        this.c.b.a();
    }
}
