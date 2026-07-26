package io.sentry;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.o40;
import io.sentry.rrweb.RRWebEventType;
import io.sentry.rrweb.RRWebIncrementalSnapshotEvent$IncrementalSource;
import io.sentry.vendor.gson.stream.JsonToken;
import ir.mservices.market.version2.webapi.responsedto.LayoutPageDTO;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.pcap4j.packet.Dot11LinkAdaptationControl;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements s1 {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i) {
        this.a = i;
    }

    public static k6 b(h3 h3Var, u0 u0Var) {
        String strM0;
        h3Var.P0();
        io.sentry.protocol.v vVar = null;
        m6 m6Var = null;
        String strT = null;
        ConcurrentHashMap concurrentHashMap = null;
        m6 m6Var2 = null;
        String strT2 = null;
        SpanStatus spanStatus = null;
        String strT3 = null;
        ConcurrentHashMap concurrentHashMapQ = null;
        Map map = null;
        while (h3Var.peek() == JsonToken.NAME) {
            strM0 = h3Var.m0();
            strM0.getClass();
            switch (strM0) {
                case "span_id":
                    m6Var = new m6(h3Var.t());
                    break;
                case "parent_span_id":
                    m6Var2 = (m6) h3Var.M0(u0Var, new e(23));
                    break;
                case "description":
                    strT2 = h3Var.t();
                    break;
                case "origin":
                    strT3 = h3Var.t();
                    break;
                case "status":
                    spanStatus = (SpanStatus) h3Var.M0(u0Var, new e(24));
                    break;
                case "op":
                    strT = h3Var.t();
                    break;
                case "data":
                    map = (Map) h3Var.O0();
                    break;
                case "tags":
                    concurrentHashMapQ = io.sentry.config.a.Q((Map) h3Var.O0());
                    break;
                case "trace_id":
                    vVar = new io.sentry.protocol.v(h3Var.t());
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    h3Var.H(u0Var, concurrentHashMap, strM0);
                    break;
            }
        }
        if (vVar == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
            u0Var.f(SentryLevel.ERROR, "Missing required field \"trace_id\"", illegalStateException);
            throw illegalStateException;
        }
        if (m6Var == null) {
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
            u0Var.f(SentryLevel.ERROR, "Missing required field \"span_id\"", illegalStateException2);
            throw illegalStateException2;
        }
        if (strT == null) {
            strT = "";
        }
        k6 k6Var = new k6(vVar, m6Var, strT, m6Var2);
        k6Var.f = strT2;
        k6Var.g = spanStatus;
        k6Var.i = strT3;
        if (concurrentHashMapQ != null) {
            k6Var.h = concurrentHashMapQ;
        }
        if (map != null) {
            k6Var.j = map;
        }
        k6Var.k = concurrentHashMap;
        h3Var.t0();
        return k6Var;
    }

    private final Object c(h3 h3Var, u0 u0Var) {
        String strM0;
        h3Var.P0();
        ConcurrentHashMap concurrentHashMap = null;
        io.sentry.protocol.v vVar = null;
        String strT = null;
        String strS = null;
        String strS2 = null;
        String strS3 = null;
        String strS4 = null;
        String strS5 = null;
        String strS6 = null;
        io.sentry.protocol.v vVar2 = null;
        String strS7 = null;
        while (h3Var.peek() == JsonToken.NAME) {
            strM0 = h3Var.m0();
            strM0.getClass();
            switch (strM0) {
                case "replay_id":
                    vVar2 = new io.sentry.protocol.v(h3Var.t());
                    break;
                case "user_id":
                    strS3 = h3Var.S();
                    break;
                case "environment":
                    strS2 = h3Var.S();
                    break;
                case "sample_rand":
                    strS7 = h3Var.S();
                    break;
                case "sample_rate":
                    strS5 = h3Var.S();
                    break;
                case "release":
                    strS = h3Var.S();
                    break;
                case "trace_id":
                    vVar = new io.sentry.protocol.v(h3Var.t());
                    break;
                case "sampled":
                    strS6 = h3Var.S();
                    break;
                case "public_key":
                    strT = h3Var.t();
                    break;
                case "transaction":
                    strS4 = h3Var.S();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    h3Var.H(u0Var, concurrentHashMap, strM0);
                    break;
            }
        }
        if (vVar == null) {
            throw e(u0Var, "trace_id");
        }
        if (strT == null) {
            throw e(u0Var, "public_key");
        }
        n6 n6Var = new n6(vVar, strT, strS, strS2, strS3, strS4, strS5, strS6, vVar2, strS7);
        n6Var.k = concurrentHashMap;
        h3Var.t0();
        return n6Var;
    }

    public static IllegalStateException d(u0 u0Var, String str) {
        String strY = o40.y("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strY);
        u0Var.f(SentryLevel.ERROR, strY, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException e(u0 u0Var, String str) {
        String strY = o40.y("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strY);
        u0Var.f(SentryLevel.ERROR, strY, illegalStateException);
        return illegalStateException;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r52v0, types: [io.sentry.u0] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // io.sentry.s1
    public final Object a(h3 h3Var, u0 u0Var) {
        ?? r9;
        String strM0;
        byte b;
        String strM02;
        ArrayList arrayList;
        String strM03;
        String strM04;
        String strM05;
        int i;
        String strM06;
        String strM07;
        String strM08;
        String strM09;
        String strM010;
        Integer num;
        String strM011;
        h3 h3Var2 = h3Var;
        int i2 = 17;
        int i3 = 11;
        switch (this.a) {
            case 0:
                boolean z = true;
                char c = 2;
                String strS = null;
                h3Var2.P0();
                Date dateZ = io.sentry.config.a.z();
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                String strS2 = null;
                String strS3 = null;
                ConcurrentHashMap concurrentHashMap2 = null;
                String strS4 = null;
                SentryLevel sentryLevelValueOf = null;
                Date date = dateZ;
                while (h3Var2.peek() == JsonToken.NAME) {
                    String strM012 = h3Var2.m0();
                    strM012.getClass();
                    switch (strM012.hashCode()) {
                        case -1008619738:
                            r9 = strM012.equals(AppMeasurementSdk.ConditionalUserProperty.ORIGIN) ? 0 : -1;
                            break;
                        case 3076010:
                            r9 = strM012.equals("data") ? z : -1;
                            break;
                        case 3575610:
                            r9 = strM012.equals("type") ? c : -1;
                            break;
                        case 50511102:
                            r9 = strM012.equals(LayoutPageDTO.Type.CATEGORY) ? 3 : -1;
                            break;
                        case 55126294:
                            r9 = strM012.equals("timestamp") ? 4 : -1;
                            break;
                        case 102865796:
                            r9 = strM012.equals("level") ? 5 : -1;
                            break;
                        case 954925063:
                            r9 = strM012.equals("message") ? 6 : -1;
                            break;
                        default:
                            r9 = -1;
                            break;
                    }
                    switch (r9) {
                        case 0:
                            strS4 = h3Var.S();
                            continue;
                            h3Var2 = h3Var;
                            z = true;
                            c = 2;
                            break;
                        case 1:
                            ConcurrentHashMap concurrentHashMapQ = io.sentry.config.a.Q((Map) h3Var.O0());
                            if (concurrentHashMapQ != null) {
                                concurrentHashMap = concurrentHashMapQ;
                            } else {
                                continue;
                            }
                            h3Var2 = h3Var;
                            z = true;
                            c = 2;
                            break;
                        case 2:
                            strS2 = h3Var.S();
                            continue;
                            h3Var2 = h3Var;
                            z = true;
                            c = 2;
                            break;
                        case 3:
                            strS3 = h3Var.S();
                            continue;
                            h3Var2 = h3Var;
                            z = true;
                            c = 2;
                            break;
                        case 4:
                            Date dateV0 = h3Var.v0(u0Var);
                            if (dateV0 != null) {
                                date = dateV0;
                            } else {
                                continue;
                            }
                            h3Var2 = h3Var;
                            z = true;
                            c = 2;
                            break;
                        case 5:
                            try {
                                sentryLevelValueOf = SentryLevel.valueOf(h3Var2.t().toUpperCase(Locale.ROOT));
                            } catch (Exception e) {
                                u0Var.e(SentryLevel.ERROR, e, "Error when deserializing SentryLevel", new Object[0]);
                            }
                            break;
                        case 6:
                            strS = h3Var2.S();
                            break;
                        default:
                            if (concurrentHashMap2 == null) {
                                concurrentHashMap2 = new ConcurrentHashMap();
                            }
                            h3Var2.H(u0Var, concurrentHashMap2, strM012);
                            break;
                    }
                    h3Var2 = h3Var;
                    z = true;
                    c = 2;
                }
                f fVar = new f(date);
                fVar.d = strS;
                fVar.e = strS2;
                fVar.f = concurrentHashMap;
                fVar.g = strS3;
                fVar.h = strS4;
                fVar.i = sentryLevelValueOf;
                fVar.j = concurrentHashMap2;
                h3Var.t0();
                return fVar;
            case 1:
                ConcurrentHashMap concurrentHashMap3 = null;
                h3Var2.P0();
                io.sentry.protocol.v vVar = io.sentry.protocol.v.b;
                n3 n3Var = new n3(vVar, vVar, null, new HashMap(), Double.valueOf(0.0d), "android", b6.empty());
                while (h3Var2.peek() == JsonToken.NAME) {
                    strM0 = h3Var2.m0();
                    strM0.getClass();
                    switch (strM0) {
                        case "debug_meta":
                            io.sentry.protocol.f fVar2 = (io.sentry.protocol.f) h3Var2.M0(u0Var, new io.sentry.clientreport.a(8));
                            if (fVar2 == null) {
                                break;
                            } else {
                                n3Var.a = fVar2;
                                break;
                            }
                            break;
                        case "measurements":
                            HashMap mapV = h3Var2.V(u0Var, new io.sentry.clientreport.a(2));
                            if (mapV != null) {
                                n3Var.e.putAll(mapV);
                            }
                            break;
                        case "profile":
                            io.sentry.protocol.profiling.a aVar = (io.sentry.protocol.profiling.a) h3Var2.M0(u0Var, new io.sentry.protocol.b0(5));
                            if (aVar != null) {
                                n3Var.m = aVar;
                            }
                            break;
                        case "environment":
                            String strS5 = h3Var2.S();
                            if (strS5 != null) {
                                n3Var.h = strS5;
                            }
                            break;
                        case "timestamp":
                            Double dH0 = h3Var2.h0();
                            if (dH0 != null) {
                                n3Var.j = dH0.doubleValue();
                            }
                            break;
                        case "profiler_id":
                            io.sentry.protocol.v vVar2 = (io.sentry.protocol.v) h3Var2.M0(u0Var, new io.sentry.clientreport.a(23));
                            if (vVar2 != null) {
                                n3Var.b = vVar2;
                            }
                            break;
                        case "version":
                            String strS6 = h3Var2.S();
                            if (strS6 != null) {
                                n3Var.i = strS6;
                            }
                            break;
                        case "release":
                            String strS7 = h3Var2.S();
                            if (strS7 != null) {
                                n3Var.g = strS7;
                            }
                            break;
                        case "client_sdk":
                            io.sentry.protocol.t tVar = (io.sentry.protocol.t) h3Var2.M0(u0Var, new io.sentry.clientreport.a(21));
                            if (tVar != null) {
                                n3Var.d = tVar;
                            }
                            break;
                        case "platform":
                            String strS8 = h3Var2.S();
                            if (strS8 != null) {
                                n3Var.f = strS8;
                            }
                            break;
                        case "sampled_profile":
                            String strS9 = h3Var2.S();
                            if (strS9 != null) {
                                n3Var.l = strS9;
                            }
                            break;
                        case "chunk_id":
                            io.sentry.protocol.v vVar3 = (io.sentry.protocol.v) h3Var2.M0(u0Var, new io.sentry.clientreport.a(23));
                            if (vVar3 != null) {
                                n3Var.c = vVar3;
                            }
                            break;
                        default:
                            if (concurrentHashMap3 == null) {
                                concurrentHashMap3 = new ConcurrentHashMap();
                            }
                            h3Var2.H(u0Var, concurrentHashMap3, strM0);
                            break;
                    }
                }
                n3Var.n = concurrentHashMap3;
                h3Var2.t0();
                return n3Var;
            case 2:
                ConcurrentHashMap concurrentHashMap4 = null;
                h3Var2.P0();
                o3 o3Var = new o3(io.sentry.protocol.v.b);
                while (h3Var2.peek() == JsonToken.NAME) {
                    String strM013 = h3Var2.m0();
                    strM013.getClass();
                    if (strM013.equals("profiler_id")) {
                        io.sentry.protocol.v vVar4 = (io.sentry.protocol.v) h3Var2.M0(u0Var, new io.sentry.clientreport.a(23));
                        if (vVar4 != null) {
                            o3Var.a = vVar4;
                        }
                    } else {
                        if (concurrentHashMap4 == null) {
                            concurrentHashMap4 = new ConcurrentHashMap();
                        }
                        h3Var2.H(u0Var, concurrentHashMap4, strM013);
                    }
                }
                o3Var.b = concurrentHashMap4;
                h3Var2.t0();
                return o3Var;
            case 3:
                h3Var2.P0();
                File file = new File("dummy");
                Date dateZ2 = io.sentry.config.a.z();
                ArrayList arrayList2 = new ArrayList();
                io.sentry.protocol.v vVar5 = io.sentry.protocol.v.b;
                ConcurrentHashMap concurrentHashMap5 = null;
                p3 p3Var = new p3(file, dateZ2, arrayList2, "", vVar5.toString(), new k6(vVar5, m6.b, "op", null).a.toString(), "0", 0, "", new i0(2), null, null, null, null, null, null, null, null, "normal", new HashMap());
                while (h3Var2.peek() == JsonToken.NAME) {
                    String strM014 = h3Var2.m0();
                    strM014.getClass();
                    switch (strM014.hashCode()) {
                        case -2133529830:
                            b = strM014.equals("device_manufacturer") ? (byte) 0 : (byte) -1;
                            break;
                        case -1981468849:
                            b = strM014.equals("android_api_level") ? (byte) 1 : (byte) -1;
                            break;
                        case -1430655860:
                            b = strM014.equals("build_id") ? (byte) 2 : (byte) -1;
                            break;
                        case -1172160413:
                            b = strM014.equals("device_locale") ? (byte) 3 : (byte) -1;
                            break;
                        case -1102636175:
                            b = strM014.equals("profile_id") ? (byte) 4 : (byte) -1;
                            break;
                        case -716656436:
                            b = strM014.equals("device_os_build_number") ? (byte) 5 : (byte) -1;
                            break;
                        case -591076352:
                            b = strM014.equals("device_model") ? (byte) 6 : (byte) -1;
                            break;
                        case -512511455:
                            b = strM014.equals("device_is_emulator") ? (byte) 7 : (byte) -1;
                            break;
                        case -478065584:
                            b = strM014.equals("duration_ns") ? (byte) 8 : (byte) -1;
                            break;
                        case -362243017:
                            b = strM014.equals("measurements") ? (byte) 9 : (byte) -1;
                            break;
                        case -332426004:
                            b = strM014.equals("device_physical_memory_bytes") ? (byte) 10 : (byte) -1;
                            break;
                        case -212264198:
                            b = strM014.equals("device_cpu_frequencies") ? (byte) 11 : (byte) -1;
                            break;
                        case -102985484:
                            b = strM014.equals("version_code") ? (byte) 12 : (byte) -1;
                            break;
                        case -102670958:
                            b = strM014.equals("version_name") ? (byte) 13 : (byte) -1;
                            break;
                        case -85904877:
                            b = strM014.equals("environment") ? Dot11LinkAdaptationControl.ASELI : (byte) -1;
                            break;
                        case 55126294:
                            b = strM014.equals("timestamp") ? (byte) 15 : (byte) -1;
                            break;
                        case 508853068:
                            b = strM014.equals("transaction_name") ? (byte) 16 : (byte) -1;
                            break;
                        case 796476189:
                            b = strM014.equals("device_os_name") ? (byte) 17 : (byte) -1;
                            break;
                        case 839674195:
                            b = strM014.equals("architecture") ? (byte) 18 : (byte) -1;
                            break;
                        case 1010584092:
                            b = strM014.equals("transaction_id") ? (byte) 19 : (byte) -1;
                            break;
                        case 1052553990:
                            b = strM014.equals("device_os_version") ? (byte) 20 : (byte) -1;
                            break;
                        case 1163928186:
                            b = strM014.equals("truncation_reason") ? (byte) 21 : (byte) -1;
                            break;
                        case 1270300245:
                            b = strM014.equals("trace_id") ? (byte) 22 : (byte) -1;
                            break;
                        case 1874684019:
                            b = strM014.equals("platform") ? (byte) 23 : (byte) -1;
                            break;
                        case 1953158756:
                            b = strM014.equals("sampled_profile") ? (byte) 24 : (byte) -1;
                            break;
                        case 1954122069:
                            b = strM014.equals("transactions") ? (byte) 25 : (byte) -1;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        case 0:
                            String strS10 = h3Var2.S();
                            if (strS10 != null) {
                                p3Var.e = strS10;
                            }
                            break;
                        case 1:
                            Integer numC = h3Var2.C();
                            if (numC != null) {
                                p3Var.c = numC.intValue();
                            }
                            break;
                        case 2:
                            String strS11 = h3Var2.S();
                            if (strS11 != null) {
                                p3Var.o = strS11;
                            }
                            break;
                        case 3:
                            String strS12 = h3Var2.S();
                            if (strS12 != null) {
                                p3Var.d = strS12;
                            }
                            break;
                        case 4:
                            String strS13 = h3Var2.S();
                            if (strS13 != null) {
                                p3Var.w = strS13;
                            }
                            break;
                        case 5:
                            String strS14 = h3Var2.S();
                            if (strS14 != null) {
                                p3Var.g = strS14;
                            }
                            break;
                        case 6:
                            String strS15 = h3Var2.S();
                            if (strS15 != null) {
                                p3Var.f = strS15;
                            }
                            break;
                        case 7:
                            Boolean boolZ0 = h3Var2.z0();
                            if (boolZ0 != null) {
                                p3Var.j = boolZ0.booleanValue();
                            }
                            break;
                        case 8:
                            String strS16 = h3Var2.S();
                            if (strS16 != null) {
                                p3Var.r = strS16;
                            }
                            break;
                        case 9:
                            HashMap mapV2 = h3Var2.V(u0Var, new io.sentry.clientreport.a(2));
                            if (mapV2 != null) {
                                p3Var.A.putAll(mapV2);
                            }
                            break;
                        case 10:
                            String strS17 = h3Var2.S();
                            if (strS17 != null) {
                                p3Var.m = strS17;
                            }
                            break;
                        case 11:
                            List list = (List) h3Var2.O0();
                            if (list != null) {
                                p3Var.l = list;
                            }
                            break;
                        case 12:
                            String strS18 = h3Var2.S();
                            if (strS18 != null) {
                                p3Var.s = strS18;
                            }
                            break;
                        case 13:
                            String strS19 = h3Var2.S();
                            if (strS19 != null) {
                                p3Var.t = strS19;
                            }
                            break;
                        case 14:
                            String strS20 = h3Var2.S();
                            if (strS20 != null) {
                                p3Var.x = strS20;
                            }
                            break;
                        case 15:
                            Date dateV02 = h3Var.v0(u0Var);
                            if (dateV02 != null) {
                                p3Var.z = dateV02;
                            }
                            break;
                        case 16:
                            String strS21 = h3Var2.S();
                            if (strS21 != null) {
                                p3Var.q = strS21;
                            }
                            break;
                        case 17:
                            String strS22 = h3Var2.S();
                            if (strS22 != null) {
                                p3Var.h = strS22;
                            }
                            break;
                        case 18:
                            String strS23 = h3Var2.S();
                            if (strS23 != null) {
                                p3Var.k = strS23;
                            }
                            break;
                        case 19:
                            String strS24 = h3Var2.S();
                            if (strS24 != null) {
                                p3Var.u = strS24;
                            }
                            break;
                        case 20:
                            String strS25 = h3Var2.S();
                            if (strS25 != null) {
                                p3Var.i = strS25;
                            }
                            break;
                        case 21:
                            String strS26 = h3Var2.S();
                            if (strS26 != null) {
                                p3Var.y = strS26;
                            }
                            break;
                        case 22:
                            String strS27 = h3Var2.S();
                            if (strS27 != null) {
                                p3Var.v = strS27;
                            }
                            break;
                        case 23:
                            String strS28 = h3Var2.S();
                            if (strS28 != null) {
                                p3Var.n = strS28;
                            }
                            break;
                        case 24:
                            String strS29 = h3Var2.S();
                            if (strS29 != null) {
                                p3Var.B = strS29;
                            }
                            break;
                        case 25:
                            ArrayList arrayListZ0 = h3Var2.Z0(u0Var, new e(4));
                            if (arrayListZ0 != null) {
                                p3Var.p.addAll(arrayListZ0);
                            }
                            break;
                        default:
                            if (concurrentHashMap5 == null) {
                                concurrentHashMap5 = new ConcurrentHashMap();
                            }
                            h3Var2.H(u0Var, concurrentHashMap5, strM014);
                            break;
                    }
                }
                p3Var.C = concurrentHashMap5;
                h3Var2.t0();
                return p3Var;
            case 4:
                h3Var2.P0();
                q3 q3Var = new q3(e3.a, 0L, 0L);
                ConcurrentHashMap concurrentHashMap6 = null;
                while (h3Var2.peek() == JsonToken.NAME) {
                    strM02 = h3Var2.m0();
                    strM02.getClass();
                    switch (strM02) {
                        case "relative_start_ns":
                            Long L = h3Var2.L();
                            if (L == null) {
                                break;
                            } else {
                                q3Var.d = L;
                                break;
                            }
                            break;
                        case "relative_end_ns":
                            Long L2 = h3Var2.L();
                            if (L2 == null) {
                                break;
                            } else {
                                q3Var.e = L2;
                                break;
                            }
                            break;
                        case "id":
                            String strS30 = h3Var2.S();
                            if (strS30 == null) {
                                break;
                            } else {
                                q3Var.a = strS30;
                                break;
                            }
                            break;
                        case "name":
                            String strS31 = h3Var2.S();
                            if (strS31 == null) {
                                break;
                            } else {
                                q3Var.c = strS31;
                                break;
                            }
                            break;
                        case "trace_id":
                            String strS32 = h3Var2.S();
                            if (strS32 == null) {
                                break;
                            } else {
                                q3Var.b = strS32;
                                break;
                            }
                            break;
                        case "relative_cpu_end_ms":
                            Long L3 = h3Var2.L();
                            if (L3 == null) {
                                break;
                            } else {
                                q3Var.g = L3;
                                break;
                            }
                            break;
                        case "relative_cpu_start_ms":
                            Long L4 = h3Var2.L();
                            if (L4 == null) {
                                break;
                            } else {
                                q3Var.f = L4;
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap6 == null) {
                                concurrentHashMap6 = new ConcurrentHashMap();
                            }
                            h3Var2.H(u0Var, concurrentHashMap6, strM02);
                            break;
                    }
                }
                q3Var.h = concurrentHashMap6;
                h3Var2.t0();
                return q3Var;
            case 5:
                u3 u3Var = new u3();
                h3Var2.P0();
                Integer numC2 = null;
                HashMap map = null;
                while (h3Var2.peek() == JsonToken.NAME) {
                    String strM015 = h3Var2.m0();
                    strM015.getClass();
                    if (strM015.equals("segment_id")) {
                        numC2 = h3Var2.C();
                    } else {
                        if (map == null) {
                            map = new HashMap();
                        }
                        h3Var2.H(u0Var, map, strM015);
                    }
                }
                h3Var2.t0();
                h3Var2.T(true);
                List list2 = (List) h3Var2.O0();
                h3Var2.T(false);
                if (list2 != null) {
                    arrayList = new ArrayList(list2.size());
                    for (Object obj : list2) {
                        if (obj instanceof Map) {
                            Map map2 = (Map) obj;
                            io.sentry.util.f fVar3 = new io.sentry.util.f(map2);
                            for (Map.Entry entry : map2.entrySet()) {
                                String str = (String) entry.getKey();
                                Object value = entry.getValue();
                                if (str.equals("type")) {
                                    RRWebEventType rRWebEventType = RRWebEventType.values()[((Integer) value).intValue()];
                                    int i4 = t3.b[rRWebEventType.ordinal()];
                                    if (i4 == 1) {
                                        Map map3 = (Map) map2.get("data");
                                        if (map3 == null) {
                                            map3 = Collections.EMPTY_MAP;
                                        }
                                        Integer num2 = (Integer) map3.get("source");
                                        if (num2 != null) {
                                            RRWebIncrementalSnapshotEvent$IncrementalSource rRWebIncrementalSnapshotEvent$IncrementalSource = RRWebIncrementalSnapshotEvent$IncrementalSource.values()[num2.intValue()];
                                            int i5 = t3.a[rRWebIncrementalSnapshotEvent$IncrementalSource.ordinal()];
                                            if (i5 == 1) {
                                                arrayList.add(io.sentry.protocol.b0.c(fVar3, u0Var));
                                            } else if (i5 != 2) {
                                                u0Var.i(SentryLevel.DEBUG, "Unsupported rrweb incremental snapshot type %s", rRWebIncrementalSnapshotEvent$IncrementalSource);
                                            } else {
                                                arrayList.add(io.sentry.protocol.b0.d(fVar3, u0Var));
                                            }
                                        }
                                    } else if (i4 == 2) {
                                        arrayList.add(io.sentry.protocol.b0.e(fVar3, u0Var));
                                    } else if (i4 == 3) {
                                        Map map4 = (Map) map2.get("data");
                                        if (map4 == null) {
                                            map4 = Collections.EMPTY_MAP;
                                        }
                                        String str2 = (String) map4.get("tag");
                                        if (str2 != null) {
                                            switch (str2) {
                                                case "performanceSpan":
                                                    arrayList.add(io.sentry.protocol.b0.f(fVar3, u0Var));
                                                    break;
                                                case "video":
                                                    arrayList.add(io.sentry.protocol.b0.g(fVar3, u0Var));
                                                    break;
                                                case "breadcrumb":
                                                    arrayList.add(io.sentry.protocol.b0.b(fVar3, u0Var));
                                                    break;
                                                default:
                                                    u0Var.i(SentryLevel.DEBUG, "Unsupported rrweb event type %s", rRWebEventType);
                                                    break;
                                            }
                                        }
                                    } else {
                                        u0Var.i(SentryLevel.DEBUG, "Unsupported rrweb event type %s", rRWebEventType);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    arrayList = null;
                }
                u3Var.a = numC2;
                u3Var.b = arrayList;
                u3Var.c = map;
                return u3Var;
            case 6:
                h3Var2.P0();
                i4 i4Var = new i4();
                i4Var.c = false;
                i4Var.d = null;
                i4Var.a = false;
                i4Var.b = null;
                i4Var.i = false;
                i4Var.e = null;
                i4Var.f = false;
                i4Var.g = false;
                i4Var.l = ProfileLifecycle.MANUAL;
                i4Var.h = 0;
                i4Var.j = true;
                i4Var.k = false;
                ConcurrentHashMap concurrentHashMap7 = null;
                while (h3Var2.peek() == JsonToken.NAME) {
                    strM03 = h3Var2.m0();
                    strM03.getClass();
                    switch (strM03) {
                        case "is_enable_app_start_profiling":
                            Boolean boolZ02 = h3Var2.z0();
                            if (boolZ02 == null) {
                                break;
                            } else {
                                i4Var.j = boolZ02.booleanValue();
                                break;
                            }
                            break;
                        case "trace_sampled":
                            Boolean boolZ03 = h3Var2.z0();
                            if (boolZ03 == null) {
                                break;
                            } else {
                                i4Var.c = boolZ03.booleanValue();
                                break;
                            }
                            break;
                        case "profiling_traces_dir_path":
                            String strS33 = h3Var2.S();
                            if (strS33 == null) {
                                break;
                            } else {
                                i4Var.e = strS33;
                                break;
                            }
                            break;
                        case "is_continuous_profiling_enabled":
                            Boolean boolZ04 = h3Var2.z0();
                            if (boolZ04 == null) {
                                break;
                            } else {
                                i4Var.g = boolZ04.booleanValue();
                                break;
                            }
                            break;
                        case "is_profiling_enabled":
                            Boolean boolZ05 = h3Var2.z0();
                            if (boolZ05 == null) {
                                break;
                            } else {
                                i4Var.f = boolZ05.booleanValue();
                                break;
                            }
                            break;
                        case "is_start_profiler_on_app_start":
                            Boolean boolZ06 = h3Var2.z0();
                            if (boolZ06 == null) {
                                break;
                            } else {
                                i4Var.k = boolZ06.booleanValue();
                                break;
                            }
                            break;
                        case "profile_sampled":
                            Boolean boolZ07 = h3Var2.z0();
                            if (boolZ07 == null) {
                                break;
                            } else {
                                i4Var.a = boolZ07.booleanValue();
                                break;
                            }
                            break;
                        case "profile_lifecycle":
                            String strS34 = h3Var2.S();
                            if (strS34 == null) {
                                break;
                            } else {
                                try {
                                    i4Var.l = ProfileLifecycle.valueOf(strS34);
                                } catch (IllegalArgumentException unused) {
                                    u0Var.i(SentryLevel.ERROR, "Error when deserializing ProfileLifecycle: ".concat(strS34), new Object[0]);
                                }
                                break;
                            }
                            break;
                        case "continuous_profile_sampled":
                            Boolean boolZ08 = h3Var2.z0();
                            if (boolZ08 == null) {
                                break;
                            } else {
                                i4Var.i = boolZ08.booleanValue();
                                break;
                            }
                            break;
                        case "profiling_traces_hz":
                            Integer numC3 = h3Var2.C();
                            if (numC3 == null) {
                                break;
                            } else {
                                i4Var.h = numC3.intValue();
                                break;
                            }
                            break;
                        case "trace_sample_rate":
                            Double dH02 = h3Var2.h0();
                            if (dH02 == null) {
                                break;
                            } else {
                                i4Var.d = dH02;
                                break;
                            }
                            break;
                        case "profile_sample_rate":
                            Double dH03 = h3Var2.h0();
                            if (dH03 == null) {
                                break;
                            } else {
                                i4Var.b = dH03;
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap7 == null) {
                                concurrentHashMap7 = new ConcurrentHashMap();
                            }
                            h3Var2.H(u0Var, concurrentHashMap7, strM03);
                            break;
                    }
                }
                i4Var.m = concurrentHashMap7;
                h3Var2.t0();
                return i4Var;
            case 7:
                h3Var2.P0();
                io.sentry.protocol.t tVar2 = null;
                n6 n6Var = null;
                Date dateV03 = null;
                HashMap map5 = null;
                io.sentry.protocol.v vVar6 = null;
                while (h3Var2.peek() == JsonToken.NAME) {
                    strM04 = h3Var2.m0();
                    strM04.getClass();
                    switch (strM04) {
                        case "sdk":
                            tVar2 = (io.sentry.protocol.t) h3Var2.M0(u0Var, new io.sentry.clientreport.a(21));
                            break;
                        case "trace":
                            n6Var = (n6) h3Var2.M0(u0Var, new e(25));
                            break;
                        case "event_id":
                            vVar6 = (io.sentry.protocol.v) h3Var2.M0(u0Var, new io.sentry.clientreport.a(23));
                            break;
                        case "sent_at":
                            dateV03 = h3Var.v0(u0Var);
                            break;
                        default:
                            if (map5 == null) {
                                map5 = new HashMap();
                            }
                            h3Var2.H(u0Var, map5, strM04);
                            break;
                    }
                }
                p4 p4Var = new p4(vVar6, tVar2, n6Var);
                p4Var.d = dateV03;
                p4Var.e = map5;
                h3Var2.t0();
                return p4Var;
            case 8:
                h3Var2.P0();
                HashMap map6 = null;
                SentryItemType sentryItemType = null;
                int iNextInt = 0;
                String strS35 = null;
                String strS36 = null;
                String strS37 = null;
                String strS38 = null;
                Integer numC4 = null;
                while (h3Var2.peek() == JsonToken.NAME) {
                    strM05 = h3Var2.m0();
                    strM05.getClass();
                    switch (strM05) {
                        case "item_count":
                            numC4 = h3Var2.C();
                            continue;
                            break;
                        case "length":
                            iNextInt = h3Var2.nextInt();
                            continue;
                            break;
                        case "filename":
                            strS36 = h3Var2.S();
                            continue;
                            break;
                        case "attachment_type":
                            strS37 = h3Var2.S();
                            continue;
                            break;
                        case "type":
                            sentryItemType = (SentryItemType) h3Var2.M0(u0Var, new e(10));
                            continue;
                            break;
                        case "content_type":
                            strS35 = h3Var2.S();
                            break;
                        case "platform":
                            strS38 = h3Var2.S();
                            break;
                        default:
                            if (map6 == null) {
                                map6 = new HashMap();
                            }
                            h3Var2.H(u0Var, map6, strM05);
                            break;
                    }
                }
                if (sentryItemType == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"type\"");
                    u0Var.f(SentryLevel.ERROR, "Missing required field \"type\"", illegalStateException);
                    throw illegalStateException;
                }
                v4 v4Var = new v4(sentryItemType, iNextInt, strS35, strS36, strS37, strS38, numC4);
                v4Var.i = map6;
                h3Var2.t0();
                return v4Var;
            case 9:
                int i6 = 0;
                h3Var2.P0();
                w4 w4Var = new w4();
                ConcurrentHashMap concurrentHashMap8 = null;
                while (h3Var2.peek() == JsonToken.NAME) {
                    String strM016 = h3Var2.m0();
                    strM016.getClass();
                    switch (strM016.hashCode()) {
                        case -1375934236:
                            i = strM016.equals("fingerprint") ? i6 : -1;
                            break;
                        case -1337936983:
                            i = strM016.equals("threads") ? 1 : -1;
                            break;
                        case -1097337456:
                            i = strM016.equals("logger") ? 2 : -1;
                            break;
                        case 55126294:
                            i = strM016.equals("timestamp") ? 3 : -1;
                            break;
                        case 102865796:
                            i = strM016.equals("level") ? 4 : -1;
                            break;
                        case 954925063:
                            i = strM016.equals("message") ? 5 : -1;
                            break;
                        case 1227433863:
                            i = strM016.equals("modules") ? 6 : -1;
                            break;
                        case 1481625679:
                            i = strM016.equals("exception") ? 7 : -1;
                            break;
                        case 2141246174:
                            i = strM016.equals("transaction") ? 8 : -1;
                            break;
                        default:
                            i = -1;
                            break;
                    }
                    switch (i) {
                        case 0:
                            List list3 = (List) h3Var2.O0();
                            if (list3 != null) {
                                w4Var.w = list3;
                            }
                            break;
                        case 1:
                            h3Var2.P0();
                            h3Var2.m0();
                            w4Var.s = new c2(h3Var2.Z0(u0Var, new io.sentry.protocol.b0(i6)));
                            h3Var2.t0();
                            break;
                        case 2:
                            w4Var.r = h3Var2.S();
                            break;
                        case 3:
                            Date dateV04 = h3Var.v0(u0Var);
                            if (dateV04 != null) {
                                w4Var.p = dateV04;
                            }
                            break;
                        case 4:
                            w4Var.u = (SentryLevel) h3Var2.M0(u0Var, new e(i3));
                            break;
                        case 5:
                            w4Var.q = (io.sentry.protocol.o) h3Var2.M0(u0Var, new io.sentry.clientreport.a(i2));
                            break;
                        case 6:
                            w4Var.y = io.sentry.config.a.Q((Map) h3Var2.O0());
                            break;
                        case 7:
                            h3Var2.P0();
                            h3Var2.m0();
                            w4Var.t = new c2(h3Var2.Z0(u0Var, new io.sentry.clientreport.a(22)));
                            h3Var2.t0();
                            break;
                        case 8:
                            w4Var.v = h3Var2.S();
                            break;
                        default:
                            if (!io.sentry.config.a.q(w4Var, strM016, h3Var2, u0Var)) {
                                if (concurrentHashMap8 == null) {
                                    concurrentHashMap8 = new ConcurrentHashMap();
                                }
                                h3Var2.H(u0Var, concurrentHashMap8, strM016);
                            }
                            break;
                    }
                    i6 = 0;
                }
                w4Var.x = concurrentHashMap8;
                h3Var2.t0();
                return w4Var;
            case 10:
                return SentryItemType.valueOfLabel(h3Var2.t().toLowerCase(Locale.ROOT));
            case 11:
                return SentryLevel.valueOf(h3Var2.t().toUpperCase(Locale.ROOT));
            case 12:
                f5 f5Var = new f5();
                h3Var2.P0();
                ConcurrentHashMap concurrentHashMap9 = null;
                while (h3Var2.peek() == JsonToken.NAME) {
                    strM06 = h3Var2.m0();
                    strM06.getClass();
                    switch (strM06) {
                        case "package_name":
                            f5Var.c = h3Var2.S();
                            break;
                        case "thread_id":
                            f5Var.e = h3Var2.L();
                            break;
                        case "address":
                            f5Var.b = h3Var2.S();
                            break;
                        case "class_name":
                            f5Var.d = h3Var2.S();
                            break;
                        case "type":
                            f5Var.a = h3Var2.nextInt();
                            break;
                        default:
                            if (concurrentHashMap9 == null) {
                                concurrentHashMap9 = new ConcurrentHashMap();
                            }
                            h3Var2.H(u0Var, concurrentHashMap9, strM06);
                            break;
                    }
                }
                f5Var.f = concurrentHashMap9;
                h3Var2.t0();
                return f5Var;
            case 13:
                h3Var2.P0();
                Double dH04 = null;
                String strS39 = null;
                HashMap map7 = null;
                SentryLogLevel sentryLogLevel = null;
                HashMap mapV3 = null;
                Integer numC5 = null;
                m6 m6Var = null;
                io.sentry.protocol.v vVar7 = null;
                while (h3Var2.peek() == JsonToken.NAME) {
                    strM07 = h3Var2.m0();
                    strM07.getClass();
                    switch (strM07) {
                        case "span_id":
                            m6Var = (m6) h3Var2.M0(u0Var, new e(23));
                            break;
                        case "severity_number":
                            numC5 = h3Var2.C();
                            break;
                        case "body":
                            strS39 = h3Var2.S();
                            break;
                        case "timestamp":
                            dH04 = h3Var2.h0();
                            break;
                        case "level":
                            sentryLogLevel = (SentryLogLevel) h3Var2.M0(u0Var, new e(16));
                            break;
                        case "attributes":
                            mapV3 = h3Var2.V(u0Var, new e(14));
                            break;
                        case "trace_id":
                            vVar7 = (io.sentry.protocol.v) h3Var2.M0(u0Var, new io.sentry.clientreport.a(23));
                            break;
                        default:
                            if (map7 == null) {
                                map7 = new HashMap();
                            }
                            h3Var2.H(u0Var, map7, strM07);
                            break;
                    }
                }
                h3Var2.t0();
                if (vVar7 == null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"trace_id\"");
                    u0Var.f(SentryLevel.ERROR, "Missing required field \"trace_id\"", illegalStateException2);
                    throw illegalStateException2;
                }
                if (dH04 == null) {
                    IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"timestamp\"");
                    u0Var.f(SentryLevel.ERROR, "Missing required field \"timestamp\"", illegalStateException3);
                    throw illegalStateException3;
                }
                if (strS39 == null) {
                    IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"body\"");
                    u0Var.f(SentryLevel.ERROR, "Missing required field \"body\"", illegalStateException4);
                    throw illegalStateException4;
                }
                if (sentryLogLevel == null) {
                    IllegalStateException illegalStateException5 = new IllegalStateException("Missing required field \"level\"");
                    u0Var.f(SentryLevel.ERROR, "Missing required field \"level\"", illegalStateException5);
                    throw illegalStateException5;
                }
                g5 g5Var = new g5(vVar7, dH04, strS39, sentryLogLevel);
                g5Var.g = mapV3;
                g5Var.f = numC5;
                g5Var.b = m6Var;
                g5Var.h = map7;
                return g5Var;
            case 14:
                h3Var2.P0();
                Object objO0 = null;
                HashMap map8 = null;
                String strS40 = null;
                while (h3Var2.peek() == JsonToken.NAME) {
                    String strM017 = h3Var2.m0();
                    strM017.getClass();
                    if (strM017.equals("type")) {
                        strS40 = h3Var2.S();
                    } else if (strM017.equals(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                        objO0 = h3Var2.O0();
                    } else {
                        if (map8 == null) {
                            map8 = new HashMap();
                        }
                        h3Var2.H(u0Var, map8, strM017);
                    }
                }
                h3Var2.t0();
                if (strS40 != null) {
                    io.sentry.protocol.m mVar = new io.sentry.protocol.m(strS40, objO0);
                    mVar.d = map8;
                    return mVar;
                }
                IllegalStateException illegalStateException6 = new IllegalStateException("Missing required field \"type\"");
                u0Var.f(SentryLevel.ERROR, "Missing required field \"type\"", illegalStateException6);
                throw illegalStateException6;
            case 15:
                h3Var2.P0();
                HashMap map9 = null;
                ArrayList arrayListZ02 = null;
                while (h3Var2.peek() == JsonToken.NAME) {
                    String strM018 = h3Var2.m0();
                    strM018.getClass();
                    if (strM018.equals("items")) {
                        arrayListZ02 = h3Var2.Z0(u0Var, new e(13));
                    } else {
                        if (map9 == null) {
                            map9 = new HashMap();
                        }
                        h3Var2.H(u0Var, map9, strM018);
                    }
                }
                h3Var2.t0();
                if (arrayListZ02 != null) {
                    h5 h5Var = new h5(arrayListZ02);
                    h5Var.b = map9;
                    return h5Var;
                }
                IllegalStateException illegalStateException7 = new IllegalStateException("Missing required field \"items\"");
                u0Var.f(SentryLevel.ERROR, "Missing required field \"items\"", illegalStateException7);
                throw illegalStateException7;
            case 16:
                return SentryLogLevel.valueOf(h3Var2.t().toUpperCase(Locale.ROOT));
            case 17:
                h3Var2.P0();
                Double dH05 = null;
                String strS41 = null;
                HashMap map10 = null;
                String strS42 = null;
                Double dH06 = null;
                HashMap mapV4 = null;
                m6 m6Var2 = null;
                String strS43 = null;
                io.sentry.protocol.v vVar8 = null;
                while (true) {
                    HashMap map11 = map10;
                    if (h3Var2.peek() != JsonToken.NAME) {
                        h3Var2.t0();
                        if (vVar8 == null) {
                            IllegalStateException illegalStateException8 = new IllegalStateException("Missing required field \"trace_id\"");
                            u0Var.f(SentryLevel.ERROR, "Missing required field \"trace_id\"", illegalStateException8);
                            throw illegalStateException8;
                        }
                        if (dH05 == null) {
                            IllegalStateException illegalStateException9 = new IllegalStateException("Missing required field \"timestamp\"");
                            u0Var.f(SentryLevel.ERROR, "Missing required field \"timestamp\"", illegalStateException9);
                            throw illegalStateException9;
                        }
                        if (strS41 == null) {
                            IllegalStateException illegalStateException10 = new IllegalStateException("Missing required field \"type\"");
                            u0Var.f(SentryLevel.ERROR, "Missing required field \"type\"", illegalStateException10);
                            throw illegalStateException10;
                        }
                        if (strS42 == null) {
                            IllegalStateException illegalStateException11 = new IllegalStateException("Missing required field \"name\"");
                            u0Var.f(SentryLevel.ERROR, "Missing required field \"name\"", illegalStateException11);
                            throw illegalStateException11;
                        }
                        if (dH06 == null) {
                            IllegalStateException illegalStateException12 = new IllegalStateException("Missing required field \"value\"");
                            u0Var.f(SentryLevel.ERROR, "Missing required field \"value\"", illegalStateException12);
                            throw illegalStateException12;
                        }
                        j5 j5Var = new j5();
                        j5Var.a = vVar8;
                        j5Var.c = dH05;
                        j5Var.d = strS42;
                        j5Var.f = strS41;
                        j5Var.g = dH06;
                        j5Var.h = mapV4;
                        j5Var.b = m6Var2;
                        j5Var.e = strS43;
                        j5Var.i = map11;
                        return j5Var;
                    }
                    strM08 = h3Var2.m0();
                    strM08.getClass();
                    switch (strM08) {
                        case "span_id":
                            m6Var2 = (m6) h3Var2.M0(u0Var, new e(23));
                            break;
                        case "name":
                            strS42 = h3Var2.S();
                            break;
                        case "type":
                            strS41 = h3Var2.S();
                            break;
                        case "unit":
                            strS43 = h3Var2.S();
                            break;
                        case "timestamp":
                            dH05 = h3Var2.h0();
                            break;
                        case "value":
                            dH06 = h3Var2.h0();
                            break;
                        case "attributes":
                            mapV4 = h3Var2.V(u0Var, new e(14));
                            break;
                        case "trace_id":
                            vVar8 = (io.sentry.protocol.v) h3Var2.M0(u0Var, new io.sentry.clientreport.a(23));
                            break;
                        default:
                            HashMap map12 = map11 == null ? new HashMap() : map11;
                            h3Var2.H(u0Var, map12, strM08);
                            map10 = map12;
                            continue;
                            break;
                    }
                    map10 = map11;
                }
                break;
            case 18:
                h3Var2.P0();
                HashMap map13 = null;
                ArrayList arrayListZ03 = null;
                while (h3Var2.peek() == JsonToken.NAME) {
                    String strM019 = h3Var2.m0();
                    strM019.getClass();
                    if (strM019.equals("items")) {
                        arrayListZ03 = h3Var2.Z0(u0Var, new e(i2));
                    } else {
                        if (map13 == null) {
                            map13 = new HashMap();
                        }
                        h3Var2.H(u0Var, map13, strM019);
                    }
                }
                h3Var2.t0();
                if (arrayListZ03 != null) {
                    k5 k5Var = new k5(arrayListZ03);
                    k5Var.b = map13;
                    return k5Var;
                }
                IllegalStateException illegalStateException13 = new IllegalStateException("Missing required field \"items\"");
                u0Var.f(SentryLevel.ERROR, "Missing required field \"items\"", illegalStateException13);
                throw illegalStateException13;
            case 19:
                c6 c6Var = new c6();
                h3Var2.P0();
                SentryReplayEvent$ReplayType sentryReplayEvent$ReplayType = null;
                Date dateV05 = null;
                HashMap map14 = null;
                io.sentry.protocol.v vVar9 = null;
                Date dateV06 = null;
                List list4 = null;
                List list5 = null;
                List list6 = null;
                String strS44 = null;
                Integer numC6 = null;
                while (h3Var2.peek() == JsonToken.NAME) {
                    strM09 = h3Var2.m0();
                    strM09.getClass();
                    switch (strM09) {
                        case "replay_id":
                            vVar9 = (io.sentry.protocol.v) h3Var2.M0(u0Var, new io.sentry.clientreport.a(23));
                            break;
                        case "replay_start_timestamp":
                            dateV06 = h3Var.v0(u0Var);
                            break;
                        case "type":
                            strS44 = h3Var2.S();
                            break;
                        case "urls":
                            list4 = (List) h3Var2.O0();
                            break;
                        case "timestamp":
                            dateV05 = h3Var.v0(u0Var);
                            break;
                        case "error_ids":
                            list5 = (List) h3Var2.O0();
                            break;
                        case "trace_ids":
                            list6 = (List) h3Var2.O0();
                            break;
                        case "replay_type":
                            sentryReplayEvent$ReplayType = (SentryReplayEvent$ReplayType) h3Var2.M0(u0Var, new e(20));
                            break;
                        case "segment_id":
                            numC6 = h3Var2.C();
                            break;
                        default:
                            if (!io.sentry.config.a.q(c6Var, strM09, h3Var2, u0Var)) {
                                if (map14 == null) {
                                    map14 = new HashMap();
                                }
                                h3Var2.H(u0Var, map14, strM09);
                                break;
                            } else {
                                break;
                            }
                            break;
                    }
                }
                h3Var2.t0();
                if (strS44 != null) {
                    c6Var.q = strS44;
                }
                if (sentryReplayEvent$ReplayType != null) {
                    c6Var.r = sentryReplayEvent$ReplayType;
                }
                if (numC6 != null) {
                    c6Var.t = numC6.intValue();
                }
                if (dateV05 != null) {
                    c6Var.u = dateV05;
                }
                c6Var.s = vVar9;
                c6Var.v = dateV06;
                c6Var.w = list4;
                c6Var.x = list5;
                c6Var.y = list6;
                c6Var.z = map14;
                return c6Var;
            case 20:
                return SentryReplayEvent$ReplayType.valueOf(h3Var2.t().toUpperCase(Locale.ROOT));
            case 21:
                h3Var2.P0();
                Integer numC7 = null;
                Session$State session$StateValueOf = null;
                ConcurrentHashMap concurrentHashMap10 = null;
                String strS45 = null;
                String str3 = null;
                Long L5 = null;
                Boolean boolZ09 = null;
                String strS46 = null;
                String strS47 = null;
                String strS48 = null;
                Date dateV07 = null;
                Double dH07 = null;
                String strS49 = null;
                String strS50 = null;
                Date dateV08 = null;
                while (h3Var2.peek() == JsonToken.NAME) {
                    strM010 = h3Var2.m0();
                    strM010.getClass();
                    switch (strM010) {
                        case "duration":
                            num = numC7;
                            dH07 = h3Var2.h0();
                            break;
                        case "started":
                            num = numC7;
                            dateV07 = h3Var.v0(u0Var);
                            break;
                        case "errors":
                            numC7 = h3Var2.C();
                            continue;
                            break;
                        case "status":
                            num = numC7;
                            String strB = io.sentry.util.k.b(h3Var2.S());
                            if (strB != null) {
                                session$StateValueOf = Session$State.valueOf(strB);
                                break;
                            }
                            break;
                        case "did":
                            num = numC7;
                            strS45 = h3Var2.S();
                            break;
                        case "seq":
                            num = numC7;
                            L5 = h3Var2.L();
                            break;
                        case "sid":
                            String strS51 = h3Var2.S();
                            if (strS51 != null) {
                                num = numC7;
                                if (strS51.length() == 36 || strS51.length() == 32) {
                                    str3 = strS51;
                                }
                                break;
                            } else {
                                num = numC7;
                            }
                            u0Var.i(SentryLevel.ERROR, "%s sid is not valid.", strS51);
                            break;
                        case "init":
                            boolZ09 = h3Var2.z0();
                            continue;
                            break;
                        case "timestamp":
                            dateV08 = h3Var.v0(u0Var);
                            continue;
                            break;
                        case "attrs":
                            h3Var2.P0();
                            while (h3Var2.peek() == JsonToken.NAME) {
                                String strM020 = h3Var2.m0();
                                strM020.getClass();
                                switch (strM020) {
                                    case "environment":
                                        strS50 = h3Var2.S();
                                        break;
                                    case "release":
                                        strS47 = h3Var2.S();
                                        break;
                                    case "ip_address":
                                        strS46 = h3Var2.S();
                                        break;
                                    case "user_agent":
                                        strS49 = h3Var2.S();
                                        break;
                                    default:
                                        h3Var2.z();
                                        break;
                                }
                            }
                            h3Var2.t0();
                            continue;
                            break;
                        case "abnormal_mechanism":
                            strS48 = h3Var2.S();
                            continue;
                            break;
                        default:
                            if (concurrentHashMap10 == null) {
                                concurrentHashMap10 = new ConcurrentHashMap();
                            }
                            h3Var2.H(u0Var, concurrentHashMap10, strM010);
                            continue;
                            break;
                    }
                    numC7 = num;
                }
                Integer num3 = numC7;
                if (session$StateValueOf == null) {
                    throw d(u0Var, "status");
                }
                if (dateV07 == null) {
                    throw d(u0Var, "started");
                }
                if (num3 == null) {
                    throw d(u0Var, "errors");
                }
                if (strS47 == null) {
                    throw d(u0Var, "release");
                }
                i6 i6Var = new i6(session$StateValueOf, dateV07, dateV08, num3.intValue(), strS45, str3, boolZ09, L5, dH07, strS46, strS49, strS50, strS47, strS48);
                i6Var.p = concurrentHashMap10;
                h3Var2.t0();
                return i6Var;
            case 22:
                return b(h3Var, u0Var);
            case 23:
                return new m6(h3Var2.t());
            case 24:
                return SpanStatus.valueOf(h3Var2.t().toUpperCase(Locale.ROOT));
            case 25:
                return c(h3Var, u0Var);
            default:
                h3Var2.P0();
                io.sentry.protocol.v vVar10 = null;
                String strS52 = null;
                String strS53 = null;
                String strS54 = null;
                HashMap map15 = null;
                while (h3Var2.peek() == JsonToken.NAME) {
                    strM011 = h3Var2.m0();
                    strM011.getClass();
                    switch (strM011) {
                        case "comments":
                            strS54 = h3Var2.S();
                            break;
                        case "name":
                            strS52 = h3Var2.S();
                            break;
                        case "email":
                            strS53 = h3Var2.S();
                            break;
                        case "event_id":
                            vVar10 = new io.sentry.protocol.v(h3Var2.t());
                            break;
                        default:
                            if (map15 == null) {
                                map15 = new HashMap();
                            }
                            h3Var2.H(u0Var, map15, strM011);
                            break;
                    }
                }
                h3Var2.t0();
                if (vVar10 != null) {
                    t6 t6Var = new t6(vVar10, strS52, strS53, strS54);
                    t6Var.e = map15;
                    return t6Var;
                }
                IllegalStateException illegalStateException14 = new IllegalStateException("Missing required field \"event_id\"");
                u0Var.f(SentryLevel.ERROR, "Missing required field \"event_id\"", illegalStateException14);
                throw illegalStateException14;
        }
    }
}
