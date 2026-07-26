package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aw9 implements zv9 {
    public static final or9 a;
    public static final or9 b;
    public static final or9 c;
    public static final or9 d;
    public static final or9 e;
    public static final or9 f;
    public static final or9 g;
    public static final or9 h;

    static {
        xe1 xe1Var = new xe1(nr9.a(), true, true);
        xe1Var.C("measurement.rb.attribution.ad_campaign_info", true);
        xe1Var.C("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        a = xe1Var.C("measurement.rb.attribution.client2", true);
        b = xe1Var.C("measurement.rb.attribution.followup1.service", false);
        xe1Var.C("measurement.rb.attribution.client.get_trigger_uris_async", true);
        c = xe1Var.C("measurement.rb.attribution.service.trigger_uris_high_priority", true);
        xe1Var.C("measurement.rb.attribution.index_out_of_bounds_fix", true);
        d = xe1Var.C("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        e = xe1Var.C("measurement.rb.attribution.retry_disposition", false);
        f = xe1Var.C("measurement.rb.attribution.service", true);
        g = xe1Var.C("measurement.rb.attribution.enable_trigger_redaction", true);
        h = xe1Var.C("measurement.rb.attribution.uuid_generation", true);
        xe1Var.A(0L, "measurement.id.rb.attribution.retry_disposition");
        xe1Var.C("measurement.rb.attribution.improved_retry", true);
    }
}
