package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rl9 extends z27 {
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;

    public /* synthetic */ rl9(String str, int i) {
        this.c = i;
        this.d = str;
    }

    @Override // defpackage.z27
    public final /* synthetic */ void j(Object obj) {
        switch (this.c) {
            case 0:
                ((r11) obj).onConnectionResult(this.d, new w11(zm9.b(13)));
                break;
            case 1:
                ((r11) obj).onDisconnected(this.d);
                break;
            default:
                ((c22) obj).onEndpointLost(this.d);
                break;
        }
    }
}
