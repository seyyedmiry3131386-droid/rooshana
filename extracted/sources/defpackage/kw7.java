package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kw7 extends Thread {
    public final /* synthetic */ lw7 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw7(lw7 lw7Var) {
        super("ExoPlayer:SimpleDecoder");
        this.a = lw7Var;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (this.a.k());
    }
}
