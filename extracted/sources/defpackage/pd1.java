package defpackage;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* JADX INFO: loaded from: classes.dex */
public final class pd1 extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ qd1 a;

    public pd1(qd1 qd1Var) {
        this.a = qd1Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        rd1 rd1Var;
        qm5 qm5Var;
        h62 h62Var;
        if (audioTrack.equals(this.a.c.w) && (qm5Var = (rd1Var = this.a.c).s) != null && rd1Var.W && (h62Var = ((qm4) qm5Var.b).H) != null) {
            h62Var.a();
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(this.a.c.w)) {
            this.a.c.V = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        rd1 rd1Var;
        qm5 qm5Var;
        h62 h62Var;
        if (audioTrack.equals(this.a.c.w) && (qm5Var = (rd1Var = this.a.c).s) != null && rd1Var.W && (h62Var = ((qm4) qm5Var.b).H) != null) {
            h62Var.a();
        }
    }
}
