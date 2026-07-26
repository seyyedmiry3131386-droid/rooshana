package defpackage;

import androidx.media3.common.PlaybackException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ao4 implements q94 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlaybackException b;

    public /* synthetic */ ao4(int i, PlaybackException playbackException) {
        this.a = i;
        this.b = playbackException;
    }

    @Override // defpackage.q94
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((eb6) obj).O(this.b);
                break;
            case 1:
                ((eb6) obj).S(this.b);
                break;
            case 2:
                ((eb6) obj).O(this.b);
                break;
            default:
                ((eb6) obj).S(this.b);
                break;
        }
    }
}
