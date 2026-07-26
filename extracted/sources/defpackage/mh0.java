package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mh0 {
    public static final kp0 a = new kp0(-1, null, null, 0);
    public static final int b = o27.k("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 12);
    public static final int c = o27.k("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 12);
    public static final mu3 d = new mu3("BUFFERED", 1);
    public static final mu3 e = new mu3("SHOULD_BUFFER", 1);
    public static final mu3 f = new mu3("S_RESUMING_BY_RCV", 1);
    public static final mu3 g = new mu3("RESUMING_BY_EB", 1);
    public static final mu3 h = new mu3("POISONED", 1);
    public static final mu3 i = new mu3("DONE_RCV", 1);
    public static final mu3 j = new mu3("INTERRUPTED_SEND", 1);
    public static final mu3 k = new mu3("INTERRUPTED_RCV", 1);
    public static final mu3 l = new mu3("CHANNEL_CLOSED", 1);
    public static final mu3 m = new mu3("SUSPEND", 1);
    public static final mu3 n = new mu3("SUSPEND_NO_WAITER", 1);
    public static final mu3 o = new mu3("FAILED", 1);
    public static final mu3 p = new mu3("NO_RECEIVE_RESULT", 1);
    public static final mu3 q = new mu3("CLOSE_HANDLER_CLOSED", 1);
    public static final mu3 r = new mu3("CLOSE_HANDLER_INVOKED", 1);
    public static final mu3 s = new mu3("NO_CLOSE_CAUSE", 1);

    public static final boolean a(nm0 nm0Var, Object obj, rp2 rp2Var) {
        mu3 mu3VarF = nm0Var.f(obj, rp2Var);
        if (mu3VarF == null) {
            return false;
        }
        nm0Var.p(mu3VarF);
        return true;
    }
}
