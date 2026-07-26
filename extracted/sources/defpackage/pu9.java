package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pu9 implements ou9 {
    public static final or9 a;
    public static final or9 b;

    static {
        xe1 xe1Var = new xe1(nr9.a(), true, true);
        xe1Var.C("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        xe1Var.C("measurement.set_default_event_parameters_with_backfill.service", true);
        xe1Var.A(0L, "measurement.id.set_default_event_parameters.fix_service_request_ordering");
        a = xe1Var.C("measurement.set_default_event_parameters.fix_app_update_logging", true);
        b = xe1Var.C("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        xe1Var.C("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }
}
