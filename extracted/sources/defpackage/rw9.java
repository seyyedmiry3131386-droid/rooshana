package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rw9 implements qw9 {
    public static final or9 a;

    static {
        xe1 xe1Var = new xe1(nr9.a(), true, true);
        a = xe1Var.C("measurement.client.sessions.enable_fix_background_engagement", false);
        xe1Var.C("measurement.client.sessions.enable_pause_engagement_in_background", true);
        xe1Var.A(0L, "measurement.id.client.sessions.enable_fix_background_engagement");
    }
}
