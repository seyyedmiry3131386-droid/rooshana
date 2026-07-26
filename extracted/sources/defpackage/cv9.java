package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cv9 implements bv9 {
    public static final or9 a;
    public static final or9 b;
    public static final or9 c;

    static {
        xe1 xe1Var = new xe1(nr9.a(), true, true);
        xe1Var.C("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        a = xe1Var.C("measurement.audience.refresh_event_count_filters_timestamp", false);
        b = xe1Var.C("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        c = xe1Var.C("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
}
